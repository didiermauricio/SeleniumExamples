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

public class UsingDropDownElement {

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

		boolean isChecked = false;
		driver.get(baseUrl);
		java.util.List<WebElement> carsList = driver
				.findElements(By.xpath("//input[contains(@type,'radio') and contains(@name,'cars')]"));
		int size = carsList.size();
		for (int i = 0; i <= size; i++) {
			isChecked = carsList.get(i).isSelected();
			System.out.println(isChecked);

			if (!isChecked) {
				carsList.get(i).click();
				Thread.sleep(2000);
			}
		}
	}

}
