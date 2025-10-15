package com.example.framework.pages;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class PimPage {
	 private WebDriver driver;

	 	private By usernameInput = By.name("username");
	    private By passwordInput = By.name("password");
	    private By loginButton = By.xpath("//button[text()=' Login ']");
	    private By pimbutton = By.xpath("//span[text()='PIM']");
	    private By addbutton = By.xpath("//button[normalize-space()='Add']");
	    private By Firstname= By.name("firstName");
	    private By Middlename= By.name("middleName");
	    private By lastName= By.name("lastName");
	    private By save = By.xpath("(//button[@type='submit' and normalize-space()='Save'])[1]");
	    private By employeeid = By.xpath("//label[text()='Employee Id']/following::input[1]");
	    private By otherid = By.xpath("//label[text()='Other Id']/following::input[1]");
	    private By dlnumber=By.xpath("//label[contains(., \"Driver's License Number\")]/following::input[1]");
	    private By liscenseexd =By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[2]/div[2]/div/div[2]/div/div/input");
	    private By nationality = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[1]/div[1]/div/div[2]/div/div");
	    private By choosenationality = By.xpath("//span[text()= \"Bangladeshi\"]");
	    private By ms =By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[1]/div[2]/div/div[2]/div/div");
	    private By choosems = By.xpath("//span[text()= \"Single\"]");
	    private By dob = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[2]/div[1]/div/div[2]/div/div/input");
	    private By gender =By.xpath("//label[text()=\"Male\"]");
	    private By bloodtype=By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[2]/div/form/div[1]/div/div[1]/div/div[2]/div/div/div[1]");
	    private By choosebloodtype = By.xpath("//span[text()=\"O-\"]");
	    private By save2 = By.xpath("(//button[@type='submit' and normalize-space()='Save'])[2]");
	    private By add= By.xpath("//button [text() =\" Add \"]");
	    private By browse =By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[3]/div/form/div[1]/div/div/div/div[2]/div/div[1]");
	    private By comments = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[3]/div/form/div[2]/div/div/div/div[2]/textarea");
	    private By save3 =By.xpath("(//button[@type='submit' and normalize-space()='Save'])[3]");
	    
	    
	    
	    public PimPage (WebDriver driver) {
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

	    public void pimbutton() {
	    	driver.findElement(pimbutton).click();
	    }
	    public void addbutton() {
	    	driver.findElement(addbutton).click();
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
		public void employeeid () {
		driver.findElement(employeeid).click();
	
		}
		public void otherid () {
			driver.findElement(otherid).click();
			driver.findElement(otherid).sendKeys("12345");	
		}
		public void dlnumber () {
			driver.findElement(dlnumber).click();
			driver.findElement(dlnumber).sendKeys("123456");	
		}
		public void liscenseexd () {
			driver.findElement(liscenseexd).click();
			driver.findElement(liscenseexd).sendKeys("2026-23-02");
		}
		
		public void nationality () {
			driver.findElement(nationality).click();
		}
	    public void choosenationality() {
	    	driver.findElement(choosenationality).click();
	    }
	    public void ms () {
	    	driver.findElement(ms).click();
	    }
	    public void chossems () {
	    	driver.findElement(choosems).click();
	    }
	    public void dob() {
	    	driver.findElement(dob).click();
	    	driver.findElement(dob).sendKeys("1996-02-02");
	    }
	    public void gender () {
	    	driver.findElement(gender).click();
	    }
	    public void bloodtype() {
	    	driver.findElement(bloodtype).click();
	    }
	    public void choosebloodtype() {
	    	driver.findElement(choosebloodtype).click();
	    }
	    public void save2 () {
	    	driver.findElement(save2).click();
	    }

	    public void add() {
	    	driver.findElement(add).click();
	    }

	    public void browse () {
	    	driver.findElement(browse).click();
	    	driver.findElement(browse).sendKeys("/Users/Kazitafim/Downloads/phl city.jpg");
	    }
	    public void comments () {
	    	driver.findElement(comments).click();
	    	driver.findElement(comments).sendKeys("NO comments");
	    }
	    public void save3 () {
	    	driver.findElement(save3).click();
	    }

}
