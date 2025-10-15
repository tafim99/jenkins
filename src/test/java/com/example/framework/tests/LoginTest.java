package com.example.framework.tests;

import com.example.framework.base.BaseTest;
import com.example.framework.pages.HomePage;
import com.example.framework.pages.LoginPage;
import com.example.framework.utils.ConfigReader;
import com.example.framework.utils.LoginUtility;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void validLoginTest() throws InterruptedException {
        LoginUtility.login(driver, ConfigReader.get("username"), ConfigReader.get("password"));

        LoginPage loginpage= new LoginPage(driver);
        Thread.sleep(5000);
        loginpage.Myinfo();
        Thread.sleep(5000);
        driver.findElement(By.name("firstName")).click();
        Thread.sleep(3000);

        loginpage.inputbox("firstName", "Kazi");

    	loginpage.inputbox("middleName", "Tawsif");
    
    	loginpage.inputbox("lastName", "Tafim");
    	
    	loginpage.save();
    	driver.navigate().refresh();
    	Thread.sleep(5000);
//   	WebElement profilename = driver.findElement(By.xpath("//h6[text()='Kazi Tafim']"));
//   	String expectedTitle = "Kazi Tafim";
//    String actualTitle = profilename.getText();
    
       // Assert.assertEquals(actualTitle, expectedTitle, "Employee name does not match expected value.");
     
       
    loginpage.testEmployeeNameIsKaziTafim();
    	

    	
    	
    	
    	
    	
    	
    }
}

