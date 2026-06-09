/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  cn.hutool.json.JSONUtil
 *  jakarta.annotation.PostConstruct
 *  lombok.Generated
 *  org.springframework.stereotype.Component
 *  org.springframework.util.StringUtils
 */
package com.una.embyhub.config.license;

import cn.hutool.json.JSONUtil;
import jakarta.annotation.PostConstruct;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.OAEPParameterSpec;
import javax.crypto.spec.PSource;
import lombok.Generated;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

@Component
public class LicenseAdminProperties {
    private static final String ENCRYPTED_CONFIG = "R+G4ecR5fsP5p52HjRk+9RLy5LIVVpcKH3YoxWzS908JRLFrn5tZKhaJH/vGPB/MEb0IGKsnfcrZNyiXnYjiBUva1M8jaIFm4C0dmzzUrKjn5f/lEsQdQuIgdrTckFuWbtiW1XSR+qiGWem8eg+Ou4fQn1uoGVg0g43Rt57iuh10SgOuqRlgG/GJwGpoNaoh4QVnUf8HYLONUUNLS59JHSoXc8bQ+wxUvX93/fgsohPPDhc+LZkLhUhM3CyEgp2oAAQ+rWnjJ04fBTOuctG8GLkNcY6ug15WnUcOx9N8yTDSg1yQIlaDVUglyA9sJOjLB/mhGfx2sFw9d4Q1ctTC3qSa4zgkU7AKI0LuAQJQSo8bsTGQEM2c34kItVVByU2SLAXDKGcqZ+sqW6unkJdp+ltVZL1ZSLxalIyrXMYkE1/Yz3vmAAwTagngWVDDQDkm7b5IbTs+tFxQd1r/CGj5CCYFzhWhW5atVmzM+uAagy+yxxGrxGfOrWmvrGjtuJvA9/ndBVTCCAYXqZKgSSp4r0CZTIH0918uMquGumuv91jrX5VKhqcBDTn2GOS81l1NFanQSG7CpLPzv2vmxNnjItVCk04fwEtWLVEhSuAek67Go1LY57bJ4ms1li7rAujl2QyN3YNy5muISMKeYP9v/PGoiSBbQyk10P+BaZfTqLw=";
    private static final String PRIVATE_KEY_PEM = "-----BEGIN PRIVATE KEY-----\n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\nRxArXr/7suPaaoXbqjZ7vYwVYfpWK7c=\n-----END PRIVATE KEY-----\n";
    private String baseUrl;
    private String clientId;
    private String clientSecret;
    private String systemCode;
    private int timeoutMs;
    private String dailyVerifyCron;
    private String verifyPath;
    private String unbindPath;
    private String registerPath;
    private String activatePath;

    @PostConstruct
    public void load() {
        try {
            SecureConfig config = (SecureConfig)JSONUtil.toBean((String)this.decryptConfig(), SecureConfig.class);
            this.baseUrl = this.requireText(config.getBaseUrl(), "License service base URL is missing");
            this.clientId = this.requireText(config.getClientId(), "License service client ID is missing");
            this.clientSecret = this.requireText(config.getClientSecret(), "License service client secret is missing");
            this.systemCode = this.requireText(config.getSystemCode(), "License service system code is missing");
            this.timeoutMs = config.getTimeoutMs() <= 0 ? 10000 : config.getTimeoutMs();
            this.dailyVerifyCron = this.requireText(config.getDailyVerifyCron(), "License daily verification cron is missing");
            this.verifyPath = this.requireText(config.getPaths().getVerify(), "License verification path is missing");
            this.unbindPath = StringUtils.hasText((String)config.getPaths().getUnbind()) ? config.getPaths().getUnbind().trim() : "/api/open/license/unbind";
            this.registerPath = this.requireText(config.getPaths().getRegister(), "User registration path is missing");
            this.activatePath = this.requireText(config.getPaths().getActivate(), "User activation path is missing");
        }
        catch (Exception e) {
            throw new IllegalStateException("Failed to decrypt license service configuration", e);
        }
    }

