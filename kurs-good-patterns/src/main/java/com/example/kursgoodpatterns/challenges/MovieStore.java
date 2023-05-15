package com.example.kursgoodpatterns.challenges;

import java.util.*;
import java.util.stream.Collectors;

public class MovieStore {

    public Map<String, List<String>> getMovies() {
        List<String> ironManTranslations = new ArrayList<>();
        ironManTranslations.add("Zelazny Czlowiek");
        ironManTranslations.add("Iron Man");

        List<String> avengersTranslations = new ArrayList<>();
        avengersTranslations.add("Msciciele");
        avengersTranslations.add("Avengers");

        List<String> flashTranslation = new ArrayList<>();
        flashTranslation.add("Blyskawica");
        flashTranslation.add("Flash");

        Map<String, List<String>> booksTitlesWithTranslations = new HashMap<>();
        booksTitlesWithTranslations.put("IM", ironManTranslations);
        booksTitlesWithTranslations.put("AV", avengersTranslations);
        booksTitlesWithTranslations.put("FL", flashTranslation);

        return booksTitlesWithTranslations;
    }

    public void getTitles(Map<String, List<String>> stringListMap) {
        String collect = stringListMap.entrySet().stream()
                .flatMap(entry -> entry.getValue().stream())
                .collect(Collectors.joining("! "));

        System.out.println(collect);
    }
}
