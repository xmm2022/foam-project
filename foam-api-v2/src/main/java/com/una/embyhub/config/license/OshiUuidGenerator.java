/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  oshi.SystemInfo
 *  oshi.hardware.HardwareAbstractionLayer
 */
package com.una.embyhub.config.license;

import java.util.UUID;
import lombok.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import oshi.SystemInfo;
import oshi.hardware.HardwareAbstractionLayer;

public class OshiUuidGenerator {
    @Generated
    private static final Logger log = LoggerFactory.getLogger(OshiUuidGenerator.class);

    public static String generateFixedSystemUUID() {
        SystemInfo systemInfo = new SystemInfo();
        HardwareAbstractionLayer hardware = systemInfo.getHardware();
        String processorId = OshiUuidGenerator.getProcessorId(hardware);
        String motherboardSerial = OshiUuidGenerator.getMotherboardSerial(hardware);
        String systemUUID = OshiUuidGenerator.getSystemUUID(hardware);
        String uuidInput = processorId + "-" + motherboardSerial + "-" + systemUUID;
        UUID uuid = UUID.nameUUIDFromBytes(uuidInput.getBytes());
        return uuid.toString();
    }

    private static String getProcessorId(HardwareAbstractionLayer hardware) {
        try {
            String id = hardware.getProcessor().getProcessorIdentifier().getProcessorID();
            return id != null ? id : "UNKNOWN_PROCESSOR";
        }
        catch (Exception e) {
            return "UNKNOWN_PROCESSOR";
        }
    }

    private static String getMotherboardSerial(HardwareAbstractionLayer hardware) {
        try {
            String serial = hardware.getComputerSystem().getBaseboard().getSerialNumber();
            return serial != null ? serial : "UNKNOWN_MOTHERBOARD";
        }
        catch (Exception e) {
            return "UNKNOWN_MOTHERBOARD";
        }
    }

    private static String getSystemUUID(HardwareAbstractionLayer hardware) {
        try {
            String uuid = hardware.getComputerSystem().getHardwareUUID();
            return uuid != null ? uuid : "UNKNOWN_SYSTEM_UUID";
        }
        catch (Exception e) {
            return "UNKNOWN_SYSTEM_UUID";
        }
    }
}
