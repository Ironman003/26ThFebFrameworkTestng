package TestCases;

import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.baseClass;
import Page.loginPageClass;
import Page.ordersPageClass;

public class ordersPageClassTest extends baseClass {
	loginPageClass log;
	ordersPageClass order;

	@BeforeMethod
	public void setup() throws IOException, InterruptedException {
		browserInit();
		log = new loginPageClass();
		order = new ordersPageClass();
		log.loginZerodha();
	}

	@AfterMethod
	public void exit() {
//		driver.close();
	}

	@Test
	public void deleteGttOrderTest() {
		order.deleteGttOrder();
//		Reporter.log(value,"ok");
	}
}
