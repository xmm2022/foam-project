/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  oshi.SystemInfo
 *  oshi.hardware.Baseboard
 *  oshi.hardware.CentralProcessor
 *  oshi.hardware.ComputerSystem
 *  oshi.hardware.Firmware
 *  oshi.hardware.GlobalMemory
 *  oshi.hardware.HWDiskStore
 *  oshi.hardware.HardwareAbstractionLayer
 *  oshi.software.os.OperatingSystem
 */
package com.una.embyhub.config.license;

import java.net.NetworkInterface;
import java.net.SocketException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import lombok.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import oshi.SystemInfo;
import oshi.hardware.Baseboard;
import oshi.hardware.CentralProcessor;
import oshi.hardware.ComputerSystem;
import oshi.hardware.Firmware;
import oshi.hardware.GlobalMemory;
import oshi.hardware.HWDiskStore;
import oshi.hardware.HardwareAbstractionLayer;
import oshi.software.os.OperatingSystem;

public class HardwareInfoUtil {
    @Generated
    private static final Logger log = LoggerFactory.getLogger(HardwareInfoUtil.class);

    public static String generateMachineUUID() {
        StringBuilder hardwareInfo = new StringBuilder();
        try {
            SystemInfo systemInfo = new SystemInfo();
            HardwareAbstractionLayer hardware = systemInfo.getHardware();
            OperatingSystem os = systemInfo.getOperatingSystem();
            CentralProcessor processor = hardware.getProcessor();
            hardwareInfo.append(processor.getProcessorIdentifier().getProcessorID()).append("-");
            ComputerSystem computerSystem = hardware.getComputerSystem();
            Baseboard baseboard = computerSystem.getBaseboard();
            Firmware firmware = computerSystem.getFirmware();
            hardwareInfo.append(baseboard.getSerialNumber()).append(firmware.getVersion()).append("-");
            HardwareInfoUtil.addDiskInfo(hardware, hardwareInfo);
            GlobalMemory memory = hardware.getMemory();
            hardwareInfo.append(memory.getTotal()).append("-");
            hardwareInfo.append(os.getVersionInfo().getBuildNumber()).append(os.getFamily()).append("-");
            return HardwareInfoUtil.generateUUID(hardwareInfo.toString());
        }
        catch (Exception e) {
            throw new RuntimeException("\u751f\u6210\u673a\u5668UUID\u5931\u8d25", e);
        }
    }

    private static void addMacAddresses(StringBuilder hardwareInfo) throws SocketException {
        Enumeration<NetworkInterface> interfaces = NetworkInterface.getNetworkInterfaces();
        ArrayList<String> macAddresses = new ArrayList<String>();
        while (interfaces.hasMoreElements()) {
            byte[] byArray;
            NetworkInterface ni = interfaces.nextElement();
            if (ni == null || ni.isLoopback() || !ni.isUp() || (byArray = ni.getHardwareAddress()) == null || byArray.length <= 0) continue;
            StringBuilder sb = new StringBuilder();
            for (byte b : byArray) {
                sb.append(String.format("%02X:", b));
            }
            if (sb.length() <= 0) continue;
            sb.deleteCharAt(sb.length() - 1);
            macAddresses.add(sb.toString());
        }
        Collections.sort(macAddresses);
        for (String string : macAddresses) {
            hardwareInfo.append(string).append("-");
        }
    }

    private static void addDiskInfo(HardwareAbstractionLayer hardware, StringBuilder hardwareInfo) {
        List diskStores = hardware.getDiskStores();
        for (HWDiskStore disk : diskStores) {
            hardwareInfo.append(disk.getModel()).append(disk.getSerial()).append("-");
        }
    }

    private static String generateUUID(String input) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hash = md.digest(input.getBytes());
            StringBuilder hexString = new StringBuilder();
            for (byte b : hash) {
                String hex = String.format("%02x", b);
                hexString.append(hex);
            }
            return hexString.toString().substring(0, 32);
        }
        catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("\u751f\u6210UUID\u5931\u8d25", e);
        }
    }
}
