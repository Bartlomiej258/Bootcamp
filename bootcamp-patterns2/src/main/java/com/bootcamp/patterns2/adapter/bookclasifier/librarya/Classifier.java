package com.bootcamp.patterns2.adapter.bookclasifier.librarya;

import java.util.Set;

public interface Classifier {

    int publicationYearMedian(Set<Book> bookSet);
}
