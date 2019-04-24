package Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukri {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
		Set<String> t = driver.getWindowHandles();
		for(String w:t)
			
			
		{driver.switchTo().window(w);
			System.out.println(driver.getTitle());
			String rev = driver.getTitle();
			String s=new StringBuffer(rev).reverse().toString();
			System.out.println(s);}
		
		List<String> lst1=new ArrayList(t);
		for( int i=lst1.size()-1;i>=0;i--)
		{driver.switchTo().window(lst1.get(i));
			Thread.sleep(2000);
			driver.close();}
		
		
//		reverse an array
		WebDriver driver1=new ChromeDriver();
		driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver1.get("https://www.naukri.com/");

		Set<String> t2 = driver1.getWindowHandles();
		List<String> lst2=new ArrayList(t2);
		for( int i=lst2.size()-1;i>=0;i-=2)
		{
			driver1.switchTo().window(lst2.get(i));
			Thread.sleep(2000);
			driver1.close();
		}
		
//first and last
		WebDriver driver2=new ChromeDriver();
		driver2.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver2.get("https://www.naukri.com/");

		Set<String> t3 = driver2.getWindowHandles();
		List<String> lst3=new ArrayList(t3);
		for( int i=lst3.size()-1;i>=0;i-=3)
		{
			driver2.switchTo().window(lst3.get(i));
			Thread.sleep(2000);
			driver2.close();}
}
	
}