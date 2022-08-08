package Listners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerTstng  implements ITestListener{
	 @Override		
	    public void onFinish(ITestContext result) {					
	        // TODO Auto-generated method stub		
		 System.out.println("******tests compleleted******" +result.getName());
	        		
	    }		

	    @Override		
	    public void onStart(ITestContext result) {					
	        // TODO Auto-generated method stub				
	        		
	    }		

	    @Override		
	    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {					
	        // TODO Auto-generated method stub				
	        		
	    }		

	    @Override		
	    public void onTestFailure(ITestResult result) {					
	        // TODO Auto-generated method stub				
	    	System.out.println("******test failed******" +result.getName());
	    }		

	    @Override		
	    public void onTestSkipped(ITestResult result) {					
	        // TODO Auto-generated method stub				
	    	System.out.println("******test skipped******" +result.getName()); 		
	    }		

	    @Override		
	    public void onTestStart(ITestResult result) {					
	        // TODO Auto-generated method stub	
	    	System.out.println("******test start******" +result.getName());
	        		
	    }		

	    @Override		
	    public void onTestSuccess(ITestResult result) {					
	        // TODO Auto-generated method stub	
	    	System.out.println("******test Success******" +result.getName());
	        		
	    }		
}
