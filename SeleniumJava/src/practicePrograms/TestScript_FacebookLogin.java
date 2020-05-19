package practicePrograms;
import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class TestScript_FacebookLogin {
	

	public static void main(String[] args) throws Throwable{
		FileInputStream fis = new FileInputStream("F:\\Adactin\\meraj.properties");
		Properties p = new Properties();
		p.load(fis);
		
		ExtentReports report = new ExtentReports("F:\\Adactin\\Report.html");
		ExtentTest logger = report.startTest("Verify Login");
		
		WebDriver driver = new ChromeDriver();
		logger.log(LogStatus.INFO, "Browser Started");
		driver.get(p.getProperty("URL"));
		logger.log(LogStatus.INFO, "Application is Running");
		driver.findElement(By.xpath(p.getProperty("Uname.path"))).sendKeys(p.getProperty("Uname"));
		logger.log(LogStatus.INFO, "Username is entered");
		driver.findElement(By.xpath(p.getProperty("Pwd.path"))).sendKeys(p.getProperty("Pwd"));
		logger.log(LogStatus.INFO, "Password is entered");
		driver.findElement(By.xpath(p.getProperty("login.path"))).click();
		String act_title = driver.getTitle();
	
		if(act_title.equals("Facebook")) {
			logger.log(LogStatus.PASS, "Login Successful");
		}else {
			logger.log(LogStatus.FAIL, "Login Unsuccessful");
			File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File("F:\\Adactin\\Screenshots\\LoginFail.png"));
		}
		report.endTest(logger);
		report.flush();
	}
}