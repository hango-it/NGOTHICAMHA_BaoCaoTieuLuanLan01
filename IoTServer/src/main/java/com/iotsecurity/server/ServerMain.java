package com.iotsecurity.server;

public class ServerMain {

    public static void main(String[] args) {

        System.out.println("========== IoT DATA SECURITY ==========\n");

        // Tạo dữ liệu cảm biến
        SensorData sensor = new SensorData(
                30.5,
                "TP.HCM",
                "2026-07-16 22:00"
        );

        // Dữ liệu JSON
        String json = sensor.toString();

        System.out.println("Dữ liệu gốc:");
        System.out.println(json);

        System.out.println("\n--------------------------------");

        // Hash
        String hash = HashUtil.sha256(json);

        System.out.println("SHA-256:");
        System.out.println(hash);

        System.out.println("\n--------------------------------");

        // AES
        String encrypted = AESUtil.encrypt(json);

        System.out.println("AES Encrypted:");
        System.out.println(encrypted);

        System.out.println("\n--------------------------------");

        String decrypted = AESUtil.decrypt(encrypted);

        System.out.println("AES Decrypted:");
        System.out.println(decrypted);

        System.out.println("\n--------------------------------");

        // Token
        String token = TokenUtil.generateToken();

        System.out.println("Device Token:");
        System.out.println(token);

        System.out.println("\n--------------------------------");

        boolean valid = TokenUtil.verifyToken(token);

        System.out.println("Token hợp lệ: " + valid);

        System.out.println("\n========== KẾT THÚC ==========");
    }

}