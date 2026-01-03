package utils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverUtil {
	private static ThreadLocal<WebDriver> driver =  new ThreadLocal<WebDriver>();
	
	public static void initDriver(String browser) {
		boolean headless = ConfigReader.getBoolean("headless");
		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();

            if (headless) {
                options.addArguments("--headless=new");
                options.addArguments("--window-size=1920,1080");
                options.addArguments("--disable-gpu");
                options.addArguments("--no-sandbox");
                options.addArguments("--disable-dev-shm-usage");
            }
			driver.set(new ChromeDriver(options));
		}else if (browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			FirefoxOptions options = new FirefoxOptions();
			if(headless) {
				options.addArguments("-headless");
				options.addArguments("--width=1920");
				options.addArguments("--height=1080");
			}
			driver.set(new FirefoxDriver(options));
		}else if (browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			EdgeOptions options = new EdgeOptions();

			if (headless) {
			    options.addArguments("--headless=new");
			    options.addArguments("--window-size=1920,1080");
			    options.addArguments("--disable-gpu");
			}
			driver.set(new EdgeDriver(options));
		}
		else {
			return;
		}
		driver.get().manage().window().maximize();
		driver.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(ConfigReader.getInt("implicit.wait")));
	}
	
	public static WebDriver getDriver() {
		return driver.get();
	}
	
	public static void removeDriver() {
		if (driver == null) {
			return;
		}else {
			driver.get().quit();
			driver.remove();
		}
	}
	
}
