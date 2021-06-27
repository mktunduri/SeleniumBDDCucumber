package com.cucumber.helperclasses;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;

import com.cucumber.testbase.TestBase;

public class ElementHelper extends TestBase {

	private static final Logger log = Logger.getLogger(ElementHelper.class.getName());

	public boolean elementIsDisplayed(WebElement element) {
		try {
			element.isDisplayed();
			log.info("Element is displayed on web Page " + element);
		} catch (Exception e) {
			e.printStackTrace();
			log.info("Element is not displayed on web Page " + element);
		}
		return true;

	}

	public boolean elementIsSelected(WebElement element) {
		try {
			element.isSelected();
			log.info("Element is selected on web Page " + element);
		} catch (Exception e) {
			e.printStackTrace();
			log.info("Element is not selected on web Page " + element);
		}
		return true;

	}

	public boolean elementIsEnabled(WebElement element) {
		try {
			element.isEnabled();
			log.info("Element is enabled on web Page " + element);
		} catch (Exception e) {
			e.printStackTrace();
			log.info("Element is not enabled on web Page " + element);
		}
		return true;

	}

}
