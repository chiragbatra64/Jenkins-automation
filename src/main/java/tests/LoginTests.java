package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import Base.BaseDriver;
import Pages.Client_Dll;
import Pages.Client_Exe;
import Pages.Dashboard;
import Pages.HFT7;
import Pages.HFT8;
import Pages.LoginPage;
import Pages.MulticastTBT7;
import Pages.MulticastTBT8;
import Pages.UtradeAPI;
import Pages.mutradeSO7;
import Pages.mutradeSO8;
import utils.ConfigReader;

public class LoginTests extends BaseDriver {
	
	@Test(priority = 1, groups = {"morning", "mornigMosl", "complete", "completeMosl", "clientExe", "marketdataapi", "utradeapi", "clientExeAxis", "clientExeMosl", "allSo7", "'allSo8", "'allDll", "slim7", "slimfirst7", "fat7", "fatfirst7", "pre7", "prefirst7", "fifty7", "slim8", "slimfirst8", "fat8", "fatfirst8", "pre8", "prefirst8", "fifty8", "slim7Mosl", "slim8Mosl", "fat8Mosl", "allSoMosl7", "allSoMosl8", "allDllMosl", "tbt7", "tbt8"})
	public void userLogin() {
		LoginPage loginPage = new LoginPage();
		loginPage.loginFull(ConfigReader.get("username"), ConfigReader.get("password"), driver);
		Assert.assertTrue(loginPage.isLoggedIn(driver), "Not Logged In");
	}
	
	@Test(priority = 2, groups = {"complete", "slim8"})
	public void triggerSlimRhel8Hft() {
		Dashboard dashboard = new Dashboard();
		dashboard.enter_HFT_8();
		HFT8 hft = new HFT8();
		hft.clickBuild();
		hft.enterBranch();
		hft.selectReleaseVersion();
		hft.enterSlimFlags();
		hft.pressBuild();
		hft.returnToDashboard();
	}
	
	@Test(priority = 3, groups = {"complete", "slimfirst8"})
	public void triggerSlimFirstFetchRhel8Hft() {
		Dashboard dashboard = new Dashboard();
		dashboard.enter_HFT_8();
		HFT8 hft = new HFT8();
		hft.clickBuild();
		hft.enterBranch();
		hft.selectReleaseVersion();
		hft.enterSlimFirstFetchFlags();
		hft.pressBuild();
		hft.returnToDashboard();
	}
	
	@Test(priority = 4, groups = {"complete", "fat8"})
	public void triggerFatRhel8Hft() {
		Dashboard dashboard = new Dashboard();
		dashboard.enter_HFT_8();
		HFT8 hft = new HFT8();
		hft.clickBuild();
		hft.enterBranch();
		hft.selectReleaseVersion();
		hft.enterFatFlags();
		hft.pressBuild();
		hft.returnToDashboard();
	}
	
	@Test(priority = 5, groups = {"complete", "fatfirst8"})
	public void triggerFatFirstFetchRhel8Hft() {
		Dashboard dashboard = new Dashboard();
		dashboard.enter_HFT_8();
		HFT8 hft = new HFT8();
		hft.clickBuild();
		hft.enterBranch();
		hft.selectReleaseVersion();
		hft.enterFatFirstFetchFlags();
		hft.pressBuild();
		hft.returnToDashboard();
	}
	
	@Test(priority = 6, groups = {"complete", "pre8"})
	public void triggerPreOptimizedRhel8Hft() {
		Dashboard dashboard = new Dashboard();
		dashboard.enter_HFT_8();
		HFT8 hft = new HFT8();
		hft.clickBuild();
		hft.enterBranch();
		hft.selectReleaseVersion();
		hft.enterPreOptimizedFlags();
		hft.pressBuild();
		hft.returnToDashboard();
	}
	
