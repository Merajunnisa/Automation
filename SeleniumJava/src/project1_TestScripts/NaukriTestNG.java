package project1_TestScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import project1_HelperClass.BasicPage;
import project1_PageObjects.Personal;
import project1_PageObjects.TellMeAboutYourself;

public class NaukriTestNG extends BasicPage{
	
	Personal obj2=new Personal();
	TellMeAboutYourself obj1=new TellMeAboutYourself();
	
	@BeforeClass
	public void applicationPage() {
		launchApp();
		System.out.println("Before Class");
	}
	
	@Test(priority=1)
	public void registration() {
		element=driver.findElement(obj1.buttonProfessional);
		element.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("Test 1");
	}
	
	@Test(priority=2)
	public void personalFields() {
		element=driver.findElement(obj2.firstname);
		element.sendKeys("Ruby");
		element=driver.findElement(obj2.emailid);
		element.sendKeys("ruby@gmail1.com");
		element=driver.findElement(obj2.password);
		element.sendKeys("ruby02");
		element=driver.findElement(obj2.number);
		element.sendKeys("9988776655");
		element=driver.findElement(obj2.expinyears);
		element.click();
		element=driver.findElement(By.xpath("//span[text()='1']"));
		element.click();
		element=driver.findElement(obj2.expinmonths);
		element.click();
		element= driver.findElement(By.xpath("//span[text()='2']"));
		element.click();
		element=driver.findElement(obj2.uploadresume);
		element.sendKeys("C:\\Users\\Minhaj Unnisa\\Downloads\\Form 16 - TCS.pdf");
		System.out.println("Test 2");
		
	}
	
	@AfterClass
	public void logout() {
		driver.quit();
		System.out.println("After Class");
	}
	

}
