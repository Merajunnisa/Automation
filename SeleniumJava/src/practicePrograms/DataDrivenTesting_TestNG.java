package practicePrograms;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenTesting_TestNG {
	WebDriver driver;
	WebElement element;
	
	@DataProvider(name="Adactin")
	public Iterator<Object[]> passData() throws IOException {
		File src=new File("F:\\TestData.xlsx");
		FileInputStream fis=new FileInputStream(src);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheetAt(0);
		int rc= sheet.getLastRowNum();
		//String[][] array=new String[rc+1][2];
		ArrayList<Object[]> ob = new ArrayList<Object[]>();
		for(int i=0; i<=rc; i++) {
			String un=sheet.getRow(i).getCell(0).getStringCellValue();
			String pwd=sheet.getRow(i).getCell(1).getStringCellValue();
			//array[i][0]=un;
			//array[i][1]=pwd;
			Object[] object = {un,pwd};
			ob.add(object);
			System.out.println(un+" "+pwd);
		}
		System.out.println("data provider");
		//return array;
		return ob.iterator();
	}
		
		@Test(dataProvider="Adactin")
		public void loginTestNG(String un,String pwd) {
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
		
		@AfterMethod
		public void endSession() {
		driver.quit();
		}
	}
