package miniproject;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchPage {
	
	public WebDriver driver;
	
	public SearchPage(WebDriver driver) {
		
		this.driver = driver;
	}
	
	//Clicking the SortBy drop down and selecting popularity
	
	public void clickingSortby() {
		
		driver.findElement(By.xpath("//div[@class='sort-drop clearfix']")).click();
		System.out.println("Clicked on sortby dropdown");
	}
	
	public void selectingpopularity() {
		
		driver.findElement(By.xpath("//li[@data-sorttype='plrty']")).click();
		System.out.println("Selected popularity from dropdown");
	}
	
	//Entering values in the text box and clicking go button
	
	public void clearingValues() {
		
		driver.findElement(By.cssSelector("input[name=\"fromVal\"]")).clear();
		driver.findElement(By.cssSelector("input[name=\"toVal\"]")).clear();		
	}
	
	public void enteringValues() {
		
		driver.findElement(By.cssSelector("input[name=\"fromVal\"]")).sendKeys("value","700");
		driver.findElement(By.cssSelector("input[name=\"toVal\"]")).sendKeys("value","1400");
		System.out.println("Entered the value in the textbox");
	}
	
	public void clickingGo() {
		
		driver.findElement(By.xpath("//div[@class='price-go-arrow btn btn-line btn-theme-secondary']")).click();
		System.out.println("Clicked on the go button\n");
	}
	
	//Printing list of top five bluetooth headphones
	
	public void getlist() throws InterruptedException {
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'True Wireless Earbuds')]")));
		
		Thread.sleep(3000);
		
		List <WebElement> listHeadphone = driver.findElements(By.className("product-desc-rating"));	
		
		int i = 1;
		for(WebElement s : listHeadphone) {
			
			String bname = s.findElement(By.cssSelector("p.product-title")).getText();
			String bprice = s.findElement(By.cssSelector("span[display-price]")).getText();

			System.out.println("\nName of headphone "+i+" : " + bname);
			System.out.println("Price of headphone : " + bprice + "\n");

			i++;
			
			if(i==6) {
				break;
			}
		}
		System.out.println("List is printed");	
	}
}


