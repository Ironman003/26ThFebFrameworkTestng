package TestCases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.baseClass;
import Page.actionsClassPageDashboard;
import Page.loginPageClass;

public class actionsClassPageDashboardTest extends baseClass {
	actionsClassPageDashboard obj;
	loginPageClass logObj;

	@BeforeMethod
	public void setup() throws IOException, InterruptedException {
		browserInit();
		obj = new actionsClassPageDashboard();
		logObj = new loginPageClass();
		logObj.loginZerodha();
	}

	@Test
	public void actionsClassTest() {
		obj.actionsClass();
	}

	@AfterMethod
	public void exit() {
//	driver.close();
	}
}
