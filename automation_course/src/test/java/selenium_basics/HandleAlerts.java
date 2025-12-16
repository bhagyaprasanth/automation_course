package selenium_basics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandleAlerts extends Base {

	public void verifySimpleAlert() {
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement alertBtn = driver.findElement(By.xpath("//button[@id='alertButton']"));
		alertBtn.click();
		Alert simpleAlert = driver.switchTo().alert();
		System.out.println(simpleAlert.getText());
		simpleAlert.accept();//to click ok button
	}
	public void verifyConfirmAlert() {
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement confirmAlertBtn = driver.findElement(By.xpath("//button[@id='confirmButton']"));
		confirmAlertBtn.click();
		Alert confirmAlert = driver.switchTo().alert();
//		confirmAlert.accept();
		confirmAlert.dismiss();//to click cancel button
	}
	public void verifyPromptAlert() {
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement promptAlertBtn = driver.findElement(By.xpath("//button[@id='promtButton']"));
		promptAlertBtn.click();
		Alert promptAlert = driver.switchTo().alert();
		promptAlert.sendKeys("Bhagya");
		promptAlert.accept();
	}

	public static void main(String[] args) {
		HandleAlerts handleAlerts = new HandleAlerts();
		handleAlerts.initializeBrowser();
		//handleAlerts.verifySimpleAlert();
//		handleAlerts.verifyConfirmAlert();
		handleAlerts.verifyPromptAlert();
	}

}
