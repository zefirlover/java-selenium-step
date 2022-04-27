package org.example.specs;

import org.example.helpers.TestBase;
import org.junit.Test;
import java.time.Duration;

public class PagesDisplaySpec extends TestBase {
    /*
        The login page in Step automatically fill credential inputs with
        login "admin" and password "init". This test checks the inputs,
        if the login = admin and password = init, it clicks the login
        and checks user is log in by checking existence of the button,
        that can be shown on the default page (Plans page) only if user is
        log in
    */
    @Test
    public void loginTest() {
        //loginPage.checkAutoInput();
        loginPage.clickLoginBtn();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        plansPage.isPlansDisplayed();
    }
    // going to the "Plans" page and check that it opens by trying to find
    // the unique page element
    @Test
    public void plansDisplayTest() {
        plansPage.redirectToPlans();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        plansPage.isPlansDisplayed();
    }
    // going to the "Keywords" page and check that it opens by trying to find
    // the unique page element
    @Test
    public void keywordsDisplayTest() {
        keywordsPage.redirectToKeywords();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        keywordsPage.isKeywordsDisplayed();
    }
    // going to the "Parameters" page and check that it opens by trying to find
    // the unique page element
    @Test
    public void parametersDisplayTest() {
        parametersPage.redirectToParameters();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        parametersPage.isParametersDisplayed();
    }
    // going to the "Executions" page and check that it opens by trying to find
    // the unique page element
    @Test
    public void executionsDisplayTest() {
        executionsPage.redirectToExecutions();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        executionsPage.isExecutionsDisplayed();
    }
    // going to the "Scheduler" page and check that it opens by trying to find
    // the unique page element
    @Test
    public void schedulerDisplayTest() {
        schedulerPage.redirectToScheduler();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        schedulerPage.isSchedulerDisplayed();
    }
    // going to the "Grid" page and check that it opens by trying to find
    // the unique page element
    @Test
    public void gridDisplayTest() {
        gridPage.redirectToGrid();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        gridPage.isGridDisplayed();
    }
    // going to the "Admin" page and check that it opens by trying to find
    // the unique page element
    @Test
    public void adminDisplayTest() {
        adminPage.redirectToAdmin();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        adminPage.isAdminDisplayed();
    }
}