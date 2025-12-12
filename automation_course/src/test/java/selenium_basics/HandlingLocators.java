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
		driver.findElement(By.cssSelector("input[id='single-input-field']"));
		driver.findElement(By.xpath("//input[@id='single-input-field']"));
		driver.findElement(By.xpath("//input[@class='form-control' & @type='text']"));
		// xPath access using parent. Selects the Parent of node specified. -- least used
		driver.findElement(By.xpath("//div[contains (text(), 'Single Input Field')]//parent::div[@class='card']"));
		// xPath access using child. Selects the Child of node specified
		driver.findElement(By.xpath("//div[@class='card']//child::button[@id='button-one']"));
		// xPath access using following. Selects div that is given in following
		driver.findElement(By.xpath("//button[@id='button-one']//following::div[@class='card']"));
		// xPath access using Preceding. Selects the div that precedes button
		driver.findElement(By.xpath("//button[@id='button-one']//preceding:: div[@class='card']"));
		// xPath access using ancestor. Selects the parent/grand parent that has div with class card
		driver.findElement(By.xpath("//div/ancestor::div[@class='card']"));
		// xPath access using Descendant. Selects the child/grandchild node where div comes after the div with class 'card'
		driver.findElement(By.xpath("//div[@class='card']//descendant::div"));
	}

	public static void main(String[] args) {
		HandlingLocators handlingLocators = new HandlingLocators();
		handlingLocators.initializeBrowser();

	}

}
