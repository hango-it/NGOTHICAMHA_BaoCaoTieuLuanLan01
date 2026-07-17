package com.iotsecurity.server;

import java.time.LocalDateTime;
import java.io.PrintWriter;
import java.net.Socket;

public class IoTClient {

    public static void main(String[] args) {

        try {

            // Tạo dữ liệu cảm biến
            SensorData sensor = new SensorData(
                    29.8,
                    "TP.HCM",
                    LocalDateTime.now().toString()
            );

            // Chuyển sang JSON
            String json = sensor.toString();

            System.out.println("========== IoT CLIENT ==========");
            System.out.println("Dữ liệu gốc:");
            System.out.println(json);

            // Hash SHA-256
            String hash = HashUtil.sha256(json);

            System.out.println("\nSHA-256:");
            System.out.println(hash);

            // Mã hóa AES
            String encrypted = AESUtil.encrypt(json);

            System.out.println("\nAES Encrypted:");
            System.out.println(encrypted);

            // Sinh Token
            String token = TokenUtil.generateToken();

            System.out.println("\nDevice Token:");
            System.out.println(token);

            // Kết nối đến Server
            Socket socket = new Socket("localhost", 5000);

            // Gửi dữ liệu đã mã hóa
            PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);
            writer.println(encrypted);

            System.out.println("\nĐã gửi dữ liệu đến Server!");

            writer.close();
            socket.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}