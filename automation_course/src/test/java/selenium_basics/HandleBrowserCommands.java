package selenium_basics;

public class HandleBrowserCommands extends Base {

	public void verifyBrowserCommands() {
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getWindowHandle());
		System.out.println(driver.getPageSource());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HandleBrowserCommands handleBrowserCommands = new HandleBrowserCommands();
		handleBrowserCommands.initializeBrowser();
		handleBrowserCommands.verifyBrowserCommands();
	}

}
