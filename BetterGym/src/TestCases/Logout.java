package TestCases;

import org.testng.annotations.Test;

public class Logout  {
	
	//TestLogin lg = new TestLogin();
	   
	      
	@Test
	public void BetterLogou(){
	
	TestLogin.driver.close();
		
	System.out.println("driver closed");  
	
	}
	
	
	

}
