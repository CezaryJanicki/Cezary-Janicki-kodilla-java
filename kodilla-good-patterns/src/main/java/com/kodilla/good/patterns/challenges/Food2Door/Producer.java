package com.kodilla.good.patterns.challenges.Food2Door;

import java.math.BigDecimal;
import java.util.HashMap;

interface Producer {
    public void process(HashMap<Products, BigDecimal> productsOrdered);
}
