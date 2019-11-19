package Selenium_Training;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class S18_Lesson146_Listeners implements ITestListener{

	/*
	 *  THIS CANNOT BE RUN SEPARATELY WITHOUT THE Lesson146.xml and S18_Lesson146_Test.java
	 *  i.e : must be run from Lesson146.xml
	 *  
	 */
	
	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onFinish(context);
		//System.out.println(context);
		System.out.println("\n" +  "If your seeing this line then it means that the test run from the Lesson146.xml has Finished but does not mean it has passed or failed.");
	}
	
	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onStart(context);
		System.out.println("This Marks the start of Lesson146.java "+ "\n" + "\n");
	}
	
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}
	
	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedWithTimeout(result);
	}
	
	
	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailure(result);
		System.out.println("\n" +  "If your seeing this line then it means that the test failed." + "\n");
		System.out.println("Failure name is "+ result);
	}
	
	
	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSkipped(result);
	}
	
	
	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestStart(result);
	}
	
	
	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSuccess(result);
	}

	

}
