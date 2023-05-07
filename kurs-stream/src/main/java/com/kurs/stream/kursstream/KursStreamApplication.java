package com.kurs.stream.kursstream;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.OptionalInt;
import java.util.stream.IntStream;

@SpringBootApplication
public class KursStreamApplication {

    public static void main(String[] args) {

        int[] arr = {2,5,7,8,55,3,2,11,2};

        double min = Arrays.stream(arr)
                .average()
                .orElseThrow();
        System.out.println(min);
    }

}
