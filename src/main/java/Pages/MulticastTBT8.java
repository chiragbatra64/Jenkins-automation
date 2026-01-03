package Pages;

import org.openqa.selenium.By;

import utils.ConfigReader;
import utils.Waits;

public class MulticastTBT8 {
	private final By buildWithParameters = By.xpath("//*[@id=\"tasks\"]/div[4]/a[2]");
	private final By branchInput = By.xpath("//*[@id=\"main-panel\"]/form/table/tbody[2]/tr[1]/td[3]/div/input[2]");
	private final By withSlimTbtFlag = By.xpath("//*[@id=\"ecp_CMAKE_VAR_0\"]/td/label");
	private final By useMtbOptFlag = By.xpath("//*[@id=\"ecp_CMAKE_VAR_3\"]/td/label");
	private final By buildButton = By.xpath("//*[@id=\"yui-gen1-button\"]");
	private final By fiftyDepthSupportFlag = By.xpath("//*[@id=\"ecp_CMAKE_VAR_13\"]/td/label");
	private final By enableRhel8LibsFlag = By.xpath("//*[@id=\"ecp_CMAKE_VAR_11\"]/td/label");
	private final By feedTravelCheckbox = By.xpath("//*[@id=\"main-panel\"]/form/table/tbody[6]/tr[1]/td[3]/div/input[2]");
	private final By returnToDashboardButton = By.xpath("//*[@id=\"tasks\"]/div[1]/a[2]");
	
	public MulticastTBT8 clickBuild() {
		Waits.waitForClickable(buildWithParameters).click();
		return this;
	}
	
	public MulticastTBT8 enterBranch() {
		Waits.waitForVisible(branchInput).click();
		Waits.waitForVisible(branchInput).clear();
		Waits.waitForVisible(branchInput).sendKeys(ConfigReader.get("backend.branch"));
		return this;
	}
	
	public MulticastTBT8 selectSlimFlag() {
		Waits.waitForVisible(withSlimTbtFlag).click();
		return this;
	}
	
	public MulticastTBT8 selectPreOptimizedFlag() {
		Waits.waitForVisible(useMtbOptFlag).click();
		return this;
	}
	
	public MulticastTBT8 selectFiftyDepthFlag() {
		Waits.waitForVisible(fiftyDepthSupportFlag).click();
		return this;
	}
	
	public MulticastTBT8 selectEnableRhel8LibsFlag() {
		Waits.waitForVisible(enableRhel8LibsFlag).click();
		return this;
	}
	
	public MulticastTBT8 checkFeedTravelCheckBox() {
		Waits.waitForVisible(feedTravelCheckbox).click();
		return this;
	}
	
	public MulticastTBT8 pressBuild() {
		Waits.waitForClickable(buildButton).click();
		return this;
	}
	
	public MulticastTBT8 returnToDashboard() {
		Waits.waitForClickable(returnToDashboardButton).click();
		return this;
	}
}
