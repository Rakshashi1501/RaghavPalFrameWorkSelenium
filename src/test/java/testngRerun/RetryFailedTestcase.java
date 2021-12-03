package testngRerun;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryFailedTestcase implements IRetryAnalyzer {
	
	 
		 
		  private int retryCount = 0;
		  private static final int maxRetryCount = 3; // retry for 3 times
		 
		  public boolean retry(ITestResult result) {
		    if (retryCount < maxRetryCount) {
		      retryCount++;
		      return true;
		    }
		    return false;
		  }
		}



