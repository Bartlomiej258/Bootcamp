package com.kurs.stream.kursstream.world;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class WorldTestSuite {

    @Test
    void testGetPeopleQuantity() {
        //Given
        Country poland = new Country(new BigDecimal("38000000"));
        Country germany = new Country(new BigDecimal("80000000"));
        Country china = new Country(new BigDecimal("1000000000"));
        Country japan = new Country(new BigDecimal("80000000"));
        Country rpa = new Country(new BigDecimal("60000000"));

        Continent europe = new Continent();
        europe.countries.add(poland);
        europe.countries.add(germany);

        Continent asia = new Continent();
        asia.countries.add(china);
        asia.countries.add(japan);

        Continent africa = new Continent();
        africa.countries.add(rpa);

        World world = new World();
        world.continents.add(europe);
        world.continents.add(asia);
        world.continents.add(africa);

        //When
        BigDecimal result = world.getPeopleQuantity();

        //Then
        Assertions.assertEquals(new BigDecimal("1258000000"), result);
    }
}
