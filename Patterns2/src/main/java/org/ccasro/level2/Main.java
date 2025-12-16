package org.ccasro.level2;


import org.ccasro.level2.observable.StockAgent;
import org.ccasro.level2.observer.StockAgency;

public class Main {
    public static void main (String[] args) {

        StockAgency a1 = new StockAgency("Agency1");
        StockAgency a2 = new StockAgency("Agency2");
        StockAgency a3 = new StockAgency("Agency3");

        StockAgent agent = new StockAgent();

        agent.addObserver(a1);
        agent.addObserver(a2);

        agent.setPrice(5000);

        agent.removeObserver(a1);
        agent.addObserver(a3);

        agent.setPrice(7000);
    }
}
