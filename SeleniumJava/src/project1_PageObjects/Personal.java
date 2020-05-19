package project1_PageObjects;

import org.openqa.selenium.By;

public class Personal {
	public By firstname= By.xpath("//input[@name='fname']");
	public By emailid= By.xpath("//input[@name='email']");
	public By password= By.xpath("//input[@name='password']");
	public By number= By.xpath("//input[@name='number']");
	public By expinyears= By.xpath("//input[@name='expYear']");
	public By expinmonths= By.xpath("//input[@name='expMonth']");
	public By uploadresume= By.xpath("//input[@name='uploadCV']");
	
}
