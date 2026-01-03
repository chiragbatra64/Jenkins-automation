package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import utils.ConfigReader;
import utils.Waits;

public class HFT7 {
	private final By buildWithParameters = By.xpath("//*[@id=\"tasks\"]/div[4]/a[2]");
	private final By branchInput = By.xpath("//*[@id=\"main-panel\"]/form/table/tbody[1]/tr[1]/td[3]/div/input[2]");
	private final By releaseVersionDropdown = By.xpath("//*[@id=\"main-panel\"]/form/table/tbody[2]/tr[1]/td[3]/div/select");
	private final By withSlimTbtFlag = By.xpath("//*[@id=\"ecp_CMAKE_VAR_11\"]/td/label");
	private final By bseLatestVersionFlag = By.xpath("//*[@id=\"ecp_CMAKE_VAR_48\"]/td/label");
	private final By nseMultipleTraderSupportFlag = By.xpath("//*[@id=\"ecp_CMAKE_VAR_50\"]/td/label");
	private final By enableNewRmsFlag = By.xpath("//*[@id=\"ecp_CMAKE_VAR_59\"]/td/label");
	private final By newServerFlag = By.xpath("//*[@id=\"ecp_CMAKE_VAR_62\"]/td/label");
	private final By masterSquareOffAppliactionFlag = By.xpath("//*[@id=\"ecp_CMAKE_VAR_70\"]/td/label");
	private final By masterSquareUsingFileReaderFlag = By.xpath("//*[@id=\"ecp_CMAKE_VAR_72\"]/td/label");
	private final By firstFetchFlag = By.xpath("//*[@id=\"ecp_CMAKE_VAR_36\"]/td/label");
	private final By useMtbOptFlag = By.xpath("//*[@id=\"ecp_CMAKE_VAR_15\"]/td/label");
	private final By withPreTradeConfirmationFlag = By.xpath("//*[@id=\"ecp_CMAKE_VAR_31\"]/td/label");
	private final By fiftyDepthSupportFlag = By.xpath("//*[@id=\"ecp_CMAKE_VAR_78\"]/td/label");
	private final By mtbtSpreadSupportFlag = By.xpath("//*[@id=\"ecp_CMAKE_VAR_65\"]/td/label");
	private final By withDbTagFlag = By.xpath("//*[@id=\"ecp_CMAKE_VAR_66\"]/td/label");
	private final By enableMoslFlag = By.xpath("//*[@id=\"ecp_CMAKE_VAR_77\"]/td/label");
	private final By buildButton = By.xpath("//*[@id=\"yui-gen1-button\"]");
	private final By returnToDashboardButton = By.xpath("//*[@id=\"tasks\"]/div[1]/a[2]");
	
	public HFT7 clickBuild() {
		Waits.waitForClickable(buildWithParameters).click();
		return this;
	}
	
	public HFT7 enterBranch() {
		Waits.waitForVisible(branchInput).click();
		Waits.waitForVisible(branchInput).clear();
		Waits.waitForVisible(branchInput).sendKeys(ConfigReader.get("backend.branch"));
		return this;
	}
	
	public HFT7 selectReleaseVersion() {
		Select select = new Select(Waits.waitForVisible(releaseVersionDropdown));
		select.selectByVisibleText(ConfigReader.get("release.version"));
		return this;
	}
	
	public HFT7 enterSlimFlags() {
		Waits.waitForClickable(withSlimTbtFlag).click();
		Waits.waitForClickable(bseLatestVersionFlag).click();
		Waits.waitForClickable(nseMultipleTraderSupportFlag).click();
		Waits.waitForClickable(enableNewRmsFlag).click();
		Waits.waitForClickable(newServerFlag).click();
		Waits.waitForClickable(masterSquareOffAppliactionFlag).click();
		Waits.waitForClickable(masterSquareUsingFileReaderFlag).click();
		return this;
	}
	
	public HFT7 enterSlimFirstFetchFlags() {
		Waits.waitForClickable(withSlimTbtFlag).click();
		Waits.waitForClickable(firstFetchFlag).click();
		Waits.waitForClickable(bseLatestVersionFlag).click();
		Waits.waitForClickable(nseMultipleTraderSupportFlag).click();
		Waits.waitForClickable(enableNewRmsFlag).click();
		Waits.waitForClickable(newServerFlag).click();
		Waits.waitForClickable(masterSquareOffAppliactionFlag).click();
		Waits.waitForClickable(masterSquareUsingFileReaderFlag).click();
		return this;
	}
	
