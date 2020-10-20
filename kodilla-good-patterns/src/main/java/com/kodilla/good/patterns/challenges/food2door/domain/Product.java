package com.kodilla.good.patterns.challenges.food2door.domain;

import java.math.BigDecimal;

public class Product {
    private final String name;
    private final BigDecimal price;
    private final Producer producer;

    public Product(String name, BigDecimal price, Producer producer) {
        this.name = name;
        this.price = price;
        this.producer = producer;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public Producer getProducer() { return producer; }

    @Override
    public String toString() {
        return name;
    }
}
