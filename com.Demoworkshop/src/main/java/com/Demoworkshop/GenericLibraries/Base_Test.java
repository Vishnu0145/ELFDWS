package com.Demoworkshop.GenericLibraries;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base_Test extends FrameWorkLibrary{
	
	/*
	 * making public so can access driver into other package
	 * within the project.
	 */
 public WebDriver driver;


	@BeforeMethod
	public void browserSetup() throws IOException {
		
		if (getPropertiesValue("browser").equalsIgnoreCase("chrome")){
			driver=new ChromeDriver();}
		else if (getPropertiesValue("browser").equalsIgnoreCase("firefox")){
			driver=new FirefoxDriver();}
		else if(getPropertiesValue("browser").equalsIgnoreCase("Edge")){
			driver=new EdgeDriver();}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMESOUT));
		driver.navigate().to(getPropertiesValue("url"));
		initObjects(driver);
	}



	


	@AfterMethod
	public void browserTearDown() {

		driver.quit();
		softAssert.assertAll();

	}

}
