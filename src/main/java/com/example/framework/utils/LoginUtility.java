package com.example.framework.utils;

import com.example.framework.pages.LoginPage;
import org.openqa.selenium.WebDriver;

public class LoginUtility {
    public static void login(WebDriver driver, String username, String password) {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
        loginPage.clickLogin();
    }
}
