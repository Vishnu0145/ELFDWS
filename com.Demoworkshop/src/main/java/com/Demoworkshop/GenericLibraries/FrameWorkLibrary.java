package com.Demoworkshop.GenericLibraries;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class FrameWorkLibrary implements FrameworkConstants{
public Actions actions;
public WebDriverWait Wait;
public SoftAssert softAssert;

		public void SelectClass(WebElement Dropdown, String Option) {
			Select select = new Select(Dropdown);
			int counter=0;
			try {
				int indexValue=Integer.parseInt(Option);
				select.selectByIndex(indexValue);
				select.deselectByIndex(indexValue);
				counter++;
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("Not an Index Value");
			}
			if(counter==0) {
				try {
					select.selectByValue(Option);
					select.deselectByValue(Option);
					select.deselectAll();


				} catch (Exception e) {

					select.selectByVisibleText(Option);
					select.deselectByVisibleText(Option);
				}
			}

		}
		
		/*
		 * name() returns date & time as string and replaces : with - when called
		 * It is used to for dynamic storing path name as time keeps changing
		 * 
		 */
		public String  name() {
			LocalDateTime datetime=LocalDateTime.now();
			String fileName = datetime.toString().replaceAll(":", "-");
			return fileName;
			
		}
		
		
		
		
		
		public void takeScreenshotofPage(WebDriver driver) {

			
			TakesScreenshot ts = (TakesScreenshot)driver;
			File dest = new File(SCREENSHOT_PATH+name()+".png");
			File temp = ts.getScreenshotAs(OutputType.FILE);
			try {
				FileHandler.copy(temp, dest);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		public void takeScreenshotofElement(WebElement element) {

			File dest=new File(SCREENSHOT_PATH+name()+".png");
			File temp=element.getScreenshotAs(OutputType.FILE);
			try {
				FileHandler.copy(temp, dest);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	
	public String getPropertiesValue(String Key) throws IOException {
		File file=new File(PROPERTIES_PATH);
		FileInputStream fis=new FileInputStream(file);
		Properties prop=new Properties();
		prop.load(fis);
		return prop.getProperty(Key);
	}
	
	
	public void initObjects(WebDriver driver){
		actions = new Actions(driver);
		Wait = new WebDriverWait(driver, Duration.ofSeconds(TIMESOUT));
		softAssert = new SoftAssert();
		
	}
	
	public void scrollTillWebElement(WebElement element) {
		actions.scrollToElement(element);
		
		
	}

}
