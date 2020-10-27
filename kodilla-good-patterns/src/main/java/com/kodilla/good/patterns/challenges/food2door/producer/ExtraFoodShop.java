package com.kodilla.good.patterns.challenges.food2door.producer;

import com.kodilla.good.patterns.challenges.food2door.domain.Producer;
import com.kodilla.good.patterns.challenges.food2door.domain.Product;

import java.util.Map;

public class ExtraFoodShop implements Producer {
    private final String name;
    private final String email;
    private final String telephone;

    public ExtraFoodShop(final String name, final String email, final String telephone) {
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
    public boolean process(Map<Product, Integer> productsOrdered) {
        if (productsOrdered.keySet().stream().map(Product::getName).anyMatch("Mango"::equals)) {
            System.out.println("We ran out of Oregano, sorry. This order cannot be processed. Please call your representative in the company. ");
            return false;
        }
        return true;
    }
}
