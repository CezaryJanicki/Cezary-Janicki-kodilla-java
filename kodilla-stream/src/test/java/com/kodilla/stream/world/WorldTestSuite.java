package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity() {
        //Given
        Country china = new Country(new BigDecimal("1440000000"));
        Country india = new Country(new BigDecimal("1370000000"));
        Country unitedStates = new Country(new BigDecimal("330122000"));
        Country brazil = new Country(new BigDecimal("211913000"));
        Country nigeria = new Country(new BigDecimal("206140000"));
        Country mexico = new Country(new BigDecimal("128933000"));
        Country ethiopia = new Country(new BigDecimal("122032000"));
        Country egypt = new Country(new BigDecimal("99388000"));
        Country colombia = new Country(new BigDecimal("50374000"));

        Continent northAmerica = new Continent();
        northAmerica.addCountry(unitedStates);
        northAmerica.addCountry(mexico);

        Continent asia = new Continent();
        asia.addCountry(china);
        asia.addCountry(india);

        Continent southAmerica = new Continent();
        southAmerica.addCountry(brazil);
        southAmerica.addCountry(colombia);

        Continent africa = new Continent();
        africa.addCountry(nigeria);
        africa.addCountry(ethiopia);
        africa.addCountry(egypt);

        World world = new World();
        world.addContinent(northAmerica);
        world.addContinent(asia);
        world.addContinent(southAmerica);
        world.addContinent(africa);

        //When
        BigDecimal result = world.getPeopleQuantity();
        //Then
        Assert.assertEquals(new BigDecimal("3958902000"), result);
    }
}
