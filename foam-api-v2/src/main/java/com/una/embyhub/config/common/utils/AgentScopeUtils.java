/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.springframework.util.StringUtils
 */
package com.una.embyhub.config.common.utils;

import com.una.embyhub.config.common.exception.BizException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.springframework.util.StringUtils;

public class AgentScopeUtils {
    public static String normalizeScopePath(Path workspaceRoot, String scopePath) {
        if (!StringUtils.hasText((String)scopePath)) {
            return null;
        }
        Path rootPath = workspaceRoot.toAbsolutePath().normalize();
        Path resolvedPath = AgentScopeUtils.resolvePath(rootPath, scopePath);
        if (!Files.exists(resolvedPath, new LinkOption[0])) {
            throw new BizException("scopePath \u4e0d\u5b58\u5728: " + String.valueOf(resolvedPath));
        }
        if (resolvedPath.equals(rootPath)) {
            return null;
        }
        return AgentScopeUtils.normalizeRelativePath(rootPath, resolvedPath);
    }

    public static Path resolvePath(Path workspaceRoot, String path) {
        Path resolvedPath;
        Path rootPath = workspaceRoot.toAbsolutePath().normalize();
        String safePath = StringUtils.hasText((String)path) ? path.trim() : ".";
        Path candidate = Paths.get(safePath, new String[0]);
        Path path2 = resolvedPath = candidate.isAbsolute() ? candidate.toAbsolutePath().normalize() : rootPath.resolve(safePath).normalize();
        if (!resolvedPath.startsWith(rootPath)) {
            throw new BizException("\u8def\u5f84\u8d85\u51fa\u5141\u8bb8\u76ee\u5f55: " + safePath);
        }
        return resolvedPath;
    }

    public static String normalizeRelativePath(Path workspaceRoot, Path path) {
        Path rootPath = workspaceRoot.toAbsolutePath().normalize();
        Path normalizedPath = path.toAbsolutePath().normalize();
        if (!normalizedPath.startsWith(rootPath)) {
            throw new BizException("\u8def\u5f84\u8d85\u51fa\u5141\u8bb8\u76ee\u5f55: " + String.valueOf(normalizedPath));
        }
        if (normalizedPath.equals(rootPath)) {
            return ".";
        }
        return rootPath.relativize(normalizedPath).toString().replace('\\', '/');
    }

    public static boolean hasScope(String scopePath) {
        return StringUtils.hasText((String)scopePath) && !".".equals(scopePath.trim());
    }

    public static boolean isPathWithinScope(Path workspaceRoot, String scopePath, String path) {
        if (!AgentScopeUtils.hasScope(scopePath)) {
            return true;
        }
        Path scopeRoot = AgentScopeUtils.resolvePath(workspaceRoot, scopePath);
        Path targetPath = AgentScopeUtils.resolvePath(workspaceRoot, path);
        return targetPath.equals(scopeRoot) || targetPath.startsWith(scopeRoot);
    }
}
