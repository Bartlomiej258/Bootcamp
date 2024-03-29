package com.bootcamp.patterns2.adapter.bookclasifier;

import com.bootcamp.patterns2.adapter.bookclasifier.libraryb.Book;
import com.bootcamp.patterns2.adapter.bookclasifier.libraryb.BookSignature;
import com.bootcamp.patterns2.adapter.bookclasifier.libraryb.BookStatistics;
import com.bootcamp.patterns2.adapter.bookclasifier.libraryb.Statistics;

import java.util.Map;

public class MedianAdaptee extends Statistics implements BookStatistics {

    @Override
    public int averagePublicationYear(Map<BookSignature, Book> books) {
        Statistics statistics = new Statistics();
        return statistics.averagePublicationYear(books);
    }

    @Override
    public int medianPublicationYear(Map<BookSignature, Book> books) {
        Statistics statistics = new Statistics();
        return statistics.medianPublicationYear(books);
    }
}
