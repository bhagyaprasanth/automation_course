package selenium_basics;

import org.openqa.selenium.By;

public class HandlingLocators extends Base {

	public void verifyLocators() {
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		driver.findElement(By.id("button-one"));
		driver.findElement(By.className("btn btn-primary"));
		driver.findElement(By.linkText("Simple Form Demo"));
		driver.findElement(By.partialLinkText("Simple Form"));
		driver.findElement(By.tagName("button"));
	}

	public static void main(String[] args) {
		HandlingLocators handlingLocators = new HandlingLocators();
		handlingLocators.initializeReturn();

	}

}