    private String decryptConfig() throws Exception {
        byte[] cipherBytes = Base64.getMimeDecoder().decode(this.encryptedConfig());
        Cipher cipher = Cipher.getInstance("RSA/ECB/OAEPPadding");
        OAEPParameterSpec oaep = new OAEPParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA256, PSource.PSpecified.DEFAULT);
        cipher.init(2, (Key)this.privateKey(), oaep);
        return new String(cipher.doFinal(cipherBytes), StandardCharsets.UTF_8);
    }

    private PrivateKey privateKey() throws Exception {
        String pem = this.privateKeyPem().replace("-----BEGIN PRIVATE KEY-----", "").replace("-----END PRIVATE KEY-----", "").replaceAll("\\s+", "");
        byte[] keyBytes = Base64.getDecoder().decode(pem);
        return KeyFactory.getInstance("RSA").generatePrivate(new PKCS8EncodedKeySpec(keyBytes));
    }

    private String encryptedConfig() throws Exception {
        return ENCRYPTED_CONFIG;
    }

    private String privateKeyPem() throws Exception {
        return PRIVATE_KEY_PEM;
    }

    private String requireText(String value, String message) {
        if (!StringUtils.hasText((String)value)) {
            throw new IllegalStateException(message);
        }
        return value.trim();
    }

    @Generated
    public LicenseAdminProperties() {
    }

    @Generated
    public String getBaseUrl() {
        return this.baseUrl;
    }

    @Generated
    public String getClientId() {
        return this.clientId;
    }

    @Generated
    public String getClientSecret() {
        return this.clientSecret;
    }

    @Generated
    public String getSystemCode() {
        return this.systemCode;
    }

    @Generated
    public int getTimeoutMs() {
        return this.timeoutMs;
    }

    @Generated
    public String getDailyVerifyCron() {
        return this.dailyVerifyCron;
    }

    @Generated
    public String getVerifyPath() {
        return this.verifyPath;
    }

    @Generated
    public String getUnbindPath() {
        return this.unbindPath;
    }

    @Generated
    public String getRegisterPath() {
        return this.registerPath;
    }

    @Generated
    public String getActivatePath() {
        return this.activatePath;
    }

    @Generated
    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    @Generated
    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    @Generated
    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
    }

    @Generated
    public void setSystemCode(String systemCode) {
        this.systemCode = systemCode;
    }

    @Generated
    public void setTimeoutMs(int timeoutMs) {
        this.timeoutMs = timeoutMs;
    }

    @Generated
    public void setDailyVerifyCron(String dailyVerifyCron) {
        this.dailyVerifyCron = dailyVerifyCron;
    }

    @Generated
    public void setVerifyPath(String verifyPath) {
        this.verifyPath = verifyPath;
    }

    @Generated
    public void setUnbindPath(String unbindPath) {
        this.unbindPath = unbindPath;
    }

    @Generated
    public void setRegisterPath(String registerPath) {
        this.registerPath = registerPath;
    }

    @Generated
    public void setActivatePath(String activatePath) {
        this.activatePath = activatePath;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof LicenseAdminProperties)) {
            return false;
        }
        LicenseAdminProperties other = (LicenseAdminProperties)o;
        if (!other.canEqual(this)) {
            return false;
        }
        if (this.getTimeoutMs() != other.getTimeoutMs()) {
            return false;
        }
        String this$baseUrl = this.getBaseUrl();
        String other$baseUrl = other.getBaseUrl();
        if (this$baseUrl == null ? other$baseUrl != null : !this$baseUrl.equals(other$baseUrl)) {
            return false;
        }
        String this$clientId = this.getClientId();
        String other$clientId = other.getClientId();
        if (this$clientId == null ? other$clientId != null : !this$clientId.equals(other$clientId)) {
            return false;
        }
        String this$clientSecret = this.getClientSecret();
        String other$clientSecret = other.getClientSecret();
        if (this$clientSecret == null ? other$clientSecret != null : !this$clientSecret.equals(other$clientSecret)) {
            return false;
        }
        String this$systemCode = this.getSystemCode();
        String other$systemCode = other.getSystemCode();
        if (this$systemCode == null ? other$systemCode != null : !this$systemCode.equals(other$systemCode)) {
            return false;
        }
        String this$dailyVerifyCron = this.getDailyVerifyCron();
        String other$dailyVerifyCron = other.getDailyVerifyCron();
        if (this$dailyVerifyCron == null ? other$dailyVerifyCron != null : !this$dailyVerifyCron.equals(other$dailyVerifyCron)) {
            return false;
        }
        String this$verifyPath = this.getVerifyPath();
        String other$verifyPath = other.getVerifyPath();
        if (this$verifyPath == null ? other$verifyPath != null : !this$verifyPath.equals(other$verifyPath)) {
            return false;
        }
        String this$unbindPath = this.getUnbindPath();
        String other$unbindPath = other.getUnbindPath();
        if (this$unbindPath == null ? other$unbindPath != null : !this$unbindPath.equals(other$unbindPath)) {
            return false;
        }
        String this$registerPath = this.getRegisterPath();
        String other$registerPath = other.getRegisterPath();
        if (this$registerPath == null ? other$registerPath != null : !this$registerPath.equals(other$registerPath)) {
            return false;
        }
        String this$activatePath = this.getActivatePath();
        String other$activatePath = other.getActivatePath();
        return !(this$activatePath == null ? other$activatePath != null : !this$activatePath.equals(other$activatePath));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof LicenseAdminProperties;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        result = result * 59 + this.getTimeoutMs();
        String $baseUrl = this.getBaseUrl();
        result = result * 59 + ($baseUrl == null ? 43 : $baseUrl.hashCode());
        String $clientId = this.getClientId();
        result = result * 59 + ($clientId == null ? 43 : $clientId.hashCode());
        String $clientSecret = this.getClientSecret();
        result = result * 59 + ($clientSecret == null ? 43 : $clientSecret.hashCode());
        String $systemCode = this.getSystemCode();
        result = result * 59 + ($systemCode == null ? 43 : $systemCode.hashCode());
        String $dailyVerifyCron = this.getDailyVerifyCron();
        result = result * 59 + ($dailyVerifyCron == null ? 43 : $dailyVerifyCron.hashCode());
        String $verifyPath = this.getVerifyPath();
        result = result * 59 + ($verifyPath == null ? 43 : $verifyPath.hashCode());
        String $unbindPath = this.getUnbindPath();
        result = result * 59 + ($unbindPath == null ? 43 : $unbindPath.hashCode());
        String $registerPath = this.getRegisterPath();
        result = result * 59 + ($registerPath == null ? 43 : $registerPath.hashCode());
        String $activatePath = this.getActivatePath();
        result = result * 59 + ($activatePath == null ? 43 : $activatePath.hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "LicenseAdminProperties(baseUrl=" + this.getBaseUrl() + ", clientId=" + this.getClientId() + ", clientSecret=" + this.getClientSecret() + ", systemCode=" + this.getSystemCode() + ", timeoutMs=" + this.getTimeoutMs() + ", dailyVerifyCron=" + this.getDailyVerifyCron() + ", verifyPath=" + this.getVerifyPath() + ", unbindPath=" + this.getUnbindPath() + ", registerPath=" + this.getRegisterPath() + ", activatePath=" + this.getActivatePath() + ")";
    }

    public static class SecureConfig {
        private String baseUrl;
        private String clientId;
        private String clientSecret;
        private String systemCode;
        private int timeoutMs;
        private String dailyVerifyCron;
        private Paths paths = new Paths();

        @Generated
        public SecureConfig() {
        }

        @Generated
        public String getBaseUrl() {
            return this.baseUrl;
        }

        @Generated
        public String getClientId() {
            return this.clientId;
        }

        @Generated
        public String getClientSecret() {
            return this.clientSecret;
        }

        @Generated
        public String getSystemCode() {
            return this.systemCode;
        }

        @Generated
        public int getTimeoutMs() {
            return this.timeoutMs;
        }

        @Generated
        public String getDailyVerifyCron() {
            return this.dailyVerifyCron;
        }

        @Generated
        public Paths getPaths() {
            return this.paths;
        }

        @Generated
        public void setBaseUrl(String baseUrl) {
            this.baseUrl = baseUrl;
        }

        @Generated
        public void setClientId(String clientId) {
            this.clientId = clientId;
        }

        @Generated
        public void setClientSecret(String clientSecret) {
            this.clientSecret = clientSecret;
        }

        @Generated
        public void setSystemCode(String systemCode) {
            this.systemCode = systemCode;
        }

        @Generated
        public void setTimeoutMs(int timeoutMs) {
            this.timeoutMs = timeoutMs;
        }

        @Generated
        public void setDailyVerifyCron(String dailyVerifyCron) {
            this.dailyVerifyCron = dailyVerifyCron;
        }

        @Generated
        public void setPaths(Paths paths) {
            this.paths = paths;
        }

        @Generated
        public boolean equals(Object o) {
            if (o == this) {
                return true;
            }
            if (!(o instanceof SecureConfig)) {
                return false;
            }
            SecureConfig other = (SecureConfig)o;
            if (!other.canEqual(this)) {
                return false;
            }
            if (this.getTimeoutMs() != other.getTimeoutMs()) {
                return false;
            }
            String this$baseUrl = this.getBaseUrl();
            String other$baseUrl = other.getBaseUrl();
            if (this$baseUrl == null ? other$baseUrl != null : !this$baseUrl.equals(other$baseUrl)) {
                return false;
            }
            String this$clientId = this.getClientId();
            String other$clientId = other.getClientId();
            if (this$clientId == null ? other$clientId != null : !this$clientId.equals(other$clientId)) {
                return false;
            }
            String this$clientSecret = this.getClientSecret();
            String other$clientSecret = other.getClientSecret();
            if (this$clientSecret == null ? other$clientSecret != null : !this$clientSecret.equals(other$clientSecret)) {
                return false;
            }
            String this$systemCode = this.getSystemCode();
            String other$systemCode = other.getSystemCode();
            if (this$systemCode == null ? other$systemCode != null : !this$systemCode.equals(other$systemCode)) {
                return false;
            }
            String this$dailyVerifyCron = this.getDailyVerifyCron();
            String other$dailyVerifyCron = other.getDailyVerifyCron();
            if (this$dailyVerifyCron == null ? other$dailyVerifyCron != null : !this$dailyVerifyCron.equals(other$dailyVerifyCron)) {
                return false;
            }
            Paths this$paths = this.getPaths();
            Paths other$paths = other.getPaths();
            return !(this$paths == null ? other$paths != null : !((Object)this$paths).equals(other$paths));
        }

        @Generated
        protected boolean canEqual(Object other) {
            return other instanceof SecureConfig;
        }

        @Generated
        public int hashCode() {
            int PRIME = 59;
            int result = 1;
            result = result * 59 + this.getTimeoutMs();
            String $baseUrl = this.getBaseUrl();
            result = result * 59 + ($baseUrl == null ? 43 : $baseUrl.hashCode());
            String $clientId = this.getClientId();
            result = result * 59 + ($clientId == null ? 43 : $clientId.hashCode());
            String $clientSecret = this.getClientSecret();
            result = result * 59 + ($clientSecret == null ? 43 : $clientSecret.hashCode());
            String $systemCode = this.getSystemCode();
            result = result * 59 + ($systemCode == null ? 43 : $systemCode.hashCode());
            String $dailyVerifyCron = this.getDailyVerifyCron();
            result = result * 59 + ($dailyVerifyCron == null ? 43 : $dailyVerifyCron.hashCode());
            Paths $paths = this.getPaths();
            result = result * 59 + ($paths == null ? 43 : ((Object)$paths).hashCode());
            return result;
        }

        @Generated
        public String toString() {
            return "LicenseAdminProperties.SecureConfig(baseUrl=" + this.getBaseUrl() + ", clientId=" + this.getClientId() + ", clientSecret=" + this.getClientSecret() + ", systemCode=" + this.getSystemCode() + ", timeoutMs=" + this.getTimeoutMs() + ", dailyVerifyCron=" + this.getDailyVerifyCron() + ", paths=" + String.valueOf(this.getPaths()) + ")";
        }
    }

    public static class Paths {
        private String verify;
        private String unbind;
        private String register;
        private String activate;

        @Generated
        public Paths() {
        }

        @Generated
        public String getVerify() {
            return this.verify;
        }

        @Generated
        public String getUnbind() {
            return this.unbind;
        }

        @Generated
        public String getRegister() {
            return this.register;
        }

        @Generated
        public String getActivate() {
            return this.activate;
        }

        @Generated
        public void setVerify(String verify) {
            this.verify = verify;
        }

        @Generated
        public void setUnbind(String unbind) {
            this.unbind = unbind;
        }

        @Generated
        public void setRegister(String register) {
            this.register = register;
        }

        @Generated
        public void setActivate(String activate) {
            this.activate = activate;
        }

        @Generated
        public boolean equals(Object o) {
            if (o == this) {
                return true;
            }
            if (!(o instanceof Paths)) {
                return false;
            }
            Paths other = (Paths)o;
            if (!other.canEqual(this)) {
                return false;
            }
            String this$verify = this.getVerify();
            String other$verify = other.getVerify();
            if (this$verify == null ? other$verify != null : !this$verify.equals(other$verify)) {
                return false;
            }
            String this$unbind = this.getUnbind();
            String other$unbind = other.getUnbind();
            if (this$unbind == null ? other$unbind != null : !this$unbind.equals(other$unbind)) {
                return false;
            }
            String this$register = this.getRegister();
            String other$register = other.getRegister();
            if (this$register == null ? other$register != null : !this$register.equals(other$register)) {
                return false;
            }
            String this$activate = this.getActivate();
            String other$activate = other.getActivate();
            return !(this$activate == null ? other$activate != null : !this$activate.equals(other$activate));
        }

        @Generated
        protected boolean canEqual(Object other) {
            return other instanceof Paths;
        }

        @Generated
        public int hashCode() {
            int PRIME = 59;
            int result = 1;
            String $verify = this.getVerify();
            result = result * 59 + ($verify == null ? 43 : $verify.hashCode());
            String $unbind = this.getUnbind();
            result = result * 59 + ($unbind == null ? 43 : $unbind.hashCode());
            String $register = this.getRegister();
            result = result * 59 + ($register == null ? 43 : $register.hashCode());
            String $activate = this.getActivate();
            result = result * 59 + ($activate == null ? 43 : $activate.hashCode());
            return result;
        }

        @Generated
        public String toString() {
            return "LicenseAdminProperties.Paths(verify=" + this.getVerify() + ", unbind=" + this.getUnbind() + ", register=" + this.getRegister() + ", activate=" + this.getActivate() + ")";
        }
    }
}
