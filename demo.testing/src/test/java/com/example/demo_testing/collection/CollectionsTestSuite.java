package com.example.demo_testing.collection;

import com.example.testing.collection.OddNumbersExterminator;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionsTestSuite {

    public List<Integer> integers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

    @BeforeEach
    public void before() {
        System.out.println("testing before");
    }

    @AfterEach
    public void after() {
        System.out.println("testing finish");
    }

    @DisplayName("testing if the list is empty")

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        List<Integer> emptyList = new ArrayList<>();

        //When
        List<Integer> result = exterminator.extermiante(emptyList);

        //Then
        Assertions.assertEquals(0, emptyList.size());
    }


    @DisplayName("testing if a new list with even elements is created")

    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        OddNumbersExterminator exterminator = new OddNumbersExterminator();

        //When
        List<Integer> oddNumbersList = exterminator.extermiante(integers);
        List<Integer> expectedNumbersInList = Arrays.asList(2,4,6,8,10);

        //Then
        Assertions.assertEquals(expectedNumbersInList, oddNumbersList);
    }
}
