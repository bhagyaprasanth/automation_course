package test_script;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utilities.ExcelUtility;

public class LoginTest extends TestNGBase{
	@Test
	public void verifyLoginWithValidCredentials() throws IOException {
		String usernameValue=ExcelUtility.getStringData(1, 0, "LoginPage");
		String passwordValue=ExcelUtility.getStringData(1, 1, "LoginPage");
		WebElement usernameFld=driver.findElement(By.xpath("//input[@id='user-name']"));
		WebElement passwordFld=driver.findElement(By.xpath("//input[@id='password']"));
		WebElement loginBtn=driver.findElement(By.xpath("//input[@id='login-button']"));
		usernameFld.sendKeys(usernameValue);
		passwordFld.sendKeys(passwordValue);
		loginBtn.click();
		
	}
	@Test
	public void verifyLoginWithInvalidUserNameAndValidPassword() throws IOException {
		String usernameValue=ExcelUtility.getStringData(2, 0, "LoginPage");
		String passwordValue=ExcelUtility.getStringData(2, 1, "LoginPage");
		WebElement usernameFld=driver.findElement(By.xpath("//input[@id='user-name']"));
		WebElement passwordFld=driver.findElement(By.xpath("//input[@id='password']"));
		WebElement loginBtn=driver.findElement(By.xpath("//input[@id='login-button']"));
		usernameFld.sendKeys(usernameValue);
		passwordFld.sendKeys(passwordValue);
		loginBtn.click();
		
	}
	@Test
	public void verifyLoginWithValidUserNameAndInvalidPassword() throws IOException {
		String usernameValue=ExcelUtility.getStringData(3, 0, "LoginPage");
		String passwordValue=ExcelUtility.getStringData(3, 1, "LoginPage");
		WebElement usernameFld=driver.findElement(By.xpath("//input[@id='user-name']"));
		WebElement passwordFld=driver.findElement(By.xpath("//input[@id='password']"));
		WebElement loginBtn=driver.findElement(By.xpath("//input[@id='login-button']"));
		usernameFld.sendKeys(usernameValue);
		passwordFld.sendKeys(passwordValue);
		loginBtn.click();
		
	}
	@Test
	public void verifyLoginWithInalidUserNameAndInvalidPassword() throws IOException {
		String usernameValue=ExcelUtility.getStringData(4, 0, "LoginPage");
		String passwordValue=ExcelUtility.getStringData(4, 1, "LoginPage");
		WebElement usernameFld=driver.findElement(By.xpath("//input[@id='user-name']"));
		WebElement passwordFld=driver.findElement(By.xpath("//input[@id='password']"));
		WebElement loginBtn=driver.findElement(By.xpath("//input[@id='login-button']"));
		usernameFld.sendKeys(usernameValue);
		passwordFld.sendKeys(passwordValue);
		loginBtn.click();
		
	}
}
