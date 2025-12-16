package org.ccasro.level1.builder;

import org.ccasro.level1.model.Pizza;

public interface PizzaBuilder {
    void buildSize();
    void buildDough();
    void buildToppings();
    Pizza getPizza();
}
