package org.example.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PlansPage {
    public WebDriver driver;
    public PlansPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void redirectToPlans() {
        driver.findElement(By.xpath("//*[contains(text(),'Plans')]")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
    }

    public void isPlansDisplayed() {
        driver.findElement(By.xpath("//*[text()='New plan']"));
    }
    
    public void logoutBtn() {
        driver.findElement(By.id("sessionDropdown")).click();
        driver.findElement(By.xpath("//a[@ng-click='authService.logout()']")).click();
    }
}
