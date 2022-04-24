package com;

public class Stock {
    private String symbol;
    private String name;
    private double previousClosingPrice;
    private double currentPrice;

    public Stock(String symbol, String name) {

        this.symbol = symbol != null ? symbol : "No symbol";
        this.name = name != null ? name : "No name";
        setCurrentPrice(0);
        setPreviousClosingPrice(0);
    }

    public String getSymbol() {
        return symbol;
    }

    public String getName() {
        return name;
    }

    public double getPreviousClosingPrice() {
        return previousClosingPrice;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public void setPreviousClosingPrice(double price) {
       this.previousClosingPrice = previousClosingPrice > 0 ? price : 0;
    }

    public void setCurrentPrice(double price) {
        this.currentPrice = currentPrice > 0 ? price : 0;

    }

    public double changePercent() {
        return ((previousClosingPrice - currentPrice) /  currentPrice) * 100;
    }
}
