package web;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser {

	static String driverPath = "";
	static String PROXYURL = "199.201.125.147:8080";
	public WebDriver driver;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Runtime.getRuntime().exec("taskkill /F /IM iexplore.exe");
		Runtime.getRuntime().exec("taskkill /F /IM IEDriverServer.exe");

		Browser b = new Browser();
		WebDriver driver = b.setUpEdgeBrowser();
		b.launchgoogle(driver);
	
	}

	public void setProxy() {
		org.openqa.selenium.Proxy proxy = new org.openqa.selenium.Proxy();
		proxy.setHttpProxy(PROXYURL);
		proxy.setFtpProxy(PROXYURL);
		proxy.setSslProxy(PROXYURL);

		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(CapabilityType.PROXY, proxy);

	}

	public void selectBrowser() {

	}

	public WebDriver setUpIEBrowser() {
		System.out.println("*******************");
		System.out.println("launching IE browser");

		// System.setProperty("webdriver.ie.driver",
		// "Q:\\Softwares\\IEDriverServer.exe");
		WebDriverManager.iedriver().setup();

		InternetExplorerOptions IEoptions = new InternetExplorerOptions();
		IEoptions.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		IEoptions.setCapability(InternetExplorerDriver.ENABLE_PERSISTENT_HOVERING, true);
		IEoptions.setCapability(InternetExplorerDriver.REQUIRE_WINDOW_FOCUS, true);
		IEoptions.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION, true);
		IEoptions.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);

		// if(Jenkins)
		// {IEoptions.setCapability(InternetExplorerDriver.NATIVE_EVENTS,false);}

		InternetExplorerDriver driver = new InternetExplorerDriver(IEoptions);
		driver.manage().window().maximize();
		return driver;

	}

	public WebDriver setUpChromeBrowser() {
		System.out.println("*******************");
		System.out.println("launching Chrome browser");
		WebDriverManager.chromedriver().setup();
		ChromeOptions chromeOptions = new ChromeOptions();
		// chromeOptions.setCapability("chrome.binary",
		// configData.get("ChromeBinary").toString());
		chromeOptions.addArguments("disable-infobars");
		chromeOptions.addArguments("disable-extensions");
		chromeOptions.setExperimentalOption("useAutomationExtension", false);

		ChromeDriver driver = new ChromeDriver(chromeOptions);
		return driver;
	}

	public WebDriver setUpFirefoxBrowser() {
		System.out.println("*******************");
		System.out.println("launching firefox browser");

		WebDriverManager.firefoxdriver().setup();
		FirefoxOptions fireFoxOptions = new FirefoxOptions().setProfile(new FirefoxProfile());
		// fireFoxOptions.setBinary(configData.get("FirefoxBinary"));
		driver = new FirefoxDriver(fireFoxOptions);

		return driver;
	}

	public WebDriver setUpEdgeBrowser() {
		System.out.println("*******************");
		System.out.println("launching Edge browser");
		WebDriverManager.edgedriver().setup();

		EdgeOptions Edgeoptions = new EdgeOptions();

		driver = new EdgeDriver(Edgeoptions);

		return driver;
	}

	public void launchgoogle(WebDriver driver) {

		driver.get("http://www.google.com");
		// driver.navigate().to("http://www.google.com");
		String strPageTitle = driver.getTitle();
		System.out.println(strPageTitle);
		Assert.assertEquals(strPageTitle, "Google");

		driver.quit();
	}

}
