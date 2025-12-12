package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingTables extends Base {
	public void verifyTables() {
		driver.navigate().to("https://money.rediff.com/indices/nse");
		WebElement table = driver.findElement(By.xpath("//table[@id='dataTable']"));
		System.out.println("Contents of the table");
		System.out.println(table.getText());
		WebElement tableRow = driver.findElement(By.xpath("//table[@id='dataTable']/tbody/tr[3]"));
		System.out.println("Contents of 3rd row of the table");
		System.out.println(tableRow.getText());
		WebElement tableColumn = driver.findElement(By.xpath("//table[@id='dataTable']/tbody/tr[3]/td[2]"));
		System.out.println("Contents of 2nd column and 3rd row of the table");
		System.out.println(tableColumn.getText());
		WebElement tableLastRow = driver.findElement(By.xpath("//table[@id='dataTable']/tbody/tr[last()]"));
		System.out.println("Contents of last row of the table");
		System.out.println(tableLastRow.getText());
		WebElement tableLastRowlastColumn = driver.findElement(By.xpath("//table[@id='dataTable']/tbody/tr[last()]/td[last()]"));
		System.out.println("Contents of last row , last column of the table");
		System.out.println(tableLastRowlastColumn.getText());
	}

	public static void main(String[] args) {
		HandlingTables handlingTables = new HandlingTables();
		handlingTables.initializeBrowser();
		handlingTables.verifyTables();
		handlingTables.closeBrowser();
	}
}
