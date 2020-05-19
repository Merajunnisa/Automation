package practicePrograms;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SwitchBetweenTabs_Program {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://popuptest.com//goodpopups.html");
		driver.findElement(By.linkText("Good PopUp #3")).click();
		Set<String> handle = driver.getWindowHandles();
		
		Iterator<String> it = handle.iterator();
		
		String parentHandle = it.next();
			System.out.println(parentHandle);
			
		String childHandle = it.next();
			System.out.println(childHandle);
			
		driver.switchTo().window(childHandle);
		driver.getTitle();
		Thread.sleep(2000);
		driver.close();
		
		driver.switchTo().window(parentHandle);
		Thread.sleep(2000);
		driver.close();
		
	}

}
