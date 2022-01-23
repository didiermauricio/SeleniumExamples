package SearchingBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SearchingByXpath2 {

	public static void main(String[] args) {
		
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "E:\\01_UDEMY\\SeleniumCourse\\Libraries\\Gheko\\geckodriver.exe");
		driver = new FirefoxDriver();
		String baseUrl = "https://learn.letskodeit.com/p/practice";
		
		driver.get(baseUrl);
		
		String result = driver.findElement(By.xpath("//table[@id='product']//td[contains(text(),'30')]")).getText();
		
		
		System.out.println(result);
		
		result = driver.findElement(By.xpath("//table[@id='product']//td[contains(text(),'25')]")).getText();
		
		System.out.println(result);

		//driver.findElement(By.xpath("//div[@class='FPdoLc VlcLAe']//input[@value='Buscar con Google']")).click();;
	}

}
