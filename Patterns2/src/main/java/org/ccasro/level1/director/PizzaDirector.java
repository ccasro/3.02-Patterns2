package org.ccasro.level1.director;

import org.ccasro.level1.builder.PizzaBuilder;
import org.ccasro.level1.model.Pizza;

public class PizzaDirector {
    private PizzaBuilder builder;

    public void setBuilder(PizzaBuilder builder) {
        this.builder = builder;
    }

    public Pizza makePizza() {
        builder.buildSize();
        builder.buildDough();
        builder.buildToppings();
        return builder.getPizza();
    }
}
