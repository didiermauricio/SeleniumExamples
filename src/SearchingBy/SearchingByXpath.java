package SearchingBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SearchingByXpath {

	public static void main(String[] args) {
		
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "E:\\01_UDEMY\\SeleniumCourse\\Libraries\\Gheko\\geckodriver.exe");
		driver = new FirefoxDriver();
		String baseUrl = "http://www.google.com";
		
		driver.get(baseUrl);
		
		driver.findElement(By.xpath("//input[@title='Buscar']")).sendKeys("Didier");		

		driver.findElement(By.xpath("//div[@class='FPdoLc VlcLAe']//input[@value='Buscar con Google']")).click();;
	}

}
