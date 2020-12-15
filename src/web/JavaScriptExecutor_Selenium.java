/*Syntax:
JavascriptExecutor js = (JavascriptExecutor) driver;  
js.executeScript(Script,Arguments);
script - The JavaScript to execute
Arguments - The arguments to the script.(Optional)*/

package web;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutor_Selenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions chromeOptions = new ChromeOptions();
		ChromeDriver driver = new ChromeDriver(chromeOptions);
		driver.get("http://www.newtours.demoaut.com/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementByName('userName').value='mercury'");

		// JavaScriptExecutor_Selenium.getElement_JavaScriptExecutor(driver);

	}

	public static void getElement_JavaScriptExecutor(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;

		WebElement Dummy = driver.findElement(By.xpath("//*[@id='next']"));

		// wait.until(ExpectedConditions.visibilityOf(elements[i]));

		String MouseEvents = "var evObj = document.createEvent('MouseEvents');"
				+ "evObj.initMouseEvent(\"mouseover\",true, false, window, 0, 0, 0, 0, 0, false, false, false, false, 0, null);"
				+ "arguments[0].dispatchEvent(evObj);";
		js.executeScript(MouseEvents, Dummy);


		// Uncomment each scenario by using Ctrl + Shift + \ (backslash) and find the
		// solution

		// to type text in Selenium WebDriver without using sendKeys() method
		js.executeScript("document.getElementById('some id').value='someValue';");
		js.executeScript("document.getElementById('Email').value='SoftwareTestingMaterial.com';");

		/*
		 * //to click a button in Selenium WebDriver using JavaScript
		 * //js.executeScript("arguments[0].click();", loginButton); //or
		 * js.executeScript("document.getElementById('enter your element id').click();"
		 * ); js.executeScript("document.getElementById('next').click();");
		 */

		/*
		 * //to handle checkbox
		 * js.executeScript("document.getElementById('enter element id').checked=false;"
		 * );
		 */

		// to generate Alert Pop window in selenium
		js.executeScript("alert('hello world');");

		// to refresh browser window using Javascript
		js.executeScript("history.go(0)");

		// to get innertext of the entire webpage in Selenium
		String sText = js.executeScript("return document.documentElement.innerText;").toString();
		System.out.println(sText);

		// to get the domain
		String sText2 = js.executeScript("return document.domain;").toString();
		System.out.println(sText2);

		// to get the URL of our webpage
		String sText3 = js.executeScript("return document.URL;").toString();
		System.out.println(sText3);

		// to get the Title of our webpage
		String sText1 = js.executeScript("return document.title;").toString();
		System.out.println(sText1);

		// Scroll - to the visibility of element
		js.executeScript("arguments[0].scrollIntoView();", Dummy);

		// Vertical scroll - down by 100 pixels
		js.executeScript("window.scrollBy(0, 100)");

		// Vertical scroll - up by 50 pixels
		js.executeScript("window.scrollBy(50,0)");

		// for scrolling till the bottom of the page 
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");

		// Hover on Automation Menu on the MenuBar
		js.executeScript("$('ul.menus.menu-secondary.sf-js-enabled.sub-menu li').hover()");

		// Navigate to new Page
		js.executeScript("window.location = 'https://www.softwaretestingmaterial.com");

	}

}
