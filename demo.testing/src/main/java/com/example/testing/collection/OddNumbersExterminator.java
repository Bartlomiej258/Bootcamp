package com.example.testing.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OddNumbersExterminator {

    public List<Integer> extermiante(List<Integer> numbers) {
        List<Integer> newList = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 == 0)
            newList.add(numbers.get(i));
        }
        return newList;
    }

}
