package Exercises;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class links {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new FirefoxDriver();
driver.get("https://ebay.in");
System.out.println(driver.findElements(By.tagName("a")).size());
WebElement footer=driver.findElement(By.xpath(".//*[@id='glbfooter']"));
System.out.println(footer.findElements(By.tagName("a")).size());
for(int i=1;i<footer.findElements(By.tagName("a")).size();i++){
	System.out.println(footer.findElements(By.tagName("a")).get(i).getText());
}
	}

}
