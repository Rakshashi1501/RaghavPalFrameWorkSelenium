package testngRerun;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestngtestrerunDemo {

	@Test
	public void test1() {
		System.out.println("In test 1");
	}
	
	@Test
	public void test2() {
		System.out.println("In test 2");
		
		Assert.assertTrue(false);
	}
	@Test(retryAnalyzer=RetryFailedTestcase.class)
	public void test3() {
		System.out.println("In test 3");
		// int i = 1/0;
	}
	
	// to re- try failed test case
	
	
}
