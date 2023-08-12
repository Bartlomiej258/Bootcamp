package com.bootcamp.patterns2.decorator.pizza;

import java.math.BigDecimal;

public interface PizzaOrder {

    BigDecimal getCost();
    String getDescription();
}