	@Test(priority = 7, groups = {"complete", "prefirst8"})
	public void triggerPreOptimizedFirstFetchRhel8Hft() {
		Dashboard dashboard = new Dashboard();
		dashboard.enter_HFT_8();
		HFT8 hft = new HFT8();
		hft.clickBuild();
		hft.enterBranch();
		hft.selectReleaseVersion();
		hft.enterPreOptimizedFirstFetchFlags();
		hft.pressBuild();
		hft.returnToDashboard();
	}
	
	@Test(priority = 8, groups = {"complete", "fifty8"})
	public void triggerFiftyDepthRhel8Hft() {
		Dashboard dashboard = new Dashboard();
		dashboard.enter_HFT_8();
		HFT8 hft = new HFT8();
		hft.clickBuild();
		hft.enterBranch();
		hft.selectReleaseVersion();
		hft.enterFiftyDepthFlags();
		hft.pressBuild();
		hft.returnToDashboard();
	}
	
	@Test(priority = 9, groups = {"complete", "slim7", "morning"})
	public void triggerSlimCentOs7Hft() {
		Dashboard dashboard = new Dashboard();
		dashboard.enter_HFT_7();
		HFT7 hft = new HFT7();
		hft.clickBuild();
		hft.enterBranch();
		hft.selectReleaseVersion();
		hft.enterSlimFlags();
		hft.pressBuild();
		hft.returnToDashboard();
	}
	
	@Test(priority = 10, groups = {"complete", "slimfirst7"})
	public void triggerSlimFirstFetchCentOs7Hft() {
		Dashboard dashboard = new Dashboard();
		dashboard.enter_HFT_7();
		HFT7 hft = new HFT7();
		hft.clickBuild();
		hft.enterBranch();
		hft.selectReleaseVersion();
		hft.enterSlimFirstFetchFlags();
		hft.pressBuild();
		hft.returnToDashboard();
	}
	
	@Test(priority = 11, groups = {"complete", "fat7"})
	public void triggerFatCentOs7Hft() {
		Dashboard dashboard = new Dashboard();
		dashboard.enter_HFT_7();
		HFT7 hft = new HFT7();
		hft.clickBuild();
		hft.enterBranch();
		hft.selectReleaseVersion();
		hft.enterFatFlags();
		hft.pressBuild();
		hft.returnToDashboard();
	}
	
	@Test(priority = 12, groups = {"complete", "fatfirst7"})
	public void triggerFatFirstFetchCentOs7Hft() {
		Dashboard dashboard = new Dashboard();
		dashboard.enter_HFT_7();
		HFT7 hft = new HFT7();
		hft.clickBuild();
		hft.enterBranch();
		hft.selectReleaseVersion();
		hft.enterFatFirstFetchFlags();
		hft.pressBuild();
		hft.returnToDashboard();
	}
	
	@Test(priority = 13, groups = {"complete", "pre7"})
	public void triggerPreOptimizedCentOs7Hft() {
		Dashboard dashboard = new Dashboard();
		dashboard.enter_HFT_7();
		HFT7 hft = new HFT7();
		hft.clickBuild();
		hft.enterBranch();
		hft.selectReleaseVersion();
		hft.enterPreOptimizedFlags();
		hft.pressBuild();
		hft.returnToDashboard();
	}
	
	@Test(priority = 14, groups = {"complete", "prefirst7"})
	public void triggerPreOptimizedFirstFetchCentOs7Hft() {
		Dashboard dashboard = new Dashboard();
		dashboard.enter_HFT_7();
		HFT7 hft = new HFT7();
		hft.clickBuild();
		hft.enterBranch();
		hft.selectReleaseVersion();
		hft.enterPreOptimizedFirstFetchFlags();
		hft.pressBuild();
		hft.returnToDashboard();
	}
	
	@Test(priority = 15, groups = {"complete", "fifty7"})
	public void triggerFiftyDepthCentOs7Hft() {
		Dashboard dashboard = new Dashboard();
		dashboard.enter_HFT_7();
		HFT7 hft = new HFT7();
		hft.clickBuild();
		hft.enterBranch();
		hft.selectReleaseVersion();
		hft.enterFiftyDepthFlags();
		hft.pressBuild();
		hft.returnToDashboard();
	}
	
