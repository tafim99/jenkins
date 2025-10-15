package com.example.framework.tests;
import com.example.framework.base.BaseTest;
import com.example.framework.pages.AdminPage;
import com.example.framework.pages.HomePage;
import com.example.framework.pages.LoginPage;
import com.example.framework.utils.ConfigReader;
import com.example.framework.utils.LoginUtility;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AdminTest extends BaseTest {

	 @Test

	public void validLoginTest() throws InterruptedException {
        LoginUtility.login(driver, ConfigReader.get("username"), ConfigReader.get("password"));
		
        AdminPage adminpage = new AdminPage (driver);
        Thread.sleep(7000);
		adminpage.adminbutton();
		Thread.sleep(6000);
		adminpage.addbutton();
		Thread.sleep(6000);
		adminpage.roledropdown();
		adminpage.selectadmin();
		adminpage.clickemployeename("a");
		Thread.sleep(2000);
		adminpage.selectemployeename();
		adminpage.statusdropdown();
		adminpage.selectenableordisable("Enabled");
		adminpage.username();
		adminpage.inputpassword();
		adminpage.confirmpassword();
		adminpage.savebutton();
		
		Thread.sleep(5000);
		adminpage.username2("tafim");
    	Thread.sleep(2000);
    	adminpage.searchbutton();
    	Thread.sleep(4000);
    	adminpage.verifystatus("Enabled");
    	Thread.sleep(6000);
    	adminpage.edit();
    	Thread.sleep(3000);
    	adminpage.status();
    	Thread.sleep(7000);
    	adminpage.Disabled();
    	Thread.sleep(5000);
    	adminpage.savebutton();
    	Thread.sleep(4000);
    	adminpage.username2("tafim");
    	Thread.sleep(3000);
    	adminpage.searchbutton();
    	Thread.sleep(2000);
    	adminpage.verifystatus("Disabled");
    	Thread.sleep(3000);
    	adminpage.popupdelete();
    	
	 
	 
	 
	 
	 
	 
	 
	 }
}

