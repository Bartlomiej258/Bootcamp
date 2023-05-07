package com.kurs.stream.kursstream.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayOperationsTestSuite {

    @Test
    void testGetAverage() {
        //Given
        int[] array = {1,2,4,6,8,12};

        //When
        double average = ArrayOperations.getAverage(array);

        //Then
        Assertions.assertEquals(6, array.length);
        Assertions.assertEquals(5.5, average);
    }
}
