package com.kodilla.good.patterns.challenges.food2door.api;

import com.kodilla.good.patterns.challenges.food2door.domain.Producer;
import com.kodilla.good.patterns.challenges.food2door.domain.Product;

import java.time.LocalDateTime;
import java.util.Map;

public class OrderRequest {
    private final Producer producer;
    private final Map<Product, Integer> productsOrdered;
    private final LocalDateTime orderTime;

    public OrderRequest(Producer producer, Map<Product, Integer> productsOrdered, LocalDateTime orderTime) {
        this.producer = producer;
        this.productsOrdered = productsOrdered;
        this.orderTime = orderTime;
    }

    public Producer getProducer() {
        return producer;
    }

    public Map<Product, Integer> getProductsOrdered() {
        return productsOrdered;
    }

    public LocalDateTime getOrderTime() {
        return orderTime;
    }
}
