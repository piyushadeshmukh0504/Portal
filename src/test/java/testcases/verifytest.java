package testcases;

import java.time.Duration;

import org.testng.annotations.Test;

import pageobjectmodule.studentforum;
import resource.baseclass;

public class verifytest extends baseclass {

	
	@Test
	public static void verifystudentforum() throws InterruptedException{
		 

		studentforum obj=new studentforum(driver);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
			 
			obj.studentformsClick().click();
			
			Thread.sleep(3000);
			obj.nextbuttonClick().click();
			
			Thread.sleep(3000);
			obj.prevbuttonClick().click();
			Thread.sleep(3000);
			obj.askquesClick().click(); 
			 
		 }
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

