package com.example.framework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;

    private By logoutButton = By.cssSelector("a[href='/logout']");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isLogoutDisplayed() {
        return driver.findElement(logoutButton).isDisplayed();
    }
}

