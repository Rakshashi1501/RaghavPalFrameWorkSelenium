package testNgGrouping;

import org.testng.annotations.Test;


// groups can also be run at class lever
@Test (groups = {"AllClassTests"})
public class Grouping {
	
	// testng4.xml 
	//Inside groups, we can create another group by <define> and <include> 

	@Test(groups = { "sanity" })
	public void test1() {
		System.out.println("in test1");
	}

	@Test(groups = { "sanity", "smoke" })
	public void test2() {
		System.out.println("in test2");
	}

	@Test(groups = {  "regression" })
	public void test3() {
		System.out.println("in test3");

	}

	@Test
	public void test4() {
		System.out.println("in test4");
	}
}
