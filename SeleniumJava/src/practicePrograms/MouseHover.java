package practicePrograms;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com//");
		Thread.sleep(2000);
		Actions actions = new Actions(driver);
		WebElement element = driver.findElement(By.xpath("//input[@name='btnI']"));
		//actions.moveToElement(element).perform();
		actions.moveToElement(element).click().perform();

	}

}
