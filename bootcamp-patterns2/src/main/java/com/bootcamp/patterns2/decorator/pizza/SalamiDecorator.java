package com.bootcamp.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class SalamiDecorator extends AbstractPizzaDecorator {

    public SalamiDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(6.0));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", salami";
    }
}
