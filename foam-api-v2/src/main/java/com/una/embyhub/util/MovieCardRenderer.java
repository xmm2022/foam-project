/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson2.JSON
 *  com.alibaba.fastjson2.JSONArray
 *  com.alibaba.fastjson2.JSONObject
 */
package com.una.embyhub.util;

import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONObject;
import java.awt.AlphaComposite;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.GradientPaint;
import java.awt.Graphics2D;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.font.FontRenderContext;
import java.awt.geom.Path2D;
import java.awt.geom.RoundRectangle2D;
import java.awt.image.BufferedImage;
import java.awt.image.ConvolveOp;
import java.awt.image.Kernel;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.time.Duration;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import javax.imageio.IIOImage;
import javax.imageio.ImageIO;
import javax.imageio.ImageWriteParam;
import javax.imageio.ImageWriter;
import javax.imageio.stream.MemoryCacheImageOutputStream;

public class MovieCardRenderer {
    private static final String CH_FONT_RES = "fonts/NotoSansCJKsc-Regular.otf";
    private static final String EN_FONT_RES = "fonts/NotoSans-Regular.ttf";
    private static final String LOGO_RES = "img/foam.png";
    private static final String POSTER_RES = "img/default.jpg";
    private static final float JPEG_QUALITY = 0.78f;
    private static final HttpClient HTTP = HttpClient.newBuilder().connectTimeout(Duration.ofSeconds(10L)).build();
    private static final Map<String, Font> FONT_CACHE = new ConcurrentHashMap<String, Font>();

    private static Font loadFont(Path path, float size, boolean fallbackSansSerif) {
        try {
            return Font.createFont(0, Files.newInputStream(path, new OpenOption[0])).deriveFont(size);
        }
        catch (Exception e) {
            return new Font(fallbackSansSerif ? "SansSerif" : "Serif", 0, Math.round(size));
        }
    }

    private static Font loadFontFromResource(String res, boolean fallbackSansSerif) {
        return FONT_CACHE.computeIfAbsent(res, k -> {
            Font font;
            block9: {
                InputStream in = MovieCardRenderer.getResourceStream(res);
                try {
                    if (in == null) {
                        throw new IOException("resource not found: " + res);
                    }
                    Font font2 = Font.createFont(0, in);
                    GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
                    ge.registerFont(font2);
                    font = font2;
                    if (in == null) break block9;
                }
                catch (Throwable throwable) {
                    try {
                        if (in != null) {
                            try {
                                in.close();
                            }
                            catch (Throwable throwable2) {
                                throwable.addSuppressed(throwable2);
                            }
                        }
                        throw throwable;
                    }
                    catch (Exception e) {
                        return new Font(fallbackSansSerif ? "SansSerif" : "Serif", 0, 12);
                    }
                }
                in.close();
            }
            return font;
        });
    }

    private static InputStream getResourceStream(String res) {
        InputStream in = null;
        try {
            ClassLoader cl = Thread.currentThread().getContextClassLoader();
            if (cl != null) {
                in = cl.getResourceAsStream(res);
            }
        }
        catch (Throwable throwable) {
            // empty catch block
        }
        if (in == null) {
            in = MovieCardRenderer.class.getResourceAsStream((String)(res.startsWith("/") ? res : "/" + res));
        }
        return in;
    }

    private static Font derive(Font base, float size) {
        return base.deriveFont(size);
    }

    private static RenderFonts renderFonts(Font chBase, Font enBase) {
        return new RenderFonts(MovieCardRenderer.derive(chBase, 28.0f), MovieCardRenderer.derive(chBase, 17.0f), MovieCardRenderer.derive(chBase, 14.0f), MovieCardRenderer.derive(chBase, 11.0f), MovieCardRenderer.derive(enBase, 32.0f), MovieCardRenderer.derive(chBase, 13.0f));
    }

    private static RenderFonts resourceFonts() {
        Font chBase = MovieCardRenderer.loadFontFromResource(CH_FONT_RES, true);
        Font enBase = MovieCardRenderer.loadFontFromResource(EN_FONT_RES, true);
        return MovieCardRenderer.renderFonts(chBase, enBase);
    }

    private static BufferedImage gradientBg(int w, int h) {
        BufferedImage img = new BufferedImage(w, h, 1);
        Graphics2D g = img.createGraphics();
        for (int y = 0; y < h; ++y) {
            float ratio = (float)y / (float)h;
            int r = (int)(20.0f + 40.0f * ratio);
            int gg = (int)(20.0f + 30.0f * ratio);
            int b = (int)(30.0f + 40.0f * ratio);
            g.setColor(new Color(r, gg, b));
            g.drawLine(0, y, w, y);
        }
        g.dispose();
        return img;
    }

    private static BufferedImage blur(BufferedImage src, int radius) {
        if (radius < 1) {
            return src;
        }
        int size = radius * 2 + 1;
        float[] data = new float[size * size];
        float sigma = (float)radius / 3.0f;
        float sum = 0.0f;
        int idx = 0;
        for (int y = -radius; y <= radius; ++y) {
            for (int x = -radius; x <= radius; ++x) {
                float val = (float)Math.exp((float)(-(x * x + y * y)) / (2.0f * sigma * sigma));
                data[idx++] = val;
                sum += val;
            }
        }
        int i = 0;
        while (i < data.length) {
            int n = i++;
            data[n] = data[n] / sum;
        }
        Kernel kernel = new Kernel(size, size, data);
        return new ConvolveOp(kernel, 1, null).filter(src, null);
    }

    private static Graphics2D gfx(BufferedImage img) {
        Graphics2D g = img.createGraphics();
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        return g;
    }

    private static List<String> wrapText(Graphics2D g, String text, Font font, int maxWidth) {
        String[] blocks;
        ArrayList<String> lines = new ArrayList<String>();
        if (text == null || text.isEmpty()) {
            return lines;
        }
        FontRenderContext frc = g.getFontRenderContext();
        for (String block : blocks = text.split("\\n", -1)) {
            StringBuilder line = new StringBuilder();
            for (char ch : block.toCharArray()) {
                String test = line.toString() + ch;
                int w = (int)font.getStringBounds(test, frc).getWidth();
                if (w <= maxWidth) {
                    line.append(ch);
                    continue;
                }
                if (!line.isEmpty()) {
                    lines.add(line.toString());
                }
                line = new StringBuilder(String.valueOf(ch));
            }
            lines.add(line.toString());
        }
        return lines;
    }

    private static void drawStatusIcon(Graphics2D g, int x, int y, int size, boolean success) {
        g.setStroke(new BasicStroke((float)size / 6.0f, 1, 1));
        if (success) {
            g.setColor(new Color(40, 180, 100));
            int x1 = x + size / 4;
            int y1 = y + size / 2;
            int x2 = x + size / 2;
            int y2 = y + size * 3 / 4;
            int x3 = x + size * 7 / 8;
            int y3 = y + size / 4;
            g.drawLine(x1, y1, x2, y2);
            g.drawLine(x2, y2, x3, y3);
        } else {
            g.setColor(new Color(220, 60, 60));
            int padding = size / 4;
            g.drawLine(x + padding, y + padding, x + size - padding, y + size - padding);
            g.drawLine(x + size - padding, y + padding, x + padding, y + size - padding);
        }
    }

    private static int drawWrappedText(Graphics2D g, String text, Font font, Color color, int x, int y, int maxWidth, int maxLines, int extraSpacing) {
        if (text == null || text.isBlank()) {
            return y;
        }
        g.setFont(font);
        g.setColor(color);
        List<String> lines = MovieCardRenderer.wrapText(g, text, font, maxWidth);
        if (lines.isEmpty()) {
            return y;
        }
        FontRenderContext frc = g.getFontRenderContext();
        if (lines.size() > maxLines) {
            lines = new ArrayList<String>(lines.subList(0, maxLines));
            String last = lines.get(maxLines - 1);
            lines.set(maxLines - 1, MovieCardRenderer.shrinkWithEllipsis(last, font, frc, maxWidth));
        }
        for (String line : lines) {
            g.drawString(line, x, y + g.getFontMetrics().getAscent());
            y += g.getFontMetrics().getHeight() + 2;
        }
        return y + extraSpacing;
    }

    private static void drawStar(Graphics2D g, double cx, double cy, double outer, double inner, Color color) {
        Path2D.Double star = new Path2D.Double();
        for (int i = 0; i < 10; ++i) {
            double angle = Math.toRadians(90 + i * 36);
            double r = i % 2 == 0 ? outer : inner;
            double x = cx + r * Math.cos(angle);
            double y = cy - r * Math.sin(angle);
            if (i == 0) {
                ((Path2D)star).moveTo(x, y);
                continue;
            }
            ((Path2D)star).lineTo(x, y);
        }
        star.closePath();
        g.setColor(color);
        g.fill(star);
    }

