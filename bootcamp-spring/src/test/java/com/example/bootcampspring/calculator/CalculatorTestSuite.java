package com.example.bootcampspring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CalculatorTestSuite {

    @Autowired
    Calculator calculator;

    @Test
    void testCalculations() {
        //given
        //when
        double add = calculator.add(2, 2);
        double sub = calculator.sub(4, 2);
        double mul = calculator.mul(3, 3);
        double div = calculator.div(10, 5);

        //then
        assertEquals(4, add);
        assertEquals(2, sub);
        assertEquals(9, mul);
        assertEquals(2, div);
    }
}
