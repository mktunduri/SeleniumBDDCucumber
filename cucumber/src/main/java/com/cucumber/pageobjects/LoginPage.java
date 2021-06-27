package com.cucumber.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cucumber.testbase.TestBase;

public class LoginPage extends TestBase {

	/* for locators find */

	@FindBy(xpath = "//input[@type='email']")
	private WebElement userId;

	@FindBy(xpath = "//*[@id='identifierNext']/div/button/span")
	private WebElement NextButton;

	@FindBy(xpath = "//input[@type='password']")
	private WebElement password;

	@FindBy(xpath = "(//*[@class='VfPpkd-vQzf8d'])[1]")
	private WebElement LoginButton;

	@FindBy(xpath = "//*[@style='user-select: none']")
	private WebElement ComposeButton;

	// @FindBy(xpath="//textarea[@name='to']"),
	@FindBy(name = "to")
	private WebElement totext;

	@FindBy(css=".aoD.az6 input")
	private WebElement subjectText;

	@FindBy(css = ".Ar.Au div")
	private WebElement bodyText;
	
	@FindBy(xpath="//*[@class='T-I J-J5-Ji aoO v7 T-I-atl L3']")
	private WebElement sendButton;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public WebElement getUserId() {
		return userId;
	}

	public WebElement getNextButton() {
		return NextButton;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginButton() {
		return LoginButton;
	}

	public WebElement getComposeButton() {
		return ComposeButton;
	}

	public WebElement getTotext() {
		return totext;
	}

	public WebElement getSubjectText() {
		return subjectText;
	}

	public WebElement getSendButton() {
		return sendButton;
	}

	public WebElement getBodyText() {
		// TODO Auto-generated method stub
		return bodyText;
	}

}
