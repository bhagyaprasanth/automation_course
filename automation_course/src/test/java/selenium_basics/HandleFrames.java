package selenium_basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandleFrames extends Base {
	public void verifyFrames() {
		driver.navigate().to("https://demoqa.com/frames");
		List <WebElement> totalFrames = driver.findElements(By.tagName("iframe"));
		System.out.println("No of Frames in the page " );
		System.out.println(totalFrames.size());
	}

	public static void main(String[] args) {
		HandleFrames handleFrames = new HandleFrames();
		handleFrames.initializeBrowser();
		handleFrames.verifyFrames();	
		handleFrames.closeBrowser();
	}

}
