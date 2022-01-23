package Wait;
import java.awt.List;
import java.util.concurrent.TimeUnit;

import javax.xml.xpath.XPath;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class UsingImplicitWait {

	WebDriver driver;
	String baseUrl;
	
	@Before
	public void setUp() throws Exception {
		
		baseUrl = "https://letskodeit.teachable.com/p/practice";
		
		driver = new FirefoxDriver();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
				
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		driver.get(baseUrl);
				
		driver.findElement(By.xpath("//a[@class='navbar-link fedora-navbar-link']")).click();
		driver.findElement(By.id("user_email")).sendKeys("Didier");
		
		
	}

}
