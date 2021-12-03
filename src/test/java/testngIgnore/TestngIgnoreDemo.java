package testngIgnore;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;


// for ignoring all the test cases at package level, create a new package as same package name and add Ignore.

@ Ignore // Ignore all test in class level
public class TestngIgnoreDemo {

	@Test
	@Ignore
	public void test1() {
		System.out.println("Inside test 1");
	}
	
	public void test2() {
		System.out.println("Inside test 2");
	}
}
