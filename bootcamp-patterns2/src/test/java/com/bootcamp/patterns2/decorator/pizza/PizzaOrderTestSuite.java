package com.bootcamp.patterns2.decorator.pizza;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaOrderTestSuite {

    @Test
    void testPizzaOrderGetPrice() {
        //given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ExtraCheeseDecorator(theOrder);
        //when
        BigDecimal theCost = theOrder.getCost();
        //then
        assertEquals(new BigDecimal(20.0), theCost);
    }

    @Test
    void testPizzaOrderGetDescription() {
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ExtraCheeseDecorator(theOrder);
        //when
        String description = theOrder.getDescription();
        //then
        assertEquals("dough, tomato sauce, cheese, extra cheese", description);
    }

    @Test
    void testPizzaOrderWithDoubleBeckonGetPrice() {
        //given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new BeckonDecorator(theOrder);
        theOrder = new BeckonDecorator(theOrder);
        //when
        BigDecimal theCost = theOrder.getCost();
        //then
        assertEquals(new BigDecimal(29.0), theCost);
    }

    @Test
    void testPizzaOrderWithDoubleBeckonGetDescription() {
        //given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new BeckonDecorator(theOrder);
        theOrder = new BeckonDecorator(theOrder);
        //when
        String description = theOrder.getDescription();
        //then
        assertEquals("dough, tomato sauce, cheese, beckon, beckon", description);
    }

}
