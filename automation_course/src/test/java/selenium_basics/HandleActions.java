package selenium_basics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HandleActions extends Base {
	public void verifyRightClick() {
		WebElement homeLink = driver.findElement(By.xpath("//a[text()='Home']"));
		Actions act = new Actions(driver);
		act.contextClick(homeLink).build().perform();
	}

	public void verifyMouseHover() {
		WebElement homeLink = driver.findElement(By.xpath("//a[text()='Home']"));
		Actions act = new Actions(driver);
		act.moveToElement(homeLink).build().perform();

	}

	public void verifyDragAandDrop() {
		driver.navigate().to("https://demoqa.com/droppable");
		WebElement dragElement = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement dropElement = driver.findElement(By.xpath("//div[@id='droppable']"));
		Actions act = new Actions(driver);
		act.dragAndDrop(dragElement, dropElement).build().perform();
	}
	
	public void verifyKeyboardActions() throws AWTException{
		Robot robot = new Robot();
		//VK - Virtual key. keypress simulates key press activity.
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_T);
		//keyrelease to release the press of key
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_T);
	}

	public static void main(String[] args) {
		HandleActions handleActions = new HandleActions();
		handleActions.initializeFirefoxBrowser();
//		handleActions.verifyRightClick();
//		handleActions.verifyMouseHover();
//		handleActions.verifyDragAandDrop();
		try {
			handleActions.verifyKeyboardActions();
		} catch (AWTException e) {
			e.printStackTrace();
		}
//		handleActions.closeBrowser();
	}

}
