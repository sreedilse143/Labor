/*
	number of Locators to precisely locate a GUI element
	The different types of Locators in Selenium IDE
	

Example

By ID							id= id_of_the_element								id=user
By Name							name=name_of_the_element							name=userName
By Name Using Filters			name=name_of_the_element filter=value_of_filter		name=tripType value=return
By Link Text					link=link_text										link=REGISTER
Tag and ID						css=tag#id											css=input#user
Tag and Class					css=tag.class										css=input.inputtext
Tag and Attribute				css=tag[attribute=value]							css=input[name=userName]
Tag, Class, and Attribute		css=tag.class[attribute=value]						css=input.inputtext[tabindex=1]
XPath							XPath												\\input[@class='xxx' and @type='text']

--DOM------------------

getElementById					document.getElementById("id of the element")		document.getElementById("userName")
getElementsByName				document.getElementsByName("name")[index]			document.getElementsByName("userName")[1]


dom:name						document.forms["name of the form"].elements["name of the element"]
																					document.forms["main"].elements["userName"]
dom:index						document.forms[index of the form].elements[index of the element]
																					document.forms[0].elements[1]


*/

package selenium;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_Locators {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Sel_Locators.getMax_table();
	}

	public static void selfinelements() {
		Sel_Locators.sel_findElement("id", "user");
		Sel_Locators.sel_findElement("name", "userName");
		Sel_Locators.sel_findElement("className", "inputtext");
		Sel_Locators.sel_findElement("tagName", "input");
		Sel_Locators.sel_findElement("linkText", "REGISTER");
		Sel_Locators.sel_findElement("partialLinkText", "REGIS");
		Sel_Locators.sel_findElement("cssSelector", "input#user");
		Sel_Locators.sel_findElement("cssSelector", "input.inputtext");
		Sel_Locators.sel_findElement("cssSelector", "input[name=userName]");
		Sel_Locators.sel_findElement("cssSelector", "input.inputtext[tabindex=1]");
		Sel_Locators.sel_findElement("xpath", "\\input[@class='xxx' and @type='text']");
		Sel_Locators.sel_findElement("documentgetElementById", "document.getElementById(\"user\")");
		Sel_Locators.sel_findElement("documentgetElementsByName", "document.getElementsByName(\"userName\")");
		Sel_Locators.sel_findElement("documentgetElementById", "document.getElementById(\"userName\")");
		Sel_Locators.sel_findElements();

	}

	public static WebElement sel_findElement(String locator, String locator_Property) {

		WebElement Element_Formed = null;

		WebDriverManager.chromedriver().setup();
		ChromeOptions co = new ChromeOptions();
		co.setExperimentalOption("useAutomationExtension", false);
		ChromeDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		driver.get("http://demo.guru99.com/test/ajax.html");

		ExpectedConditions.invisibilityOf(Element_Formed);
		ExpectedConditions.frameToBeAvailableAndSwitchToIt("topFrame");

		try {
			switch (locator) {

			case ("id"):
				Element_Formed = driver.findElement(By.id(locator_Property));
			case ("name"):
				Element_Formed = driver.findElement(By.name(locator_Property));
			case ("className"):
				Element_Formed = driver.findElement(By.className(locator_Property));
			case ("tagName"):
				Element_Formed = driver.findElement(By.tagName(locator_Property));
			case ("linkText"):
				Element_Formed = driver.findElement(By.linkText(locator_Property));
			case ("partialLinkText"):
				Element_Formed = driver.findElement(By.partialLinkText(locator_Property));
			case ("cssSelector"):
				Element_Formed = driver.findElement(By.cssSelector(locator_Property));
			case ("xpath"):
				Element_Formed = driver.findElement(By.xpath(locator_Property));
			}

			// wait.until(ExpectedConditions.visibilityOf(Element_Formed));

		} catch (NoSuchElementException e) {
		} catch (WebDriverException e) {
		}

		return Element_Formed;

	}

	public static void javaScript_findElement(String locator, String locator_Property) {

		/*
		 * var x = document.getElementById(locator_Property); // Get the element with
		 * id="demo" x.style.color = "red"; // Change the color of the element var at =
		 * document.getElementById(locator_Property).value.indexOf("@"); var age =
		 * document.getElementById(locator_Property).value;
		 * document.getElementById(locator_Property).value = "Johnny Bravo";
		 * document.getElementById(locator_Property).checked = true;
		 * 
		 * $('#msg').val(msg); $('#sp_100').attr('checked', 'checked');
		 * 
		 */

	}

	public static void sel_findElements() {

		WebDriverManager.chromedriver().setup();
		ChromeOptions co = new ChromeOptions();
		co.setExperimentalOption("useAutomationExtension", false);
		ChromeDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);

		driver.get("http://demo.guru99.com/test/ajax.html");
		List<WebElement> elements = driver.findElements(By.name("name"));

		System.out.println("Number of elements:" + elements.size());

		for (int i = 0; i < elements.size(); i++) {
			System.out.println("Radio button text:" + elements.get(i).getAttribute("value"));
		}

	}

	public static void sel_Element_Operations(WebElement Element, String Testdata, String ElementName) {

		String Element_getTagName = Element.getTagName();
		boolean Element_isDisplayed = Element.isDisplayed();
		String Element_get_Attributetype = Element.getAttribute("type");

		try {

			switch (Element_getTagName) {
			case ("input"):
				// radio
				if (Element_get_Attributetype.equalsIgnoreCase("radio")) {
					Element.click();
					// checkbox
				} else if (Element_get_Attributetype.equalsIgnoreCase("check")) {
					Element.click();
				} else {
					// edit
					Element.sendKeys(Testdata);
				}

			case ("textarea"):
				Element.sendKeys(Testdata);
			case ("typekeys"):
			case ("selectByVisibleText"):
				new Select(Element).selectByVisibleText(Testdata);
			case ("selectByIndex"):
				new Select(Element).selectByValue(Testdata);
			case ("deselectByIndex"):
				new Select(Element).deselectByIndex(1);
			case ("getOptions"):
				new Select(Element).getOptions();
			case ("deselectAll"):
				new Select(Element).deselectAll();

			case ("button"):
				Element.click();
				// clickAt (Element,2);
			case "a":
				if (Element_get_Attributetype.equalsIgnoreCase("href")) {
					Element.click();
				}

			}

			//System.out.println(LogStatus.INFO + ": Value[" + Testdata + "] set in" + "[" + ElementName + "]");

		} catch (Exception e) {
			//OSystem.out.println(LogStatus.INFO + " :Not able to " + "set value in" + "[" + ElementName + "]");
			throw e;
		}

	}

	public static void extractdata_table() {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		driver.get("http://only-testing-blog.blogspot.in/2013/09/test.html");

		WebElement f = driver.findElement(By.xpath(".//*[@id='post-body-6522850981930750493']/div[1]/table/tbody"));
		List<WebElement> rows = f.findElements(By.tagName("tr"));
		System.out.println("Number of rows=" + rows.size());
		List<WebElement> columns = f.findElements(By.tagName("td"));
		System.out.println("Number of columns=" + columns.size());
		System.out.println(f.getText());

		driver.quit();
	}

	public static void getMax_table() throws ParseException {

		String row_val = "";
		double cur_val = 0, max_val = 0;

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/test/web-table-element.php");

		// No.of rows
		List<WebElement> rows = driver.findElements(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr/td[1]"));
		System.out.println("Total No of rows are : " + rows.size());

		// No. of Columns
		List<WebElement> col = driver.findElements(By.xpath(".//*[@id='leftcontainer']/table/thead/tr/th"));
		System.out.println("Total No of columns are : " + col.size());

		for (int i = 1; i <= rows.size(); i++) {
			row_val = driver.findElement(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr[" + i + "]/td[4]")).getText();
			System.out.println("tr[" + i + "] value = [" + row_val + "]");
			
			cur_val = Double.parseDouble(NumberFormat.getNumberInstance().parse(row_val).toString());

			if (cur_val > max_val) {
				max_val = cur_val;
			}
		}

		System.out.println("Maximum current price is : " + max_val);

		driver.quit();
	}

	
	


}
