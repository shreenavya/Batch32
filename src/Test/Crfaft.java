package Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Crfaft {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.craftsvilla.com/");
List<WebElement> menu = driver.findElements(By.xpath("//nav[@id='mega-menu']/div/ul/li/a[@first-click]"));
Actions act=new Actions(driver);

for(WebElement m:menu)
		{
			System.out.println(m.getText());
			Thread.sleep(2000);
			act.moveToElement(m).build().perform();
			
	List<WebElement> sub = driver.findElements(By.xpath("//a[contains(.,'"+m.getText()+"')]/following-sibling::div/div/ul/li/a"));
	for(WebElement s:sub)
	{
		Thread.sleep(2000);
		
		System.out.println(s.getText());
	}
////	List<WebElement> toll = driver.findElements(By.xpath("//nav[@id='mega-menu']/descendant::a[@href='#']/parent::li/ancestor::div/descendant::a[@href='#']/parent::li/ul/li/a"));
////	for(WebElement c:toll)
////	{
////		System.out.println(c.getText());
////	}
		}
			 
		}
}