	@Test(priority = 16, groups = {"complete", "allSo7"})
	public void triggerAllSOsForCentOS7() {
		Dashboard dashboard = new Dashboard();
		dashboard.enter_muTradeSo7();
		mutradeSO7 so = new mutradeSO7();
		so.clickBuildWithParameters();
		so.enterBranch();
		so.selectReleaseVersion();
		so.selectAlgoName("BlockReporting");
		so.pressBuild();
		so.clickBuildWithParameters();
		so.enterBranch();
		so.selectReleaseVersion();
		so.selectAlgoName("CashCash");
		so.pressBuild();
		so.clickBuildWithParameters();
		so.enterBranch();
		so.selectReleaseVersion();
		so.selectAlgoName("ExecutionAlgo");
		so.pressBuild();
		so.clickBuildWithParameters();
		so.enterBranch();
		so.selectReleaseVersion();
		so.selectAlgoName("OrderOnTime");
		so.pressBuild();
		so.clickBuildWithParameters();
		so.enterBranch();
		so.selectReleaseVersion();
		so.selectAlgoName("SpreadBasket");
		so.pressBuild();
		so.clickBuildWithParameters();
		so.enterBranch();
		so.selectReleaseVersion();
		so.selectAlgoName("SpreadTicker");
		so.pressBuild();
		so.clickBuildWithParameters();
		so.enterBranch();
		so.selectReleaseVersion();
		so.selectAlgoName("PairTrade");
		so.pressBuild();
		so.clickBuildWithParameters();
		so.enterBranch();
		so.selectReleaseVersion();
		so.selectAlgoName("Pair");
		so.pressBuild();
		so.clickBuildWithParameters();
		so.enterBranch();
		so.selectReleaseVersion();
		so.selectAlgoName("indexarbitrage");
		so.pressBuild();
		so.clickBuildWithParameters();
		so.enterBranch();
		so.selectReleaseVersion();
		so.selectAlgoName("JobbingStrategy");
		so.pressBuild();
		so.clickBuildWithParameters();
		so.enterBranch();
		so.selectReleaseVersion();
		so.selectAlgoName("JobbingStrategy");
		so.selectJobbinhWithPrecisionFour();
		so.pressBuild();
		so.clickBuildWithParameters();
		so.enterBranch();
		so.selectReleaseVersion();
		so.selectAlgoName("FutFutCustom");
		so.pressBuild();
		so.clickBuildWithParameters();
		so.enterBranch();
		so.selectReleaseVersion();
		so.selectAlgoName("demo");
		so.pressBuild();
		so.returnToDashboard();
	}
	@Test(priority = 17, groups = {"complete", "allSo8"})
	public void triggerAllSOsForRHEL8() {
		Dashboard dashboard = new Dashboard();
		dashboard.enter_muTradeSo8();
		mutradeSO8 so = new mutradeSO8();
		so.clickBuildWithParameters();
		so.enterBranch();
		so.selectReleaseVersion();
		so.selectAlgoName("BlockReporting");
		so.pressBuild();
		so.clickBuildWithParameters();
		so.enterBranch();
		so.selectReleaseVersion();
		so.selectAlgoName("CashCash");
		so.pressBuild();
		so.clickBuildWithParameters();
		so.enterBranch();
		so.selectReleaseVersion();
		so.selectAlgoName("ExecutionAlgo");
		so.pressBuild();
		so.clickBuildWithParameters();
		so.enterBranch();
		so.selectReleaseVersion();
		so.selectAlgoName("OrderOnTime");
		so.pressBuild();
		so.clickBuildWithParameters();
		so.enterBranch();
		so.selectReleaseVersion();
		so.selectAlgoName("SpreadBasket");
		so.pressBuild();
		so.clickBuildWithParameters();
		so.enterBranch();
		so.selectReleaseVersion();
		so.selectAlgoName("SpreadTicker");
		so.pressBuild();
		so.clickBuildWithParameters();
		so.enterBranch();
		so.selectReleaseVersion();
		so.selectAlgoName("PairTrade");
		so.pressBuild();
		so.clickBuildWithParameters();
		so.enterBranch();
		so.selectReleaseVersion();
		so.selectAlgoName("Pair");
		so.pressBuild();
		so.clickBuildWithParameters();
		so.enterBranch();
		so.selectReleaseVersion();
		so.selectAlgoName("indexarbitrage");
		so.pressBuild();
		so.clickBuildWithParameters();
		so.enterBranch();
		so.selectReleaseVersion();
		so.selectAlgoName("JobbingStrategy");
		so.pressBuild();
		so.clickBuildWithParameters();
		so.enterBranch();
		so.selectReleaseVersion();
		so.selectAlgoName("JobbingStrategy");
		so.selectJobbinhWithPrecisionFour();
		so.pressBuild();
		so.clickBuildWithParameters();
		so.enterBranch();
		so.selectReleaseVersion();
		so.selectAlgoName("FutFutCustom");
		so.pressBuild();
		so.clickBuildWithParameters();
		so.enterBranch();
		so.selectReleaseVersion();
		so.selectAlgoName("demo");
		so.pressBuild();
		so.returnToDashboard();
	}
	
