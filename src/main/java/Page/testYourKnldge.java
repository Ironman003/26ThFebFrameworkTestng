package Page;

import java.util.Iterator;
import java.util.List;

import javax.xml.xpath.XPath;

import org.apache.xmlbeans.impl.xb.xsdschema.All;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import Base.baseClass;
import lombok.Data;

public class testYourKnldge extends baseClass {

	@FindBy(xpath = "//button[@class='_2KpZ6l _2doB4z']")
	private WebElement demo;
	@FindBy(xpath = "//input[@class=\"_3704LK\"]")
	private WebElement search;
	@FindBy(xpath = "//button[@class=\"L0Z3Pu\"]")
	private WebElement btn;
//@FindBys(xpath="//div[@class=\"_1YokD2 _3Mn1Gg\"]") private List<WebElement>  list;
	@FindBys(@FindBy(xpath = "//div[@class=\\\"_1YokD2 _3Mn1Gg\\"))
	private List<WebElement> AllData;

	public testYourKnldge() {
		PageFactory.initElements(driver, this);

	}
	public void showw() {
		demo.click();
		search.sendKeys("IPHONE");
		btn.click();
		System.out.println(AllData);
		
	}
	
	

}
