import java.util.concurrent.TimeUnit;

import javax.xml.xpath.XPath;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckElementStatus {

	WebDriver driver;
	String baseUrl;
	
	@Before
	public void setUp() throws Exception {
		
		baseUrl = "http://google.com/";
		
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
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
		driver.findElement(By.xpath("/html//form[@id='tsf']//div[@class='a4bIc']/input[@role='combobox']")).sendKeys("Millos vence al real madrid");
		WebElement searchBox =  driver.findElement(By.xpath("//div[@class='FPdoLc VlcLAe']//input[@value='Buscar con Google']"));
		
		
		if(searchBox.isDisplayed() && searchBox.isSelected())
		{
			driver.findElement(By.xpath("/html//form[@id='tsf']//div[@class='A8SBwf emcav']/div[@class='UUbT9']//input[@name='btnK']")).click();;
			System.out.println("Element found and used");
		}
		else
		{
			System.out.println("Element is not ready for working");
		}
		
	}

}
