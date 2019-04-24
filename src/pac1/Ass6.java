package pac1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Ass6 {
@Test
public void countLocations() {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://www.bluestone.com");
	driver.findElement(By.xpath("//a[text()='Visit Our Stores']")).click();
	List<WebElement> lst=driver.findElements(By.xpath("//div[@class='map-wrap']"));
	int n=lst.size();
	System.out.println(n);
}
}
