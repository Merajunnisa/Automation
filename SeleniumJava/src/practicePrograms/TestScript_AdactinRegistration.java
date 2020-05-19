package practicePrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class TestScript_AdactinRegistration {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://adactin.com//HotelAppBuild2//");
		driver.manage().window().maximize();
		driver.findElement(By.name("username")).sendKeys("testtester");
		Thread.sleep(1000);
		driver.findElement(By.name("username")).clear();
		driver.findElement(By.name("username")).sendKeys("testtester");
		driver.findElement(By.name("password")).sendKeys("tester");
		Thread.sleep(1000);
		driver.findElement(By.id("login")).click();
		new Select(driver.findElement(By.xpath("//select[@name='location']"))).selectByVisibleText("London");
		new Select(driver.findElement(By.xpath("//select[@id='hotels']"))).selectByVisibleText("Hotel Creek");
		new Select(driver.findElement(By.xpath("//select[@name='room_type' or @id='room_type']"))).selectByVisibleText("Double");
		new Select(driver.findElement(By.xpath("//select[@name='room_nos' and @id='room_nos']"))).selectByVisibleText("2 - Two");
		driver.findElement(By.cssSelector("input[name=datepick_in]")).clear();
		driver.findElement(By.cssSelector("input[name=datepick_in]")).sendKeys("18/07/2018");
		driver.findElement(By.cssSelector("input[name=datepick_out]")).clear();
		driver.findElement(By.cssSelector("input[name=datepick_out]")).sendKeys("20/07/2018");
		new Select(driver.findElement(By.name("adult_room"))).selectByVisibleText("2 - Two");
		new Select(driver.findElement(By.id("child_room"))).selectByVisibleText("2 - Two");
		driver.findElement(By.xpath("//input[@name='Submit']")).click();
		driver.findElement(By.id("radiobutton_0")).click();
		driver.findElement(By.name("continue")).click();
		driver.findElement(By.name("first_name")).sendKeys("Ruby");
		driver.findElement(By.name("last_name")).sendKeys("Nisha");
		driver.findElement(By.name("address")).sendKeys("Hyd");
		driver.findElement(By.xpath("//input[@name='cc_num']")).sendKeys("1234567890123456");
		new Select(driver.findElement(By.xpath("//select[@name='cc_type']"))).selectByVisibleText("VISA");
		new Select(driver.findElement(By.xpath("//select[@name='cc_exp_month']"))).selectByVisibleText("July");
		new Select(driver.findElement(By.xpath("//select[@id='cc_exp_year']"))).selectByVisibleText("2020");
		driver.findElement(By.name("cc_cvv")).sendKeys("420");
		driver.findElement(By.name("book_now")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='my_itinerary']")).click();
		driver.findElement(By.xpath("//input[@value='216493']")).click();
		driver.findElement(By.xpath("//input[@value='Cancel 4MJZMWZO3O']")).click();
		driver.switchTo().alert().dismiss();
		driver.findElement(By.xpath("//input[@value='216493']")).click();
		driver.findElement(By.xpath("//input[@value='Cancel 4MJZMWZO3O']")).click();
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Logout")).click();
		driver.quit();
	}

}
