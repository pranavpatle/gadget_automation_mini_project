package miniproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	public WebDriver driver;
	
	public HomePage(WebDriver driver) {
		
		this.driver = driver;
	}
	
	//Entering text in the search box and clicking search button
	public void enteringText() {
	
		driver.findElement(By.name("keyword")).sendKeys("Bluetooth headphone");
		System.out.println("Entered the text in search box");
	}
	
	public void clickingSearch() {
		
		driver.findElement(By.xpath("//button[@class='searchformButton col-xs-4 rippleGrey']")).click();
		System.out.println("Clicked on the search button");
	}
}


