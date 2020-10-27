package com.kodilla.good.patterns.challenges.allegro;

import java.time.LocalDateTime;

public class OrderRequestRetriever {
    public OrderRequest retrieve() {
        User user = new User("John", "Weki");

        LocalDateTime orderTime = LocalDateTime.of(2017, 8, 1, 12, 0);

        Product product = new Product("oranges");

        return new OrderRequest(user, product, orderTime);
    }
}
