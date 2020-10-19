package com.kodilla.good.patterns.challenges.Food2Door;

import java.math.BigDecimal;
import java.util.Map;

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
    public void process(Map<Products, BigDecimal> productsOrdered) {

    }
}
