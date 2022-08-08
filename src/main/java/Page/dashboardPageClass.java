package Page;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.baseClass;

public class dashboardPageClass extends baseClass {
	@FindBy(xpath = "//a[@class='dropdown-label']")
	private WebElement dashboardAvtar;
	@FindBy(xpath = "//h4[@class='username']")
	private WebElement dashUsername;
	@FindBy(xpath = "//div[@class='email']")
	private WebElement dashEmail;
	@FindBy(xpath = "//button[text()='Start investing ']")
	private WebElement startInvestingBtn;
	@FindBy(xpath = "//div[@class='instrument-search']//div[@class='omnisearch']//div[@class='search']//div[@class='su-input-group su-has-icon search-input-field']//input[@icon='search']")
	private WebElement searchTxt;
	@FindBy(xpath = "//span[text()='TATACOFFEE']")
	private WebElement selectedElement;
	@FindBy(xpath = "//button[text()='Create GTT ']")
	private WebElement createGttBtn;
	@FindBy(xpath = "//input[@label='Trigger price']")
	private WebElement triggerPriceTxt;
	@FindBy(xpath = "//input[@label='Qty.']")
	private WebElement selectQtyTxt;
	@FindBy(xpath = "//div[@class='transaction-type su-radio-wrap checked']//input[@value='BUY'] ")
	private WebElement selectedRadioBtn;
	@FindBy(xpath = "//input[@label='Price']")
	private WebElement priceTxt;
	@FindBy(xpath = "//button[@class='place button-blue']")
	private WebElement placeBtn;

	@FindBy(xpath = "//span[@class='margin-value']")
	private WebElement getTxtLablePrice;

	@FindBy(xpath = "//button[@class='button-blue buy']")
	private WebElement HiddenDivBuyBtn;
	@FindBy(xpath = "//button[@class='button-outline cancel']")
	private WebElement HiddenDivCancelBtn;
	@FindBy(xpath = "//a[@href='/funds']")
	private WebElement fundsBtn;
	@FindBy(xpath = "//button[text()='Add funds ']")
	private WebElement AddfundsBtn;
	@FindBy(xpath = "//p[text()='Akshay Vitthal Kamble']")
	private WebElement getTxtDepistFunds;
	
	@FindBy(xpath = "//input[@id='addfunds_amount']")
	private WebElement amountTxt;

	public dashboardPageClass() {
		PageFactory.initElements(driver, this);
	}

	public String verifyDashboardCredentials() throws IOException, InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", dashboardAvtar);
		Thread.sleep(1000);
//		dashboardAvtar.click();
		screenShots();
		return dashUsername.getText();

	}

	public Boolean createGttOrder() throws EncryptedDocumentException, IOException {
		startInvestingBtn.click();
		searchTxt.sendKeys(readExcelFile(0, 0));
		selectedElement.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", createGttBtn);
//		createGttBtn.click();
		triggerPriceTxt.clear();
		triggerPriceTxt.sendKeys(readExcelFile(0, 1)); // 200
		selectQtyTxt.clear();
		selectQtyTxt.sendKeys(readExcelFile(0, 2));
		priceTxt.sendKeys(readExcelFile(0, 3));
		placeBtn.click();
		return selectedRadioBtn.isSelected();

	}

	/*
	 * public void hiddenDivisionPopUp() throws InterruptedException { Actions act =
	 * new Actions(driver); act.moveToElement(HiddenDivBuyBtn).build().perform();
	 * 
	 * HiddenDivBuyBtn.click(); Thread.sleep(2000); HiddenDivCancelBtn.click();
	 * return getTxtLablePrice.getText();
	 * 
	 * }
	 */
	public String childBrowser() throws InterruptedException {
		fundsBtn.click();
		AddfundsBtn.click();

		Set<String> windows = driver.getWindowHandles();
		System.out.println(windows.size()); // 2

		Iterator<String> itr = windows.iterator();
		System.out.println(itr);
		String[] store = new String[10];
		for (int i =0; i < windows.size(); i++) {

			store[i] = itr.next();
			System.out.println(store[i]);
			
		}
		driver.switchTo().window(store[1]);
		amountTxt.sendKeys("12");
		return getTxtDepistFunds.getText();
	}
}
