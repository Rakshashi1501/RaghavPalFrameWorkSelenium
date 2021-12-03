package testNgPriority;

import org.testng.annotations.Test;

public class TestNgPriority {
	
	// // we can give negitive number priority = -1
	// when two tests have same priority = 1, alphabetical order of Function name is considered
	// even if we dont have any priority, for @test alphabetical order is considered 
	// if we donot give priority first it will run @test and then @Test(priority = 1) etc 

	@Test(priority = 2)
	public void test1() {
		System.out.println("********  we are inside Test 1");
	}

	@Test (priority = 3)
	public void test2() {
		System.out.println("********  we are inside Test 2");
	}

	@Test(priority = - 1) // we can give negitive number 
	public void test3() {
		System.out.println("********  we are inside Test 3");
	}

}
