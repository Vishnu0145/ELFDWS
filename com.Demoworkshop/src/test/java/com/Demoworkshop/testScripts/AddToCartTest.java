package com.Demoworkshop.testScripts;

import java.io.IOException;

import org.testng.annotations.Test;

import com.Demoworkshop.GenericLibraries.Base_Test;
import com.Demoworkshop.POMRepository.DigitalDownload;
import com.Demoworkshop.POMRepository.LoginPage;
import com.Demoworkshop.POMRepository.WelcomePage;

public class AddToCartTest extends Base_Test {

	@Test
	public void TC_addProduct_003() throws InterruptedException, IOException{
		WelcomePage wp=new WelcomePage(driver);
		wp.clicklogin();
		Thread.sleep(4000);

		LoginPage lp=new LoginPage(driver);
		lp.LoggedinPage(getPropertiesValue("email"), getPropertiesValue("password"));
		Thread.sleep(4000);
		DigitalDownload Dd=new DigitalDownload(driver);

		Dd.addAlbumProduct();


	}
}
