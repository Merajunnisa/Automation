package practicePrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://jqueryui.com//droppable//");
		driver.switchTo().frame(0);
		Actions actions=new Actions(driver);
		actions.clickAndHold(driver.findElement(By.id("draggable"))).moveToElement(driver.findElement(By.id("droppable"))).release().build().perform();

	}

}
