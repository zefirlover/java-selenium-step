package org.example.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class KeywordsPage {
    public WebDriver driver;
    public KeywordsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void redirectToKeywords() {
        driver.findElement(By.xpath("//*[contains(text(),'Keywords')]")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
    }

    public void isKeywordsDisplayed() {
        driver.findElement(By.xpath("//*[text()='New keyword']"));
    }
}
