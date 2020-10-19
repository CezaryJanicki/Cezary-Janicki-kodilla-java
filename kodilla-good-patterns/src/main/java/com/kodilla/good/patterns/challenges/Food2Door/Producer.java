package com.kodilla.good.patterns.challenges.Food2Door;

import java.math.BigDecimal;
import java.util.Map;

interface Producer {
    public void process(Map<Products, BigDecimal> productsOrdered);
}
