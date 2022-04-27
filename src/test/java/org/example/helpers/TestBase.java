package org.example.helpers;

import org.example.pages.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class TestBase {
    public static LoginPage loginPage;
    public static PlansPage plansPage;
    public static KeywordsPage keywordsPage;
    public static ParametersPage parametersPage;
    public static ExecutionsPage executionsPage;
    public static SchedulerPage schedulerPage;
    public static GridPage gridPage;
    public static AdminPage adminPage;
    public static WebDriver driver;
    @BeforeClass
    public static void setup() {
        System.setProperty("webdriver.chrome.driver", ConfProperties.getProperty("chrome-driver"));
        driver = new ChromeDriver();
        loginPage = new LoginPage(driver);
        plansPage = new PlansPage(driver);
        keywordsPage = new KeywordsPage(driver);
        parametersPage = new ParametersPage(driver);
        executionsPage = new ExecutionsPage(driver);
        schedulerPage = new SchedulerPage(driver);
        gridPage = new GridPage(driver);
        adminPage = new AdminPage(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(ConfProperties.getProperty("login-page"));
    }
    @AfterClass
    public static void tearDown() {
        plansPage.logoutBtn();
        driver.quit();
    }
}
