package Table;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class ESPN {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\GYAAN\\Pictures\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.espncricinfo.com/");
		Thread.sleep(2000L);
		//Code to find no. of links----------------
//		Actions action = new Actions(driver);
//		action.moveToElement(driver.findElement(By.xpath(".//*[@id='nav_grp']/li[2]/a"))).click().build().perform();
//		WebElement element=driver.findElement(By.xpath(".//*[@id='first']/div[1]"));
//		element.findElements(By.tagName("a")).get(3).click();
		//----------------------
		
		//----------Code to retrieve data from a table--------------
		driver.findElement(By.xpath(".//*[@id='live']/ul[1]/li[1]/ul/li")).click();
		Thread.sleep(5000L);
		WebElement table=driver.findElement(By.cssSelector("table[class='score-table']"));
		System.out.println(table.findElements(By.tagName("tr")).size());
		int i=0;
		int j=0;
		for(WebElement eachrow:table.findElements(By.tagName("tr"))){
			
			List<WebElement> eachcolumn=eachrow.findElements(By.tagName("td"));
			i++;
			System.out.println(i+" "+eachcolumn.size());
			
			/*for(WebElement eachrowofcolumn:eachcolumn){
				List<WebElement> eachcolumnofrow=eachrowofcolumn.findElements(By.tagName("tr"));
				j++;
				System.out.println(i+" "+j+" "+eachcolumnofrow.size());
				
			}*/
			//System.out.println();
			/*for(WebElement text:eachcolumn){
				System.out.println(text.getText());
			}*/
			if(eachcolumn.size()!=0)
			System.out.println(eachcolumn.get(0).getText());
		}
		
	}

}
