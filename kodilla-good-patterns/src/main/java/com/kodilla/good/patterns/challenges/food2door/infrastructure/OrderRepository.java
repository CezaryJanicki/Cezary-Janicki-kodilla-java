package com.kodilla.good.patterns.challenges.food2door.infrastructure;

import com.kodilla.good.patterns.challenges.food2door.domain.Producer;
import com.kodilla.good.patterns.challenges.food2door.domain.Product;

import java.time.LocalDateTime;
import java.util.Map;

public class OrderRepository {
    public void createOrder(Producer producer, Map<Product, Integer> productsOrdered, LocalDateTime orderTime) {}
}