	@Test(priority = 18, groups = {"completeMosl", "allSoMosl7"})
	public void triggerAllMOSLSOsForCentOS7() {
		Dashboard dashboard = new Dashboard();
		dashboard.enter_muTradeSo7();
		mutradeSO7 so = new mutradeSO7();
		so.clickBuildWithParameters();
		so.enterBranch();
		so.selectReleaseVersion();
		so.selectAlgoName("BlockReporting");
		so.selectEnableMoslFlag();
		so.pressBuild();
		so.clickBuildWithParameters();
		so.enterBranch();
		so.selectReleaseVersion();
		so.selectAlgoName("CashCash");
		so.selectEnableMoslFlag();
		so.pressBuild();
		so.clickBuildWithParameters();
		so.enterBranch();
		so.selectReleaseVersion();
		so.selectAlgoName("ExecutionAlgo");
		so.pressBuild();
		so.clickBuildWithParameters();
		so.enterBranch();
		so.selectReleaseVersion();
		so.selectAlgoName("OrderOnTime");
		so.selectEnableMoslFlag();
		so.pressBuild();
		so.clickBuildWithParameters();
		so.enterBranch();
		so.selectReleaseVersion();
		so.selectAlgoName("SpreadTicker");
		so.selectEnableMoslFlag();
		so.pressBuild();
		so.clickBuildWithParameters();
		so.enterBranch();
		so.selectReleaseVersion();
		so.selectAlgoName("PairTrade");
		so.selectEnableMoslFlag();
		so.pressBuild();
		so.clickBuildWithParameters();
		so.enterBranch();
		so.selectReleaseVersion();
		so.selectAlgoName("TwapSwitch");
		so.selectEnableMoslFlag();
		so.pressBuild();
		so.clickBuildWithParameters();
		so.enterBranch();
		so.selectReleaseVersion();
		so.selectAlgoName("indexarbitrage");
		so.selectEnableMoslFlag();
		so.pressBuild();
		so.clickBuildWithParameters();
		so.enterBranch();
		so.selectReleaseVersion();
		so.selectAlgoName("syntheticindexarbitrage");
		so.selectEnableMoslFlag();
		so.pressBuild();
		so.clickBuildWithParameters();
		so.enterBranch();
		so.selectReleaseVersion();
		so.selectAlgoName("TwapSwitchIndex");
		so.selectEnableMoslFlag();
		so.selectJobbinhWithPrecisionFour();
		so.pressBuild();
		so.clickBuildWithParameters();
		so.enterBranch();
		so.selectReleaseVersion();
		so.selectAlgoName("demo");
		so.pressBuild();
		so.returnToDashboard();
	}
	
