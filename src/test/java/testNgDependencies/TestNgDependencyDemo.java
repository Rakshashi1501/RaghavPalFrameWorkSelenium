package testNgDependencies;

import org.testng.annotations.Test;

public class TestNgDependencyDemo {

	@Test(dependsOnMethods = { "test2", "test3" })            // dependsOnMethods means test 2 will execute first
	public void test1() {                                       // But when we set priority,ie., priority = 1, it still executes test 2 first.
		System.out.println("inside test1");
	}                                                                 // dependsOnMethods means test 2, test3 , will execute test2 and then test3
		                                                                // first and after test1

	@Test(priority = 2)
	public void test2() {
		System.out.println("Inside test2");
	}

	@Test(priority = 2)
	public void test3() {
		System.out.println("Inside test3");

	}

}
