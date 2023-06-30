package bootcamp.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BigmacTestSuite {

    @Test
    void testBigmacBuilder() {
        //given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("thin")
                .burgers("roll")
                .sauce("spicy")
                .ingredients("paprika")
                .ingredients("tomato")
                .ingredients("cheese")
                .build();

        //when
        int howManyIngredients = bigmac.ingredients().size();

        //then
        assertEquals(3, howManyIngredients);
    }
}