	@Test(priority = 19, groups = {"completeMosl", "allSoMosl8"})
	public void triggerAllMOSLSOsForRHEL8() {
		Dashboard dashboard = new Dashboard();
		dashboard.enter_muTradeSo8();
		mutradeSO8 so = new mutradeSO8();
		so.clickBuildWithParameters();
		so.enterBranch();
		so.selectReleaseVersion();
		so.selectAlgoName("BlockReporting");
		so.selectEnableMoslFlag();
		so.pressBuild();
		so.clickBuildWithParameters();
		so.enterBranch();
		so.selectReleaseVersion();
		so.selectAlgoName("CashCash");
		so.selectEnableMoslFlag();
		so.pressBuild();
		so.clickBuildWithParameters();
		so.enterBranch();
		so.selectReleaseVersion();
		so.selectAlgoName("ExecutionAlgo");
		so.pressBuild();
		so.clickBuildWithParameters();
		so.enterBranch();
		so.selectReleaseVersion();
		so.selectAlgoName("OrderOnTime");
		so.selectEnableMoslFlag();
		so.pressBuild();
		so.clickBuildWithParameters();
		so.enterBranch();
		so.selectReleaseVersion();
		so.selectAlgoName("SpreadTicker");
		so.selectEnableMoslFlag();
		so.pressBuild();
		so.clickBuildWithParameters();
		so.enterBranch();
		so.selectReleaseVersion();
		so.selectAlgoName("PairTrade");
		so.selectEnableMoslFlag();
		so.pressBuild();
		so.clickBuildWithParameters();
		so.enterBranch();
		so.selectReleaseVersion();
		so.selectAlgoName("TwapSwitch");
		so.selectEnableMoslFlag();
		so.pressBuild();
		so.clickBuildWithParameters();
		so.enterBranch();
		so.selectReleaseVersion();
		so.selectAlgoName("indexarbitrage");
		so.selectEnableMoslFlag();
		so.pressBuild();
		so.clickBuildWithParameters();
		so.enterBranch();
		so.selectReleaseVersion();
		so.selectAlgoName("syntheticindexarbitrage");
		so.selectEnableMoslFlag();
		so.pressBuild();
		so.clickBuildWithParameters();
		so.enterBranch();
		so.selectReleaseVersion();
		so.selectAlgoName("TwapSwitchIndex");
		so.selectEnableMoslFlag();
		so.selectJobbinhWithPrecisionFour();
		so.pressBuild();
		so.clickBuildWithParameters();
		so.enterBranch();
		so.selectReleaseVersion();
		so.selectAlgoName("demo");
		so.pressBuild();
		so.returnToDashboard();
	}
	
	@Test(priority = 20, groups = {"complete", "allDll"})
	public void triggerAllDlls() {
		Dashboard dashboard = new Dashboard();
		dashboard.enter_Dll();
		Client_Dll dll = new Client_Dll();
		dll.clickBuild();
		dll.enterBranch();
		dll.selectReleaseVersion();
		dll.selectAlgo("OptionAlgo");
		dll.selectFlag("OptionAlgo");
		dll.selectBuildType();
		dll.pressBuild();
		dll.clickBuild();
		dll.enterBranch();
		dll.selectReleaseVersion();
		dll.selectAlgo("SingleLegIV");
		dll.selectBuildType();
		dll.pressBuild();
		dll.clickBuild();
		dll.enterBranch();
		dll.selectReleaseVersion();
		dll.selectAlgo("IVPair");
		dll.selectFlag("IVPair");
		dll.selectBuildType();
		dll.pressBuild();
		dll.clickBuild();
		dll.enterBranch();
		dll.selectReleaseVersion();
		dll.selectAlgo("BlockReporting");
		dll.selectBuildType();
		dll.pressBuild();
		dll.clickBuild();
		dll.enterBranch();
		dll.selectReleaseVersion();
		dll.selectAlgo("CashCash");
		dll.selectBuildType();
		dll.pressBuild();
		dll.clickBuild();
		dll.enterBranch();
		dll.selectReleaseVersion();
		dll.selectAlgo("ExecutionAlgo");
		dll.selectBuildType();
		dll.pressBuild();
		dll.clickBuild();
		dll.enterBranch();
		dll.selectReleaseVersion();
		dll.selectAlgo("OrderOnTime");
		dll.selectBuildType();
		dll.pressBuild();
		dll.clickBuild();
		dll.enterBranch();
		dll.selectReleaseVersion();
		dll.selectAlgo("SpreaBasket");
		dll.selectBuildType();
		dll.pressBuild();
		dll.clickBuild();
		dll.enterBranch();
		dll.selectReleaseVersion();
		dll.selectAlgo("SpreadTicker");
		dll.selectBuildType();
		dll.pressBuild();
		dll.clickBuild();
		dll.enterBranch();
		dll.selectReleaseVersion();
		dll.selectAlgo("PairTrade");
		dll.selectBuildType();
		dll.pressBuild();
		dll.clickBuild();
		dll.enterBranch();
		dll.selectReleaseVersion();
		dll.selectAlgo("Pair");
		dll.selectBuildType();
		dll.pressBuild();
		dll.returnToDashboard();
	}
	
