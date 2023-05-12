package com.kurs.stream.kursstream;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

@SpringBootApplication
public class KursStreamApplication {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3};

        OptionalDouble avg = Arrays.stream(numbers).mapToDouble(a -> a).average();
        System.out.println(avg);

    }



}
