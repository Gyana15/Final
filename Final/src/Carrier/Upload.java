package Carrier;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Upload {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\GYAAN\\Pictures\\geckodriver.exe");
		//System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "//chromedriver_win32//chromedriver.exe");
		WebDriver driver=new FirefoxDriver();
		try{
			driver.manage().timeouts().setScriptTimeout(20, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
		driver.get("https://www.gmail.com/");
		driver.findElement(By.id("Email")).sendKeys("15gyana");
		driver.findElement(By.id("Email")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.id("Passwd")).sendKeys("sweatheart");
		driver.findElement(By.id("Passwd")).sendKeys(Keys.ENTER);
		Thread.sleep(6000);
		driver.findElement(By.xpath("//div[@class='T-I J-J5-Ji T-I-KE L3']")).click();
		Thread.sleep(4000);
		WebElement upload=driver.findElement(By.xpath("//div[@class='a1 aaA aMZ']"));
		System.out.println(upload.isDisplayed());
		//take a screenshot
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		//save the screenshot in png format on the disk.
		FileUtils.copyFile(scrFile, new File("C:\\Users\\GYAAN\\Desktop\\screenshot.png"));
		upload.click();
		upload.sendKeys("C:\\Users\\GYAAN\\Desktop\\Chai Resto Bill.xlsx");
		Thread.sleep(2000);
		}
		catch(Exception E){
			System.out.println(E.toString());
		}
	}

}
