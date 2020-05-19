package practicePrograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScript_NaukriDotCom {
	public static WebDriver driver;
	public static WebElement element;

	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.get("https://my.naukri.com//account//createaccount");
		element=driver.findElement(By.xpath("//button[text()='I am a Professional']"));
		element.click();
		element=driver.findElement(By.name("fname"));
		element.sendKeys("Ruby");
		element= driver.findElement(By.xpath("//input[@name='email']"));
		element.sendKeys("ruby@gmail1.com");
		element= driver.findElement(By.xpath("//input[@name='password']"));
		element.sendKeys("rubyduby");
		element= driver.findElement(By.xpath("//input[@name='number']"));
		element.sendKeys("8899776655");
		element= driver.findElement(By.xpath("//input[@name='expYear']"));
		element.click();
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		element= driver.findElement(By.xpath("//span[text()='1']"));
		element.click();
		element= driver.findElement(By.xpath("//input[@name='expMonth']"));
		element.click();
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		element= driver.findElement(By.xpath("//span[text()='2']"));
		element.click();
		element= driver.findElement(By.xpath("//input[@name='uploadCV']"));
		element.sendKeys("C:\\Users\\Minhaj Unnisa\\Downloads\\Form 16 - TCS.pdf");

	}

}
