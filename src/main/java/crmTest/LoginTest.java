package crmTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
	
	public static void main(String[] args) throws InterruptedException{
	//setting up the property
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		//creating web driver instance
	WebDriver driver = new ChromeDriver();
	
	
	//maximizing browser
	
	driver.manage().window().maximize(); 
	
	//get to the site
	driver.get("http://www.techfios.com/ibilling/?ng=admin/");
	
	//identifying the username field
	driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
	
	//identifying the password field
	driver.findElement(By.id("password")).sendKeys("abc123");
	//click the login button
	driver.findElement(By.name("login")).click();
	
	Thread.sleep(10000);
	
	driver.close();

	}
}