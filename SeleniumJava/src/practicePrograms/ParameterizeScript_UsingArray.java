package practicePrograms;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParameterizeScript_UsingArray {

	public static void main(String[] args) {
		String a[][] = {{"testtester","tester"}, {"testtester","tester"}, {"testtester","tester"}, {"testtester","tester"}};
		for(int i=0; i<4; i++) {
			WebDriver driver = new ChromeDriver();
			driver.get("http://adactin.com//HotelAppBuild2//");
			driver.findElement(By.name("username")).sendKeys(a[i][0]);
			driver.findElement(By.name("password")).sendKeys(a[i][1]);
			driver.findElement(By.name("login")).click();
			driver.quit();
		}
	}

}
