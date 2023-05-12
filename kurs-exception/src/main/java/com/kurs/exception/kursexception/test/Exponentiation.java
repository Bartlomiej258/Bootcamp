package com.kurs.exception.kursexception.test;

import java.sql.PreparedStatement;

public class Exponentiation {
    public static void main(String[] args) {

        int exponentiationNumber = exponentiationNumber(2, 2);
        System.out.println(exponentiationNumber);

    }

    static int exponentiationNumber(int number, int exponent) throws ArithmeticException {
        if (exponent == 0) {
            return 1;
        }
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }
}
