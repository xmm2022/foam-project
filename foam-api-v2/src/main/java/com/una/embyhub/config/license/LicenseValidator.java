/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.boot.ApplicationArguments
 *  org.springframework.boot.ApplicationRunner
 *  org.springframework.stereotype.Component
 */
package com.una.embyhub.config.license;

import com.una.embyhub.config.license.OshiUuidGenerator;
import lombok.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class LicenseValidator
implements ApplicationRunner {
    @Generated
    private static final Logger log = LoggerFactory.getLogger(LicenseValidator.class);

    public void run(ApplicationArguments args) {
        String machineUUID = OshiUuidGenerator.generateFixedSystemUUID();
        log.info("\u5f53\u524d\u673a\u5668UUID: {}", (Object)machineUUID);
    }
}
