package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Sel_Actions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sel_Actions.sel_Actions();
		Sel_Actions.sel_multipleActions();
	}

	public static void sel_Actions() {
		String baseUrl = "http://demo.guru99.com/test/newtours/";
		System.setProperty("webdriver.firefox.marionette", "C:\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.get(baseUrl);
		WebElement link_Home = driver.findElement(By.linkText("Home"));
		WebElement td_Home = driver.findElement(By.xpath("//html/body/div" + "/table/tbody/tr/td" + "/table/tbody/tr/td"
				+ "/table/tbody/tr/td" + "/table/tbody/tr"));

		Actions a = new Actions(driver);
		Action mouseOverHome = a.moveToElement(link_Home).build();
		String bgColor = td_Home.getCssValue("background-color");
		mouseOverHome.perform();
		System.out.println("Before hover: " + bgColor);

		/*
		 * or direct
		 */

		new Actions(driver).moveToElement(link_Home).build().perform();

		bgColor = td_Home.getCssValue("background-color");
		System.out.println("After hover: " + bgColor);
		driver.close();
	}

	public static void sel_multipleActions() {
		String baseUrl = "http://www.facebook.com/";
		WebDriver driver = new FirefoxDriver();

		driver.get(baseUrl);
		WebElement txtUsername = driver.findElement(By.id("email"));

		Actions a = new Actions(driver);
		Action seriesOfActions = a.moveToElement(txtUsername).click().keyDown(txtUsername, Keys.SHIFT)
				.sendKeys(txtUsername, "hello").keyUp(txtUsername, Keys.SHIFT).doubleClick(txtUsername).contextClick()
				.build();

		seriesOfActions.perform();

		/*
		 * or direct
		 */
		new Actions(driver)
						.moveToElement(txtUsername).click()
						.contextClick()		//RightClick
						.doubleClick()
						.clickAndHold()
						.sendKeys(txtUsername, "hello")
						.keyDown(txtUsername, Keys.SHIFT)
						.keyUp(txtUsername, Keys.SHIFT)
						.sendKeys(Keys.RETURN)
						.sendKeys(Keys.TAB)
						.build().perform();

	}


	
}
