package project2_AmazonPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import project2_AmazonUtilities.SafeActions;

public class LoginPage extends SafeActions{
	
	 public WebDriver driver;
	 public WebElement element;
	
	public LoginPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}
	
	public void userLogin(String username,String password) {
		element = driver.findElement(By.id("ap_email"));
		safeClearAndSendKeys(element, username);
		safeImplicitWait();
		element = driver.findElement(By.id("continue"));
		safeClick(element);
		element = driver.findElement(By.id("ap_password"));
		safeClearAndSendKeys(element,password);
		element =driver.findElement(By.id("signInSubmit"));
		safeClick(element);
	}
	
	public void verifyLogin(String expectedTitle) {
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
	}

}
