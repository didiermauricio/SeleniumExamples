package Wait;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ExplicitWaitWithUtilityDemo {

	WebDriver driver;
	String baseUrl;
	WaitTypes wt;
	
	@Before
	public void setUp() throws Exception {
		
		baseUrl = "https://letskodeit.teachable.com/p/practice";
		
		driver = new FirefoxDriver();
		wt = new WaitTypes(driver);
		driver.manage().window().maximize();
				
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.quit();
	}

	@Test
	public void test() {
		
		driver.get(baseUrl);
		WebElement loginLink = driver.findElement(By.linkText("Login"));
		loginLink.click();
		
		WebElement emailField = wt.waitForElement(By.id("user_email"), 5);
		emailField.sendKeys("test");		
		
	}
	
}
