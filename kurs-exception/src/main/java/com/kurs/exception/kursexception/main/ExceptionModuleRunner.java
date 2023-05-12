package com.kurs.exception.kursexception.main;

import com.kurs.exception.kursexception.io.FileReader;
import com.kurs.exception.kursexception.test.FirstChallenge;

public class ExceptionModuleRunner {

    public static void main(String[] args) {

        FileReader fileReader = new FileReader();
        fileReader.readFile();
        FirstChallenge firstChallenge = new FirstChallenge();
        try {
            double result = firstChallenge.divide(2,0);
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
}
