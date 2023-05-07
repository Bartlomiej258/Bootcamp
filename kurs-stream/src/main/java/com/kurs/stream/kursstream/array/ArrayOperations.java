package com.kurs.stream.kursstream.array;

import java.util.stream.IntStream;

public interface ArrayOperations {

    static Double getAverage(int[] numbers) {
        IntStream.rangeClosed(0, numbers.length - 1)
                .forEach(i -> System.out.println(numbers[i]));

                Double avg = IntStream.of(numbers)
                        .average()
                        .orElse(0);
                return avg;
    }
}
