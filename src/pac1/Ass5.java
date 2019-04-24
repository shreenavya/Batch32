package pac1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;



public class Ass5 {
	@Test
	public void schemePositive() throws InterruptedException {
		String e="priyanka.tikam@gmail.com";
		String a="1000";
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.bluestone.com"); 
		driver.findElement(By.xpath("//a[@title='Gold Mine 10+1 Monthly Scheme']")).click();
		driver.findElement(By.id("amount")).sendKeys(a);
		driver.findElement(By.id("Email")).sendKeys(e);
		driver.findElement(By.xpath("//input[@value='Start Now']")).click();
		WebElement w1=driver.findElement(By.id("email"));
		Thread.sleep(5000);
		boolean status=w1.isDisplayed();
		if(status) {
			System.out.println("Passed");
		}
		
		WebElement w2=driver.findElement(By.xpath("//span[@class='subscription-amount subscribed-amount']"));
		String amount=w2.getText();
		Assert.assertEquals(a, amount);
		
		driver.close();
		
	}
}
