package selenium_basics;

public class HandleNavigationCommands extends Base {
	public void verifyNavigationCommands() {
		driver.navigate().to("https://www.amazon.in/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}

	public static void main(String[] args) {
		HandleNavigationCommands handleNavigationCommands = new HandleNavigationCommands();
		handleNavigationCommands.initializeReturn();
		handleNavigationCommands.verifyNavigationCommands();
	}

}
