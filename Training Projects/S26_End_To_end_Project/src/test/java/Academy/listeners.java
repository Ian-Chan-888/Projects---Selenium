package Academy;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import resources.base;

public class listeners implements ITestListener{
base b = new base();  // create base object here so we can access base methods. Ensure you, muse over base and click on 'import base (resources)'
	/*
	 * import org.testng.ITestListener;
	 * import resources.base;
	 * mouse over 'listeners' and click on 'Add unimplemented methods'
	 * 	-this will autopopulate the methods below : ie. ...onTextStart...onTestSuccess... etc
	 */
	
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		// when Test is started this listener will implement what ever is written in this block.
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		// we what to take a screen shot if test fails. 
		
		try {
			b.getScreenshot(result.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}
	


}
