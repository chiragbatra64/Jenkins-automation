package utils;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotUtil {

	public static String takeScreenshot (WebDriver driver, String testName) {
		String basePath =  System.getProperty("user.dir");
		String currentTimestamp = new SimpleDateFormat("ddMMyyyy_HHmmss").format(new Date());
		String screenshotPath = basePath + "/target/screenshots/" + testName + "_" + currentTimestamp + ".png";
		
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File dest = new File(screenshotPath);
		
		try {
			FileUtils.copyFile(src, dest);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return screenshotPath;
	}
}
