package project2_AmazonPages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import project2_AmazonUtilities.SafeActions;

public class HomePage extends SafeActions{
	
	public WebDriver driver;
	public WebElement element;
	
	public HomePage(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}
			
	public void clickOnLogin() throws InterruptedException {
		element = driver.findElement(By.id("nav-link-accountList"));
		safeClick(element);	
	}
	
	public void clickOnRegister() {
		element = driver.findElement(By.xpath("//*[text()'Start here.']"));
		safeClick(element);
	}
	
	public void clickOnLogout() {
		element = driver.findElement(By.xpath("//span[text()='Sign Out']"));
		safeClick(element);
	}
}
