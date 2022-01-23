package SearchingBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SearchingById {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "E:\\01_UDEMY\\SeleniumCourse\\Libraries\\Gheko\\geckodriver.exe");
		driver = new FirefoxDriver();
		String baseUrl = "https://www.testingcolombia.com";
		
		driver.get(baseUrl);
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[@class='sidebar']//input[@id='s']")).sendKeys("nunit");
		driver.findElement(By.xpath("//div[@class='sidebar']//button[@type='submit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Nunit 3.0 parte – 6')]")).click();
		
		

		//driver.findElement(By.xpath("//div[@class='FPdoLc VlcLAe']//input[@value='Buscar con Google']")).click();;
	}

}
