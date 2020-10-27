package com.kodilla.good.patterns.challenges.food2door.infrastructure;

import com.kodilla.good.patterns.challenges.food2door.api.OrderRequest;
import com.kodilla.good.patterns.challenges.food2door.domain.Producer;
import com.kodilla.good.patterns.challenges.food2door.domain.Product;
import com.kodilla.good.patterns.challenges.food2door.producer.ExtraFoodShop;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.HashMap;

public class OrderRequestRetriever {
    public OrderRequest retrieve() {
        Producer extraFoodShop = new ExtraFoodShop("ExtraFoodShop", "extrafoodshop@extrafoodshop.com", "555333444");
        //Producer healthyShop = new Producer("HealthyShop", "healthyshop@healthyshop.com", "444333222");
        //Producer glutenFreeShop = new Producer("GlutenFreeShop", "glutenfreeshop@glutenfreeshop.com", "666777888");

        HashMap<Product, Integer> productsOrdered = new HashMap<>();
        productsOrdered.put(new Product("Apple", new BigDecimal("13.40")), 1342);
        productsOrdered.put(new Product("Orange", new BigDecimal("13.40")), 142);
        productsOrdered.put(new Product("Mango", new BigDecimal("3.40")), 132);
        productsOrdered.put(new Product("Papaya", new BigDecimal("13.46")), 342);

        LocalDateTime orderTime = LocalDateTime.of(2019, 4, 2, 10, 45);

        return new OrderRequest(extraFoodShop, productsOrdered, orderTime);
    }
}
