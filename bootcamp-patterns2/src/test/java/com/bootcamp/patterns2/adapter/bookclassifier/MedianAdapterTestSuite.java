package com.bootcamp.patterns2.adapter.bookclassifier;

import com.bootcamp.patterns2.adapter.bookclasifier.MedianAdapter;
import com.bootcamp.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MedianAdapterTestSuite {

    @Test
    void publicationYearMedianTest() {
        //given
        Set<Book> bookSet = new HashSet<>();
        bookSet.add(new Book("Mickiewicz", "Dziady", 1910, "123456"));
        bookSet.add(new Book("Kowal", "Sen", 1920, "34543543"));
        bookSet.add(new Book("Nosek", "Nowy Świat", 1940, "3453454"));
        bookSet.add(new Book("Polak", "Kolekcje", 1941, "5345354"));
        bookSet.add(new Book("Zibi", "Planeta 123", 1938, "9768"));

        MedianAdapter medianAdapter = new MedianAdapter();
        //when
        int median = medianAdapter.publicationYearMedian(bookSet);
        //then
        assertEquals(1938, median);
    }
}
