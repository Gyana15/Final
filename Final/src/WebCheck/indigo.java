package WebCheck;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class indigo {

	
	public static void main(String args[]) throws InterruptedException{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\GYAAN\\Pictures\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.goindigo.in/");
		driver.findElement(By.cssSelector("a[class='one-way-tab bw-trip-tabs']")).click();
		driver.findElement(By.xpath(".//*[@id='bookingflightTab']/div[2]/div[1]/ul[1]/li[2]/a")).click();
		Thread.sleep(1000);
	//	WebDriverWait wait = new WebDriverWait(driver, 15, 100);
	//		    wait.until(ExpectedConditions.alertIsPresent());
		//	    Alert alert=driver.switchTo().alert();
		driver.findElement(By.xpath(".//*[@id='globalModal']/div/div/div[3]/button")).click();
		Thread.sleep(5000);
		System.out.println(driver.findElement(By.xpath("//input[@placeholder='From']")).isDisplayed());
		System.out.println(driver.findElement(By.xpath(".//*[@id='oneWay']/form/div[1]/ul/li[1]/input[1]")).isDisplayed());
		driver.findElement(By.xpath(".//*[@id='oneWay']/form/div[1]/ul/li[1]/input[1]")).sendKeys("b"+"l"+"r");
		// TODO Auto-generated method stub
		//from(driver);
	}
		public static void from(WebDriver driver) throws InterruptedException{
		 int i=0;
	       while(i++<5)
	       {
	            try
	            {
	            	driver.findElement(By.cssSelector("input[placeholder='From']")).click();
	                break;
	            }
	            catch(ElementNotVisibleException e)
	            {
	              Thread.sleep(1000);
	              System.out.println("not found");
	              continue;
	            }
	       }
		
		
	//	driver.findElement(By.className("origins-value city-name-value valid")).sendKeys("bbi");
	}
}
