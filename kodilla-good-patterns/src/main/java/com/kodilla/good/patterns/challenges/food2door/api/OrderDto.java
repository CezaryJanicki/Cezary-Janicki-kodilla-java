package com.kodilla.good.patterns.challenges.food2door.api;


import com.kodilla.good.patterns.challenges.food2door.domain.Producer;
import com.kodilla.good.patterns.challenges.food2door.domain.Product;

import java.time.LocalDateTime;
import java.util.Map;

public class OrderDto {
    private final Producer producer;
    private final Map<Product, Integer> productsOrdered;
    private final boolean isOrdered;
    private final LocalDateTime orderTime;

    public OrderDto(Producer producer, Map<Product, Integer> productsOrdered, boolean isOrdered, LocalDateTime orderTime) {
        this.producer = producer;
        this.productsOrdered = productsOrdered;
        this.isOrdered = isOrdered;
        this.orderTime = orderTime;
    }

    public Producer getProducer() {
        return producer;
    }

    public Map<Product, Integer> getProductsOrdered() {
        return productsOrdered;
    }

    public boolean isOrdered() {
        return isOrdered;
    }

    public LocalDateTime getOrderTime() {
        return orderTime;
    }
}
