package practicePrograms;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGExample {
	
	@BeforeClass
	public void method1() {
		System.out.println("Before Class");
	}
	
	@BeforeMethod
	public void method2() {
		System.out.println("Before Method");
	}
	
	@Test(priority=2)
	public void method3() {
		System.out.println("Test 1");
	}
	
	@AfterMethod
	public void method4() {
		System.out.println("After Method");
	}
	
	@AfterClass
	public void method5() {
		System.out.println("After Class");
	}
	
	@Test(priority=1)
	public void method6() {
		System.out.println("Test 2");
	}
	

}
