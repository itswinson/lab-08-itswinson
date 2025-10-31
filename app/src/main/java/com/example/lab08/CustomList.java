package com.example.lab08;

import java.util.ArrayList;
import java.util.List;

public class CustomList {
    private List<City> cities;

    public CustomList() {
        this.cities = new ArrayList<>();
    }

    public void addCity(City city) {
        cities.add(city);
    }

    // TDD Step 1: hasCity()
    public boolean hasCity(City city) {
        return cities.contains(city);
    }

    // TDD Step 2: deleteCity()
    public void deleteCity(City city) {
        if (cities.contains(city)) {
            cities.remove(city);
        } else {
            throw new IllegalArgumentException("City not found in list");
        }
    }

    // TDD Step 3: countCities()
    public int countCities() {
        return cities.size();
    }
}
