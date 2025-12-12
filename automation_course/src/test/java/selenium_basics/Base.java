package selenium_basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	public WebDriver driver;

	public void initializeBrowser() {
		driver = new ChromeDriver();
//		driver = new FirefoxDriver();
		driver.get("https://selenium.qabible.in/");
		driver.manage().window().maximize();
//		driver.manage().window().minimize();
	}

	public void initializeFirefoxBrowser() {
//		driver = new ChromeDriver();
		driver = new FirefoxDriver();
		driver.get("https://selenium.qabible.in/");
		driver.manage().window().maximize();
//		driver.manage().window().minimize();
	}
	public void closeBrowser() {
		// driver.close();//to close a tab
		driver.quit();// to close the window
	}

	public static void main(String args[]) {
		Base base = new Base();
		base.initializeBrowser();
//		base.closeBrowser();
	}
}
