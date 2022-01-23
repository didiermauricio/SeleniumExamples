
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import Wait.WaitTypes;

public class DatePickerExpediaExample {

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
		
		wt.clickWhenReady(By.xpath("/html//input[@id='package-departing-hp-package']"),5);
		//wt.clickWhenReady(By.xpath("/html[1]/body[1]/main[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/fieldset[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[4]/td[4]/a[1]"),10);
		WebElement calMonth = driver.findElement(By.xpath("//section[@class='cal-month'][position()=1]"));
		
		List<WebElement> allValidDates = calMonth.findElements(By.tagName("a"));
		
		Thread.sleep(3000);
		
		for(WebElement date : allValidDates)
		{
			if (date.getText().equals("30")) 
			{
				date.click();
				break;
			}
		}
		
		
	}
	
}