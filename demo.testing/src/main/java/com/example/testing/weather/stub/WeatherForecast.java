package com.example.testing.weather.stub;

import java.util.*;
import java.util.stream.DoubleStream;

public class WeatherForecast {

    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {

            // adding 1 celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        return resultMap;
    }

    public double calculateAverageTemperature() {
        int size = temperatures.getTemperatures().size();
        double sum = 0;
        double avg;
        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            sum += temperature.getValue();
        }
        avg = sum / size;
        return avg;
    }

    public double calculateMedianForTemperatures() {
        TreeMap<String, Double> treeMap = new TreeMap<>(temperatures.getTemperatures());
        List<Double> valuesList = new ArrayList<>(treeMap.values());
        int size = valuesList.size();
        double median = size % 2 == 0 ? (valuesList.get(size / 2 - 1) + valuesList.get(size / 2)) / 2.0
                : valuesList.get(size / 2);
        return median;
    }

}
