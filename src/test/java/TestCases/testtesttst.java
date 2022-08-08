package TestCases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
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
//	@Test(dataProvider = "phone")
	@Test
	public void demo( ) {
		obj.showw();
	}
	
//	@DataProvider(name="phone")
//	public Object[][] showData() {
//		Object[][] data = new Object[1][1];
//		data[0][0]="Oneplus";
//;		return data;
//		
//	}
	@AfterMethod
	public void exit() {
		driver.close();
	}
	

}