    private static void pasteImage(BufferedImage base, BufferedImage overlay, int x, int y) {
        Graphics2D g = MovieCardRenderer.gfx(base);
        g.drawImage((Image)overlay, x, y, null);
        g.dispose();
    }

    private static Dimension logoScaledSize(int left, int right, int maxSize) {
        BufferedImage logoImg = MovieCardRenderer.readResourceImage(LOGO_RES);
        if (logoImg == null) {
            return new Dimension(0, 0);
        }
        int lw = logoImg.getWidth();
        int lh = logoImg.getHeight();
        double limitBySize = 1.0 * (double)maxSize / (double)Math.max(lw, lh);
        double limitByWidth = (double)Math.max(1, right - left) / (double)lw;
        double scale = Math.min(Math.min(limitBySize, limitByWidth), 1.0);
        int w = (int)((double)lw * scale);
        int h = (int)((double)lh * scale);
        return new Dimension(w, h);
    }

    private static Rectangle pasteLogo(BufferedImage base, int left, int right, int y, int maxSize, boolean alignCenter) {
        BufferedImage logoImg = MovieCardRenderer.readResourceImage(LOGO_RES);
        if (logoImg == null) {
            return new Rectangle();
        }
        int lw = logoImg.getWidth();
        int lh = logoImg.getHeight();
        double limitBySize = 1.0 * (double)maxSize / (double)Math.max(lw, lh);
        double limitByWidth = (double)Math.max(1, right - left) / (double)lw;
        double scale = Math.min(Math.min(limitBySize, limitByWidth), 1.0);
        int w = (int)((double)lw * scale);
        int h = (int)((double)lh * scale);
        Image scaled = logoImg.getScaledInstance(w, h, 4);
        BufferedImage copy = new BufferedImage(w, h, 2);
        Graphics2D g = MovieCardRenderer.gfx(copy);
        g.drawImage(scaled, 0, 0, null);
        g.dispose();
        int cx = alignCenter ? (left + right) / 2 - w / 2 : left;
        MovieCardRenderer.pasteImage(base, copy, cx, y);
        return new Rectangle(cx, y, w, h);
    }

    private static Rectangle pasteLogo(BufferedImage base, int left, int right, int y, int maxSize) {
        return MovieCardRenderer.pasteLogo(base, left, right, y, maxSize, true);
    }

