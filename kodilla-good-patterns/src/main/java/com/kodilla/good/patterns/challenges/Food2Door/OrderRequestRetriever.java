package com.kodilla.good.patterns.challenges.Food2Door;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class OrderRequestRetriever {
    public OrderRequest retrieve() {
        Producer extraFoodShop = new ExtraFoodShop("ExtraFoodShop", "extrafoodshop@extrafoodshop.com", "555333444");
        //Producer healthyShop = new Producer("HealthyShop", "healthyshop@healthyshop.com", "444333222");
        //Producer glutenFreeShop = new Producer("GlutenFreeShop", "glutenfreeshop@glutenfreeshop.com", "666777888");

        Map<Products, BigDecimal> productsOrdered = new HashMap<>();
        productsOrdered.put(Products.BASIL, new BigDecimal("1423"));
        productsOrdered.put(Products.CORIANDER, new BigDecimal("342349234"));
        productsOrdered.put(Products.SALT, new BigDecimal("234123123"));
        productsOrdered.put(Products.OREGANO, new BigDecimal("8230891273018273"));

        LocalDateTime orderTime = LocalDateTime.of(2019, 4, 2, 10, 45);

        return new OrderRequest(extraFoodShop, productsOrdered, orderTime);
    }
}
