package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.Waits;

public class LoginPage {
	private final By usernameInput = By.xpath("//*[@id=\"j_username\"]");
	private final By passwordInput = By.xpath("/html/body/div/div/form/div[2]/input");
	private final By loginButton = By.xpath("/html/body/div/div/form/div[3]/input");
	private final By peopleLink = By.xpath("//*[@id=\"tasks\"]/div[1]/a[2]");
	
	public LoginPage enterUsername(String username, WebDriver driver) {
		Waits.waitForClickable(usernameInput).click();
		Waits.waitForVisible(usernameInput).sendKeys(username);
		return this;
	}
	
	public LoginPage enterPassword(String password, WebDriver driver) {
		Waits.waitForClickable(passwordInput).click();
		Waits.waitForVisible(passwordInput).sendKeys(password);
		return this;
	}
	
	public LoginPage clickLogin(WebDriver driver) {
		Waits.waitForClickable(loginButton).click();
		return this;
	}
	
	public LoginPage loginFull(String username, String password, WebDriver driver) {
		enterUsername(username, driver);
		enterPassword(password, driver);
		clickLogin(driver);
		return this;
	}
	
	public boolean isLoggedIn(WebDriver driver) {
		try {
			Waits.waitForVisible(peopleLink);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}
