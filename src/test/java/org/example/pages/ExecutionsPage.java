package org.example.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class ExecutionsPage {
    public WebDriver driver;
    public ExecutionsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void redirectToExecutions() {
        driver.findElement(By.xpath("//*[contains(text(),'Executions')]")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
    }

    public void isExecutionsDisplayed() {
        WebElement executionList = driver.findElement(By.xpath("//*[text()=' Execution list ']"));
        executionList.isDisplayed();
    }
}