    private static void writeJpeg(BufferedImage img, Path out, float quality) throws IOException {
        try (OutputStream fos = Files.newOutputStream(out, new OpenOption[0]);){
            MovieCardRenderer.writeJpeg(img, fos, quality);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static void writeJpeg(BufferedImage img, OutputStream out, float quality) throws IOException {
        BufferedImage rgb = new BufferedImage(img.getWidth(), img.getHeight(), 1);
        Graphics2D g = rgb.createGraphics();
        g.drawImage((Image)img, 0, 0, null);
        g.dispose();
        ImageWriter writer = ImageIO.getImageWritersByFormatName("jpg").next();
        ImageWriteParam param = writer.getDefaultWriteParam();
        param.setCompressionMode(2);
        param.setCompressionQuality(quality);
        try (MemoryCacheImageOutputStream ios = new MemoryCacheImageOutputStream(out);){
            writer.setOutput(ios);
            writer.write(null, new IIOImage(rgb, null, null), param);
            ios.flush();
        }
        finally {
            writer.dispose();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static BufferedImage readResourceImage(String res) {
        try (InputStream in = MovieCardRenderer.getResourceStream(res);){
            if (in == null) {
                BufferedImage bufferedImage2 = null;
                return bufferedImage2;
            }
            BufferedImage bufferedImage = ImageIO.read(in);
            return bufferedImage;
        }
        catch (IOException e) {
            return null;
        }
    }

    public static void generateHorizontalCard(MovieDetail detail, BufferedImage poster, Path outPath) throws IOException {
        MovieCardRenderer.generateHorizontalCard(detail, poster, outPath, MovieCardRenderer.resourceFonts());
    }

    public static void generateHorizontalCard(MovieDetail detail, BufferedImage poster, Path outPath, Path chFontPath, Path enFontPath) throws IOException {
        Font chBase = MovieCardRenderer.loadFont(chFontPath, 12.0f, true);
        Font enBase = MovieCardRenderer.loadFont(enFontPath, 12.0f, true);
        MovieCardRenderer.generateHorizontalCard(detail, poster, outPath, MovieCardRenderer.renderFonts(chBase, enBase));
    }

    public static byte[] generateHorizontalCardToBytes(MovieDetail detail, BufferedImage poster) throws IOException {
        return MovieCardRenderer.generateHorizontalCardToBytes(detail, poster, MovieCardRenderer.resourceFonts());
    }

    public static byte[] generateHorizontalCardToBytes(MovieDetail detail, BufferedImage poster, Path chFontPath, Path enFontPath) throws IOException {
        Font chBase = MovieCardRenderer.loadFont(chFontPath, 12.0f, true);
        Font enBase = MovieCardRenderer.loadFont(enFontPath, 12.0f, true);
        return MovieCardRenderer.generateHorizontalCardToBytes(detail, poster, MovieCardRenderer.renderFonts(chBase, enBase));
    }

    private static byte[] generateHorizontalCardToBytes(MovieDetail detail, BufferedImage poster, RenderFonts fonts) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        MovieCardRenderer.generateHorizontalCardInternal(detail, poster, baos, fonts);
        return baos.toByteArray();
    }

    private static void generateHorizontalCard(MovieDetail detail, BufferedImage poster, Path outPath, RenderFonts fonts) throws IOException {
        Objects.requireNonNull(detail, "detail");
        Objects.requireNonNull(outPath, "outPath");
        try (OutputStream fos = Files.newOutputStream(outPath, new OpenOption[0]);){
            MovieCardRenderer.generateHorizontalCardInternal(detail, poster, fos, fonts);
        }
    }

    private static void generateHorizontalCardInternal(MovieDetail detail, BufferedImage poster, OutputStream out, RenderFonts fonts) throws IOException {
        boolean isLandscape;
        Objects.requireNonNull(out, "out");
        boolean bl = isLandscape = poster != null && poster.getWidth() >= poster.getHeight();
        if (isLandscape) {
            MovieCardRenderer.generateHorizontalCardLandscapeInternal(detail, poster, out, fonts);
            return;
        }
        int W = 900;
        int H = 400;
        BufferedImage base = new BufferedImage(W, H, 2);
        BufferedImage bg = poster != null ? MovieCardRenderer.resizeCrop(poster, W, H) : MovieCardRenderer.gradientBg(W, H);
        bg = MovieCardRenderer.blur(bg, 10);
        MovieCardRenderer.pasteImage(base, MovieCardRenderer.toRgba(bg), 0, 0);
        Graphics2D g = MovieCardRenderer.gfx(base);
        g.setColor(new Color(5, 5, 15, 90));
        g.fillRect(0, 0, W, H);
        int margin = 28;
        RoundRectangle2D.Float glass = new RoundRectangle2D.Float(margin, margin, W - 2 * margin, H - 2 * margin, 26.0f, 26.0f);
        g.setColor(new Color(255, 255, 255, 190));
        g.fill(glass);
        g.setColor(new Color(255, 255, 255, 70));
        g.setStroke(new BasicStroke(2.0f));
        g.draw(glass);
        Font titleFont = fonts.title();
        Font subTitleFont = fonts.subTitle();
        Font infoFont = fonts.info();
        Font smallFont = fonts.small();
        Font ratingBig = fonts.ratingBig();
        Font ratingSmall = fonts.ratingSmall();
        Color text = new Color(40, 40, 45);
        Color sub = new Color(110, 110, 120);
        Color accent = new Color(0, 170, 125);
        Color barBg = new Color(230, 230, 230);
        int innerH = H - margin * 2;
        int posterH = innerH - 50;
        int posterW = poster != null ? (int)((double)posterH * ((double)poster.getWidth() / (double)poster.getHeight())) : (int)((double)posterH * 0.7);
        BufferedImage posterRender = poster != null ? MovieCardRenderer.scale(poster, posterW, posterH) : MovieCardRenderer.plain(posterW, posterH, new Color(220, 220, 230));
        int posterX = margin + 35;
        int posterY = margin + (innerH - posterH) / 2;
        BufferedImage shadow = MovieCardRenderer.roundedShadow(posterW, posterH, 18);
        MovieCardRenderer.pasteImage(base, shadow, posterX - 11, posterY - 8);
        MovieCardRenderer.pasteRounded(base, posterRender, posterX, posterY, 18);
        int ratingBoxW = 210;
        int ratingBoxX = W - margin - ratingBoxW - 24;
        int textLeft = posterX + posterW + 32;
        int textRight = ratingBoxX - 24;
        int textWidth = Math.max(220, textRight - textLeft);
        int y = margin + 40;
        String titleCn = MovieCardRenderer.withEpisodeCode(MovieCardRenderer.pick(detail.title(), detail.originalTitle(), "\u672a\u77e5\u6807\u9898"), MovieCardRenderer.seasonEpisodeLabel(detail));
        String titleEn = detail.originalTitle();
        FontRenderContext frc = g.getFontRenderContext();
        List<String> titleLines = MovieCardRenderer.wrapText(g, titleCn, titleFont, textWidth);
        int firstLineW = 0;
        if (!titleLines.isEmpty()) {
            firstLineW = (int)titleFont.getStringBounds(titleLines.get(0), frc).getWidth();
        }
        int startY = y;
        y = MovieCardRenderer.drawWrappedText(g, titleCn, titleFont, text, textLeft, y, textWidth, 3, 4);
        if (detail.success() != null) {
            int iconSize = 24;
            int iconX = textLeft + firstLineW + 10;
            int iconY = startY + (g.getFontMetrics(titleFont).getAscent() - iconSize) / 2 + 4;
            MovieCardRenderer.drawStatusIcon(g, iconX, iconY, iconSize, detail.success());
        }
        y = titleEn != null && !titleEn.isBlank() && !titleEn.equals(titleCn) ? MovieCardRenderer.drawWrappedText(g, titleEn, subTitleFont, sub, textLeft, y, textWidth, 3, 6) : (y += 10);
        g.setFont(infoFont);
        g.setColor(sub);
        for (String line : MovieCardRenderer.baseInfo(detail)) {
            g.drawString(line, textLeft, y + g.getFontMetrics().getAscent());
            y += g.getFontMetrics().getHeight() + 4;
        }
        y += 14;
        List<String> lines = MovieCardRenderer.wrapText(g, MovieCardRenderer.defaultString(detail.overview(), "\u6682\u65e0\u7b80\u4ecb\u3002"), infoFont, textWidth);
        List<String> drawLines = lines.size() <= 3 ? lines : lines.subList(0, 3);
        boolean ellipsis = lines.size() > 3;
        g.setFont(infoFont);
        g.setColor(text);
        for (int i = 0; i < drawLines.size(); ++i) {
            String line = drawLines.get(i);
            if (ellipsis && i == drawLines.size() - 1) {
                line = MovieCardRenderer.shrinkWithEllipsis(line, infoFont, frc, textWidth);
            }
            g.drawString(line, textLeft, y + g.getFontMetrics().getAscent());
            y += g.getFontMetrics().getHeight() + 2;
        }
        int brandingBottomPadding = 12;
        int logoYOffset = 6;
        Dimension logoSize = MovieCardRenderer.logoScaledSize(textLeft, textRight, 36);
        FontMetrics serverFm = g.getFontMetrics(smallFont);
        int brandingBaseY = (int)glass.getBounds2D().getMaxY() - brandingBottomPadding;
        int brandingBlockHeight = Math.max(logoSize.height, serverFm.getHeight());
        int brandingTop = brandingBaseY - brandingBlockHeight;
        int logoY = brandingBaseY - logoSize.height + logoYOffset;
        Rectangle logoArea = MovieCardRenderer.pasteLogo(base, textLeft, textRight, logoY, 36, false);
        if (detail.serverUrl() != null && !detail.serverUrl().isBlank()) {
            g.setFont(smallFont);
            g.setColor(sub);
            String serverLabel = "\u670d\u52a1\u5668\uff1a" + detail.serverUrl();
            int textX = logoArea.x + logoArea.width + 10;
            int maxWidth = Math.max(0, textRight - textX);
            if (maxWidth > 20) {
                Object labelToDraw = serverLabel;
                if (serverFm.stringWidth((String)labelToDraw) > maxWidth) {
                    labelToDraw = MovieCardRenderer.shrinkWithEllipsis(serverLabel, smallFont, frc, maxWidth);
                }
                int textY = brandingTop + brandingBlockHeight - serverFm.getDescent();
                g.drawString((String)labelToDraw, textX, textY);
            }
        }
        y += 10;
        RoundRectangle2D.Float ratingGlass = new RoundRectangle2D.Float(ratingBoxX, margin + 32, ratingBoxW, H - margin * 2 - 64, 20.0f, 20.0f);
        g.setColor(new Color(255, 255, 255, 200));
        g.fill(ratingGlass);
        g.setColor(new Color(220, 220, 230));
        g.draw(ratingGlass);
        int rx = ratingBoxX + 14;
        int ry = margin + 32 + 14;
        g.setFont(ratingSmall);
        g.setColor(accent);
        g.drawString("TMDB \u8bc4\u5206", rx, ry + g.getFontMetrics().getAscent());
        g.setFont(ratingBig);
        g.setColor(text);
        String score = String.format("%.1f", detail.voteAverage());
        g.drawString(score, rx, (ry += g.getFontMetrics().getHeight() + 6) + g.getFontMetrics().getAscent());
        ry += g.getFontMetrics().getHeight() + 8;
        double starVal = Math.max(0.0, Math.min(5.0, detail.voteAverage() / 2.0));
        int fullStars = (int)Math.round(starVal);
        for (int i = 0; i < 5; ++i) {
            Color c = i < fullStars ? new Color(255, 170, 0) : new Color(210, 210, 210);
            MovieCardRenderer.drawStar(g, rx + i * 25 + 9, ry + 14, 9.0, 4.0, c);
        }
        g.setFont(smallFont);
        g.setColor(sub);
        g.drawString(detail.voteCount() + " \u4eba\u8bc4\u4ef7", rx, (ry += 27) + g.getFontMetrics().getAscent());
        ry += g.getFontMetrics().getHeight() + 8;
        String[] labels = new String[]{"\u597d\u8bc4", "\u4e00\u822c", "\u5dee\u8bc4"};
        double good = Math.min(Math.max((detail.voteAverage() - 5.0) / 5.0, 0.0), 1.0);
        double normal = (1.0 - good) * 0.6;
        double bad = 1.0 - good - normal;
        double[] ratios = new double[]{good, normal, bad};
        int barTotal = ratingBoxW - 28 - 40;
        for (int i = 0; i < labels.length; ++i) {
            g.setFont(smallFont);
            g.setColor(sub);
            String lbl = labels[i];
            g.drawString(lbl, rx, ry + g.getFontMetrics().getAscent());
            int lw = g.getFontMetrics().stringWidth(lbl);
            int barX = rx + lw + 6;
            int barY = ry + g.getFontMetrics().getAscent() / 2 - 3;
            g.setColor(barBg);
            g.fillRoundRect(barX, barY, barTotal, 7, 6, 6);
            g.setColor(accent);
            g.fillRoundRect(barX, barY, (int)((double)barTotal * ratios[i]), 7, 6, 6);
            ry += g.getFontMetrics().getHeight() + 4;
        }
        g.setFont(smallFont);
        g.setColor(sub);
        String tag = MovieCardRenderer.year(detail.releaseDate()) + " \u00b7 " + MovieCardRenderer.mainGenre(detail);
        int tagW = g.getFontMetrics().stringWidth(tag);
        int tagX = ratingBoxX + ratingBoxW - 14 - tagW;
        int tagY = (int)(ratingGlass.getBounds2D().getMaxY() - 14.0 - (double)g.getFontMetrics().getDescent());
        g.drawString(tag, tagX, tagY);
        g.dispose();
        MovieCardRenderer.writeJpeg(base, out, 0.78f);
    }

    private static void generateHorizontalCardLandscapeInternal(MovieDetail detail, BufferedImage poster, OutputStream out, RenderFonts fonts) throws IOException {
        int W = 900;
        int H = 500;
        BufferedImage base = new BufferedImage(W, H, 2);
        BufferedImage bg = MovieCardRenderer.resizeCrop(poster, W, H);
        bg = MovieCardRenderer.blur(bg, 10);
        MovieCardRenderer.pasteImage(base, MovieCardRenderer.toRgba(bg), 0, 0);
        Graphics2D g = MovieCardRenderer.gfx(base);
        g.setColor(new Color(5, 5, 15, 90));
        g.fillRect(0, 0, W, H);
        int margin = 28;
        RoundRectangle2D.Float glass = new RoundRectangle2D.Float(margin, margin, W - 2 * margin, H - 2 * margin, 26.0f, 26.0f);
        g.setColor(new Color(255, 255, 255, 190));
        g.fill(glass);
        g.setColor(new Color(255, 255, 255, 70));
        g.setStroke(new BasicStroke(2.0f));
        g.draw(glass);
        Font titleFont = fonts.title();
        Font subTitleFont = fonts.subTitle();
        Font infoFont = fonts.info();
        Font smallFont = fonts.small();
        Font ratingBig = fonts.ratingBig();
        Font ratingSmall = fonts.ratingSmall();
        Color text = new Color(40, 40, 45);
        Color sub = new Color(110, 110, 120);
        Color accent = new Color(0, 170, 125);
        Color barBg = new Color(230, 230, 230);
        int imgPadding = 16;
        int innerLeft = margin + imgPadding;
        int innerRight = W - margin - imgPadding;
        int innerWidth = innerRight - innerLeft;
        int posterTopY = margin + imgPadding;
        int maxPosterH = (int)((double)(H - 2 * margin) * 0.42);
        double imgRatio = (double)poster.getWidth() / (double)poster.getHeight();
        int posterW = innerWidth;
        int posterH = (int)((double)posterW / imgRatio);
        if (posterH > maxPosterH) {
            posterH = maxPosterH;
        }
        BufferedImage posterRender = MovieCardRenderer.resizeCrop(poster, posterW, posterH);
        int posterX = innerLeft;
        BufferedImage shadow = MovieCardRenderer.roundedShadow(posterW, posterH, 18);
        MovieCardRenderer.pasteImage(base, shadow, posterX - 11, posterTopY - 8);
        MovieCardRenderer.pasteRounded(base, posterRender, posterX, posterTopY, 18);
        int logoGapTop = posterTopY + posterH + 4;
        MovieCardRenderer.pasteLogo(base, innerLeft, innerRight, logoGapTop, 28, true);
        int logoGapBottom = logoGapTop + 32;
        int textLeft = innerLeft + 10;
        int ratingBoxW = 180;
        int ratingBoxX = innerRight - ratingBoxW;
        int textRight = ratingBoxX - 20;
        int textWidth = Math.max(200, textRight - textLeft);
        int y = logoGapBottom + 2;
        String titleCn = MovieCardRenderer.withEpisodeCode(MovieCardRenderer.pick(detail.title(), detail.originalTitle(), "\u672a\u77e5\u6807\u9898"), MovieCardRenderer.seasonEpisodeLabel(detail));
        String titleEn = detail.originalTitle();
        FontRenderContext frc = g.getFontRenderContext();
        List<String> titleLines = MovieCardRenderer.wrapText(g, titleCn, titleFont, textWidth);
        int firstLineW = 0;
        if (!titleLines.isEmpty()) {
            firstLineW = (int)titleFont.getStringBounds(titleLines.get(0), frc).getWidth();
        }
        int startY = y;
        y = MovieCardRenderer.drawWrappedText(g, titleCn, titleFont, text, textLeft, y, textWidth, 3, 4);
        if (detail.success() != null) {
            int iconSize = 22;
            int iconX = textLeft + firstLineW + 10;
            int iconY = startY + (g.getFontMetrics(titleFont).getAscent() - iconSize) / 2 + 4;
            MovieCardRenderer.drawStatusIcon(g, iconX, iconY, iconSize, detail.success());
        }
        y = titleEn != null && !titleEn.isBlank() && !titleEn.equals(titleCn) ? MovieCardRenderer.drawWrappedText(g, titleEn, subTitleFont, sub, textLeft, y, textWidth, 3, 4) : (y += 6);
        g.setFont(infoFont);
        g.setColor(sub);
        for (String line : MovieCardRenderer.baseInfo(detail)) {
            g.drawString(line, textLeft, y + g.getFontMetrics().getAscent());
            y += g.getFontMetrics().getHeight() + 2;
        }
        y += 8;
        List<String> lines = MovieCardRenderer.wrapText(g, MovieCardRenderer.defaultString(detail.overview(), "\u6682\u65e0\u7b80\u4ecb\u3002"), infoFont, textWidth);
        int maxOverviewLines = 3;
        List<String> drawLines = lines.size() <= maxOverviewLines ? lines : lines.subList(0, maxOverviewLines);
        boolean ellipsis = lines.size() > maxOverviewLines;
        g.setFont(infoFont);
        g.setColor(text);
        for (int i = 0; i < drawLines.size(); ++i) {
            String line = drawLines.get(i);
            if (ellipsis && i == drawLines.size() - 1) {
                line = MovieCardRenderer.shrinkWithEllipsis(line, infoFont, frc, textWidth);
            }
            g.drawString(line, textLeft, y + g.getFontMetrics().getAscent());
            y += g.getFontMetrics().getHeight() + 2;
        }
        int ry = logoGapBottom + 2;
        g.setFont(ratingSmall);
        g.setColor(accent);
        g.drawString("TMDB \u8bc4\u5206", ratingBoxX, ry + g.getFontMetrics().getAscent());
        g.setFont(ratingBig);
        g.setColor(text);
        String score = String.format("%.1f", detail.voteAverage());
        g.drawString(score, ratingBoxX, (ry += g.getFontMetrics().getHeight() + 4) + g.getFontMetrics().getAscent());
        ry += g.getFontMetrics().getHeight() + 6;
        double starVal = Math.max(0.0, Math.min(5.0, detail.voteAverage() / 2.0));
        int fullStars = (int)Math.round(starVal);
        for (int i = 0; i < 5; ++i) {
            Color c = i < fullStars ? new Color(255, 170, 0) : new Color(210, 210, 210);
            MovieCardRenderer.drawStar(g, ratingBoxX + i * 22 + 8, ry + 12, 8.0, 3.5, c);
        }
        g.setFont(smallFont);
        g.setColor(sub);
        g.drawString(detail.voteCount() + " \u4eba\u8bc4\u4ef7", ratingBoxX, (ry += 24) + g.getFontMetrics().getAscent());
        ry += g.getFontMetrics().getHeight() + 6;
        String[] labels = new String[]{"\u597d\u8bc4", "\u4e00\u822c", "\u5dee\u8bc4"};
        double good = Math.min(Math.max((detail.voteAverage() - 5.0) / 5.0, 0.0), 1.0);
        double normal = (1.0 - good) * 0.6;
        double bad = 1.0 - good - normal;
        double[] ratios = new double[]{good, normal, bad};
        int barTotal = ratingBoxW - 50;
        for (int i = 0; i < labels.length; ++i) {
            g.setFont(smallFont);
            g.setColor(sub);
            String lbl = labels[i];
            g.drawString(lbl, ratingBoxX, ry + g.getFontMetrics().getAscent());
            int lw = g.getFontMetrics().stringWidth(lbl);
            int barX = ratingBoxX + lw + 6;
            int barY = ry + g.getFontMetrics().getAscent() / 2 - 3;
            g.setColor(barBg);
            g.fillRoundRect(barX, barY, barTotal, 6, 6, 6);
            g.setColor(accent);
            g.fillRoundRect(barX, barY, (int)((double)barTotal * ratios[i]), 6, 6, 6);
            ry += g.getFontMetrics().getHeight() + 3;
        }
        g.setFont(smallFont);
        g.setColor(sub);
        String tag = MovieCardRenderer.year(detail.releaseDate()) + " \u00b7 " + MovieCardRenderer.mainGenre(detail);
        int tagW = g.getFontMetrics().stringWidth(tag);
        int tagX = innerRight - tagW;
        int tagY = (int)(glass.getBounds2D().getMaxY() - 14.0 - (double)g.getFontMetrics().getDescent());
        g.drawString(tag, tagX, tagY);
        g.dispose();
        MovieCardRenderer.writeJpeg(base, out, 0.78f);
    }

    public static void generateVerticalCard(MovieDetail detail, BufferedImage poster, Path outPath) throws IOException {
        MovieCardRenderer.generateVerticalCard(detail, poster, outPath, MovieCardRenderer.resourceFonts());
    }

    public static void generateVerticalCard(MovieDetail detail, BufferedImage poster, Path outPath, Path chFontPath, Path enFontPath) throws IOException {
        Font chBase = MovieCardRenderer.loadFont(chFontPath, 12.0f, true);
        Font enBase = MovieCardRenderer.loadFont(enFontPath, 12.0f, true);
        MovieCardRenderer.generateVerticalCard(detail, poster, outPath, MovieCardRenderer.renderFonts(chBase, enBase));
    }

    public static byte[] generateVerticalCardToBytes(MovieDetail detail, BufferedImage poster) throws IOException {
        return MovieCardRenderer.generateVerticalCardToBytes(detail, poster, MovieCardRenderer.resourceFonts());
    }

    public static byte[] generateVerticalCardToBytes(MovieDetail detail, BufferedImage poster, Path chFontPath, Path enFontPath) throws IOException {
        Font chBase = MovieCardRenderer.loadFont(chFontPath, 12.0f, true);
        Font enBase = MovieCardRenderer.loadFont(enFontPath, 12.0f, true);
        return MovieCardRenderer.generateVerticalCardToBytes(detail, poster, MovieCardRenderer.renderFonts(chBase, enBase));
    }

    private static byte[] generateVerticalCardToBytes(MovieDetail detail, BufferedImage poster, RenderFonts fonts) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        MovieCardRenderer.generateVerticalCardInternal(detail, poster, baos, fonts);
        return baos.toByteArray();
    }

    private static void generateVerticalCard(MovieDetail detail, BufferedImage poster, Path outPath, RenderFonts fonts) throws IOException {
        Objects.requireNonNull(outPath, "outPath");
        try (OutputStream fos = Files.newOutputStream(outPath, new OpenOption[0]);){
            MovieCardRenderer.generateVerticalCardInternal(detail, poster, fos, fonts);
        }
    }

    private static void generateVerticalCardInternal(MovieDetail detail, BufferedImage poster, OutputStream out, RenderFonts fonts) throws IOException {
        Objects.requireNonNull(detail, "detail");
        int W = 720;
        int H = 1080;
        BufferedImage base = new BufferedImage(W, H, 2);
        BufferedImage bg = poster != null ? MovieCardRenderer.resizeCrop(poster, W, H) : MovieCardRenderer.gradientBg(W, H);
        bg = MovieCardRenderer.blur(bg, 10);
        MovieCardRenderer.pasteImage(base, MovieCardRenderer.toRgba(bg), 0, 0);
        Graphics2D g = MovieCardRenderer.gfx(base);
        g.setColor(new Color(5, 5, 15, 90));
        g.fillRect(0, 0, W, H);
        int margin = 32;
        RoundRectangle2D.Float glass = new RoundRectangle2D.Float(margin, margin, W - 2 * margin, H - 2 * margin, 26.0f, 26.0f);
        g.setColor(new Color(255, 255, 255, 190));
        g.fill(glass);
        g.setColor(new Color(255, 255, 255, 70));
        g.setStroke(new BasicStroke(2.0f));
        g.draw(glass);
        int innerLeft = margin + 40;
        int innerRight = W - margin - 40;
        int innerWidth = innerRight - innerLeft;
        Font titleFont = fonts.title();
        Font subTitleFont = fonts.subTitle();
        Font infoFont = fonts.info();
        Font smallFont = fonts.small();
        Font ratingBig = fonts.ratingBig();
        Font ratingSmall = fonts.ratingSmall();
        Color text = new Color(40, 40, 45);
        Color sub = new Color(110, 110, 120);
        Color accent = new Color(0, 170, 125);
        Color barBg = new Color(230, 230, 230);
        int maxPosterW = innerWidth;
        double ratio = poster != null ? (double)poster.getWidth() / (double)poster.getHeight() : 0.7;
        int posterW = maxPosterW;
        int posterH = (int)((double)posterW / ratio);
        int maxPosterH = (int)((double)H * 0.45);
        if (posterH > maxPosterH) {
            posterH = maxPosterH;
            posterW = (int)((double)posterH * ratio);
        }
        BufferedImage posterRender = poster != null ? MovieCardRenderer.scale(poster, posterW, posterH) : MovieCardRenderer.plain(posterW, posterH, new Color(220, 220, 230));
        int posterX = (W - posterW) / 2;
        int posterY = margin + 26;
        MovieCardRenderer.pasteImage(base, MovieCardRenderer.roundedShadow(posterW, posterH, 22), posterX - 11, posterY - 8);
        MovieCardRenderer.pasteRounded(base, posterRender, posterX, posterY, 22);
        int y = posterY + posterH + 28;
        y = Math.max(y, margin + 80);
        int textLeft = innerLeft;
        int textRight = innerRight;
        int textWidth = innerWidth;
        String title = MovieCardRenderer.pick(detail.title(), detail.originalTitle(), "\u672a\u77e5\u6807\u9898");
        FontRenderContext frc = g.getFontRenderContext();
        List<String> titleLines = MovieCardRenderer.wrapText(g, title, titleFont, textWidth);
        int firstLineW = 0;
        if (!titleLines.isEmpty()) {
            firstLineW = (int)titleFont.getStringBounds(titleLines.get(0), frc).getWidth();
        }
        int startY = y;
        y = MovieCardRenderer.drawWrappedText(g, title, titleFont, text, textLeft, y, textWidth, 3, 6);
        if (detail.success() != null) {
            int iconSize = 24;
            int iconX = textLeft + firstLineW + 10;
            int iconY = startY + (g.getFontMetrics(titleFont).getAscent() - iconSize) / 2 + 4;
            MovieCardRenderer.drawStatusIcon(g, iconX, iconY, iconSize, detail.success());
        }
        y = detail.originalTitle() != null && !detail.originalTitle().isBlank() && !detail.originalTitle().equals(detail.title()) ? MovieCardRenderer.drawWrappedText(g, detail.originalTitle(), subTitleFont, sub, textLeft, y, textWidth, 3, 8) : (y += 6);
        g.setFont(infoFont);
        g.setColor(sub);
        for (String line : MovieCardRenderer.baseInfo(detail)) {
            g.drawString(line, textLeft, y + g.getFontMetrics().getAscent());
            y += g.getFontMetrics().getHeight() + 2;
        }
        y += 10;
        List<String> lines = MovieCardRenderer.wrapText(g, MovieCardRenderer.defaultString(detail.overview(), "\u6682\u65e0\u7b80\u4ecb\u3002"), infoFont, textWidth);
        List<String> drawLines = lines.size() <= 3 ? lines : lines.subList(0, 3);
        boolean ellipsis = lines.size() > 3;
        g.setFont(infoFont);
        g.setColor(text);
        for (int i = 0; i < drawLines.size(); ++i) {
            String line = drawLines.get(i);
            if (ellipsis && i == drawLines.size() - 1) {
                line = MovieCardRenderer.shrinkWithEllipsis(line, infoFont, frc, textWidth);
            }
            g.drawString(line, textLeft, y + g.getFontMetrics().getAscent());
            y += g.getFontMetrics().getHeight() + 2;
        }
        MovieCardRenderer.pasteLogo(base, textLeft, textRight, y += 10, 32);
        y += 44;
        String[] labels = new String[]{"\u597d\u8bc4", "\u4e00\u822c", "\u5dee\u8bc4"};
        FontMetrics ratingSmallMetrics = g.getFontMetrics(ratingSmall);
        FontMetrics ratingBigMetrics = g.getFontMetrics(ratingBig);
        FontMetrics smallMetrics = g.getFontMetrics(smallFont);
        int ratingBottomLimit = H - margin - 40;
        int ratingSectionHeight = ratingSmallMetrics.getHeight() + 6 + ratingBigMetrics.getHeight() + 10 + 9 + 16 + 6 + smallMetrics.getHeight() + 4 + labels.length * (smallMetrics.getHeight() + 2);
        int maxStartY = ratingBottomLimit - ratingSectionHeight;
        if (y > maxStartY) {
            y = Math.max(maxStartY, margin + 80);
        }
        g.setFont(ratingSmall);
        g.setColor(accent);
        g.drawString("TMDB \u8bc4\u5206", textLeft, y + g.getFontMetrics().getAscent());
        g.setFont(ratingBig);
        g.setColor(text);
        String score = String.format("%.1f", detail.voteAverage());
        g.drawString(score, textLeft, (y += g.getFontMetrics().getHeight() + 6) + g.getFontMetrics().getAscent());
        y += g.getFontMetrics().getHeight() + 10;
        double starVal = Math.max(0.0, Math.min(5.0, detail.voteAverage() / 2.0));
        int fullStars = (int)Math.round(starVal);
        for (int i = 0; i < 5; ++i) {
            Color c = i < fullStars ? new Color(255, 140, 0) : new Color(210, 210, 210);
            MovieCardRenderer.drawStar(g, textLeft + i * 26 + 9, y + 16, 9.0, 4.0, c);
        }
        g.setFont(smallFont);
        g.setColor(sub);
        g.drawString(detail.voteCount() + " \u4eba\u8bc4\u4ef7", textLeft, (y += 31) + g.getFontMetrics().getAscent());
        y += g.getFontMetrics().getHeight() + 4;
        double good = Math.min(Math.max((detail.voteAverage() - 5.0) / 5.0, 0.0), 1.0);
        double normal = (1.0 - good) * 0.6;
        double bad = 1.0 - good - normal;
        double[] ratios = new double[]{good, normal, bad};
        int barTotal = textWidth - 80;
        for (int i = 0; i < labels.length && y + 12 <= ratingBottomLimit; ++i) {
            g.setFont(smallFont);
            g.setColor(sub);
            String lbl = labels[i];
            g.drawString(lbl, textLeft, y + g.getFontMetrics().getAscent());
            int lw = g.getFontMetrics().stringWidth(lbl);
            int barX = textLeft + lw + 6;
            int barY = y + g.getFontMetrics().getAscent() / 2 - 3;
            g.setColor(barBg);
            g.fillRoundRect(barX, barY, barTotal, 6, 6, 6);
            g.setColor(accent);
            g.fillRoundRect(barX, barY, (int)((double)barTotal * ratios[i]), 6, 6, 6);
            y += g.getFontMetrics().getHeight() + 2;
        }
        g.setFont(smallFont);
        g.setColor(sub);
        String tag = MovieCardRenderer.year(detail.releaseDate()) + " \u00b7 " + MovieCardRenderer.mainGenre(detail);
        int tagW = g.getFontMetrics().stringWidth(tag);
        g.drawString(tag, textRight - tagW, H - margin - 20);
        g.dispose();
        MovieCardRenderer.writeJpeg(base, out, 0.78f);
    }

    private static BufferedImage resizeCrop(BufferedImage src, int w, int h) {
        int newW;
        int newH;
        double rCanvas;
        double rSrc = (double)src.getWidth() / (double)src.getHeight();
        if (rSrc > (rCanvas = (double)w / (double)h)) {
            newH = h;
            newW = (int)((double)newH * rSrc);
        } else {
            newW = w;
            newH = (int)((double)newW / rSrc);
        }
        BufferedImage scaled = MovieCardRenderer.scale(src, newW, newH);
        int left = (newW - w) / 2;
        int top = (newH - h) / 2;
        return scaled.getSubimage(left, top, w, h);
    }

    private static BufferedImage scale(BufferedImage src, int w, int h) {
        Image tmp = src.getScaledInstance(w, h, 4);
        BufferedImage img = new BufferedImage(w, h, 1);
        Graphics2D g = MovieCardRenderer.gfx(img);
        g.drawImage(tmp, 0, 0, null);
        g.dispose();
        return img;
    }

    private static BufferedImage plain(int w, int h, Color c) {
        BufferedImage img = new BufferedImage(w, h, 1);
        Graphics2D g = MovieCardRenderer.gfx(img);
        g.setColor(c);
        g.fillRect(0, 0, w, h);
        g.dispose();
        return img;
    }

    private static BufferedImage roundedShadow(int w, int h, int radius) {
        int sw = w + 22;
        int sh = h + 22;
        BufferedImage shadow = new BufferedImage(sw, sh, 2);
        Graphics2D g = MovieCardRenderer.gfx(shadow);
        g.setColor(new Color(0, 0, 0, 180));
        g.fill(new RoundRectangle2D.Float(11.0f, 11.0f, w, h, (float)radius * 2.0f, (float)radius * 2.0f));
        g.dispose();
        return MovieCardRenderer.blur(shadow, 10);
    }

    private static void pasteRounded(BufferedImage base, BufferedImage img, int x, int y, int radius) {
        BufferedImage mask = MovieCardRenderer.makeRoundedCorner(img, radius);
        MovieCardRenderer.pasteImage(base, mask, x, y);
    }

    private static BufferedImage makeRoundedCorner(BufferedImage img, int radius) {
        BufferedImage output = new BufferedImage(img.getWidth(), img.getHeight(), 2);
        Graphics2D g = MovieCardRenderer.gfx(output);
        g.setComposite(AlphaComposite.Src);
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g.setColor(Color.WHITE);
        g.fill(new RoundRectangle2D.Float(0.0f, 0.0f, img.getWidth(), img.getHeight(), (float)radius * 2.0f, (float)radius * 2.0f));
        g.setComposite(AlphaComposite.SrcIn);
        g.drawImage((Image)img, 0, 0, null);
        g.dispose();
        return output;
    }

    private static BufferedImage toRgba(BufferedImage img) {
        BufferedImage out = new BufferedImage(img.getWidth(), img.getHeight(), 2);
        Graphics2D g = MovieCardRenderer.gfx(out);
        g.drawImage((Image)img, 0, 0, null);
        g.dispose();
        return out;
    }

    private static String shrinkWithEllipsis(String line, Font font, FontRenderContext frc, int maxWidth) {
        String ell = "\u2026";
        if (font.getStringBounds(line, frc).getWidth() <= (double)maxWidth) {
            return line;
        }
        if (font.getStringBounds(line + ell, frc).getWidth() <= (double)maxWidth) {
            return line + ell;
        }
        StringBuilder sb = new StringBuilder(line);
        while (sb.length() > 0 && font.getStringBounds(String.valueOf(sb) + ell, frc).getWidth() > (double)maxWidth) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.isEmpty() ? ell : String.valueOf(sb) + ell;
    }

    private static List<String> wrapText(String text, Font font, FontRenderContext frc, int maxWidth) {
        String[] blocks;
        ArrayList<String> lines = new ArrayList<String>();
        if (text == null || text.isEmpty()) {
            return lines;
        }
        for (String block : blocks = text.split("\\n", -1)) {
            StringBuilder currentLine = new StringBuilder();
            for (int i = 0; i < block.length(); ++i) {
                char c = block.charAt(i);
                String test = currentLine.toString() + c;
                if (font.getStringBounds(test, frc).getWidth() > (double)maxWidth) {
                    if (currentLine.length() > 0) {
                        lines.add(currentLine.toString());
                        currentLine = new StringBuilder();
                        currentLine.append(c);
                        continue;
                    }
                    lines.add(String.valueOf(c));
                    continue;
                }
                currentLine.append(c);
            }
            lines.add(currentLine.toString());
        }
        return lines;
    }

    private static String pick(String ... vals) {
        for (String v : vals) {
            if (v == null || v.isBlank()) continue;
            return v;
        }
        return "";
    }

    private static String defaultString(String s, String def) {
        return s == null || s.isBlank() ? def : s;
    }

    private static String seasonEpisodeLabel(MovieDetail detail) {
        if (!detail.tvSeries()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        if (detail.seasonNumber() > 0) {
            sb.append(String.format("S%02d", detail.seasonNumber()));
        }
        if (detail.episodeNumber() > 0) {
            sb.append(String.format("E%02d", detail.episodeNumber()));
        }
        return sb.toString();
    }

    private static String withEpisodeCode(String title, String episodeCode) {
        if (episodeCode == null || episodeCode.isBlank()) {
            return title;
        }
        return title + " " + episodeCode;
    }

    private static List<String> baseInfo(MovieDetail d) {
        String runtime = d.runtime() > 0 ? d.runtime() + " \u5206\u949f" : "\u7247\u957f\u672a\u77e5";
        String genres = d.genres() != null && !d.genres().isEmpty() ? String.join((CharSequence)" / ", d.genres().subList(0, Math.min(3, d.genres().size()))) : "\u7c7b\u578b\u672a\u77e5";
        String date = d.releaseDate() != null ? d.releaseDate() : "\u672a\u77e5";
        String countries = d.productionCountries() != null && !d.productionCountries().isEmpty() ? String.join((CharSequence)" / ", d.productionCountries().subList(0, Math.min(2, d.productionCountries().size()))) : "\u56fd\u5bb6/\u5730\u533a\u672a\u77e5";
        ArrayList<String> list = new ArrayList<String>();
        list.add(runtime + " / " + genres);
        list.add("\u4e0a\u6620\u65e5\u671f\uff1a" + date);
        list.add("\u5236\u7247\u56fd\u5bb6/\u5730\u533a\uff1a" + countries);
        String resourceLine = null;
        if (d.downloadCurrent() != null && !d.downloadCurrent().isBlank()) {
            resourceLine = "\u8d44\u6e90\uff1a" + d.downloadCurrent();
        }
        if (Boolean.FALSE.equals(d.success()) && d.downloadError() != null && !d.downloadError().isBlank()) {
            resourceLine = resourceLine != null ? resourceLine + " (\u539f\u56e0\uff1a" + d.downloadError() + ")" : "\u539f\u56e0\uff1a" + d.downloadError();
        }
        if (resourceLine != null) {
            list.add(resourceLine);
        }
        return list;
    }

    private static String year(String date) {
        return date != null && date.length() >= 4 ? date.substring(0, 4) : "\u672a\u77e5\u5e74\u4efd";
    }

    private static String mainGenre(MovieDetail d) {
        return d.genres() != null && !d.genres().isEmpty() ? d.genres().get(0) : "\u7535\u5f71";
    }

    public static MovieCardData fetchMovieByQuery(String apiKey, String query) throws Exception {
        return MovieCardRenderer.fetchMovieByQuery(apiKey, query, "zh-CN");
    }

    public static MovieCardData fetchMovieByQuery(String apiKey, String query, String language) throws Exception {
        JSONObject search = MovieCardRenderer.tmdbGet(apiKey, "/search/movie", Map.of("query", query, "language", language == null ? "zh-CN" : language, "page", "1", "include_adult", "false"));
        JSONArray results = search.getJSONArray("results");
        if (results == null || results.isEmpty()) {
            throw new IllegalStateException("TMDB \u672a\u627e\u5230\u5f71\u7247: " + query);
        }
        JSONObject first = results.getJSONObject(0);
        long id = first.getLongValue("id");
        return MovieCardRenderer.fetchMovieById(apiKey, id, language);
    }

    public static MovieCardData fetchMovieById(String apiKey, long movieId) throws Exception {
        return MovieCardRenderer.fetchMovieById(apiKey, movieId, "zh-CN");
    }

    public static MovieCardData fetchMovieById(String apiKey, long movieId, String language) throws Exception {
        JSONObject detail = MovieCardRenderer.tmdbGet(apiKey, "/movie/" + movieId, Map.of("language", language == null ? "zh-CN" : language));
        String title = detail.getString("title");
        String originalTitle = detail.getString("original_title");
        String overview = detail.getString("overview");
        int runtime = detail.getIntValue("runtime");
        ArrayList<String> genres = new ArrayList<String>();
        JSONArray gArr = detail.getJSONArray("genres");
        if (gArr != null) {
            gArr.forEach(o -> {
                JSONObject jo = (JSONObject)o;
                genres.add(jo.getString("name"));
            });
        }
        String releaseDate = detail.getString("release_date");
        ArrayList<String> countries = new ArrayList<String>();
        JSONArray cArr = detail.getJSONArray("production_countries");
        if (cArr != null) {
            cArr.forEach(o -> {
                JSONObject jo = (JSONObject)o;
                countries.add(jo.getString("name"));
            });
        }
        double voteAverage = detail.getDoubleValue("vote_average");
        int voteCount = detail.getIntValue("vote_count");
        String posterPath = detail.getString("poster_path");
        MovieDetail md = new MovieDetail(title, originalTitle, null, overview, runtime, genres, releaseDate, countries, voteAverage, voteCount, null, false, 0, 0, null, null, null, null);
        return new MovieCardData(md, posterPath);
    }

    private static JSONObject tmdbGet(String apiKey, String path, Map<String, String> params) throws Exception {
        if (apiKey == null || apiKey.isBlank()) {
            throw new IllegalArgumentException("TMDB apiKey \u4e0d\u80fd\u4e3a\u7a7a");
        }
        LinkedHashMap<String, String> query = new LinkedHashMap<String, String>();
        if (params != null) {
            query.putAll(params);
        }
        query.put("api_key", apiKey);
        StringBuilder url = new StringBuilder("https://api.themoviedb.org/3").append(path).append("?");
        boolean first = true;
        for (Map.Entry e : query.entrySet()) {
            if (!first) {
                url.append("&");
            }
            first = false;
            url.append(URLEncoder.encode((String)e.getKey(), StandardCharsets.UTF_8)).append("=").append(URLEncoder.encode(e.getValue() == null ? "" : (String)e.getValue(), StandardCharsets.UTF_8));
        }
        HttpRequest req = HttpRequest.newBuilder().uri(URI.create(url.toString())).timeout(Duration.ofSeconds(15L)).GET().build();
        HttpResponse<byte[]> resp = HTTP.send(req, HttpResponse.BodyHandlers.ofByteArray());
        if (resp.statusCode() / 100 != 2) {
            throw new IOException("TMDB \u8bf7\u6c42\u5931\u8d25: " + resp.statusCode() + " " + String.valueOf(url));
        }
        return JSON.parseObject((byte[])resp.body());
    }

    public static BufferedImage downloadPoster(String posterPath) throws Exception {
        if (posterPath == null || posterPath.isBlank()) {
            return null;
        }
        return MovieCardRenderer.downloadPosterFromUrl("https://image.tmdb.org/t/p/w500" + posterPath);
    }

    public static BufferedImage downloadPosterFromUrl(String url) throws Exception {
        if (url == null || url.isBlank()) {
            return null;
        }
        if (!url.startsWith("http://") && !url.startsWith("https://")) {
            return MovieCardRenderer.readResourceImage(POSTER_RES);
        }
        HttpRequest req = HttpRequest.newBuilder().uri(URI.create(url)).timeout(Duration.ofSeconds(20L)).GET().build();
        HttpResponse<byte[]> resp = HTTP.send(req, HttpResponse.BodyHandlers.ofByteArray());
        if (resp.statusCode() != 200) {
            throw new IOException("poster download failed: " + resp.statusCode());
        }
        return ImageIO.read(new ByteArrayInputStream(resp.body()));
    }

    public static void generateHorizontalCardFromUrl(MovieDetail detail, String posterUrl, Path outPath) throws Exception {
        BufferedImage poster = MovieCardRenderer.downloadPosterFromUrl(posterUrl);
        MovieCardRenderer.generateHorizontalCard(detail, poster, outPath);
    }

    public static void generateHorizontalCardFromUrl(MovieDetail detail, String posterUrl, Path outPath, Path chFontPath, Path enFontPath) throws Exception {
        BufferedImage poster = MovieCardRenderer.downloadPosterFromUrl(posterUrl);
        MovieCardRenderer.generateHorizontalCard(detail, poster, outPath, chFontPath, enFontPath);
    }

    public static byte[] generateHorizontalCardBytesFromUrl(MovieDetail detail, String posterUrl) throws Exception {
        BufferedImage poster = MovieCardRenderer.downloadPosterFromUrl(posterUrl);
        return MovieCardRenderer.generateHorizontalCardToBytes(detail, poster);
    }

    public static void generateVerticalCardFromUrl(MovieDetail detail, String posterUrl, Path outPath) throws Exception {
        BufferedImage poster = MovieCardRenderer.downloadPosterFromUrl(posterUrl);
        MovieCardRenderer.generateVerticalCard(detail, poster, outPath);
    }

    public static void generateVerticalCardFromUrl(MovieDetail detail, String posterUrl, Path outPath, Path chFontPath, Path enFontPath) throws Exception {
        BufferedImage poster = MovieCardRenderer.downloadPosterFromUrl(posterUrl);
        MovieCardRenderer.generateVerticalCard(detail, poster, outPath, chFontPath, enFontPath);
    }

    public static byte[] generateVerticalCardBytesFromUrl(MovieDetail detail, String posterUrl) throws Exception {
        BufferedImage poster = MovieCardRenderer.downloadPosterFromUrl(posterUrl);
        return MovieCardRenderer.generateVerticalCardToBytes(detail, poster);
    }

    public static byte[] generatePlaybackCardToBytes(PlaybackDetail detail, BufferedImage backdrop, BufferedImage poster) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        MovieCardRenderer.generatePlaybackCardInternal(detail, backdrop, poster, baos, MovieCardRenderer.resourceFonts());
        return baos.toByteArray();
    }

    public static byte[] generatePlaybackCardToBytes(PlaybackDetail detail, BufferedImage backdrop) throws IOException {
        return MovieCardRenderer.generatePlaybackCardToBytes(detail, backdrop, null);
    }

    public static byte[] generatePlaybackCardBytesFromUrl(PlaybackDetail detail, String backdropUrl) throws Exception {
        BufferedImage backdrop = MovieCardRenderer.downloadPosterFromUrl(backdropUrl);
        return MovieCardRenderer.generatePlaybackCardToBytes(detail, backdrop, null);
    }

    private static void generatePlaybackCardInternal(PlaybackDetail detail, BufferedImage backdrop, BufferedImage poster, OutputStream out, RenderFonts fonts) throws IOException {
        BufferedImage bg;
        Objects.requireNonNull(detail, "detail");
        int W = 900;
        int H = 500;
        BufferedImage base = new BufferedImage(W, H, 2);
        BufferedImage bgSource = backdrop != null ? backdrop : poster;
        BufferedImage bufferedImage = bg = bgSource != null ? MovieCardRenderer.resizeCrop(bgSource, W, H) : MovieCardRenderer.gradientBg(W, H);
        if (backdrop == null && poster != null) {
            bg = MovieCardRenderer.blur(bg, 15);
        }
        MovieCardRenderer.pasteImage(base, MovieCardRenderer.toRgba(bg), 0, 0);
        Graphics2D g = MovieCardRenderer.gfx(base);
        GradientPaint gradient = new GradientPaint(0.0f, 0.0f, new Color(0, 0, 0, 60), 0.0f, H, new Color(0, 0, 0, 220));
        g.setPaint(gradient);
        g.fillRect(0, 0, W, H);
        Font titleFont = MovieCardRenderer.derive(fonts.title().deriveFont(1), 48.0f);
        Font subtitleFont = MovieCardRenderer.derive(fonts.subTitle(), 15.0f);
        Font infoFont = MovieCardRenderer.derive(fonts.info(), 15.0f);
        Font buttonFont = MovieCardRenderer.derive(fonts.subTitle().deriveFont(1), 15.0f);
        Color textWhite = new Color(255, 255, 255);
        Color textGray = new Color(245, 245, 245);
        Color glassBg = new Color(255, 255, 255, 40);
        Color glassBorder = new Color(255, 255, 255, 90);
        int margin = 50;
        int y = H - 200;
        int posterW = 0;
        if (poster != null) {
            int posterTargetW;
            int posterTargetH = 280;
            posterW = posterTargetW = (int)((double)posterTargetH * 2.0 / 3.0);
            int posterX = W - margin - posterTargetW;
            int posterY = (H - posterTargetH) / 2;
            g.setColor(new Color(0, 0, 0, 100));
            g.fillRoundRect(posterX + 6, posterY + 6, posterTargetW, posterTargetH, 12, 12);
            BufferedImage croppedPoster = MovieCardRenderer.resizeCrop(poster, posterTargetW, posterTargetH);
            BufferedImage roundedPoster = MovieCardRenderer.makeRoundedCorner(croppedPoster, 12);
            g.drawImage((Image)roundedPoster, posterX, posterY, null);
        }
        int contentMaxWidth = W - margin * 2 - (poster != null ? posterW + 40 : 0);
        g.setFont(titleFont);
        String title = detail.title() != null ? detail.title() : "\u672a\u77e5\u6807\u9898";
        FontRenderContext frc = g.getFontRenderContext();
        List<String> titleLines = MovieCardRenderer.wrapText(title, titleFont, frc, contentMaxWidth);
        FontMetrics titleMetrics = g.getFontMetrics();
        int lineHeight = titleMetrics.getHeight() - 10;
        y = titleLines.size() > 1 ? H - 250 : H - 220;
        for (String line : titleLines) {
            g.setColor(new Color(255, 200, 100, 60));
            g.drawString(line, margin - 2, y - 2);
            g.drawString(line, margin + 2, y - 2);
            g.drawString(line, margin - 2, y + 2);
            g.drawString(line, margin + 2, y + 2);
            g.setColor(new Color(255, 220, 150, 40));
            g.drawString(line, margin - 3, y - 3);
            g.drawString(line, margin + 3, y + 3);
            GradientPaint titleGradient = new GradientPaint(margin, y - titleMetrics.getHeight(), new Color(255, 215, 120), margin + titleMetrics.stringWidth(line), y, new Color(255, 255, 255));
            g.setPaint(titleGradient);
            g.drawString(line, margin, y);
            y += 50;
        }
        y -= 10;
        if (detail.subtitle() != null && !detail.subtitle().isBlank()) {
            g.setFont(subtitleFont);
            g.setColor(textGray);
            String displaySubtitle = MovieCardRenderer.shrinkWithEllipsis(detail.subtitle(), subtitleFont, frc, contentMaxWidth);
            g.drawString(displaySubtitle, margin, y);
            y += 22;
        }
        if (detail.resolution() != null && !detail.resolution().isBlank()) {
            g.setFont(infoFont);
            g.setColor(textGray);
            g.drawString("\u89c4\u683c\uff1a" + detail.resolution(), margin, y);
            y += 22;
        }
        if (detail.duration() != null && !detail.duration().isBlank()) {
            g.setFont(infoFont);
            g.setColor(textGray);
            g.drawString("\u5f71\u7247\u65f6\u957f\uff1a" + detail.duration(), margin, y);
            y += 22;
        }
        if (detail.date() != null && !detail.date().isBlank()) {
            g.setFont(infoFont);
            g.setColor(textGray);
            g.drawString("\u64ad\u653e\u65f6\u95f4\uff1a" + detail.date(), margin, y);
            y += 22;
        }
        if (detail.genres() != null && !detail.genres().isEmpty()) {
            g.setFont(infoFont);
            g.setColor(textGray);
            String genresStr = String.join((CharSequence)", ", detail.genres());
            g.drawString(genresStr, margin, y);
            y += 22;
        }
        if (detail.userName() != null && !detail.userName().isBlank()) {
            g.setFont(infoFont);
            g.setColor(textGray);
            g.drawString("\u7528\u6237\u540d\u79f0\uff1a" + detail.userName(), margin, y);
            y += 22;
        }
        if (detail.serverName() != null && !detail.serverName().isBlank()) {
            g.setFont(infoFont);
            g.setColor(textGray);
            g.drawString("\u64ad\u653e\u5730\u5740\uff1a" + detail.serverName(), margin, y);
        }
        String buttonText = detail.isPlaying() ? "\u25b6 \u64ad\u653e" : "|| \u6682\u505c";
        g.setFont(buttonFont);
        FontMetrics fm = g.getFontMetrics();
        int btnTextWidth = fm.stringWidth(buttonText);
        int buttonPaddingX = 24;
        int buttonPaddingY = 10;
        int buttonW = btnTextWidth + buttonPaddingX * 2;
        int buttonH = fm.getHeight() + buttonPaddingY * 2;
        int buttonX = margin;
        int buttonY = H - 65;
        int buttonRadius = buttonH;
        g.setColor(glassBg);
        g.fillRoundRect(buttonX, buttonY, buttonW, buttonH, buttonRadius, buttonRadius);
        g.setColor(glassBorder);
        g.setStroke(new BasicStroke(1.5f));
        g.drawRoundRect(buttonX, buttonY, buttonW, buttonH, buttonRadius, buttonRadius);
        g.setColor(textWhite);
        int textX = buttonX + buttonPaddingX;
        int textY = buttonY + buttonPaddingY + fm.getAscent();
        g.drawString(buttonText, textX, textY);
        MovieCardRenderer.pasteLogo(base, W - margin - 100, W - margin, H - 55, 28, false);
        g.dispose();
        MovieCardRenderer.writeJpeg(base, out, 0.78f);
    }

    public static void main(String[] args) throws Exception {
        String apiKey = "your_tmdb_key";
        MovieCardData data = MovieCardRenderer.fetchMovieByQuery(apiKey, "\u6d41\u6d6a\u5730\u74032");
        BufferedImage poster = MovieCardRenderer.downloadPosterFromUrl("https://image.tmdb.org/t/p/w500" + data.posterPath());
        MovieCardRenderer.generateHorizontalCard(data.detail(), poster, Path.of("out-horizontal.jpg", new String[0]));
        MovieCardRenderer.generateVerticalCard(data.detail(), poster, Path.of("out-vertical.jpg", new String[0]));
        byte[] horizontal = MovieCardRenderer.generateHorizontalCardBytesFromUrl(data.detail(), "https://image.tmdb.org/t/p/w500" + data.posterPath());
        byte[] vertical = MovieCardRenderer.generateVerticalCardBytesFromUrl(data.detail(), "https://image.tmdb.org/t/p/w500" + data.posterPath());
    }

    private record RenderFonts(Font title, Font subTitle, Font info, Font small, Font ratingBig, Font ratingSmall) {
    }

    public record MovieDetail(String title, String originalTitle, String displayTitle, String overview, int runtime, List<String> genres, String releaseDate, List<String> productionCountries, double voteAverage, int voteCount, String serverUrl, boolean tvSeries, int seasonNumber, int episodeNumber, String downloadCurrent, String downloadStatus, String downloadError, Boolean success) {
    }

    public record MovieCardData(MovieDetail detail, String posterPath) {
    }

    public record PlaybackDetail(String title, String subtitle, String duration, String date, String resolution, List<String> genres, boolean isPlaying, String userName, String serverName) {
    }
}

