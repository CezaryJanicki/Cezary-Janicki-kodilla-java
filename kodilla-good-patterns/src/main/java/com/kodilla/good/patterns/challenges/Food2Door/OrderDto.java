package com.kodilla.good.patterns.challenges.Food2Door;


import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Map;

public class OrderDto {
    private final Producer producer;
    private final Map<Products, BigDecimal> productsOrdered;
    private final boolean isOrdered;
    private final LocalDateTime orderTime;

    public OrderDto(Producer producer, Map<Products, BigDecimal> productsOrdered, boolean isOrdered, LocalDateTime orderTime) {
        this.producer = producer;
        this.productsOrdered = productsOrdered;
        this.isOrdered = isOrdered;
        this.orderTime = orderTime;
    }

    public Producer getProducer() {
        return producer;
    }

    public Map<Products, BigDecimal> getProductsOrdered() {
        return productsOrdered;
    }

    public boolean isOrdered() {
        return isOrdered;
    }

    public LocalDateTime getOrderTime() {
        return orderTime;
    }
}
