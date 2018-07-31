package test1;

import org.testng.annotations.Test;

import base.DriverInstance;

public class ErrorRemoval {

	@Test
	public void check(){
		System.out.println("Checking...");
		DriverInstance driver = new DriverInstance();
		driver.launchBrowser();
	}
}