	@Test(priority = 21, groups = {"completeMosl", "allDllMosl"})
	public void triggerAllMOSLDlls() {
		Dashboard dashboard = new Dashboard();
		dashboard.enter_Dll();
		Client_Dll dll = new Client_Dll();
		dll.clickBuild();
		dll.enterBranch();
		dll.selectReleaseVersion();
		dll.selectMOSLAlgo("OptionAlgo");
		dll.selectBuildType();
		dll.checkEnableMOSLFlag();
		dll.pressBuild();
		dll.clickBuild();
		dll.enterBranch();
		dll.selectReleaseVersion();
		dll.selectMOSLAlgo("BlockReporting");
		dll.selectBuildType();
		dll.checkEnableMOSLFlag();
		dll.pressBuild();
		dll.clickBuild();
		dll.enterBranch();
		dll.selectReleaseVersion();
		dll.selectMOSLAlgo("CashCash");
		dll.selectBuildType();
		dll.checkEnableMOSLFlag();
		dll.pressBuild();
		dll.clickBuild();
		dll.enterBranch();
		dll.selectReleaseVersion();
		dll.selectMOSLAlgo("ExecutionAlgo");
		dll.selectBuildType();
		dll.pressBuild();
		dll.clickBuild();
		dll.enterBranch();
		dll.selectReleaseVersion();
		dll.selectMOSLAlgo("OrderOnTime");
		dll.selectBuildType();
		dll.checkEnableMOSLFlag();
		dll.pressBuild();
		dll.clickBuild();
		dll.enterBranch();
		dll.selectReleaseVersion();
		dll.selectMOSLAlgo("SpreadTicker");
		dll.selectBuildType();
		dll.checkEnableMOSLFlag();
		dll.pressBuild();
		dll.clickBuild();
		dll.enterBranch();
		dll.selectReleaseVersion();
		dll.selectMOSLAlgo("PairTrade");
		dll.selectBuildType();
		dll.checkEnableMOSLFlag();
		dll.pressBuild();
		dll.clickBuild();
		dll.enterBranch();
		dll.selectReleaseVersion();
		dll.selectMOSLAlgo("TwapSwitch");
		dll.selectBuildType();
		dll.checkEnableMOSLFlag();
		dll.pressBuild();
		dll.returnToDashboard();
	}
	
	@Test(priority = 22, groups = {"complete", "clientExe", "morning"})
	public void triggerClientExe() {
		Dashboard dashboard = new Dashboard();
		dashboard.enter_Client_Exe();
		Client_Exe exe = new Client_Exe();
		exe.clickBuild();
		exe.selectReleaseVersion();
		exe.selectFlags();
		exe.enterBranch();
		exe.selectBuildType();
		exe.checkNewUICheckBox();
		exe.checkalgoEnabledCheckbox();
		exe.pressBuild();
		exe.returnToDashboard();
	}
	
