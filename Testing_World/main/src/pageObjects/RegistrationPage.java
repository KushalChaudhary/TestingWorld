package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.DriverInstance;

public class RegistrationPage {

	public ChromeDriver driver;
	public void registrationPageLocators(){
		
		this.driver = DriverInstance.cdriver;
		
		driver.findElement(By.name("fld_username")).sendKeys("TestRegirstaion");
		
	}
	
	
	
}
