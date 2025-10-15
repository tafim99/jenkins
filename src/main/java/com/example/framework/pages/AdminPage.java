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
public class AdminPage {
	 private WebDriver driver;

	    // Locators
	    private By usernameInput = By.name("username");
	    private By passwordInput = By.name("password");
	    private By loginButton = By.xpath("//button[text()=' Login ']");
	    private By adminbutton = By.xpath("//span[text()='Admin']");
	    private By addbutton = By.xpath("//button[normalize-space()='Add']");
	    private By roledropdown =By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/div/div/div[2]/i");//div[@role='listbox']//div[1]
	    private By selectadmin = By.xpath("//span[contains(text(),'Admin')]");
	    private By clickemployeename= By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/div/div[2]/div/div/input");
	    private By selectemployeename= By.xpath("//span[text()=\"Ravi M B\"]");
	    private By statusdropdown= By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[3]/div/div[2]/div/div/div[2]/i");
	    private By selectenable = By.xpath("//span[text()='Enabled']");
	    private By username = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[4]/div/div[2]/input");
	    private By inputpassword= By.xpath("//div[@class='oxd-grid-item oxd-grid-item--gutters user-password-cell']//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@type='password']");
	    private By confirmpassword= By.xpath("//div[@class='oxd-grid-item oxd-grid-item--gutters']//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@type='password']");
	    private By savebutton = By.xpath("//button[normalize-space()='Save']");
	    
	    private By employeename=By.xpath("//*[@placeholder=\"Type for hints...\"]");
	    private By employeeranga=By.xpath("//span[text()=\"Ravi M B\"]");
	    private By username2=By.cssSelector("#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-container > div.oxd-layout-context > div > div.oxd-table-filter > div.oxd-table-filter-area > form > div.oxd-form-row > div > div:nth-child(1) > div > div:nth-child(2) > input");
	    private By searchbutton=By.xpath("//button[text()=\" Search \"]");
	    private By verifystatus=By.xpath("//div[@role=\"cell\"][5]");
	    private By edit=By.xpath("//i[@class=\"oxd-icon bi-pencil-fill\"]");
	    private By delete=By.xpath("//i[@class=\"oxd-icon bi-trash\"]");
	    private By popup=By.xpath("//*[@role=\"document\"]");
	    private By Disabled=By.xpath("//span[contains(text(),\"Disabled\")]");
	    private By status=By.cssSelector("#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-container > div.oxd-layout-context > div > div > form > div:nth-child(1) > div > div:nth-child(3) > div > div:nth-child(2) > div > div > div.oxd-select-text-input");
	    
	    
	    
	    
	    
	    public AdminPage (WebDriver driver) {
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
	    public void adminbutton () {
	    	driver.findElement(adminbutton).click();
	    }
	    public void addbutton() {
	    	driver.findElement(addbutton).click();
	    }
	    public void roledropdown () {
	    	driver.findElement(roledropdown).click();
	    }
	    public void selectadmin() {
	    	driver.findElement(selectadmin).click();
	    }
	    public void clickemployeename (String name) {
	    	driver.findElement(clickemployeename).click();
	    	driver.findElement(clickemployeename).sendKeys(name);
	     }
	    public void selectemployeename() {
	    	driver.findElement(selectemployeename).click();
	    }
	    public void statusdropdown() {
	    	driver.findElement(statusdropdown).click();
	    	
	    }
	    String a = " sami";
	    String b =" ahmend";
	    String c = " hossein";
	    String fullname= a+b+c;
	    
	    
	    
	  public void selectenableordisable (String status) {
		String first = "//span[text()='";	
		String Second = "']";  
		String Finalxpath= first+status+Second;
		
		
		
		WebElement selectenableordisable = driver.findElement(By.xpath(Finalxpath));
		selectenableordisable.click();
		
		}
	    public void username () {
	    	driver.findElement(username).click();
	    	driver.findElement(username).clear();
	    	driver.findElement(username).sendKeys("Tafim");
	    }
	    public void inputpassword () {
	    	driver.findElement(inputpassword).click();
	    	driver.findElement(inputpassword).sendKeys("admin123");
	    }
	    public void confirmpassword () {
	    	driver.findElement(confirmpassword).click();
	    	driver.findElement(confirmpassword).sendKeys("admin123");
	    }
	    public void savebutton() {
	    	driver.findElement(savebutton).click();
	    }
	    public void username2(String uname) {
			 driver.findElement(username2).click();
		driver.findElement(username2).sendKeys(uname);
			 
			 
			}  
		   
		   public void searchbutton() {
			   
			   
			  driver.findElement(searchbutton) .click();
			   
		   }
		   
		   public void verifystatus(String text ) {
				
				
			   String message =driver.findElement(verifystatus).getText();
			   	
			   	
			   	System.out.println(message);
			   	Assert.assertEquals(text, message);
			   }
		   
		   public void edit() {
			   
			   driver.findElement(edit).click();
			   
		   }
		   public void Disabled() {
			   
			 driver.findElement(Disabled).click();  
			   
		   }
		   public void popupdelete() {
			    // Click on the trash icon
			    driver.findElement(delete).click();
			    
			     // Wait for the modal popup to appear
			    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			    
			    // Locate and click the confirm delete button inside the modal
			    By confirmDeleteButton = By.xpath("//button[normalize-space()='Yes, Delete']"); // update this if text differs
			    wait.until(ExpectedConditions.visibilityOfElementLocated(confirmDeleteButton));
			   
			    String popupText = driver.findElement(popup).getText();
			    System.out.println("Popup message: " + popupText);
		        
			    System.out.println(driver.findElement(popup));
			    driver.findElement(confirmDeleteButton).click();
		   }
			    public void status() {
					driver.findElement(status).click(); 
					  
				  }
			   
				   
	    
	
	
	
	
	
	
	
	
		   
}
