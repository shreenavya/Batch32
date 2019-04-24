package pac1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class SearchRings {
@Test
public void getCount() throws InterruptedException {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://www.bluestone.com"); 
	driver.findElement(By.xpath("//input[@name='search_query']")).sendKeys("Rings");
	Actions act=new Actions(driver);
	act.sendKeys(Keys.ENTER).perform();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[text()='More Filters']")).click();
	WebElement w1=driver.findElement(By.xpath("//section[@id='Gold Purity-form']/descendant::form[@id='gold purity']/div/div[@class='form-item last']/descendant::span[@class='items-count']"));
	String count=w1.getText();
	System.out.println(count);
	driver.close();
	
}


}
