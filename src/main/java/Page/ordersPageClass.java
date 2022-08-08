package Page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.baseClass;

public class ordersPageClass extends baseClass {

	@FindBy(xpath = "//a[@class='orders-nav-item']")
	private WebElement ordersTab;
	@FindBy(xpath = "//a[@href=\"/orders/gtt\"]//span[text()='GTT']")
	private WebElement gttTab;
	@FindBy(xpath = "//span[@class=\"icon icon-ellipsis\"]")
	private WebElement deleteOption;
	@FindBy(xpath = "//td[@class=\"instrument\"]//span[@class=\"tradingsymbol\"]")
	private WebElement dltOptionHover;
	@FindBy(xpath = "//span[text()='ACTIVE']")
	private WebElement dltDropDownClick;
	@FindBy(xpath = "//span[@class=\"icon icon-times\"]")
	private WebElement dltBtn;

	public ordersPageClass() {
		PageFactory.initElements(driver, this);
	}

	public void deleteGttOrder() {
		ordersTab.click();
		gttTab.click();
		Actions act = new Actions(driver);
		act.moveToElement(dltOptionHover).build().perform();
//		deleteOption.click();
		act.moveToElement(deleteOption).click().build().perform();
//		act.moveToElement(deleteOption).keyDown(Keys.DOWN).click().perform();
		act.moveToElement(deleteOption).sendKeys(Keys.DOWN).sendKeys(Keys.ENTER).build().perform();
		dltDropDownClick.click();
		dltBtn.click();
	}
}
