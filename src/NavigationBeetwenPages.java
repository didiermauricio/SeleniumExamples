import java.util.concurrent.TimeUnit;

import javax.xml.xpath.XPath;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigationBeetwenPages {

	WebDriver driver;
	String baseUrl;
	
	@Before
	public void setUp() throws Exception {
		
		baseUrl = "https://www.testingcolombia.com/";
		
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
				
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void test() {
		driver.get(baseUrl);
		String title = driver.getTitle();
		System.out.println("Title is: " + title);
		String CurrentUrl = driver.getCurrentUrl();
		System.out.println("Current Url is: "+CurrentUrl);
		driver.navigate().to("https://www.testingcolombia.com/47-2/");
		
		title = driver.getTitle();
		System.out.println("Title is: " + title);
		CurrentUrl = driver.getCurrentUrl();
		System.out.println("Current Url is: "+CurrentUrl);
		
		driver.navigate().back();
	}

}
