package com.koilla.patterns.builder.bigmac;

import com.kodilla.patterns.builder.bigmac.Bigmac;
import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {

    @Test
    public void testBigmacSandwitch() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .setBun("Big Mac Bun")
                .setBurgers(3)
                .setSauce("1000 Islands")
                .setIngredients("Onion")
                .setIngredients("Pepper")
                .setIngredients("Lettuce")
                .build();
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        //Then
        Assert.assertEquals(3, howManyIngredients);
        Assert.assertEquals("Big Mac Bun", bigmac.getBun());
        Assert.assertEquals(3, bigmac.getBurgers());
        Assert.assertEquals("1000 Islands", bigmac.getSauce());
    }
}
