package WebCheck;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.setProperty("webdriver.gecko.driver", "C:\\Users\\GYAAN\\Pictures\\geckodriver.exe");
//WebDriver driver=new FirefoxDriver();
//driver.get("http://google.com/");
//driver.findElement(By.xpath(".//*[@id='gs_htif0']")).sendKeys("friends");
//WebElement element=driver.findElement(By.xpath(".//*[@id='gs_htif0']"));
//element.sendKeys(Keys.ENTER);
//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//driver.findElement(By.xpath(".//*[@id='rso']/div/div[1]/div/h3/a")).click();
		int i=10;
		while(i>0){
			i=i*(i-1);
					System.out.println(i);
			i--;
		}
	}

}
