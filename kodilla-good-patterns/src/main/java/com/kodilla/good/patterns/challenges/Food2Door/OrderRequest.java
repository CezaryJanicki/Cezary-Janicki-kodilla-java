package com.kodilla.good.patterns.challenges.Food2Door;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Map;

public class OrderRequest {
    private final Producer producer;
    private final Map<Products, BigDecimal> productsOrdered;
    private final LocalDateTime orderTime;

    public OrderRequest(Producer producer, Map<Products, BigDecimal> productsOrdered, LocalDateTime orderTime) {
        this.producer = producer;
        this.productsOrdered = productsOrdered;
        this.orderTime = orderTime;
    }

    public Producer getProducer() {
        return producer;
    }

    public Map<Products, BigDecimal> getProductsOrdered() {
        return productsOrdered;
    }

    public LocalDateTime getOrderTime() {
        return orderTime;
    }
}
