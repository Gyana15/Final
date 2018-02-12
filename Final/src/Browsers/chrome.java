package Browsers;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.gargoylesoftware.htmlunit.BrowserVersion;

public class chrome {
	@Test
	public void browse() {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "//chromedriver_win32//chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\GYAAN\\Pictures\\geckodriver.exe");
		WebDriver driver=new ChromeDriver();
driver.get("http://google.com");
	}

}
