/*
 * https://www.guru99.com/alert-popup-handling-selenium.html
 * 
 * Alert interface provides the below few methods which are widely used in Selenium Webdriver.
 * 
 * 
 */

package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium_Alerts {
	static WebDriver driver;
	private static String alertMessage;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Selenium_Alerts.SimpleAlerts();
		Selenium_Alerts.PromptAlerts();
		alertMessage = Selenium_Alerts.ConfirmationAlerts();
		Selenium_Alerts.getWindowHandle();
		
	}

	public static void SimpleAlerts() {
		driver.switchTo().alert().accept();
	}

	public static void PromptAlerts() {
		driver.switchTo().alert().sendKeys("Text");
		driver.switchTo().alert().accept();
	}

	public static String ConfirmationAlerts() {
		alertMessage = driver.switchTo().alert().getText();
		driver.switchTo().alert().dismiss();
		driver.switchTo().alert().accept();
		return alertMessage;

	}

	public static void getWindowHandle() {
		WebDriver driver = new FirefoxDriver();

		// Launching the site.
		driver.get("http://demo.guru99.com/popup.php");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//*[contains(@href,'popup.php')]")).click();

		String MainWindow = driver.getWindowHandle();

		// To handle all new opened window.
		Set<String> s1 = driver.getWindowHandles();
		Iterator<String> i1 = s1.iterator();

		while (i1.hasNext()) {
			String ChildWindow = i1.next();

			if (!MainWindow.equalsIgnoreCase(ChildWindow)) {

				// Switching to Child window
				driver.switchTo().window(ChildWindow);
				driver.findElement(By.name("emailid")).sendKeys("gaurav.3n@gmail.com");

				driver.findElement(By.name("btnLogin")).click();

				// Closing the Child Window.
				driver.close();
			}
		}
		// Switching to Parent window i.e Main Window.
		driver.switchTo().window(MainWindow);
	}

}