	@Test(priority = 23, groups = {"completeMosl", "clientExeMosl", "morningMosl"})
	public void triggerMOSLClientExe() {
		Dashboard dashboard = new Dashboard();
		dashboard.enter_Client_Exe();
		Client_Exe exe = new Client_Exe();
		exe.clickBuild();
		exe.selectReleaseVersion();
		exe.selectFlags();
		exe.enterBranch();
		exe.selectBuildType();
		exe.checkNewUICheckBox();
		exe.checkalgoEnabledCheckbox();
		exe.checkEnableMOSLFlag();
		exe.returnToDashboard();
	}
	
	@Test(priority = 24, groups = {"complete", "clientExeAxis"})
	public void triggerAxisClientExe() {
		Dashboard dashboard = new Dashboard();
		dashboard.enter_Client_Exe();
		Client_Exe exe = new Client_Exe();
		exe.clickBuild();
		exe.selectReleaseVersion();
		exe.selectFlags();
		exe.enterBranch();
		exe.selectBuildType();
		exe.checkNewUICheckBox();
		exe.checkalgoEnabledCheckbox();
		exe.checkAxisCapitalEnabledCheckBox();
		exe.returnToDashboard();
	}
	
	@Test(priority = 25, groups = {"complete", "utradeapi", "completeMosl", "morning", "morningMosl"})
	public void triggerUtradeApi() {
		Dashboard dashboard = new Dashboard();
		dashboard.enter_Utrade_Api();
		UtradeAPI api = new UtradeAPI();
		api.clickBuild();
		api.enterBranch();
		api.selectReleaseVersion();
		api.selectFlags();
		api.selectBuildType();
		api.checkalgoEnabledCheckbox();
		api.pressBuild();
		api.returnToDashboard();
	}
	
	@Test(priority=26, groups = {"complete", "marketdataapi", "completeMosl", "morning", "morningMosl"})
	public void triggerMarketDataApi() {
		Dashboard dashboard = new Dashboard();
		dashboard.enter_Dll();
		Client_Dll dll = new Client_Dll();
		dll.clickBuild();
		dll.enterBranch();
		dll.selectReleaseVersion();
		dll.selectAlgo("market");
		dll.selectBuildType();
		dll.pressBuild();
		dll.returnToDashboard();
	}
	
	@Test(priority = 27, groups = {"complete", "tbt7"})
	public void triggerAllTBTsForCentOS7() {
		Dashboard dashboard = new Dashboard();
		dashboard.enter_tbt7();
		MulticastTBT7 tbt = new MulticastTBT7();
		tbt.clickBuild();
		tbt.enterBranch();
		tbt.selectSlimFlag();
		tbt.checkFeedTravelCheckBox();
		tbt.pressBuild();
		tbt.clickBuild();
		tbt.enterBranch();
		tbt.checkFeedTravelCheckBox();
		tbt.pressBuild();
		tbt.clickBuild();
		tbt.enterBranch();
		tbt.selectPreOptimizedFlag();
		tbt.checkFeedTravelCheckBox();
		tbt.pressBuild();
		tbt.clickBuild();
		tbt.enterBranch();
		tbt.selectSlimFlag();
		tbt.selectFiftyDepthFlag();
		tbt.checkFeedTravelCheckBox();
		tbt.pressBuild();
		tbt.returnToDashboard();
	}
	
	@Test(priority = 28, groups = {"complete", "tbt8"})
	public void triggerAllTBTsForRHEL8() {
		Dashboard dashboard = new Dashboard();
		dashboard.enter_tbt8();
		MulticastTBT8 tbt = new MulticastTBT8();
		tbt.clickBuild();
		tbt.enterBranch();
		tbt.selectSlimFlag();
		tbt.selectEnableRhel8LibsFlag();
		tbt.checkFeedTravelCheckBox();
		tbt.pressBuild();
		tbt.clickBuild();
		tbt.enterBranch();
		tbt.selectEnableRhel8LibsFlag();
		tbt.checkFeedTravelCheckBox();
		tbt.pressBuild();
		tbt.clickBuild();
		tbt.enterBranch();
		tbt.selectPreOptimizedFlag();
		tbt.selectEnableRhel8LibsFlag();
		tbt.checkFeedTravelCheckBox();
		tbt.pressBuild();
		tbt.clickBuild();
		tbt.enterBranch();
		tbt.selectSlimFlag();
		tbt.selectFiftyDepthFlag();
		tbt.selectEnableRhel8LibsFlag();
		tbt.checkFeedTravelCheckBox();
		tbt.pressBuild();
		tbt.returnToDashboard();
	}
	
