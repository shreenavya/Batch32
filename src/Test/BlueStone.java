package Test;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.apache.commons.collections4.list.TreeList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BlueStone {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.get("https://www.bluestone.com/");
Actions act=new Actions(driver);
WebElement ear = driver.findElement(By.xpath("//a[contains(text(),'Earrings ')]"));
act.moveToElement(ear).perform();
driver.findElement(By.xpath("//ul/li/a[@title='Gold Earrings' and text()='Plain Gold']")).click();
List<WebElement> price = driver.findElements(By.xpath("//span[@class='new-price']"));
int count = price.size();
List l=new ArrayList();
TreeList s=new TreeList(l);
//WebElement move = driver.findElement(By.xpath("//span[text()=' Popular ']"));
//act.moveToElement(move).perform();
//Thread.sleep(3000);
//driver.findElement(By.xpath("//a[text()='Price Low to High ']")).click();
for(WebElement k:price)
{
	System.out.println(k.getText());
}

	}

}
