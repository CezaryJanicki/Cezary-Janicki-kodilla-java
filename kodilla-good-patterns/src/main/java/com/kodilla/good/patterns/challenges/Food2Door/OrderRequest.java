package com.kodilla.good.patterns.challenges.Food2Door;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.HashMap;

public class OrderRequest {
    private final Producer producer;
    private final HashMap<Products, BigDecimal> productsOrdered;
    private final LocalDateTime orderTime;

    public OrderRequest(Producer producer, HashMap<Products, BigDecimal> productsOrdered, LocalDateTime orderTime) {
        this.producer = producer;
        this.productsOrdered = productsOrdered;
        this.orderTime = orderTime;
    }

    public Producer getProducer() {
        return producer;
    }

    public HashMap<Products, BigDecimal> getProductsOrdered() {
        return productsOrdered;
    }

    public LocalDateTime getOrderTime() {
        return orderTime;
    }
}
