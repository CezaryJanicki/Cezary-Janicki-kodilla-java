package com.kodilla.good.patterns.challenges.Food2Door;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Map;

public class OrderService {
    public boolean order(final Producer producer, Map<Products, BigDecimal> productsOrdered, LocalDateTime orderTime) {
        productsOrdered.forEach((k, v) -> {
            System.out.println("Ordering from " + producer.toString() + " Item: " + k + " Amount: " + v + " at: " + orderTime.getHour() + " " + orderTime.getMinute());}
        );
    return true;
    }
}
