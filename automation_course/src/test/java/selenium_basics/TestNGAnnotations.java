package selenium_basics;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotations {
	@BeforeMethod
	public void beforeMethodExecution() {
		System.out.println("Before Method Execution");
	}

	@AfterMethod
	public void afterMethodExecution() {
		System.out.println("After Method Execution");
	}

	@BeforeTest
	public void beforeTestExecution() {
		System.out.println("Before Test Execution");
	}

	@AfterTest
	public void afterTestExecution() {
		System.out.println("After Test Execution");
	}

	@BeforeClass
	public void beforeClassExecution() {
		System.out.println("Before Class Execution");
	}

	@AfterClass
	public void afterClassExecution() {
		System.out.println("After Class Execution");
	}
	
	@BeforeSuite
	public void beforeSuiteExecution() {
		System.out.println("Before Suite Execution");
	}

	@AfterSuite
	public void afterSuiteExecution() {
		System.out.println("After Suite Execution");
	}

	@Test
	public void verifyTestCase() {
		System.out.println("Verify Test case Execution");
	}
}
