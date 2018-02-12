package Table;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class wiki {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\GYAAN\\Pictures\\geckodriver.exe");
		//System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "//chromedriver_win32//chromedriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath(".//*[@id='sb_ifc0']")).sendKeys("list of cms in odisha");
		driver.findElement(By.xpath(".//*[@id='sb_ifc0']")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='rso']/div[2]/div/div[1]/div/h3/a")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath(".//*[@id='mw-content-text']/table[4]/tbody/tr[2]/td[2]")).getText());	
	
	}

}
