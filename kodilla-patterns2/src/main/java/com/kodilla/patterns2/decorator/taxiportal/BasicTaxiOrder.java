package com.kodilla.patterns2.decorator.taxiportal;

import java.math.BigDecimal;

public class BasicTaxiOrder implements TaxiOrder {
    @Override
    public final BigDecimal getCost() {
        return new BigDecimal("5.00");
    }

    @Override
    public final String getDescription() {
        return "Drive a course";
    }
}
