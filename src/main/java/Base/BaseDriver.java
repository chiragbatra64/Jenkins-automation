package Base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.ConfigReader;
import utils.WebDriverUtil;

public class BaseDriver {
	protected WebDriver driver;
	
	@BeforeClass(alwaysRun = true)
	public void setup() {
		System.out.println("Enter");
		System.out.println("Browser: " + ConfigReader.get("browser"));
		System.out.println("Url: " + ConfigReader.get("testing.url"));
		WebDriverUtil.initDriver(ConfigReader.get("browser"));
		System.out.println("After init driver");
		driver = WebDriverUtil.getDriver();
		System.out.println("After driver");
		driver.get(ConfigReader.get("testing.url"));
		System.out.println("After getting url");
	}
	
	@AfterClass(alwaysRun = true)
	public void tearDown() {
		if(driver != null) {
			driver.quit();
		}
	}
}
