package Page;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.baseClass;

public class loginPageClass extends baseClass {
	public boolean demo = true;
	//how to check page element present
	@FindBy(xpath = "//img[@alt='Kite']")private WebElement kiteLogoImg;
	@FindBy(xpath = "//img[@alt='Zerodha']")private WebElement zerodhaLogoImg;
	//how to login
	@FindBy(xpath = "//input[@id='userid']") private WebElement userIdTxt;
	@FindBy(xpath = "//input[@id='password']") private WebElement passTxt;
	@FindBy(xpath = "//button[@type='submit']")private WebElement btnLogin; 
	@FindBy(xpath = "//input[@id='pin']")private WebElement pinTxt;
	public loginPageClass() {
		PageFactory.initElements(driver, this);
	}
	public void isLoginElementDisplayed() {
		kiteLogoImg.isDisplayed();
		 zerodhaLogoImg.isDisplayed();
	}
	public String isTitleDisplayed() {
		return driver.getTitle();
	}
	 public void loginZerodha() throws IOException, InterruptedException {
	 	 userIdTxt.sendKeys(readPropertiesFile("userid"));
	 	 Thread.sleep(2000);
		 passTxt.sendKeys(readPropertiesFile("pass"));
		 Thread.sleep(2000);
		 btnLogin.click();
		 Thread.sleep(2000);
		 pinTxt.sendKeys(readPropertiesFile("pin"));
		 Thread.sleep(2000);
		 btnLogin.click();
		 
	}

}
