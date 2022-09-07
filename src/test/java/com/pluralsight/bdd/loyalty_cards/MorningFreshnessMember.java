package com.pluralsight.bdd.loyalty_cards;

public class MorningFreshnessMember {
    private String name;
    private SuperSmoothieSchema schema;
    private int points;

    public MorningFreshnessMember(String name, SuperSmoothieSchema schema) {
        this.schema = schema;
        this.name = name;
    }

    public void orders(Integer amount, String drink) {
        points += schema.getPointsFor(drink) * amount;
    }

    public int getPoints() {
        return points;
    }
}
