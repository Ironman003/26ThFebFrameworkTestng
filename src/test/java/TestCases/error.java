package TestCases;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class error {
	WebDriver driver;

	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "Browsers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
	}

	@AfterMethod
	public void exsit() {
//	driver.close();
	}

	@Test
	public void letsSee() {
		driver.findElement(By.xpath("//button[text()='Sign Up'][1]")).click();
		WebElement message = driver.findElement(By.name("firstname"));
		message.getAttribute("message");

	}
}
