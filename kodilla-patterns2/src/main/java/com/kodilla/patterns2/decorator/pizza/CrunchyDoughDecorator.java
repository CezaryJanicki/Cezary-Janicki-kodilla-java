package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class CrunchyDoughDecorator extends AbstractPizzaOrderDecorator {
    public CrunchyDoughDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getPrice() {
        return super.getPrice().add(new BigDecimal("7"));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + crunchy dough";
    }
}
