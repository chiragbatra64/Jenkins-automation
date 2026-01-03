package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import utils.ConfigReader;
import utils.Waits;

public class mutradeSO8 {
	private final By buildWithParameters = By.xpath("//*[@id=\"tasks\"]/div[4]/a[2]");
	private final By branchInput = By.xpath("//*[@id=\"main-panel\"]/form/table/tbody[1]/tr[1]/td[3]/div/input[2]");
	private final By releaseVersionDropdown = By.xpath("//*[@id=\"main-panel\"]/form/table/tbody[2]/tr[1]/td[3]/div/select");
	private final By algoNameDropDown = By.xpath("//*[@id=\"main-panel\"]/form/table/tbody[3]/tr[1]/td[3]/div/select");
	private final By indexArbFlag = By.xpath("//*[@id=\"ecp_CMAKE_VAR_25\"]/td/label");
	private final By jobbingWithFourPrecisionFlag = By.xpath("//*[@id=\"ecp_CMAKE_VAR_43\"]/td/label");
	private final By createFutFutStrategyFlag = By.xpath("//*[@id=\"ecp_CMAKE_VAR_55\"]/td/label");
	private final By createDemoStrategyFlag = By.xpath("//*[@id=\"ecp_CMAKE_VAR_23\"]/td/label");
	private final By enableRhel8LibsFlag = By.xpath("//*[@id=\"ecp_CMAKE_VAR_67\"]/td/label");
	private final By enableMoslFlag = By.xpath("//*[@id=\"ecp_CMAKE_VAR_77\"]/td/label");
	private final By buildButton = By.xpath("//*[@id=\"yui-gen1-button\"]");
	private final By returnToDashboardButton = By.xpath("//*[@id=\"tasks\"]/div[1]/a[2]");
	
	public mutradeSO8 clickBuildWithParameters() {
		Waits.waitForClickable(buildWithParameters).click();
		return this;
	}
	
	public mutradeSO8 enterBranch() {
		Waits.waitForVisible(branchInput).click();
		Waits.waitForVisible(branchInput).clear();
		Waits.waitForVisible(branchInput).sendKeys(ConfigReader.get("backend.branch"));
		return this;
	}
	
	public mutradeSO8 selectReleaseVersion() {
		Select select = new Select(Waits.waitForVisible(releaseVersionDropdown));
		select.selectByVisibleText(ConfigReader.get("release.version"));
		return this;
	}
	
	public mutradeSO8 selectAlgoName(String algoName) {
		Select select = new Select(Waits.waitForVisible(algoNameDropDown));
		select.selectByVisibleText(algoName);
		if(algoName.equalsIgnoreCase("indexarbitrage") || algoName.equalsIgnoreCase("syntheticindexarbitrage")){
			Waits.waitForVisible(indexArbFlag).click();
		}else if(algoName.equalsIgnoreCase("futfutcustom")) {
			Waits.waitForVisible(createFutFutStrategyFlag).click();
		}else if(algoName.equalsIgnoreCase("demo")) {
			Waits.waitForVisible(createDemoStrategyFlag).click();
		}
		Waits.waitForVisible(enableRhel8LibsFlag).click();
		return this;
	}
	
	public mutradeSO8 selectEnableMoslFlag() {
		Waits.waitForVisible(enableMoslFlag).click();
		return this;
	}
	
	public mutradeSO8 selectJobbinhWithPrecisionFour() {
		Waits.waitForVisible(jobbingWithFourPrecisionFlag).click();
		return this;
	}
	
	public mutradeSO8 pressBuild() {
		Waits.waitForClickable(buildButton).click();
		return this;
	}
	
	public mutradeSO8 returnToDashboard() {
		Waits.waitForClickable(returnToDashboardButton).click();
		return this;
	}
}
