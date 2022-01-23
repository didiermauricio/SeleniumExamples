package Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitTypes {
	WebDriver driver;
	
	public WaitTypes(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public WebElement waitForElement(By locator, int timeout)
	{
		WebElement element = null;
		try 
		{
			System.out.println("Waiting for max: "+timeout+" Seconds for elemnt to be available");
			WebDriverWait wait = new WebDriverWait(driver, 5);
			element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));			
		} 
		catch (Exception e) {
			System.out.println("Element not appeared on the web page");			
		}
		return element;
	}
	public void clickWhenReady(By locator, int timeout)
	{
		WebElement element = null;
		
		try 
		{
			System.out.println("Waiting for max: "+timeout+" seconds");
			WebDriverWait wait = new WebDriverWait(driver, 10);
			element = wait.until(ExpectedConditions.elementToBeClickable(locator));
			element.click();
			System.out.println("Element appeared on the web page");
		} 
		catch (Exception e) 
		{
			System.out.println("Element not appear on the web page");
		} 		
	}
}
