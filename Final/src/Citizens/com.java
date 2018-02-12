package Citizens;

import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class com {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\GYAAN\\Pictures\\geckodriver.exe");
			//System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "//chromedriver_win32//chromedriver.exe");
			WebDriver driver=new FirefoxDriver();
			driver.get("https://www.citizensbank.com/");
			//System.out.println(driver.getPageSource());
			WebElement drop=driver.findElement(By.xpath(".//*[@id='login_dropdown']"));
			//System.out.println(drop.isDisplayed());
			Thread.sleep(2000);
			//driver.switchTo().frame(2);
			System.out.println(driver.findElements(By.tagName("Select")).size());
			//System.out.println(frameList.size());
			//WebElement drop=driver.findElement(By.xpath("//select[@id='objContent0_ctl10_loginOption']"));
			//System.out.println(drop.size());
			//System.out.println(drop.get(3));
			//System.out.println(drop.indexOf(drop));
			//System.out.println(drop.isDisplayed());
			//System.out.println(drop.getTagName());
			//System.out.println(drop.isSelected());
			//System.out.println(drop.getText());
			//System.out.println(drop.findElements(By.xpath("//select[@id='objContent0_ctl10_loginOption']")));
			//System.out.println(drop.getSize());
			//Select oSelect=new Select(driver.findElement(By.xpath("//select[@id='objContent0_ctl10_loginOption']")));
			//Select oSelect=new Select(driver.findElement(By.xpath("//select[@class='select-custome best-fares-cities']")));
			//System.out.println(oSelect.getFirstSelectedOption());
			Select oSelect=new Select(drop);
			List <WebElement> elementCount=oSelect.getOptions();
			System.out.println(elementCount.size());

	}
}
