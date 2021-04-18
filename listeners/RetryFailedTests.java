package week6.day2.TestNG.listeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryFailedTests implements IRetryAnalyzer{

	int maxtry =2;
	int retryCount = 0;
	public boolean retry(ITestResult result) {
		
		if (!result.isSuccess() && retryCount<=maxtry) {
			retryCount++;
			return true;
		}
		
		return false;
	}

}
