package TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.baseClass;
import Page.loginPageClass;

public class loginTestCases extends baseClass {
//	@BeforeSuite(groups= {"sanity"})
//	public void b4Suite() {
//		System.out.println("This will run b4 Suite Suite name = 'Sanity'");
//	}
//	
	loginPageClass log;
	

	@BeforeMethod(groups= {"sanity"})//(alwaysRun=true)
	public void setup() throws IOException {
		browserInit();
		log = new loginPageClass();
	}
	@Test(groups= "sanity")
	public void isLoginElementDisplayedTest() {
		log.isLoginElementDisplayed();
//		driver.close();
	}

	@Test(groups= {"sanity"})
	public void isTitleDisplayedTest() {
		String saveTitle = log.isTitleDisplayed();
		Assert.assertEquals("Kite - Zerodha's fast and elegant flagship trading platform", saveTitle);
	}
	@Test
	public void loginZerodhaTest() throws IOException, InterruptedException {
		log.loginZerodha();
	}

	@AfterMethod (groups= "sanity")//(alwaysRun=true)
	public void exitBrowserInit() throws InterruptedException {
//		driver.close();
	}

}
