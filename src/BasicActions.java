import java.util.concurrent.TimeUnit;

import javax.xml.xpath.XPath;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class BasicActions {

	WebDriver driver;
	String baseUrl;
	
	@Before
	public void setUp() throws Exception {
		
		baseUrl = "http://letskodeit.teachable.com/";
		
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
		
		driver.findElement(By.xpath("//a[@class='navbar-link fedora-navbar-link']")).click();
		System.out.println("Click On Login Menu");
		
		driver.findElement(By.xpath("//input[@id='user_email']")).sendKeys("test@email.com");
		System.out.println("Writing user Email");
		
		driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("test");
		System.out.println("Writing user Password");
		
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		System.out.println("Click On Login button");
		
		
		
	}

}
