package models;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Planet {

    WebElement elementPlanet;
    public Planet(WebElement elementPlanet) {
        this.elementPlanet = elementPlanet;
    }
    public String getName(){
        return elementPlanet.findElement(By.className("name")).getText();
    }

    public long getDistance() {
        String distanceStr = elementPlanet.findElement((By.className("distance"))).getText().replaceAll("[^\\d.]", "");
        return Long.parseLong(distanceStr);
    }

    public void clickExplore() {
        elementPlanet.findElement(By.tagName("button")).click();
    }
}
