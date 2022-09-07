package com.pluralsight.bdd.loyalty_cards;

import java.util.HashMap;
import java.util.Map;

public class SuperSmoothieSchema {
    private DrinkCatalog catalog;
    private Map<String, Integer> pointsPerCategory = new HashMap<>();

    public SuperSmoothieSchema(DrinkCatalog drinkCatalog) {
        this.catalog = drinkCatalog;
    }

    public void setPointsPerCategory(String category, Integer points) {
        pointsPerCategory.put(category, points);
    }

    public int getPointsFor(String drink) {
        return pointsPerCategory.get(categoryOf(drink));
    }

    private String categoryOf(String drink) {
        return catalog.getCategoryOf(drink);
    }
}
