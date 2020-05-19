package project2_AmazonUtilities;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SafeActions {
	public WebDriver driver;
	public WebElement element;	
	
	public SafeActions() {
	}
	
	public SafeActions(WebDriver driver) {
		 this.driver = driver;
	}
	
	public void safeClick(WebElement element) {
		element.click();
	}
	
	public String safeSendKeys(WebElement element, String text) {
		element.sendKeys(text);
		return text;
	}
	
	public String safeClearAndSendKeys(WebElement element, String text) {
		element.clear();
		element.sendKeys(text);
		return text;
	}
	
	public String safeGetText(WebElement element) {
		return element.getText();
	}
	
	public String safeGetAttribute(WebElement element, String attribute) {
		return element.getAttribute(attribute);
	}
	
	public void safeClicks(List<WebElement> elements) {
		for(int i=0; i<elements.size(); i++) {
			elements.get(i).click();
		}
	}
	
	public void safeMaximize() {
		driver.manage().window().maximize();
	}
	
	public void safeImplicitWait() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	public void safeExplicitWait(WebDriver driver, String locatorType, String locatorValue) {
		if(locatorType.equalsIgnoreCase("id")) {
			WebDriverWait w = new WebDriverWait(driver, 10);
			w.until(ExpectedConditions.visibilityOfElementLocated(By.id(locatorValue)));
		}else if(locatorType.equalsIgnoreCase("xpath")) {
			WebDriverWait w = new WebDriverWait(driver, 10);
			w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locatorValue)));
		}else if(locatorType.equalsIgnoreCase("name")) {
			WebDriverWait w = new WebDriverWait(driver, 10);
			w.until(ExpectedConditions.visibilityOfElementLocated(By.name(locatorValue)));
		}else {
			System.out.println("wrong input");
		}
		
	}

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getElement() {
		return element;
	}

	public void setElement(WebElement element) {
		this.element = element;
	}

}
