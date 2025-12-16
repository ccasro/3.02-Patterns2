package org.ccasro.level1;

import org.ccasro.level1.director.PizzaDirector;
import org.ccasro.level1.model.HawaiianPizzaBuilder;
import org.ccasro.level1.model.Pizza;
import org.ccasro.level1.model.VegetarianPizzaBuilder;

public class Main {
    public static void main (String[] args) {
        PizzaDirector pizzaDirector = new PizzaDirector();

        pizzaDirector.setBuilder(new HawaiianPizzaBuilder());

        Pizza hawaiian = pizzaDirector.makePizza();
        System.out.println("Hawaiian Pizza: " + hawaiian);

        pizzaDirector.setBuilder(new VegetarianPizzaBuilder());

        Pizza vegetarian = pizzaDirector.makePizza();
        System.out.println("Vegetarian Pizza: " + vegetarian);
    }
}
