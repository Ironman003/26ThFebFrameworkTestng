package TestCases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class NewTest {
	ExtentReports extent = new ExtentReports();
	ExtentSparkReporter spark = new ExtentSparkReporter("target/Spark.html");

	@Test
	public void f() {
		ExtentTest test = extent.createTest("launch browser").assignAuthor("Akshay").assignDevice("MI-noebook pro");
		test.pass("passed");

	}

	@BeforeTest
	public void beforeTest() {

		extent.attachReporter(spark);
	}

	@AfterTest
	public void afterTest() {
		extent.flush();
	}

}
