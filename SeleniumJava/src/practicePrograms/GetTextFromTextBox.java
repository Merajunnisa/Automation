package practicePrograms;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextFromTextBox {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://adactin.com//HotelAppBuild2//");
		driver.findElement(By.name("username")).sendKeys("testtester");
		String un = driver.findElement(By.name("username")).getAttribute("value");
		System.out.println(un);
		driver.quit();

	}

}
