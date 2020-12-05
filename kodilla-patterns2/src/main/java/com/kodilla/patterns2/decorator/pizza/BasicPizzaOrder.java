package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class BasicPizzaOrder implements PizzaOrder {
    @Override
    public final BigDecimal getPrice() {
        return new BigDecimal("15");
    }

    @Override
    public final String getDescription() {
        return "Pizza with sauce and mozarella cheese";
    }
}
