package project1_HelperClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicPage {
	
	public static WebDriver driver;
	public static WebElement element;
	
	
	public static void launchApp() {
		driver=new ChromeDriver();
		driver.get("https://my.naukri.com//account//createaccount");
	}

}
