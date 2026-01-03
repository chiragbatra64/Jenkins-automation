package utils;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Waits {
	public static WebDriverWait getWait() {
		return new WebDriverWait(WebDriverUtil.getDriver(), Duration.ofSeconds(ConfigReader.getInt("explicit.wait")));
	}
	
	public static WebElement waitForVisible(By locator) {
		return getWait().until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
	public static WebElement waitForClickable(By locator) {
		return getWait().until(ExpectedConditions.elementToBeClickable(locator));
	}
	
	public static WebElement waitForPresence(By locator) {
		return getWait().until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	
	public static boolean waitForInvisibility(By locator) {
		return getWait().until(ExpectedConditions.invisibilityOfElementLocated(locator));
	}
	
	public static boolean getUrl(String url) {
		return getWait().until(ExpectedConditions.urlContains(url));
	}
	
}
