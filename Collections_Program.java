package practicePrograms;
import java.awt.AWTException;
import java.awt.HeadlessException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


public class Collections_Program {
	  
	public static void main(String[] args) {
		List<String> al = new ArrayList<String>();
		al.add("Meraj");
		al.add("Mehar");
		al.add("Minhaj");
		System.out.println(al);
		
		al.remove("Meraj");
		System.out.println(al);
		
		Employee e1=new Employee("meraj",27,"QA");
		Employee e2=new Employee("Mehar",54,"Home Maker");
		Employee e3=new Employee("Minhaj",28,"Developer");
		
		List<Employee> emp=new ArrayList<Employee>();
		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		Iterator<Employee> it= emp.iterator();
		while(it.hasNext()) {
			Employee e=it.next();
			System.out.println(e.name);
			System.out.println(e.EmpId);
			System.out.println(e.desg);
		}
		
		Map<Integer,String> m = new HashMap<Integer,String>();
		m.put(100, "Minhaj");
		m.put(200, "Meraj");
		m.put(300, "Mehar");
		System.out.println(m);
		
		System.out.println(m.get(200));
		
		for(Entry e:m.entrySet()) {
			System.out.println(e.getKey()+","+e.getValue());
		}
		
		Map<Integer,Employee> m1 = new HashMap<Integer,Employee>();
		m1.put(1, e1);
		m1.put(2, e2);
		m1.put(3, e3);
		
		for(Entry e4:m1.entrySet()) {
			System.out.println(e4.getKey());
			Employee e5=(Employee) e4.getValue();
			System.out.println(e5.name+","+e5.EmpId+","+e5.desg);
			
		}
		
		Hashtable ht = new Hashtable();
		ht.put("A","Meraj");
		ht.put("B", "Minhaj");
		ht.put("C", "Mehar");
		ht.put("D", "Meraj");
		
		Enumeration e=ht.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
	}
}
