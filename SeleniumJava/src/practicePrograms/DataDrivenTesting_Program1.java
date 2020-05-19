package practicePrograms;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataDrivenTesting_Program1 {
	
	public static WebDriver driver;
	public static WebElement element;
	public static void login(String un, String pwd) throws Exception {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://adactin.com//HotelAppBuild2//");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		element=driver.findElement(By.name("username"));
		element.sendKeys(un);
		element=driver.findElement(By.name("password"));
		element.sendKeys(pwd);
		element=driver.findElement(By.name("login"));
		element.click();
	}

	public static void main(String[] args) throws Exception {
		File src=new File("F:\\TestData.xlsx");
		FileInputStream input=new FileInputStream(src);
		XSSFWorkbook wb=new XSSFWorkbook(input);
		XSSFSheet sheet=wb.getSheetAt(0);
		int rc=sheet.getLastRowNum();
		for(int i=0; i<=rc; i++) {
			String un=sheet.getRow(i).getCell(0).getStringCellValue();
			String pwd=sheet.getRow(i).getCell(1).getStringCellValue();
			login(un,pwd);
			
			Thread.sleep(2000);
			int a=driver.findElements(By.name("location")).size();
			
			if(a!=0) {
			System.out.println("login passed");
			sheet.getRow(i).createCell(2).setCellValue("pass");
			FileOutputStream fos=new FileOutputStream(src);
			wb.write(fos);
			driver.quit();
			
			}else {
				
			System.out.println("login failed");
			sheet.getRow(i).createCell(2).setCellValue("fail");
			FileOutputStream fos=new FileOutputStream(src);
			wb.write(fos);
			driver.quit();
			}
		}
	
	wb.close();
}
}