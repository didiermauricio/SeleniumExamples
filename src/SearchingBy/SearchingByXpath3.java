package SearchingBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SearchingByXpath3 {

	public static void main(String[] args) {
		
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "E:\\01_UDEMY\\SeleniumCourse\\Libraries\\Gheko\\geckodriver.exe");
		driver = new FirefoxDriver();
		String baseUrl = "http://dhtmlx.com/docs/products/dhtmlxGrid/";
		
		driver.get(baseUrl);
		
		//String result = driver.findElement(By.xpath("//table[@id='product']//td[contains(text(),'30')]")).getText();
		
		//System.out.println(result);
		
		
	}

}
