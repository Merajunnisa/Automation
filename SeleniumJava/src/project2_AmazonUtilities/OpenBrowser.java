package project2_AmazonUtilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {
	
	public WebDriver driver;
	
	public void startBrowser(String sBrowser) throws InterruptedException {
		if(sBrowser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "F:\\Adactin\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
		}else if(sBrowser.equalsIgnoreCase("IE")) {
			System.setProperty("webdriver.chrome.driver", "F:\\Adactin\\IEDriverServer.exe");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
		}else {
			System.out.println("Invalid browser name");
		}
	}

}
