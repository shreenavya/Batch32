package pac1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Ass2 {
	@Test
	public void getCount() throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.bluestone.com"); 
		driver.findElement(By.xpath("//input[@name='search_query']")).sendKeys("Rings");
		Thread.sleep(2000);
		Actions act=new Actions(driver);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		WebElement w1=driver.findElement(By.xpath("//section[@id='Gender-form']"));
		act.moveToElement(w1).perform();
		WebElement w2=driver.findElement(By.xpath("//section[@id='Gender-form']/descendant::span[@data-displayname='women']/descendant::span[@class='items-count']"));
		String s=w2.getText();
		System.out.println(s);
		driver.close();
		
}
}

