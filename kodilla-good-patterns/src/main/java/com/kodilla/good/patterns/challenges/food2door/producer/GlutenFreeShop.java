package com.kodilla.good.patterns.challenges.food2door.producer;

import com.kodilla.good.patterns.challenges.food2door.domain.Producer;
import com.kodilla.good.patterns.challenges.food2door.domain.Product;

import java.util.Map;

public class GlutenFreeShop implements Producer {
    @Override
    public boolean process(Map<Product, Integer> productsOrdered)  {
        if (productsOrdered.keySet().stream().map(Product::getName).anyMatch("Apple"::equals)) {
            System.out.println("We ran out of Oregano, sorry. This order cannot be processed. Please call your representative in the company. ");
        return false;
        }
        return true;
    }
}
