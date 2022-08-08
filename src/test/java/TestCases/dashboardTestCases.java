package TestCases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Base.baseClass;
import Page.dashboardPageClass;
import Page.loginPageClass;

public class dashboardTestCases extends baseClass {
	dashboardPageClass dash;
	loginPageClass log;

	@BeforeMethod
	public void setup() throws IOException, InterruptedException {
		browserInit();
		log = new loginPageClass();
		dash = new dashboardPageClass();
		log.loginZerodha();
	}

	@Test
	public void verifyDashboardCredentialsTest() throws IOException, InterruptedException {
//		String usernameText = 
		String usernameText = dash.verifyDashboardCredentials();
		SoftAssert obb = new SoftAssert();
		obb.assertEquals("Akshay Vitthal Kamble", usernameText);
		//Assert.assertEquals("Akshay Vitthal Kamble",usernameText);
	
	}

	@Test(groups="ok",priority = 1)
	public void createGttOrderTest() throws EncryptedDocumentException, IOException {
		dash.createGttOrder();
	}

	/*
	 * @Test public void hiddenDivisionPopUpTest() throws InterruptedException,
	 * IOException { //find the solution for
	 * this..............................................
	 * 
	 * dash.hiddenDivisionPopUp(); }
	 */

	@Test(groups="ok",priority = 2)
	public void childBrowser() throws InterruptedException {
		String obj = dash.childBrowser();
		SoftAssert sof =  new SoftAssert();
		sof.assertEquals("Akshay Vitthal Kamble", obj);
		System.out.println("this is failed test case");
		sof.assertAll();
	}

	@AfterMethod
	public void exitBrowserInit() throws InterruptedException {
//		Thread.sleep(3000);
//		driver.close();
	}
}
