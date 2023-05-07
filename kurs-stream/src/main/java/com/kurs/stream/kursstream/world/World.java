package com.kurs.stream.kursstream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class World {

    List<Continent> continents = new ArrayList<>();

    public BigDecimal getPeopleQuantity() {
        return continents.stream()
                .flatMap(country -> country.getCountries().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
    }
}
