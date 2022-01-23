package BrowsersDemo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class InternetExplorerDemo {

	public static void main(String[] args) {
		
		String baseUrl = "http://www.google.com";
		WebDriver driver;
		
		System.setProperty("webdriver.ie.driver", "D:\\\\JAVA_WORKSPACE\\\\Libraries\\IE\\IEDriverServer.exe");
		
		driver = new InternetExplorerDriver();
		driver.get(baseUrl);

	}

}
