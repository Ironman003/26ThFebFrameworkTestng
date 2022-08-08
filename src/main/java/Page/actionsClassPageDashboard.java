package Page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.baseClass;

public class actionsClassPageDashboard extends baseClass {

	@FindBy(xpath = "//a[@class='dropdown-label']")
	private WebElement dashboardAvtar;
	@FindBy(xpath = "//button[text()='Get started ']") private WebElement drop;

	public actionsClassPageDashboard() {
		PageFactory.initElements(driver, this);

	}

	public void actionsClass() {
		Actions act = new Actions(driver);
//		act.moveToElement(dashboardAvtar).contextClick().build().perform();
//		act.moveToElement(dashboardAvtar).keyDown(Keys.DOWN).build().perform()
//		act.moveToElement(dashboardAvtar).clickAndHold().build().perform();
		act.moveToElement(dashboardAvtar).dragAndDrop(dashboardAvtar, drop).build().perform();

	}
}
