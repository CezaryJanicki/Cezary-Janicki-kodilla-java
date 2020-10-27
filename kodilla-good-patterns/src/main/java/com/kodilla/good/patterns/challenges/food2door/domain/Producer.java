package com.kodilla.good.patterns.challenges.food2door.domain;

import java.util.Map;

public interface Producer {
    boolean process(Map<Product, Integer> productsOrdered);
}
