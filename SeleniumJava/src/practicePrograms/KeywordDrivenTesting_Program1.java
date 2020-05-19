package practicePrograms;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeywordDrivenTesting_Program1 {
	
	public static WebDriver driver;
	public static WebElement element;
	
	public void launch() throws InterruptedException  {
		driver=new ChromeDriver();
		driver.get("http://adactin.com//HotelAppBuild2//");
		Thread.sleep(2000);
	}
	
	public void login() throws IOException, Exception {	
		
		File src1=new File("F:\\TestData.xlsx");
		FileInputStream fis1=new FileInputStream(src1);
		XSSFWorkbook wb1=new XSSFWorkbook(fis1);
		XSSFSheet sheet1=wb1.getSheetAt(0);
		int rc1=sheet1.getLastRowNum();
		for(int j=0; j<=rc1; j++) {
			String un=sheet1.getRow(j).getCell(0).getStringCellValue();
			String pwd=sheet1.getRow(j).getCell(1).getStringCellValue();
		KeywordDrivenTesting_Program1 obj2=new KeywordDrivenTesting_Program1();
		obj2.launch();
		element=driver.findElement(By.name("username"));
		element.sendKeys(un);
		element=driver.findElement(By.name("password"));
		element.sendKeys(pwd);
		element=driver.findElement(By.name("login"));
		element.click();
		Thread.sleep(1000);
		int a=driver.findElements(By.name("location")).size();
		if(a!=0) {
			System.out.println("login successful");
			driver.quit();
		}else {
			System.out.println("login unsuccessful");
			driver.quit();
		}
		}
		wb1.close();
	}
	
	public void logout() {
		driver.quit();
	}
	

	public static void main(String[] args) throws Exception {
		File src=new File("f:\\Keywords.xlsx");
		FileInputStream fis=new FileInputStream(src);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheetAt(0);
		int rc=sheet.getLastRowNum();
		for(int i=0; i<=rc; i++) {
			String keyword=sheet.getRow(i).getCell(0).getStringCellValue();
			KeywordDrivenTesting_Program1 obj1=new KeywordDrivenTesting_Program1();
			if(keyword.equalsIgnoreCase("lh")) {
				obj1.launch();
			}
			else if(keyword.equalsIgnoreCase("ln")) {
				obj1.login();
			}
			else if(keyword.equals("lg")) {
				obj1.logout();
				System.out.println("logout");
			}
			else {
				System.out.println("invalid keyword");
			}
		}
	}

}
