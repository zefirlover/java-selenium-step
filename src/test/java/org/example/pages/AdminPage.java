package org.example.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AdminPage {
    public WebDriver driver;
    public AdminPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void redirectToAdmin() {
        driver.findElement(By.xpath("//*[contains(text(),'Admin')]")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
    }

    public void isAdminDisplayed() {
        driver.findElement(By.xpath("//*[text()='Add user']"));
    }
}