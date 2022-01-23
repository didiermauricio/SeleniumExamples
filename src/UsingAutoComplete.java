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

public class UsingAutoComplete {

	WebDriver driver;
	String baseUrl;
	
	@Before
	public void setUp() throws Exception {
		
		baseUrl = "https://letskodeit.teachable.com/p/practice";
		
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
	public void test() throws InterruptedException {
		driver.get(baseUrl);
		WebElement element = driver.findElement(By.id("multiple-select-example"));
		Thread.sleep(3000);
		Select select = new Select(element);
		select.selectByValue("apple");
		select.selectByValue("peach");
		
		java.util.List<WebElement> options = select.getOptions();
		int size = options.size();
		
		for (int i = 0; i<=size; i++)
		{
			System.out.println(options.get(i).getText());
		}
		
	}

}
