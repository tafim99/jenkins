package com.example.framework.tests;

import org.testng.annotations.Test;

import com.example.framework.pages.AdminPage;
import com.example.framework.utils.ConfigReader;
import com.example.framework.utils.LoginUtility;
import com.example.framework.base.BaseTest;
import com.example.framework.pages.AdminPage;
import com.example.framework.pages.HomePage;
import com.example.framework.pages.LoginPage;
import com.example.framework.pages.PimPage;
import com.example.framework.utils.ConfigReader;
import com.example.framework.utils.LoginUtility;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PimTest extends BaseTest {
			
	@Test
			public void validLoginTest() throws InterruptedException {
		        LoginUtility.login(driver, ConfigReader.get("username"), ConfigReader.get("password"));
				
		    PimPage pimpage = new PimPage (driver);   
		    Thread.sleep(5000);
		    pimpage.pimbutton();
		    Thread.sleep(5000);
		    pimpage.addbutton();
		    Thread.sleep(3000);
		    pimpage.inputbox("firstName", "Kazi");
		    pimpage.inputbox("middleName", "Tawsif");
		    pimpage.inputbox("lastName", "Tafim");
		    pimpage.save();
		    Thread.sleep(8000);
		    pimpage.otherid();
		    pimpage.dlnumber();
		    
		    pimpage.liscenseexd();
		    pimpage.nationality();
		    pimpage.choosenationality();
		    pimpage.ms();
		    pimpage.chossems();
		    pimpage.dob();
		    pimpage.gender();
		    pimpage.save();
		    Thread.sleep(3000);
		    pimpage.bloodtype();
		    pimpage.choosebloodtype();
		    pimpage.save2();
		    Thread.sleep(3000);
		    pimpage.add();
		   // pimpage.browse();
		    pimpage.comments();
		    pimpage.save3();
		    Thread.sleep(3000);
		   
		    
		    
		    driver.quit();
	
	
	
	
	
	
	
	}

}
