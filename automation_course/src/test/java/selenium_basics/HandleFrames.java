package selenium_basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandleFrames extends Base {
	public void verifyFrames() {
		driver.navigate().to("https://demoqa.com/frames");
		List<WebElement> totalFrames = driver.findElements(By.tagName("iframe"));
		System.out.println("No of Frames in the page ");
		System.out.println(totalFrames.size());
//		driver.switchTo().frame(1); // switch to frame by index
//		driver.switchTo().frame("frame1"); //// switch to frame by ID
		WebElement iframe = driver.findElement(By.xpath("//iframe[@id='frame1']")); 
		driver.switchTo().frame(iframe); // switch to frame by web element
//		driver.switchTo().parentFrame();
		WebElement h1 = driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
		System.out.println(h1.getText());
		driver.switchTo().defaultContent();//to release focus from the iframe 

	}

	public static void main(String[] args) {
		HandleFrames handleFrames = new HandleFrames();
		handleFrames.initializeBrowser();
		handleFrames.verifyFrames();
//		handleFrames.closeBrowser();
	}

}
