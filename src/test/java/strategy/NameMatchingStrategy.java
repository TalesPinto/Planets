package strategy;

import models.Planet;

public class NameMatchingStrategy implements MatchingStrategy{

    private final String name;

    public NameMatchingStrategy(String name) {
        this.name = name;
    }

    @Override
    public boolean Match(Planet planet) {
        return planet.getName().equalsIgnoreCase(name);
    }
}
