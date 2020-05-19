package practicePrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumBasicProgram {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://adactin.com//HotelAppBuild2//");
		driver.navigate().refresh();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.quit();
		//driver.close();
		driver.findElement(By.xpath("//img[contains(@src,'img/Hotel1.jpg')]"));
		driver.findElement(By.xpath("//input[@name='username']/following::input[@name='password']")).sendKeys("testtester");
		driver.findElement(By.xpath("//input[@name=''password']/preceding::input[@name='username']")).sendKeys("testtester");
		

	}

}
