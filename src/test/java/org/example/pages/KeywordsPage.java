package org.example.pages;

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
    }

    public void isKeywordsDisplayed() {
        driver.findElement(By.xpath("//*[text()='New keyword']"));
    }
}
