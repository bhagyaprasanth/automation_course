package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandleWebElements extends Base {
	public void verifyCommands() {
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement textBox = driver.findElement(By.xpath("//input[@id='single-input-field']"));
		textBox.sendKeys("Hello");
		WebElement showMsgBtn = driver.findElement(By.xpath("//button[@id='button-one']"));
		showMsgBtn.click();
		WebElement msgTxt = driver.findElement(By.xpath("//div[@id='message-one']"));
		System.out.println(msgTxt.getText());
		System.out.println(msgTxt.getTagName());
		System.out.println(msgTxt.getAttribute("id"));
		textBox.clear();
	}

	public static void main(String[] args) {
		HandleWebElements handleWebElements = new HandleWebElements();
		handleWebElements.initializeBrowser();
		handleWebElements.verifyCommands();
	}

}
