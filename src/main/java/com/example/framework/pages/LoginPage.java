package com.example.framework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class LoginPage {
    private WebDriver driver;

    // Locators
    private By usernameInput = By.name("username");
    private By passwordInput = By.name("password");
    private By loginButton = By.xpath("//button[text()=' Login ']");
    private By flashMessage = By.id("flash");
    private By Myinfo = By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[6]/a");
    private By Firstname= By.name("firstName");
    private By Middlename= By.name("middleName");
    private By lastName= By.name("lastName");
    private By save = By.xpath("(//button[@type='submit' and normalize-space()='Save'])[1]");
    // Constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // Actions
    public void enterUsername(String username) {
        driver.findElement(usernameInput).sendKeys(username);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordInput).sendKeys(password);
    }

    public void clickLogin() {
        driver.findElement(loginButton).click();
    }

    public String getFlashMessage() {
        return driver.findElement(flashMessage).getText();
        }
    public void Myinfo() {
    	driver.findElement(Myinfo).click();
    	
    	
    }
    
    public void inputbox(String Name, String name) {
    	
    	WebElement inputbox = driver.findElement(By.name(Name));
    	int length= inputbox.getAttribute("value").length();
    	for (int i = 0; i<length;i++) {
    		inputbox.sendKeys(Keys.BACK_SPACE);
    	}
    	driver.findElement(By.name(Name)).sendKeys(name);
    }

    public void save() {
    driver.findElement(save).click();
    }
 
    public void testEmployeeNameIsKaziTafim() {
        WebElement profilename = driver.findElement(By.xpath("//h6[text()='Kazi Tafim']"));
        String expectedName = "Kazi Tafim";
        String actualName = profilename.getText();
        Assert.assertEquals(actualName, expectedName);
        System.out.println( actualName);
    
  //  how to do asserttion text value using java
    
    
    }    
}
