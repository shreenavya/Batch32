

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class naukri1 {

	public static void main(String[] args) throws InterruptedException 
 {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
		Set<String> t = driver.getWindowHandles();
		List<String> lst=new ArrayList(t);
		for( int i=lst.size()-1;i>=0;i--)
		{
		
			driver.switchTo().window(lst.get(i));
			Thread.sleep(2000);
			driver.close();
//		for(String w:t)
//		{
//			driver.switchTo().window(w);
//			
//			
//			System.out.println(driver.getTitle());
//			String rev = driver.getTitle();
//			String s=new StringBuffer(rev).reverse().toString();
//			System.out.println(s);
//			driver.close();
	}
		
		}
		

	}
