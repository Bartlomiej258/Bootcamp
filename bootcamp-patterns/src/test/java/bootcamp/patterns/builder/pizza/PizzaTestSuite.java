package bootcamp.patterns.builder.pizza;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaTestSuite {

    @Test
    void testPizzaNew() {
        //given
        Pizza pizza = new Pizza.PizzaBuilder()
                .ingredient("onion")
                .bottom("thin")
                .sauce("spicy")
                .ingredient("ham")
                .ingredient("mushrooms")
                .build();
        System.out.println(pizza);

        //when
        int howManyIngredients = pizza.getIngredients().size();

        //then
        assertEquals(3, howManyIngredients);
    }
}
