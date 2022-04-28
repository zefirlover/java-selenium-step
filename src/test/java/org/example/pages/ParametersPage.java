package org.example.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ParametersPage {
    public WebDriver driver;
    public ParametersPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void redirectToParameters() {
        driver.findElement(By.xpath("//*[contains(text(),'Parameters')]")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
    }

    public void isParametersDisplayed() {
        driver.findElement(By.xpath("//*[text()='New parameter']"));
    }
}