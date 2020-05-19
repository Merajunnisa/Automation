package practicePrograms;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicXpath {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.toolsqa.com//automation-practice-table//");
		Thread.sleep(5000);
		List<WebElement> e5=driver.findElements(By.xpath("//table[@class='tsc_table_s13']/tbody/tr"));
		//System.out.println(e5.size());
		String e3="Clock Tower Hotel";
		for(int j=1; j<=e5.size(); j++) {
			List<WebElement> e4 = driver.findElements(By.xpath("//table[@class='tsc_table_s13']/tbody/tr["+j+"]/th"));
			
			for(int x=0; x<e4.size(); x++) {
				System.out.println(e4.get(x));
			}
			
			/*
			if(e4.equalsIgnoreCase(e3)) {
				List<WebElement> e7=driver.findElements(By.xpath("//table[@class='tsc_table_s13']/tbody/tr["+j+"]/td"));
				for(int k=1; k<=e7.size(); k++) {
				String elements = driver.findElement(By.xpath("//table[@class='tsc_table_s13']/tbody/tr["+j+"]/td["+k+"]")).getText();
					System.out.println(elements);
				}
			}
			*/
			driver.quit();
		}

	}

}
