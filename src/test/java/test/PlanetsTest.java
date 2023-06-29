package test;

import models.Planet;
import models.PlanetsPage;
import models.Toolbar;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;


import java.time.Duration;

public class PlanetsTest {

    private WebDriver driver;

    private WebDriver getWebDriver(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        return driver;
    }

    @BeforeEach
    public void setup() {
        getWebDriver();
        driver.get("https://d18u5zoaatmpxx.cloudfront.net/");
        new Toolbar(driver).openPlanetPage();
    }

    @Test
    public void PlanetInfo() {
        new PlanetsPage(driver).getPlanet(planet -> planet.getName().equalsIgnoreCase("earth")).clickExplore();

        Planet message =
//        Assertions.assertEquals("earth", plante);
    }

    @Test
    public void PlanetDistance() {
        new PlanetsPage(driver).getPlanet(planet -> planet.getDistance() == 149600000l);

    }


