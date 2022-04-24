package com;

import java.util.Scanner;

public class StockTest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String symbol;
        String name;
        double prevPrice;
        double newPrice;

        System.out.println("Enter new com.Stock symbol: ");
        symbol = input.next();
        System.out.println("Enter new com.Stock name: ");
        name = input.next();

        Stock stock = new Stock(symbol,name);

        System.out.println("Enter previous closing price");
        prevPrice = input.nextDouble();
        stock.setPreviousClosingPrice(prevPrice);

        System.out.println("Enter current price: ");
        newPrice = input.nextDouble();
        stock.setCurrentPrice(newPrice);

        System.out.println("Symbol of com.Stock: " + stock.getSymbol());
        System.out.println("Name of com.Stock: " + stock.getName());
        System.out.printf("Previous closing price:  %.2f \n", stock.getPreviousClosingPrice());
        System.out.printf("Current price: %.2f \n", stock.getCurrentPrice());
        System.out.printf("Change percent: %.2f \n", stock.changePercent());

    }
}
