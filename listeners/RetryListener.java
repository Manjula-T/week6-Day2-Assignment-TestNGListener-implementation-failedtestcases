package week6.day2.TestNG.listeners;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class RetryListener implements IAnnotationTransformer {
	
	public void transform(ITestAnnotation annotation, Class testClass, 
			Constructor testConstructor, Method testMethod) {
		
annotation.setRetryAnalyzer(RetryFailedTests.class);
if(testMethod.getName().equals("CreateLeacdTC_01"))
annotation.setInvocationCount(2);

	}

}
