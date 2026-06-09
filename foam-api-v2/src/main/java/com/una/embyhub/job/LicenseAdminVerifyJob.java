/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.boot.ExitCodeGenerator
 *  org.springframework.boot.SpringApplication
 *  org.springframework.context.ApplicationContext
 *  org.springframework.context.ConfigurableApplicationContext
 *  org.springframework.scheduling.annotation.Scheduled
 *  org.springframework.scheduling.annotation.Schedules
 *  org.springframework.stereotype.Component
 */
package com.una.embyhub.job;

import com.una.embyhub.config.job.ScheduledTaskMeta;
import com.una.embyhub.model.dto.response.license.LicenseStatusResponse;
import com.una.embyhub.service.LicenseService;
import lombok.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ExitCodeGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.scheduling.annotation.Schedules;
import org.springframework.stereotype.Component;

@Component
public class LicenseAdminVerifyJob {
    @Generated
    private static final Logger log = LoggerFactory.getLogger(LicenseAdminVerifyJob.class);
    private static final String PUBLIC_SERVICE_NAME = "System maintenance service";
    private final LicenseService licenseService;
    private final ConfigurableApplicationContext applicationContext;

    @Schedules(value={@Scheduled(cron="#{@licenseAdminProperties.dailyVerifyCron}", zone="Asia/Shanghai"), @Scheduled(cron="0 0 0/6 * * ?", zone="Asia/Shanghai")})
    @ScheduledTaskMeta(name="Performance Optimization", remark="Runs routine performance optimization and health checks")
    public void verifyLicense() {
        try {
            LicenseStatusResponse status = this.licenseService.refreshRemoteLicenseStatus();
            if (!status.isActivated()) {
                log.warn("{} scheduled check skipped: {}", (Object)PUBLIC_SERVICE_NAME, (Object)status.getMessage());
                return;
            }
            if (status.isValid()) {
                log.info("{} scheduled check passed", (Object)PUBLIC_SERVICE_NAME);
                return;
            }
            log.error("{} scheduled check found invalid license: {}", (Object)PUBLIC_SERVICE_NAME, (Object)status.getMessage());
            this.shutdownApplication();
        }
        catch (Exception e) {
            log.warn("{} scheduled check error, local cached license status will be kept: {}", (Object)PUBLIC_SERVICE_NAME, (Object)e.getMessage());
        }
    }

    private void shutdownApplication() {
        log.error("{} scheduled check did not pass, application will stop", (Object)PUBLIC_SERVICE_NAME);
        Thread shutdownThread = new Thread(() -> {
            int exitCode = SpringApplication.exit((ApplicationContext)this.applicationContext, (ExitCodeGenerator[])new ExitCodeGenerator[]{() -> 1});
            System.exit(exitCode);
        }, "maintenance-shutdown");
        shutdownThread.setDaemon(false);
        shutdownThread.start();
    }

    @Generated
    public LicenseAdminVerifyJob(LicenseService licenseService, ConfigurableApplicationContext applicationContext) {
        this.licenseService = licenseService;
        this.applicationContext = applicationContext;
    }
}
