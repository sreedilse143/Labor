package selenium;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;

public class SeleniumReusable {

	public static WebDriver driver;

	private void psvm() {
		// TODO Auto-generated method stub

	}

	public WebElement locateElement(String locator, String locValue) {
		try {
		/*	switch (locator) {
			case ("id"):
				return driver.findElementById(locValue);
			case ("link"):
				return driver.findElementByLinkText(locValue);
			case ("xpath"):
				return driver.findElementByXPath(locValue);
			case ("name"):
				return driver.findElementByName(locValue);
			case ("class"):
				return driver.findElementByClassName(locValue);
			case ("tag"):
				return driver.findElementByTagName(locValue);
			}*/
		} catch (NoSuchElementException e) {
			reportStep("The element with locator " + locator + " not found.", "FAIL");
		} catch (WebDriverException e) {
			reportStep("Unknown exception occured while finding " + locator + " with the value " + locValue, "FAIL");
		}
		return null;
	}


	public void reportStep(String a, String b) {
		
	}

}
