package org.ccasro.level2.observer;

public class StockAgency implements Observer{
    private String name;

    public StockAgency(String name) {
        this.name = name;
    }

    @Override
    public void update(double stockExchangePrice) {
        System.out.println("Agency " + name + " received an update: Stock price = " + stockExchangePrice);
    }
}
