package org.ccasro.level1.model;

import org.ccasro.level1.builder.PizzaBuilder;

import java.util.List;

public class VegetarianPizzaBuilder implements PizzaBuilder {


    private Pizza pizza;

    public VegetarianPizzaBuilder() {
        this.pizza = new Pizza();
    }

    @Override
    public void buildSize() { pizza.setSize(20);}

    @Override
    public void buildDough() { pizza.setDough("Thin");}

    @Override
    public void buildToppings() { pizza.setToppings(List.of("Onion", "Cheese", "Olives"));}

    @Override
    public Pizza getPizza() { return pizza; }
}
