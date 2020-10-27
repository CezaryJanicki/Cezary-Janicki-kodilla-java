package com.kodilla.good.patterns.challenges.food2door.domain;

import java.time.LocalDateTime;
import java.util.Map;

public class OrderService {
    public boolean order(final Producer producer, Map<Product, Integer> productsOrdered, LocalDateTime orderTime) {
        productsOrdered.forEach((k, v) -> {
            System.out.println("Ordering from " + producer.toString() + " Item: " + k + " Amount: " + v + " at: " + orderTime.getHour() + " " + orderTime.getMinute());}
        );

    return producer.process(productsOrdered);
    }
}
