package com.Demoworkshop.testScripts;

import java.io.IOException;

import org.testng.annotations.Test;

import com.Demoworkshop.GenericLibraries.Base_Test;
import com.Demoworkshop.POMRepository.RegisterPage;
import com.Demoworkshop.POMRepository.WelcomePage;

public class RegisterTest extends Base_Test {
	@Test
	public void TC_Register_002() throws InterruptedException, IOException {
		
		WelcomePage wp=new WelcomePage(driver);
		wp.RegisterPage();
		Thread.sleep(TIMESOUT);
	RegisterPage Rp=new RegisterPage(driver);
	Rp.FillRegisterPage(getPropertiesValue("FirstName"), getPropertiesValue("LastName"), getPropertiesValue("Email"), getPropertiesValue("Password"), getPropertiesValue("ConfirmPassword"), getPropertiesValue("Gender"));
	Thread.sleep(3000);

}
}