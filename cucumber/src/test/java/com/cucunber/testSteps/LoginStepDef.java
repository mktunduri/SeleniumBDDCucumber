package com.cucunber.testSteps;

import com.cucumber.pageobjects.LoginPage;
import com.cucumber.testbase.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDef extends TestBase {

	LoginPage obj;

	@Given("^I lauched Chrome Browser$")
	public void iLauchedChromeBrowser() throws Throwable {
		selectBrowser("chrome");
	}

	@Given("^I Enter the valid Url$")
	public void iEnterTheValidUrl() throws Throwable {
		enterURL();
	}

	@Given("^Enter user Name and password$")
	public void enterUserNameAndPassword() throws Throwable {
		obj = new LoginPage(driver);
		obj.getUserId().sendKeys(or.getProperty("emailId"));
		obj.getNextButton().click();
		waitForElementVisible(obj.getPassword(),10);
		obj.getPassword().sendKeys(or.getProperty("password"));

	}

	@When("^I sumbit login button$")
	public void iSumbitLoginButton() throws Throwable {
		obj = new LoginPage(driver);
		obj.getLoginButton().click();

	}

	@Then("^I verify login success$")
	public void iVerifyLoginSuccess() throws Throwable {
		System.out.println("Login success");
	}

	@Then("^I click on Compose function$")
	public void iClickOnComposeFunction() throws Throwable {
		obj = new LoginPage(driver);
		waitForElementVisible(obj.getComposeButton(), 10);
		obj.getComposeButton().click();
	}

	@Then("^I Enter on  body and subject$")
	public void iEnterOnBodyAndSubject() throws Throwable {
		obj = new LoginPage(driver);
		waitForElementVisible(obj.getTotext(), 20);
		obj.getTotext().sendKeys(or.getProperty("toAddress"));
		Thread.sleep(3000);
		obj.getSubjectText().sendKeys(or.getProperty("subject"));
		obj.getBodyText().sendKeys(or.getProperty("body"));

	}

	@When("^i click on send button$")
	public void iClickOnSendButton() throws Throwable {
		obj = new LoginPage(driver);
		waitForElementVisible(obj.getSendButton(), 20);
		obj.getSendButton().click();

	}

	@Then("^I verify the sent mail is sucess$")
	public void iVerifyTheSentMailIsSucess() throws Throwable {
		System.out.println("Compose Function is success...");

	}

	@Then("^I verify the logout success$")
	public void iVerifyTheLogoutSuccess() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Logout is success..");

	}

	@Then("^I close the browser$")
	public void iCloseTheBrowser() throws Throwable {
		driver.close();

	}

}
