package org.example.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class GridPage {
    public WebDriver driver;
    public GridPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void redirectToGrid() {
        driver.findElement(By.xpath("//*[contains(text(),'Grid')]")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
    }

    public void isGridDisplayed() {
        driver.findElement(By.xpath("//*[text()='Agents']"));
    }
}