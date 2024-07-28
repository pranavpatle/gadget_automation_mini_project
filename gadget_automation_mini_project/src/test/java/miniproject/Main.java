package miniproject;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Main {
	
	static WebDriver driver;
	Scanner sc = new Scanner(System.in);
	
	void driverSetup() {
		
		System.out.println("Enter the choice of Browser:\n1.Chrome\n2.Edge");
		System.out.println("Enter your choice:");
		int choice = sc.nextInt();
		
		if(choice==1) {
			driver = new ChromeDriver();
		}
		else if (choice==2) {
			driver = new EdgeDriver();
		}
	}
	
	void openBrowser() {
		
	driver.get("https://www.snapdeal.com/");
	System.out.println("\nOpen browser");
	
	driver.manage().window().maximize();
	System.out.println("Maximize the window");
	}
	
	void enterText() {
		
		HomePage operation = new HomePage(driver);
		operation.enteringText();
	}
	
	void clcikSearch() {
		
		HomePage operation = new HomePage(driver);
		operation.clickingSearch();
	}

	void clickSortby() {
		
		SearchPage searching = new SearchPage(driver);
		searching.clickingSortby();
	}
	
	void selectPopularity() {
		
		SearchPage searching = new SearchPage(driver);
		searching.selectingpopularity();
	}
	
	void clearValues() {
		
		SearchPage searching = new SearchPage(driver);
		searching.clearingValues();
	}	
	
	void enterValues() {
		
		SearchPage searching = new SearchPage(driver);
		searching.enteringValues();
	}
	
	void clickGo() {
		
		SearchPage searching = new SearchPage(driver);
		searching.clickingGo();
	}	
	
	void printlist() throws InterruptedException {
		
		SearchPage printlist = new SearchPage(driver);
		printlist.getlist();
	}
	
	void closeBrowser() {
		
		driver.quit();
	}

	public static void main(String[] args) throws InterruptedException {
		
		Main test = new Main();
		
		test.driverSetup();
		test.openBrowser();
		
		test.enterText();
		test.clcikSearch();
		
		test.clickSortby();
		test.selectPopularity();
		
		test.clearValues();
		test.enterValues();
		test.clickGo();
		
		test.printlist();
		
		test.closeBrowser();
	}
}

