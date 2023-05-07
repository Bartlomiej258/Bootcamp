package com.kurs.stream.kursstream.world;

import java.math.BigDecimal;
import java.util.List;

public class Country {

    private final BigDecimal peopleQuantity;

    public Country(BigDecimal peopleQuantity) {
        this.peopleQuantity = peopleQuantity;
    }

    public BigDecimal getPeopleQuantity() {
        return peopleQuantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Country country = (Country) o;

        return peopleQuantity != null ? peopleQuantity.equals(country.peopleQuantity) : country.peopleQuantity == null;
    }

    @Override
    public int hashCode() {
        return peopleQuantity != null ? peopleQuantity.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Country{" +
                "peopleQuantity=" + peopleQuantity +
                '}';
    }
}
