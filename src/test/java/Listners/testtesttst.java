package Listners;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.baseClass;
import Page.testYourKnldge;

public class testtesttst extends baseClass {
	testYourKnldge obj;
	@BeforeMethod
	public void setup() throws IOException {
		browserInit();
		 obj = new testYourKnldge();
	}
	@Test
	public void demo() {
		obj.showw();
	}
	@AfterMethod
	public void exit() {
		driver.close();
	}

}
