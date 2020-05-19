package practicePrograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class CrossBrowserProgram {
	/*
	public static WebDriver driver;
	public static WebElement element;
	
	public void cBrowser(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
		}else if(browser.equalsIgnoreCase("IE")){
			driver=new InternetExplorerDriver();
		}else {
			driver=new ChromeDriver();
		}
	}

	public static void main(String[] args) throws Exception {
		CrossBrowser obj1=new CrossBrowser();
		obj1.cBrowser("chrome");
		driver.get("http://adactin.com//HotelAppBuild2//");
		element=driver.findElement(By.name("username"));
		element.sendKeys("testtester");
		element= driver.findElement(By.name("password"));
		element.sendKeys("tester");
		element=driver.findElement(By.name("login"));
		element.click();

		boolean a=driver.findElement(By.name("location")).isDisplayed();

		if(a=true) {
		System.out.println("login passed");
		}else {
		System.out.println("login failed");
		}
		driver.quit();

	}
	*/
	
	public static WebDriver driver;
	public void cbrowser(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
		}else if(browser.equalsIgnoreCase("IE")) {
			driver=new InternetExplorerDriver();
		}
	}
	
	public static void main(String[] args) {
		
	CrossBrowserProgram obj=new CrossBrowserProgram();
	obj.cbrowser("chrome");
	driver.get("http://adactin.com//HotelAppBuild2//");
	driver.findElement(By.name("username")).sendKeys("testtester");
	driver.findElement(By.name("password")).sendKeys("tester");
	driver.findElement(By.name("login")).click();

	int a=driver.findElements(By.name("location")).size();
	if(a!=0) {
	System.out.println("login passed");
	}else {
	System.out.println("login failed");
	}
	driver.quit();
	}

}
