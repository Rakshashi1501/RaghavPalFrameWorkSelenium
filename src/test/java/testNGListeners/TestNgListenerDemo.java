package testNGListeners;

import static org.testng.Assert.assertTrue;

import org.junit.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import bsh.BshClassManager.Listener;


// What if we have 100 classes, we cannot declare in this way, so we declare in suite level in xml formate 
// we have testNG1.xml for this program
@Listeners(testNGListeners.TestNGListeners.class) // testNGListeners is package name
public class TestNgListenerDemo {

	@Test
	public void test1() {
		System.out.println("I am in test1");
	}
	@Test
	public void test2() {
		System.out.println("I am in test2");
		
		Assert.assertTrue(false);
	}
	@Test
		public void test3() {
			System.out.println("I am in test3");
			
			throw new SkipException("Test 3 is skipped");
		}
}
