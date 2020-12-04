package com.koilla.patterns.builder.bigmac;

import com.kodilla.patterns.builder.bigmac.Bigmac;
import com.kodilla.patterns.builder.bigmac.Bun;
import com.kodilla.patterns.builder.bigmac.Ingredients;
import com.kodilla.patterns.builder.bigmac.Sauce;
import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {

    @Test
    public void testBigmacSandwitch() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .setBun(Bun.PLAIN_BUN)
                .setBurgers(3)
                .setSauce(Sauce.CHIMICHURRI_SAUCE)
                .setIngredients(Ingredients.ONIONS)
                .setIngredients(Ingredients.ICEBERG_LETTUCE)
                .setIngredients(Ingredients.AMERICAN_CHEESE)
                .build();
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        //Then
        Assert.assertEquals(3, howManyIngredients);
        Assert.assertEquals(Bun.PLAIN_BUN, bigmac.getBun());
        Assert.assertEquals(3, bigmac.getBurgers());
        Assert.assertEquals(Sauce.CHIMICHURRI_SAUCE, bigmac.getSauce());
        Assert.assertTrue(bigmac.getIngredients().contains(Ingredients.ONIONS));
        Assert.assertTrue(bigmac.getIngredients().contains(Ingredients.ICEBERG_LETTUCE));
        Assert.assertTrue(bigmac.getIngredients().contains(Ingredients.AMERICAN_CHEESE));
    }
}