	@Test(priority = 29, groups = {"completeMosl", "slim7Mosl", "morningMosl"})
	public void triggerMOSLSlimCentOs7Hft() {
		Dashboard dashboard = new Dashboard();
		dashboard.enter_HFT_7();
		HFT7 hft = new HFT7();
		hft.clickBuild();
		hft.enterBranch();
		hft.selectReleaseVersion();
		hft.enterMOSLSlimFlags();
		hft.pressBuild();
		hft.returnToDashboard();
	}
	
	@Test(priority = 30, groups = {"completeMosl", "slim8Mosl", "morningMosl"})
	public void triggerMOSLSlimRhel8Hft() {
		Dashboard dashboard = new Dashboard();
		dashboard.enter_HFT_8();
		HFT8 hft = new HFT8();
		hft.clickBuild();
		hft.enterBranch();
		hft.selectReleaseVersion();
		hft.enterMOSLSlimFlags();
		hft.pressBuild();
		hft.returnToDashboard();
	}
	
	@Test(priority = 31, groups = {"completeMosl", "fat8Mosl"})
	public void triggerMOSLFatRhel8Hft() {
		Dashboard dashboard = new Dashboard();
		dashboard.enter_HFT_8();
		HFT8 hft = new HFT8();
		hft.clickBuild();
		hft.enterBranch();
		hft.selectReleaseVersion();
		hft.enterMOSLFatFlags();
		hft.pressBuild();
		hft.returnToDashboard();
	}
	
	@Test(priority = 32)
	public void morningBuilds() {
		triggerSlimCentOs7Hft();
		triggerClientExe();
		triggerMarketDataApi();
		triggerUtradeApi();
	}
	
	@Test(priority = 33)
	public void morningMOSLBuilds() {
		triggerMOSLSlimCentOs7Hft();
		triggerMOSLClientExe();
		triggerMarketDataApi();
		triggerUtradeApi();
	}
	
	@Test(priority = 34)
	public void triggerCompletePackage() {
		userLogin();
		triggerSlimRhel8Hft();
		triggerSlimFirstFetchRhel8Hft();
		triggerFatRhel8Hft();
		triggerFatFirstFetchRhel8Hft();
		triggerPreOptimizedRhel8Hft();
		triggerPreOptimizedFirstFetchRhel8Hft();
		triggerFiftyDepthRhel8Hft();
		triggerSlimCentOs7Hft();
		triggerSlimFirstFetchCentOs7Hft();
		triggerFatCentOs7Hft();
		triggerFatFirstFetchCentOs7Hft();
		triggerPreOptimizedCentOs7Hft();
		triggerPreOptimizedFirstFetchCentOs7Hft();
		triggerFiftyDepthCentOs7Hft();
		triggerAllSOsForCentOS7();
		triggerAllSOsForRHEL8();
		triggerAllDlls();
		triggerClientExe();
		triggerAxisClientExe();
		triggerMarketDataApi();
		triggerUtradeApi();
		triggerAllTBTsForCentOS7();
		triggerAllTBTsForRHEL8();
	}
	
	@Test(priority = 35)
	public void triggerCompleteMOSLPackage() {
		triggerMOSLSlimCentOs7Hft();
		triggerMOSLSlimRhel8Hft();
		triggerMOSLFatRhel8Hft();
		triggerAllMOSLSOsForCentOS7();
		triggerAllMOSLSOsForRHEL8();
		triggerAllMOSLDlls();
		triggerMOSLClientExe();
		triggerMarketDataApi();
		triggerUtradeApi();
	}
}
