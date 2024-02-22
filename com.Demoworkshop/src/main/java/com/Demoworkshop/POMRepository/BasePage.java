package com.Demoworkshop.POMRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.Demoworkshop.GenericLibraries.FrameWorkLibrary;

public class BasePage extends FrameWorkLibrary{
	
	public BasePage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}

}
