package com.example.kursgoodpatterns.homework;

public class Factorial {
    public static void main(String[] args) {

        int factorial1 = calculateFactorial(3);
        System.out.println(factorial1);

        int factorial2 = factorialRecursive(3);
        System.out.println(factorial2);
    }

    public static int calculateFactorial(int number) {
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static int factorialRecursive(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorialRecursive(n - 1);
        }
    }
}
