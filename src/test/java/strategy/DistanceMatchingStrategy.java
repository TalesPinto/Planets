package strategy;

import models.Planet;

public class DistanceMatchingStrategy implements MatchingStrategy {
    long distance;

    public DistanceMatchingStrategy(long distance) {
        this.distance = distance;
    }

    @Override
    public boolean Match(Planet planet) {

        return planet.getDistance() == distance;
    }
}
