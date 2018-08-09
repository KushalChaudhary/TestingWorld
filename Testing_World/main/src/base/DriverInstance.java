package base;

import java.util.Scanner;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverInstance {
	
	public static ChromeDriver cdriver;
	public static InternetExplorerDriver iedriver;
	public static FirefoxDriver fdriver;
	public static Scanner scan;
	public static String browserName;
	
	public void launchBrowser(){
		
		scan = new Scanner(System.in);
		System.out.println("Enter browser option to proceed Automation tests from below" + "\n" + "1 for Firefox"+ "\n" + "2 for Chrome" + "\n" + "3 for Internet Explorer");
		browserName = scan.next();
		
		switch(browserName){
		case "1":

			System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver.exe");
			fdriver = new FirefoxDriver();
			fdriver.get("http://www.thetestingworld.com/");
			fdriver.manage().window().maximize();
			break;
	
		case "2":
			System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
			cdriver = new ChromeDriver();
			cdriver.get("http://www.thetestingworld.com/");
			cdriver.manage().window().maximize();
			break;
			
		case "3":
			System.setProperty("webdriver.ie.driver", "./Driver/IEDriverServer.exe");
			iedriver = new InternetExplorerDriver();
			iedriver.get("http://www.thetestingworld.com/");
			iedriver.manage().window().maximize();
			break;
		}
		
		
	}
	

}
