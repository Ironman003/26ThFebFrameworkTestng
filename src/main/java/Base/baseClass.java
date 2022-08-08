package Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

public class baseClass {
	public static WebDriver driver;

	public String readPropertiesFile(String value) throws IOException {
		Properties pop = new Properties();
		FileInputStream file = new FileInputStream("src\\main\\java\\Config\\Config.properties");
		pop.load(file);
		return pop.getProperty(value);

	}

	public void browserInit() throws IOException {
//		boolean a= true;
		String browserNameFireFox = readPropertiesFile("browserF");
		String browserNameChrome = readPropertiesFile("browserC");
		String browserNameOpera = readPropertiesFile("browserO");
		if (browserNameChrome.equalsIgnoreCase("Chrome")) {
			ChromeOptions op = new ChromeOptions();
			op.addArguments("--disable-notifications");
			System.setProperty("webdriver.chrome.driver", "Browsers\\chromedriver.exe");
//			WebDriverManager.chromedriver().setup();
//			WebDriverManager.firefoxdriver().setup(); // doesnt need updated driver to be downloaded every time..
			driver = new ChromeDriver(op); // local variable
		}
//		if (browserNameFireFox.equalsIgnoreCase("Firefoxg")) {
//
//			System.setProperty("webdriver.gecko.driver", "Browsers\\geckodriver.exe");
//			driver = new FirefoxDriver();
//
//		}
		driver.get(readPropertiesFile("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
	}

	public String readExcelFile(int row, int col) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("TestData\\testCaseFile1.xlsx");
		Sheet sheet = WorkbookFactory.create(file).getSheet("Sheet1");
		String stringCellValue = sheet.getRow(row).getCell(col).getStringCellValue();
		return stringCellValue;
	}

	public static void screenShots() throws IOException, InterruptedException {
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("Screenshots/img.jpg");
		String a = new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss").format(new Date());
		FileHandler.copy(src, dest); 
		Thread.sleep(1000);

	}

}
