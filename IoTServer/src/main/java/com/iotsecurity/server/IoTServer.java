package com.iotsecurity.server;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class IoTServer {

    public static void main(String[] args) {

        try {

            ServerSocket server = new ServerSocket(5000);

            System.out.println("=================================");
            System.out.println("   IoT SERVER STARTED");
            System.out.println("   Waiting for Client...");
            System.out.println("=================================");

            Socket client = server.accept();

            System.out.println("\nClient Connected!");

            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(client.getInputStream()));

            String message = reader.readLine();

            System.out.println("\nReceived Data:");
            System.out.println(message);

            reader.close();
            client.close();
            server.close();

            System.out.println("\nServer Closed.");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}