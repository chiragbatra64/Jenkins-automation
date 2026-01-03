package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import utils.ConfigReader;
import utils.Waits;

public class Client_Dll {
	private final By buildWithParameters = By.xpath("//*[@id=\"tasks\"]/div[4]/a[2]");
	private final By branchInput = By.xpath("//*[@id=\"main-panel\"]/form/table/tbody[1]/tr[1]/td[3]/div/input[2]");
	private final By releaseVersionDropdown = By.xpath("//*[@id=\"main-panel\"]/form/table/tbody[2]/tr[1]/td[3]/div/select");
	private final By dllToBuildDropdown = By.xpath("//*[@id=\"main-panel\"]/form/table/tbody[4]/tr[1]/td[3]/div/select");
	private final By buildExeTypeDropdown = By.xpath("//*[@id=\"main-panel\"]/form/table/tbody[5]/tr[1]/td[3]/div/select");
	private final By flagsDropdown = By.xpath("//*[@id=\"main-panel\"]/form/table/tbody[6]/tr[1]/td[3]/div/select");
	private final By enableMoslCheckbox = By.xpath("//*[@id=\"main-panel\"]/form/table/tbody[7]/tr[1]/td[3]/div/input[2]");
	private final By buildButton = By.xpath("//*[@id=\"yui-gen1-button\"]");
	private final By returnToDashboardButton = By.xpath("//*[@id=\"tasks\"]/div[1]/a[2]");	
	
	public Client_Dll clickBuild() {
		Waits.waitForClickable(buildWithParameters).click();
		return this;
	}
	
	public Client_Dll enterBranch() {
		Waits.waitForVisible(branchInput).click();
		Waits.waitForVisible(branchInput).clear();
		Waits.waitForVisible(branchInput).sendKeys(ConfigReader.get("frontend.branch"));
		return this;
	}
	
	public Client_Dll selectReleaseVersion() {
		Select select = new Select(Waits.waitForVisible(releaseVersionDropdown));
		select.selectByVisibleText(ConfigReader.get("release.version"));
		return this;
	}
	
	public Client_Dll selectFlag(String algoName) {
		Select select = new Select(Waits.waitForVisible(flagsDropdown));
		if(algoName.equalsIgnoreCase("OptionAlgo")) {
			select.selectByVisibleText("NEW_UI");
		}else if(algoName.equalsIgnoreCase("IVPair")) {
			select.selectByContainsVisibleText("IV_PAIR_ALGO");
		}
		return this;
	}
	
	public Client_Dll selectAlgo(String algoName) {
		Select select = new Select(Waits.waitForVisible(dllToBuildDropdown));
		if(algoName.equalsIgnoreCase("OptionAlgo")) {
			select.selectByVisibleText("Custom_Api/Multiple_Generic_Strategies/OptionAlgo/OptionAlgo.pro");
		}else if(algoName.equalsIgnoreCase("SingleLegIV")) {
			select.selectByVisibleText("Custom_Api/Multiple_Generic_Strategies/SingleLegIv/SingleLegIv.pro");			
		}else if(algoName.equalsIgnoreCase("IVPair")) {
			select.selectByVisibleText("Custom_Api/Multiple_Generic_Strategies/SingleLegIv/SingleLegIv.pro");
		}else if(algoName.equalsIgnoreCase("BlockReporting")) {
			select.selectByVisibleText("Custom_Api/BlockReporting/BlockReporting.pro");
		}else if(algoName.equalsIgnoreCase("CashCash")) {
			select.selectByVisibleText("Custom_Api/CashCashArbitrage/CashCashArbitrage.pro");
		}else if(algoName.equalsIgnoreCase("ExecutionAlgo")) {
			select.selectByVisibleText("Custom_Api/ExecutionAlgo/ExecutionAlgo.pro");
		}else if(algoName.equalsIgnoreCase("OrderOnTime")) {
			select.selectByVisibleText("Custom_Api/ORDER_ON_TIME_MOSL/OrderOnTime.pro");
		}else if(algoName.equalsIgnoreCase("SpreaBasket")) {
			select.selectByVisibleText("Custom_Api/OrderOnTime/OrderOnTime.pro");
		}else if(algoName.equalsIgnoreCase("SpreadTicker")) {
			select.selectByVisibleText("Custom_Api/SpreadTicker/SpreadTicker.pro");
		}else if(algoName.equalsIgnoreCase("PairTrade")) {
			select.selectByVisibleText("Custom_Api/PairTrade/PairTrade.pro");
		}else if(algoName.equalsIgnoreCase("Pair")) {
			select.selectByVisibleText("Custom_Api/Pair_GMTM_Ver_2.0.1/Pair.pro");
		}else if (algoName.equalsIgnoreCase("market")) {
			select.selectByVisibleText("MarketDataApi/MarketDataApi.pro");
		}
		return this;
	}
	
	public Client_Dll selectMOSLAlgo(String algoName) {
		Select select = new Select(Waits.waitForVisible(dllToBuildDropdown));
		if(algoName.equalsIgnoreCase("OptionAlgo")) {
			select.selectByVisibleText("Custom_Api/MOSL/OptionAlgo/OptionAlgo.pro");
		}else if(algoName.equalsIgnoreCase("BlockReporting")) {
			select.selectByVisibleText("Custom_Api/MOSL/BlockReporting/BlockReporting.pro");
		}else if(algoName.equalsIgnoreCase("CashCash")) {
			select.selectByVisibleText("Custom_Api/MOSL/CashCashArbitrage/CashCashArbitrage.pro");
		}else if(algoName.equalsIgnoreCase("ExecutionAlgo")) {
			select.selectByVisibleText("Custom_Api/ExecutionAlgo/ExecutionAlgo.pro");
		}else if(algoName.equalsIgnoreCase("OrderOnTime")) {
			select.selectByVisibleText("Custom_Api/MOSL/ORDER_ON_TIME_MOSL/OrderOnTime.pro");
		}else if(algoName.equalsIgnoreCase("SpreadTicker")) {
			select.selectByVisibleText("Custom_Api/MOSL/SpreadTicker/SpreadTicker.pro");
		}else if(algoName.equalsIgnoreCase("PairTrade")) {
			select.selectByVisibleText("Custom_Api/MOSL/PairTrade/PairTrade.pro");
		}else if(algoName.equalsIgnoreCase("TwapSwitch")) {
			select.selectByVisibleText("Custom_Api/MOSL/TwapSwitch/TwapSwitch.pro");
		}
		return this;
	}
	
	public Client_Dll checkEnableMOSLFlag() {
		Waits.waitForVisible(enableMoslCheckbox).click();
		return this;
	}
	
	public Client_Dll selectBuildType() {
		Select select = new Select(Waits.waitForVisible(buildExeTypeDropdown));
		select.selectByVisibleText("64-Bit");
		return this;
	}
	
	public Client_Dll pressBuild() {
		Waits.waitForClickable(buildButton).click();
		return this;
	}
	
	public Client_Dll returnToDashboard() {
		Waits.waitForClickable(returnToDashboardButton).click();
		return this;
	}
}
