package pac1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Ass8 {
@Test
public void verifyPrice() throws InterruptedException {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://www.bluestone.com"); 
	driver.findElement(By.xpath("//input[@name='search_query']")).sendKeys("Rings");
	Actions act=new Actions(driver);
	act.sendKeys(Keys.ENTER).perform();
	Thread.sleep(2000);
	WebElement w1=driver.findElement(By.xpath("//li[@class='col-xs-4 three-column-browse with-discount rings-small' and @data-pid='34824']/descendant::span[@class='p-wrap']/descendant::span[@id='bst-discounted-price']"));
	String s1=w1.getText();
	WebElement w2=driver.findElement(By.xpath("//li[@class='col-xs-4 three-column-browse with-discount rings-small' and @data-pid='34824']/descendant::span[@class='p-wrap']/descendant::span[@id='bst-actual-price']"));
	String s2=w2.getText();
	WebElement w3=driver.findElement(By.xpath("//li[@class='col-xs-4 three-column-browse with-discount rings-small' and @data-pid='34824']/descendant::span[@class='p-wrap']/descendant::span[@class='b-price-left']/following-sibling::span[@class='b-price-right']"));
	String s3=w3.getText();
	System.out.println(s1);
	System.out.println(s2);
	System.out.println(s3);
	
	driver.close();
}
}
