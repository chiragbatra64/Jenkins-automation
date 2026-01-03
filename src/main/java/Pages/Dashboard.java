package Pages;

import org.openqa.selenium.By;

import utils.Waits;

public class Dashboard {
	private final By HFT7 = By.xpath("//*[@id=\"job_HFT_QA_BUILD_RELEASE_new\"]/td[3]/a");
	private final By HFT8 = By.xpath("//*[@id=\"job_HFT_QA_BUILD_RELEASE_RHEL8_GCC11\"]/td[3]/a");
	private final By clientExe = By.xpath("//*[@id=\"job_Client_GUI_BUILD_WITH_UPDATED_QT_RAGNAROK\"]/td[3]/a");
	private final By dll = By.xpath("//*[@id=\"job_Client_GUI_Custom_dll_Build_QT_Ragnarok\"]/td[3]/a");
	private final By utradeApi = By.xpath("//*[@id=\"job_Utrade_Api_Dll\"]/td[3]/a");
	private final By muTradeSo7 = By.xpath("//*[@id=\"job_muTrade_Custom_Algo_QA_Build_new\"]/td[3]/a");
	private final By muTradeSo8 = By.xpath("//*[@id=\"job_muTrade_Custom_Algo_QA_Build_RHEL8_GCC11\"]/td[3]/a");
	private final By tbt7 = By.xpath("//*[@id=\"job_Multicast-TBT_Builder_Consolidated_new\"]/td[3]/a");
	private final By tbt8 = By.xpath("//*[@id=\"job_Multicast-TBT_Builder_Consolidated_RHEL8_GCC11\"]/td[3]/a");
	
	public Dashboard enter_HFT_7() {
		Waits.waitForClickable(HFT7).click();
		return this;
	}
	
	public Dashboard enter_HFT_8() {
		Waits.waitForClickable(HFT8).click();
		return this;
	}
	
	public Dashboard enter_Client_Exe() {
		Waits.waitForClickable(clientExe).click();
		return this;
	}
	
	public Dashboard enter_Dll() {
		Waits.waitForClickable(dll).click();
		return this;
	}
	
	public Dashboard enter_Utrade_Api() {
		Waits.waitForClickable(utradeApi).click();
		return this;
	}
	
	public Dashboard enter_muTradeSo7() {
		Waits.waitForClickable(muTradeSo7).click();
		return this;
	}
	
	public Dashboard enter_muTradeSo8() {
		Waits.waitForClickable(muTradeSo8).click();
		return this;
	}
	
	public Dashboard enter_tbt7() {
		Waits.waitForClickable(tbt7).click();
		return this;
	}
	
	public Dashboard enter_tbt8() {
		Waits.waitForClickable(tbt8).click();
		return this;
	}
}
