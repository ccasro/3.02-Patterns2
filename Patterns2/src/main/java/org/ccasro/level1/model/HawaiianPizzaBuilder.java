package org.ccasro.level1.model;

import org.ccasro.level1.builder.PizzaBuilder;

import java.util.List;

public class HawaiianPizzaBuilder implements PizzaBuilder {

    private Pizza pizza;

    public HawaiianPizzaBuilder() {
        this.pizza = new Pizza();
    }

    @Override
    public void buildSize() { pizza.setSize(30);}

    @Override
    public void buildDough() { pizza.setDough("Classic");}

    @Override
    public void buildToppings() { pizza.setToppings(List.of("Chicken", "Cheese", "Barbecue"));}

    @Override
    public Pizza getPizza() { return pizza; }
}
