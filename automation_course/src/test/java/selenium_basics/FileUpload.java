package selenium_basics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FileUpload extends Base {
	public void fileUploadusingSendKeys() {
		driver.navigate().to("https://demo.guru99.com/test/upload/");
		WebElement filefld = driver.findElement(By.xpath("//input[@id='uploadfile_0']"));
		filefld.sendKeys(
				"C:\\Users\\bhagy\\git\\repository\\automation_course\\src\\test\\resources\\Midterm Evaluation-II.pdf");
		WebElement chkBox = driver.findElement(By.xpath("//input[@id='terms']"));
		chkBox.click();
		WebElement submitBtn = driver.findElement(By.xpath("//button[@id='submitbutton']"));
		submitBtn.click();
	}

	public void fileUploadUsingRobotClass() throws AWTException {
		driver.navigate().to("https://www.ilovepdf.com/pdf_to_word");
		WebElement upload = driver.findElement(By.id("pickfiles"));
		upload.click();
		StringSelection selection = new StringSelection(
				"C:\\Users\\bhagy\\git\\repository\\automation_course\\src\\test\\resources\\Midterm Evaluation-II.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		Robot robot = new Robot();
		// For handling the operating time and no error occur
		robot.delay(2500); //to pause the execution
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

	}

	public static void main(String[] args) {
		FileUpload fileUpload = new FileUpload();
		fileUpload.initializeBrowser();
//		fileUpload.fileUploadusingSendKeys();
		try {
			fileUpload.fileUploadUsingRobotClass();
		} catch (AWTException e) {
			e.printStackTrace();
		}
	}

}
