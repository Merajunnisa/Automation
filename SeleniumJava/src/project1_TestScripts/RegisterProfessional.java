package project1_TestScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import project1_HelperClass.BasicPage;
import project1_PageObjects.Personal;
import project1_PageObjects.TellMeAboutYourself;

public class RegisterProfessional extends BasicPage{

	public static void main(String[] args) {
		launchApp();
		TellMeAboutYourself obj1=new TellMeAboutYourself();
		Personal obj2=new Personal();
		
		element=driver.findElement(obj1.buttonProfessional);
		element.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
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
		driver.quit();

	}

}
