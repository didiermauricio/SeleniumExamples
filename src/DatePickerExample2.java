
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import Wait.WaitTypes;

public class DatePickerExample2 {

	WebDriver driver;
	String baseUrl;
	WaitTypes wt;
	
	@Before
	public void setUp() throws Exception {
		
		baseUrl = "https://www.expedia.com/";
		
		driver = new FirefoxDriver();
		wt = new WaitTypes(driver);
		driver.manage().window().maximize();
				
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		//driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		
		driver.get(baseUrl);
		WaitTypes wt = new WaitTypes(driver);
		
		wt.clickWhenReady(By.xpath("//button[@id='tab-flight-tab-hp']"),5);
		wt.clickWhenReady(By.xpath("//input[@id='flight-departing-hp-flight']"),5);
		wt.clickWhenReady(By.xpath("//div[@class='col gcw-date-field']//div[2]//table[1]//tbody[1]//tr[5]//td[3]//button[1]"),10);
		
		
	}
	
}
