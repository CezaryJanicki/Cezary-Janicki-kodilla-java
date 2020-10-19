package com.kodilla.good.patterns.challenges.Food2Door;

import java.math.BigDecimal;
import java.util.HashMap;

public class HealthyShop implements Producer {
    @Override
    public void process(HashMap<Products, BigDecimal> productsOrdered) {
        if (productsOrdered.containsKey(Products.SALT)) {
            System.out.println("We ran out of Oregano, sorry. This order cannot be processed. Please call your representative in the company. ");
        }
    }
}
