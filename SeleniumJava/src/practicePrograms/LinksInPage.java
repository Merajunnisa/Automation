package practicePrograms;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksInPage {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://in.yahoo.com//");
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		for(WebElement myElement:links) {
			String link=myElement.getText();
			System.out.println(link);
		}

	}

}
