package pac1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;



public class BlueStone1 {
	 @SuppressWarnings("deprecation")
	@Test
	   public static void blueStone(int off) throws InterruptedException {
		   WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get("https://www.bluestone.com"); 
			WebElement w1=driver.findElement(By.xpath("//div[@class='white-header-inner']/descendant::li[@class='menuparent offers-menuparent pull-right']"));
			Actions act=new Actions(driver);
			act.moveToElement(w1).perform();
			driver.findElement(By.xpath("//span[text()='Flat "+off+"% off']")).click();
			Thread.sleep(10000);
			List<WebElement> w2=driver.findElements(By.xpath("//span[contains(text(),'("+off+"% off)')]"));
			int n=w2.size();
			List<WebElement> w3=driver.findElements(By.xpath("//div[@class='inner pd-gray-bg']"));
			int m=w3.size();
			
			Assert.assertEquals(w2, w3);
}
}
