package practicePrograms;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SynchronizationProgram {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://primusbank.qedgetech.com//");
		driver.findElement(By.xpath("//input[@id='txtuId']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='txtPword']")).sendKeys("Admin");
		driver.findElement(By.name("login")).click();
		
		//webdriver wait
		WebDriverWait wait = new WebDriverWait(driver,10);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='customerServices.html']")));
		driver.findElement(By.xpath("//a[@href='customerServices.html']")).click();
		
		
		//Threads
		Thread.sleep(2000);
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//pageload timeout
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		

	}

}
