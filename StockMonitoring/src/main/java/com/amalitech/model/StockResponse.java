package com.amalitech.model;

import com.google.gson.annotations.SerializedName;

public class StockResponse {

    @SerializedName("symbol")
    private String symbol;

    @SerializedName("price")
    private double price;

    @SerializedName("timestamp")
    private String timestamp;

    @SerializedName("volume")
    private long volume;

    // Getters and Setters
    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public long getVolume() {
        return volume;
    }

    public void setVolume(long volume) {
        this.volume = volume;
    }

    // Method to get the latest price of the stock
    public double getLatestPrice() {
        return this.price;
    }

    @Override
    public String toString() {
        return "StockResponse{" +
                "symbol='" + symbol + '\'' +
                ", price=" + price +
                ", timestamp='" + timestamp + '\'' +
                ", volume=" + volume +
                '}';
    }
}


