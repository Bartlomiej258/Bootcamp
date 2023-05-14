package com.kurs.exception.kursexception.test;

public class ExceptionHandling {

    public static void main(String[] args) {

        SecondChallenge secondChallenge = new SecondChallenge();
        try {
            String s = secondChallenge.probablyIWillThrowException(2, 4);
            System.out.println(s);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
