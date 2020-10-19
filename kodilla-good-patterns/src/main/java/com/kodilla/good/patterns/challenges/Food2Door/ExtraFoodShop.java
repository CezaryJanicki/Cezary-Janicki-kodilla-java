package com.kodilla.good.patterns.challenges.Food2Door;

import java.math.BigDecimal;
import java.util.HashMap;

class ExtraFoodShop implements Producer {
    String name;
    String email;
    String telephone;

    public ExtraFoodShop(String name, String email, String telephone) {
        this.name = name;
        this.email = email;
        this.telephone = telephone;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getTelephone() {
        return telephone;
    }

    @Override
    public String toString() {
        return "ExtraFoodShop";
    }

    @Override
    public void process(HashMap<Products, BigDecimal> productsOrdered) {
        if (productsOrdered.containsKey(Products.OREGANO)) {
            System.out.println("We ran out of Oregano, sorry. This order cannot be processed. Please call your representative in the company. ");
        }
    }
}
