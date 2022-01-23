package BrowsersDemo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxDemo {

	public static void main(String[] args) {
		
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "D:\\\\JAVA_WORKSPACE\\\\Libraries\\Gheko\\geckodriver.exe");
		driver = new FirefoxDriver();
		String baseUrl = "http://www.google.com";
		
		driver.get(baseUrl);
		
		

	}

}
