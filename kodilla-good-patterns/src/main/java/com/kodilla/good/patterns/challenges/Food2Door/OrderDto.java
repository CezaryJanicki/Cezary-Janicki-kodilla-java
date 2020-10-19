package com.kodilla.good.patterns.challenges.Food2Door;


import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.HashMap;

public class OrderDto {
    private final Producer producer;
    private final HashMap<Products, BigDecimal> productsOrdered;
    private final boolean isOrdered;
    private final LocalDateTime orderTime;

    public OrderDto(Producer producer, HashMap<Products, BigDecimal> productsOrdered, boolean isOrdered, LocalDateTime orderTime) {
        this.producer = producer;
        this.productsOrdered = productsOrdered;
        this.isOrdered = isOrdered;
        this.orderTime = orderTime;
    }

    public Producer getProducer() {
        return producer;
    }

    public HashMap<Products, BigDecimal> getProductsOrdered() {
        return productsOrdered;
    }

    public boolean isOrdered() {
        return isOrdered;
    }

    public LocalDateTime getOrderTime() {
        return orderTime;
    }
}
