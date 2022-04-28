package org.example.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SchedulerPage {
    public WebDriver driver;
    public SchedulerPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void redirectToScheduler() {
        driver.findElement(By.xpath("//*[contains(text(),'Schedule')]")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
    }

    public void isSchedulerDisplayed() {
        driver.findElement(By.xpath("//*[text()='New task']"));
    }
}