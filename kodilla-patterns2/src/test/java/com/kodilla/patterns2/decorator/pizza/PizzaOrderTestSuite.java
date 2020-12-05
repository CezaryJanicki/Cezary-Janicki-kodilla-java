package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite {

    @Test
    public void testBasicPizzaOrderGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        //When
        BigDecimal price = theOrder.getPrice();
        //Then
        assertEquals(new BigDecimal("15"), price);
    }

    @Test
    public void testBasicPizzaOrderGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Pizza with sauce and mozarella cheese", description);
    }

    @Test
    public void testExpressDeliveryGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ExpressDeliveryDecorator(theOrder);
        //When
        BigDecimal price = theOrder.getPrice();
        //Then
        assertEquals(new BigDecimal("35"), price);
    }

    @Test
    public void testExpressDeliveryGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ExpressDeliveryDecorator(theOrder);
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Pizza with sauce and mozarella cheese + express delivery", description);
    }

    @Test
    public void testExpressDeliveryExtraSauceGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ExpressDeliveryDecorator(theOrder);
        theOrder = new ExtraSauceDecorator(theOrder);
        //When
        BigDecimal price = theOrder.getPrice();
        //Then
        assertEquals(new BigDecimal("40"), price);
    }

    @Test
    public void testExpressDeliveryExtraSauceGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ExpressDeliveryDecorator(theOrder);
        theOrder = new ExtraSauceDecorator(theOrder);
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Pizza with sauce and mozarella cheese + express delivery + extra sauce", description);
    }

    @Test
    public void testExpressDeliveryExtraSauceFourCheeseGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ExpressDeliveryDecorator(theOrder);
        theOrder = new ExtraSauceDecorator(theOrder);
        theOrder = new FourCheeseDecorator(theOrder);
        //When
        BigDecimal price = theOrder.getPrice();
        //Then
        assertEquals(new BigDecimal("50"), price);
    }

    @Test
    public void testExpressDeliveryExtraSauceFourCheeseGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ExpressDeliveryDecorator(theOrder);
        theOrder = new ExtraSauceDecorator(theOrder);
        theOrder = new FourCheeseDecorator(theOrder);
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Pizza with sauce and mozarella cheese + express delivery + extra sauce + four cheese", description);
    }

    @Test
    public void testExpressDeliveryExtraSauceFourCheeseCrunchyDoughGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ExpressDeliveryDecorator(theOrder);
        theOrder = new ExtraSauceDecorator(theOrder);
        theOrder = new FourCheeseDecorator(theOrder);
        theOrder = new CrunchyDoughDecorator(theOrder);
        //When
        BigDecimal price = theOrder.getPrice();
        //Then
        assertEquals(new BigDecimal("57"), price);
    }

    @Test
    public void testExpressDeliveryExtraSauceFourCheeseCrunchyDoughGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ExpressDeliveryDecorator(theOrder);
        theOrder = new ExtraSauceDecorator(theOrder);
        theOrder = new FourCheeseDecorator(theOrder);
        theOrder = new CrunchyDoughDecorator(theOrder);
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Pizza with sauce and mozarella cheese + express delivery + extra sauce + four cheese + crunchy dough", description);
    }

}
