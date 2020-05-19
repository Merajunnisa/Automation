package project2_AmazonTestSuites;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import project2_AmazonPages.HomePage;
import project2_AmazonPages.LoginPage;
import project2_AmazonUtilities.OpenBrowser;

public class TC001_WishListAndAddToCart extends OpenBrowser{
	
	@BeforeMethod
	public void browser() throws InterruptedException {
		startBrowser("chrome");
	}
	
	@Test
	public void searchProduct() throws InterruptedException {
		try {
			Properties configProperties = new Properties();
			FileInputStream fis = new FileInputStream(new File("F:\\Adactin\\amazonTestDataFiles\\TC001_WishListAndAddToCart.properties"));
			configProperties.load(fis);
				driver.get(configProperties.getProperty("url"));
				Thread.sleep(5000);
				
				HomePage homePage = new HomePage(driver);
				homePage.clickOnLogin();
				homePage.safeImplicitWait();
				
				LoginPage loginPage = new LoginPage(driver);
				loginPage.userLogin(configProperties.getProperty("username"), configProperties.getProperty("password"));
				homePage.safeImplicitWait();
				loginPage.verifyLogin(configProperties.getProperty("expectedTitle"));
				System.out.println("Login successful");
				Thread.sleep(3000);
				homePage.clickOnLogout();
				Thread.sleep(3000);
		}
			catch (IOException e) {
				e.printStackTrace();
				System.out.println("Login Unsuccessful");
			}
	}
	
	@AfterMethod
	public void endBrowser() {
		driver.quit();
	}

}
