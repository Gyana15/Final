package Carrier;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Naukri {

	//public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		// TODO Auto-generated method stub
		@Test
		public void update() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\GYAN\\Pictures\\geckodriver.exe");
		//System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "//chromedriver_win32//chromedriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(9,TimeUnit.SECONDS);
		driver.get("http://naukri.com/");
		System.out.println(driver.findElements(By.tagName("div")).size());
		String MainWindow=driver.getWindowHandle();
		Set<String> s1=driver.getWindowHandles();		
		Select s=new Select(driver.findElement(By.className("")));
        Iterator<String> i1=s1.iterator();		
        while(i1.hasNext())			
        {		
            String ChildWindow=i1.next();		
            		
            if(!MainWindow.equalsIgnoreCase(ChildWindow))			
            {    		// Switching to Child window
                driver.switchTo().window(ChildWindow).close();		
	// Closing the Child Window.
               // driver.close();		
    }		
}		
// Switching to Parent window i.e Main Window.
    driver.switchTo().window(MainWindow);				
       driver.findElement(By.xpath(".//*[@id='login_Layer']")).click();
		FileInputStream fis=new FileInputStream("D:\\Selenium\\Final\\src\\Carrier\\TestData.xlsx");
				Workbook wb=WorkbookFactory.create(fis);
				Sheet sh=wb.getSheet("Naukri");
				Row row=sh.getRow(1);
				//String[] credentials = null;
					Cell cell=row.getCell(0);
					//cell.getStringCellValue();
					driver.findElement(By.xpath(".//*[contains(@id,'eLogin')]")).sendKeys(cell.getStringCellValue());
					Cell cell1=row.getCell(1);
					driver.findElement(By.xpath(".//*[@id='pLogin']")).sendKeys(cell1.getStringCellValue());
				//driver.findElement(By.xpath(".//*[@id='eLogin']")).sendKeys(credentials[0]);
				//driver.findElement(By.xpath(".//*[@id='pLogin']")).sendKeys(credentials[1]);
					driver.findElement(By.xpath("//button[@value='Login']")).click();
					//Thread.sleep(30000);
					//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
					//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					//System.out.println(driver.findElement(By.xpath(".//*[@id='leftNav_updateProfile']/ul/li/a[2]")).getText());
					WebElement element1=driver.findElement(By.xpath(".//*[@id='leftNav_updateProfile']/ul/li/a[2]"));
					System.out.println(element1.getText());
					element1.click();
					driver.findElement(By.xpath(".//*[@id='editForm']/div[2]/div/button")).click();
					//System.out.println(driver.getWindowHandle());
					driver.quit();
	}
}
