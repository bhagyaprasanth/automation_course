package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdowns extends Base {
	public void verifyDropdown() {
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement link = driver.findElement(By.linkText("Select Input"));
		link.click();
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='single-input-field']"));
		Select select = new Select(dropdown);
		// select.selectByIndex(1);
		// select.selectByValue("Yellow");
		select.selectByVisibleText("Green");
	}

	public void verifyCheckBoxes() {
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement link = driver.findElement(By.linkText("Checkbox Demo"));
		link.click();
		WebElement checkbox = driver.findElement(By.xpath("//input[@id='gridCheck']"));
		checkbox.click();
		System.out.println(checkbox.isSelected());
		System.out.println(checkbox.isDisplayed());
		System.out.println(checkbox.isEnabled());

	}
	public void verifyRadioButton() {
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement link = driver.findElement(By.linkText("Radio Buttons Demo"));
		link.click();
		WebElement radioBtn=driver.findElement(By.xpath("//input[@id='inlineRadio1']"));
		radioBtn.click();
		WebElement showBtn=driver.findElement(By.xpath("//button[@id='button-one']"));
		showBtn.click();
	}

	public static void main(String[] args) {
		HandlingDropdowns handlingDropdowns = new HandlingDropdowns();
		handlingDropdowns.initializeBrowser();
		// handlingDropdowns.verifyDropdown();
		//handlingDropdowns.verifyCheckBoxes();
		handlingDropdowns.verifyRadioButton();
	}

}
