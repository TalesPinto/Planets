package models;

import org.openqa.selenium.By;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import strategy.MatchingStrategy;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PlanetsPage {

    WebDriver driver;

    public PlanetsPage(WebDriver driver) {
        this.driver = driver;
    }

        public Planet getPlanet(Predicate<Planet> strategy) {
            for(WebElement planetElement : driver.findElements(By.className("planet"))) {
                var planet = new Planet(planetElement);
                if (strategy.test(planet)) {
                    return planet;
                }
            }
            throw new NotFoundException("couldnt find planet");
        }


    }


