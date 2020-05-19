package practicePrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableXpath_Program {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.toolsqa.com//automation-practice-table//");
		Thread.sleep(5000);
		List<WebElement> e=driver.findElements(By.xpath("//table[@class='tsc_table_s13']/tbody/tr"));
		String e1="Shanghai";
		for(int i=1; i<=e.size(); i++) {
			String e2=driver.findElement(By.xpath("//table[@class='tsc_table_s13']/tbody/tr["+i+"]/td[2]")).getText();
			//System.out.println(e2);
			if(e1.equalsIgnoreCase(e2)) {
				driver.findElement(By.xpath("//table[@class='tsc_table_s13']/tbody/tr["+i+"]/td[6]")).click();
			}
			
		}
		
		

		
	}

}
