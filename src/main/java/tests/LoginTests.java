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
	
	@Test(priority = 1)
	public void userLogin() {
		LoginPage loginPage = new LoginPage();
		loginPage.loginFull(ConfigReader.get("username"), ConfigReader.get("password"), driver);
		Assert.assertTrue(loginPage.isLoggedIn(driver), "Not Logged In");
	}
	
	@Test(priority = 2)
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
	
	@Test(priority = 3)
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
	
	@Test(priority = 4)
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
	
	@Test(priority = 5)
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
	
	@Test(priority = 6)
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
	
	@Test(priority = 7)
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
	
	@Test(priority = 8)
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
	
	@Test(priority = 9)
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
	
	@Test(priority = 10)
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
	
	@Test(priority = 11)
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
	
	@Test(priority = 12)
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
	
	@Test(priority = 13)
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
	
	@Test(priority = 14)
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
	
	@Test(priority = 15)
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
	
	@Test(priority = 16)
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
	@Test(priority = 17)
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
	
	@Test(priority = 18)
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
	
	@Test(priority = 19)
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
	
	@Test(priority = 20)
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
	
	@Test(priority = 21)
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
	
	@Test(priority = 22)
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
	
	@Test(priority = 23)
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
	
	@Test(priority = 24)
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
	
	@Test(priority = 25)
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
	
	@Test(priority=26)
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
	
	@Test(priority = 27)
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
	
	@Test(priority = 28)
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
	
	@Test(priority = 29)
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
	
	@Test(priority = 30)
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
	
	@Test(priority = 31)
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
