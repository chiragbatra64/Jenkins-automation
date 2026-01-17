package listeners;

import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

import Base.BaseDriver;
import utils.ScreenshotUtil;

public class screenshotListener extends BaseDriver implements ITestListener {
	
	@Override
	public void onTestFailure(ITestResult result) {
		Object testClass = result.getInstance();
	    BaseDriver base = (BaseDriver) testClass;
	    WebDriver driver = base.getDriver();
		ScreenshotUtil.takeScreenshot(driver, result.getMethod().getMethodName());
	}
}
