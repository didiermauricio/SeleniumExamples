import java.util.concurrent.TimeUnit;

import javax.xml.xpath.XPath;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UsingRadioButtonElement {

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
	public void test() {
		
		driver.get(baseUrl);
		
		WebElement bmwRadioButton = driver.findElement(By.xpath("//input[@id='bmwradio']"));
		WebElement benzRadioButton = driver.findElement(By.xpath("//input[@id='benzradio']"));
		WebElement hondaRadioButton = driver.findElement(By.xpath("//input[@id='hondaradio']"));
		
		if(!bmwRadioButton.isSelected()&&!benzRadioButton.isSelected()&&!hondaRadioButton.isSelected()) 
		{
			bmwRadioButton.click();
			benzRadioButton.click();
			hondaRadioButton.click();
		}
		
	}

}
