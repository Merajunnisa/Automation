package practicePrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoOfFrames {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://in.yahoo.com//");
		List<WebElement> element=driver.findElements(By.xpath("//iframe"));
		System.out.println(element.size());

	}

}
