package practicePrograms;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.xmlbeans.impl.xb.ltgfmt.TestCase.Files;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskScreenshot_Program {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.adactin.com//HotelAppBuild2");
		TakesScreenshot ts=(TakesScreenshot)driver;
		File login=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(login, new File("./Screenshots/login.png"));
		driver.quit();

	}
}
