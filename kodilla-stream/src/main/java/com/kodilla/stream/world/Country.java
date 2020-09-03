package com.kodilla.stream.world;

import java.math.BigDecimal;

public final class Country {
    private final BigDecimal population;

    public Country(BigDecimal population) {
        this.population = population;
    }

    @Override
    public String toString() {
        return "Country{" +
                ", population=" + population +
                '}';
    }

    BigDecimal getPeopleQuantity() {
        return population;
    }
}
