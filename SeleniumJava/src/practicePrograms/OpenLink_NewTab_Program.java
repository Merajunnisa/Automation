package practicePrograms;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenLink_NewTab_Program {

	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    
	    driver.get("https://www.canadavisa.com/canada-immigration-discussion-board/threads/april-2018-aor-join-here.552109/page-469");
	    Thread.sleep(3000);
	    //String t = Keys.chord(Keys.CONTROL,Keys.RETURN);
	    driver.findElement(By.xpath("//a[text()='471']")).sendKeys(Keys.chord(Keys.CONTROL,Keys.RETURN));
	    ArrayList<String> tab = new ArrayList<String>(driver.getWindowHandles());
	    driver.switchTo().window(tab.get(1));

	}

}
