package models;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Toolbar {

    WebDriver driver;

    public Toolbar(WebDriver driver) {
        this.driver = driver;
    }

    public void openPlanetPage(){
        driver.findElement(By.cssSelector("[aria-label=planets]")).click();
    }
}
