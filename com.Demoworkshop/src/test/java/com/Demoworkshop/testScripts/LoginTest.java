package com.Demoworkshop.testScripts;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Demoworkshop.GenericLibraries.Base_Test;
import com.Demoworkshop.GenericLibraries.ExcelRead;
import com.Demoworkshop.POMRepository.LoginPage;
import com.Demoworkshop.POMRepository.WelcomePage;
@Test
public class LoginTest extends Base_Test {
	@Test//(dataProvider = "ExcelTysss")
		public void TC_Login_001() throws InterruptedException, IOException{
		WelcomePage wp=new WelcomePage(driver);
		wp.clicklogin();
		Thread.sleep(4000);
		
		LoginPage lp=new LoginPage(driver);
		lp.LoggedinPage(getPropertiesValue("email"), getPropertiesValue("password"));
		Thread.sleep(4000);
		//lp.logout();
		
		
	}
	@DataProvider(name="ExcelTysss")
	public void loginDataProvider() throws IOException, Throwable {
		ExcelRead.MultipleR("Login");
	}
	
}














//String fn = getPropertiesValue("FirstName");
//String ln = getPropertiesValue("LastName");
//String eid = getPropertiesValue("Email");
//String pwd = getPropertiesValue("Password");
//String cwd = getPropertiesValue("ConfirmPassword");
//String gen = getPropertiesValue("Gender");
//
//Rp.selectGenderRadioButton(gen);
//Rp.FillRegisterPage(fn,ln,eid,pwd,cwd);