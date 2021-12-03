package testNgParameter;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

// test5.xml
public class Parameter {

	@Test
	@Parameters({"MyName"})
	
	public void test( @ Optional("Anup") String name) { // added optional 
		System.out.println("name is :" + name);
		
	}
	
}
