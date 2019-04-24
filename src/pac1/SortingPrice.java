package pac1;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SortingPrice {
@Test
public void blueStone() throws InterruptedException {
	 WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.bluestone.com");
		driver.findElement(By.xpath("//input[@id='search_query_top_elastic_search']")).sendKeys("Rings");
		driver.findElement(By.xpath("//input[@name='submit_search']")).click();
		List<WebElement> w1=driver.findElements(By.xpath("//div[@class='inner pd-gray-bg']/descendant::span[@class='p-wrap']"));
		Thread.sleep(5000);
		int n=w1.size();
		List<String> lst=new ArrayList<String>();
		for(int i=0;i<=n;i++) {
			String s=w1.get(i).getText();
			lst.add(s);
			System.out.println(lst);
		}
		TreeSet<String> set=new TreeSet<String>(lst);
		System.out.println(set);
}
}
