package practicePrograms;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScript_getTitle {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://adactin.com//HotelAppBuild2//");
		System.out.println(driver.getTitle());
		System.out.println(driver.findElement(By.name("login")).isEnabled());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
		
		WebElement element = driver.findElement(By.name("login"));
		System.out.println(element.isDisplayed());
		driver.quit();

	}

}
