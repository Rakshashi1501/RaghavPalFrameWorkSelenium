package testNgDependencies;

import org.testng.annotations.Test;

public class TestNgDependencyDemo2 {

	@Test(dependsOnGroups = {"sanity.*"})            // all the groups with name sanity will run  by using sanity.*
	public void test1() {                                       
		System.out.println("inside test1");
	}                                                                 

	@Test(groups = {"sanity1"})
	public void test2() {
		System.out.println("Inside test2");
	}

	@Test (groups = {"sanity2"})
	public void test3() {
		System.out.println("Inside test3");

	}

}
