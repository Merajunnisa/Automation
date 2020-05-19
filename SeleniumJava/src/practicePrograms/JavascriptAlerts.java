package practicePrograms;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptAlerts {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://primusbank.qedgetech.com//");
		driver.findElement(By.xpath("//input[@id='txtuId']")).sendKeys("Admin");
		driver.findElement(By.name("login")).click();
		//1) void dismiss() // To click on the &#39;Cancel&#39; button of the alert.
		//driver.switchTo().alert().dismiss();

		//2) void accept()
		// To click on the &#39;OK&#39; button of the alert.
		//driver.switchTo().alert().accept();
		//3) String getText() // To capture the alert message.
		String a=driver.switchTo().alert().getText();
		System.out.println(a);
		//4) void sendKeys(String stringToSend) // To send some data to alert box.

		//driver.switchTo().alert().sendKeys("Text");

	}

}
