package practicePrograms;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


public class IRCC_Login {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.canada.ca//en//immigration-refugees-citizenship//services//application//account.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement e = driver.findElement(By.xpath("//a[text()='Continue to GCKey']"));
		js.executeScript("arguments[0].scrollIntoView();", e);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		e.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@title='Mandatory - Enter your username.']")).clear();
		driver.findElement(By.xpath("//input[@title='Mandatory - Enter your username.']")).sendKeys("meraj");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@type='password']")).clear();
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("******");
		driver.findElement(By.xpath("//button[text()='Sign In']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='_eventId_continue']")).click();
		WebElement e1 = driver.findElement(By.xpath("//input[@title='I Accept']"));
		js.executeScript("arguments[0].scrollIntoView();", e1);
		e1.click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String val = driver.findElement(By.xpath("//label/strong[1]")).getText();
		if(val.equalsIgnoreCase("\"Year that I graduated from degree\"")) {
			driver.findElement(By.xpath("//input[@id='answer']")).clear();
			driver.findElement(By.xpath("//input[@id='answer']")).sendKeys("****");
		}
		else if(val.equalsIgnoreCase("\"My sister-in-law's name\"")) {
			driver.findElement(By.xpath("//input[@id='answer']")).clear();
			driver.findElement(By.xpath("//input[@id='answer']")).sendKeys("*****");
		}
		else if(val.equalsIgnoreCase("\"First school that I attended\"")) {
			driver.findElement(By.xpath("//input[@id='answer']")).clear();
			driver.findElement(By.xpath("//input[@id='answer']")).sendKeys("*******");
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("F:\\Adactin\\Screenshots\\IRCC_Application.png"));
		
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Logout")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='_continue']")).click();
		driver.quit();
	}

}