	public HFT7 enterFatFlags() {
		Waits.waitForClickable(bseLatestVersionFlag).click();
		Waits.waitForClickable(nseMultipleTraderSupportFlag).click();
		Waits.waitForClickable(enableNewRmsFlag).click();
		Waits.waitForClickable(newServerFlag).click();
		Waits.waitForClickable(masterSquareOffAppliactionFlag).click();
		Waits.waitForClickable(masterSquareUsingFileReaderFlag).click();
		return this;
	}
	
	public HFT7 enterFatFirstFetchFlags() {
		Waits.waitForClickable(firstFetchFlag).click();
		Waits.waitForClickable(bseLatestVersionFlag).click();
		Waits.waitForClickable(nseMultipleTraderSupportFlag).click();
		Waits.waitForClickable(enableNewRmsFlag).click();
		Waits.waitForClickable(newServerFlag).click();
		Waits.waitForClickable(masterSquareOffAppliactionFlag).click();
		Waits.waitForClickable(masterSquareUsingFileReaderFlag).click();
		return this;
	}
	
	public HFT7 enterPreOptimizedFlags() {
		Waits.waitForClickable(useMtbOptFlag).click();
		Waits.waitForClickable(withPreTradeConfirmationFlag).click();
		Waits.waitForClickable(bseLatestVersionFlag).click();
		Waits.waitForClickable(nseMultipleTraderSupportFlag).click();
		Waits.waitForClickable(enableNewRmsFlag).click();
		Waits.waitForClickable(newServerFlag).click();
		Waits.waitForClickable(masterSquareOffAppliactionFlag).click();
		Waits.waitForClickable(masterSquareUsingFileReaderFlag).click();
		return this;
	}
	
	public HFT7 enterPreOptimizedFirstFetchFlags() {
		Waits.waitForClickable(useMtbOptFlag).click();
		Waits.waitForClickable(withPreTradeConfirmationFlag).click();
		Waits.waitForClickable(firstFetchFlag).click();
		Waits.waitForClickable(bseLatestVersionFlag).click();
		Waits.waitForClickable(nseMultipleTraderSupportFlag).click();
		Waits.waitForClickable(enableNewRmsFlag).click();
		Waits.waitForClickable(newServerFlag).click();
		Waits.waitForClickable(masterSquareOffAppliactionFlag).click();
		Waits.waitForClickable(masterSquareUsingFileReaderFlag).click();
		return this;
	}
	
	public HFT7 enterFiftyDepthFlags() {
		Waits.waitForClickable(withSlimTbtFlag).click();
		Waits.waitForClickable(bseLatestVersionFlag).click();
		Waits.waitForClickable(nseMultipleTraderSupportFlag).click();
		Waits.waitForClickable(enableNewRmsFlag).click();
		Waits.waitForClickable(newServerFlag).click();
		Waits.waitForClickable(masterSquareOffAppliactionFlag).click();
		Waits.waitForClickable(masterSquareUsingFileReaderFlag).click();
		Waits.waitForClickable(fiftyDepthSupportFlag).click();
		return this;
	}
	
	public HFT7 enterMOSLSlimFlags() {
		Waits.waitForClickable(withSlimTbtFlag).click();
		Waits.waitForClickable(bseLatestVersionFlag).click();
		Waits.waitForClickable(nseMultipleTraderSupportFlag).click();
		Waits.waitForClickable(enableNewRmsFlag).click();
		Waits.waitForClickable(newServerFlag).click();
		Waits.waitForClickable(mtbtSpreadSupportFlag).click();
		Waits.waitForClickable(withDbTagFlag).click();
		Waits.waitForClickable(masterSquareOffAppliactionFlag).click();
		Waits.waitForClickable(masterSquareUsingFileReaderFlag).click();
		Waits.waitForClickable(enableMoslFlag).click();
		return this;
	}
	
	public HFT7 pressBuild() {
		Waits.waitForClickable(buildButton).click();
		return this;
	}
	
	public HFT7 returnToDashboard() {
		Waits.waitForClickable(returnToDashboardButton).click();
		return this;
	}
}
