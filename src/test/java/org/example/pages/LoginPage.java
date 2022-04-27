package org.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public WebDriver driver;
    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver; }

    @FindBy(name = "username")
    private WebElement inpLogin;

    @FindBy(name = "password")
    private WebElement inpPassword;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement btnLogin;

    public void inputLogin(String login) {
        inpLogin.sendKeys(login);
    }

    public void inputPassword(String password) {
        inpPassword.sendKeys(password);
    }

    public void clickLoginBtn() {
        btnLogin.click();
    }

    public void checkAutoInput() {
        String loginText = inpLogin.getText();
        String passwordText = inpPassword.getText();
        if (loginText.equals("admin") && passwordText.equals("init")) {
            clickLoginBtn();
        }
    }

    public void checkLogin() {
        if (btnLogin.isDisplayed()) {
            btnLogin.click();
        }
    }
}
