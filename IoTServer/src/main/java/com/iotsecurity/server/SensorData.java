package com.iotsecurity.server;

public class SensorData {

    private double temperature;
    private String location;
    private String timestamp;

    public SensorData(double temperature, String location, String timestamp) {
        this.temperature = temperature;
        this.location = location;
        this.timestamp = timestamp;
    }

    public double getTemperature() {
        return temperature;
    }

    public String getLocation() {
        return location;
    }

    public String getTimestamp() {
        return timestamp;
    }

    @Override
    public String toString() {
        return "{"
                + "\"temperature\":" + temperature + ","
                + "\"location\":\"" + location + "\","
                + "\"timestamp\":\"" + timestamp + "\""
                + "}";
    }
}