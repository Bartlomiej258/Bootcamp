package com.example.kursgoodpatterns.challenges;

import java.util.List;
import java.util.Map;

public class MovieStoreRunner {
    public static void main(String[] args) {

        MovieStore movieStore = new MovieStore();
        Map<String, List<String>> movies = movieStore.getMovies();
        movieStore.getTitles(movies);
    }
}
