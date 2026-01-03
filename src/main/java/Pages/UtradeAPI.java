package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import utils.ConfigReader;
import utils.Waits;

public class UtradeAPI {
	private final By buildWithParameters = By.xpath("//*[@id=\"tasks\"]/div[4]/a[2]");
	private final By branchInput = By.xpath("//*[@id=\"main-panel\"]/form/table/tbody[1]/tr[1]/td[3]/div/input[2]");
	private final By releaseVersionDropdown = By.xpath("//*[@id=\"main-panel\"]/form/table/tbody[2]/tr[1]/td[3]/div/select");
	private final By buildExeTypeDropdown = By.xpath("//*[@id=\"main-panel\"]/form/table/tbody[4]/tr[1]/td[3]/div/select");
	private final By flagsDropdown = By.xpath("//*[@id=\"main-panel\"]/form/table/tbody[5]/tr[1]/td[3]/div/select");
	private final By algoEnabledCheckBox = By.xpath("//*[@id=\"main-panel\"]/form/table/tbody[7]/tr[1]/td[3]/div/input[2]");
	private final By buildButton = By.xpath("//*[@id=\"yui-gen1-button\"]");
	private final By returnToDashboardButton = By.xpath("//*[@id=\"tasks\"]/div[1]/a[2]");
	
	public UtradeAPI clickBuild() {
		Waits.waitForClickable(buildWithParameters).click();
		return this;
	}
	
	public UtradeAPI enterBranch() {
		Waits.waitForVisible(branchInput).click();
		Waits.waitForVisible(branchInput).clear();
		Waits.waitForVisible(branchInput).sendKeys(ConfigReader.get("frontend.branch"));
		return this;
	}
	
	public UtradeAPI selectReleaseVersion() {
		Select select = new Select(Waits.waitForVisible(releaseVersionDropdown));
		select.selectByVisibleText(ConfigReader.get("release.version"));
		return this;
	}
	
	public UtradeAPI selectFlags() {
		Select select = new Select(Waits.waitForVisible(flagsDropdown));
		select.selectByVisibleText("RMS_DEALER_MERGE");
		return this;
	}
	
	public UtradeAPI checkalgoEnabledCheckbox() {
		Waits.waitForVisible(algoEnabledCheckBox).click();
		return this;
	}
	
	public UtradeAPI selectBuildType() {
		Select select = new Select(Waits.waitForVisible(buildExeTypeDropdown));
		select.selectByVisibleText("64-Bit");
		return this;
	}
	
	public UtradeAPI pressBuild() {
		Waits.waitForClickable(buildButton).click();
		return this;
	}
	
	public UtradeAPI returnToDashboard() {
		Waits.waitForClickable(returnToDashboardButton).click();
		return this;
	}
}
