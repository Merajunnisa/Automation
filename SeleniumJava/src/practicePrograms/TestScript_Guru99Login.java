package practicePrograms;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class TestScript_Guru99Login {

	public static void main(String[] args) throws IOException, InterruptedException {
		ExtentReports report = new ExtentReports("F:\\Adactin\\Guru99_LoginReport.html");
		ExtentTest logger = report.startTest("Guru99 bank login validation");
		
		System.setProperty("webdriver.chrome.driver","F:\\Adactin\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		logger.log(LogStatus.INFO, "Chrome driver launched");
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/V1/index.php");
		logger.log(LogStatus.INFO, "Webpage loaded");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("mngr171739");
		logger.log(LogStatus.INFO, "Username entered");
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("nEsede");
		logger.log(LogStatus.INFO, "Password entered");
		driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
		logger.log(LogStatus.INFO, "Login button clicked");
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		
		String act_title = driver.getTitle();
		if(act_title.contains("Manager")) {
			logger.log(LogStatus.PASS, "Login Successful");
			File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File("F:\\Adactin\\Screenshots\\Guru99Login_Passed.png"));

		}else {
			
			logger.log(LogStatus.FAIL, "Login Failed");
			File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File("F:\\Adactin\\Screenshots\\Guru99Login_Failed.png"));
		}
		report.endTest(logger);
		report.flush();
		
		driver.quit();
		

	}

}
