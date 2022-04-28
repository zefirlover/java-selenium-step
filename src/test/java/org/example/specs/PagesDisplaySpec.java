package org.example.specs;

import org.example.helpers.TestBase;
import org.junit.Test;

public class PagesDisplaySpec extends TestBase {
    /*
        The login page in Step automatically fill credential inputs with
        login "admin" and password "init". This test checks the inputs by
        clicking the login button and check user is log in by checking existence 
        of the button, that can be shown on the default page (Plans page) only if
        user is log in.
    */
    @Test
    public void loginTest() {
        loginPage.clickLoginBtn();
        plansPage.isPlansDisplayed();
    }
    // going to the "Plans" page and check that it opens by trying to find
    // the unique page element
    @Test
    public void plansDisplayTest() {
        plansPage.redirectToPlans();
        plansPage.isPlansDisplayed();
    }
    // going to the "Keywords" page and check that it opens by trying to find
    // the unique page element
    @Test
    public void keywordsDisplayTest() {
        keywordsPage.redirectToKeywords();
        keywordsPage.isKeywordsDisplayed();
    }
    // going to the "Parameters" page and check that it opens by trying to find
    // the unique page element
    @Test
    public void parametersDisplayTest() {
        parametersPage.redirectToParameters();
        parametersPage.isParametersDisplayed();
    }
    // going to the "Executions" page and check that it opens by trying to find
    // the unique page element
    @Test
    public void executionsDisplayTest() {
        executionsPage.redirectToExecutions();
        executionsPage.isExecutionsDisplayed();
    }
    // going to the "Scheduler" page and check that it opens by trying to find
    // the unique page element
    @Test
    public void schedulerDisplayTest() {
        schedulerPage.redirectToScheduler();
        schedulerPage.isSchedulerDisplayed();
    }
    // going to the "Grid" page and check that it opens by trying to find
    // the unique page element
    @Test
    public void gridDisplayTest() {
        gridPage.redirectToGrid();
        gridPage.isGridDisplayed();
    }
    // going to the "Admin" page and check that it opens by trying to find
    // the unique page element
    @Test
    public void adminDisplayTest() {
        adminPage.redirectToAdmin();
        adminPage.isAdminDisplayed();
    }
}