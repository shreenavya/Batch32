package pac1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Ass4 {
	@Test
	public void schemeNegative() {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.bluestone.com"); 
		driver.findElement(By.xpath("//a[@title='Gold Mine 10+1 Monthly Scheme']")).click();
		driver.findElement(By.xpath("//input[@value='Start Now']")).click();
		WebElement w1=driver.findElement(By.xpath("//ul[@id='amount_error']"));
		boolean status=w1.isDisplayed();
		if(status) {
			System.out.println("passed ");
		}
		WebElement w2=driver.findElement(By.xpath("//ul[@id='Email_error']"));
		boolean status1=w2.isDisplayed();
		if(status1) {
			System.out.println("passed");
		}
		driver.close();
		
	}

}
