package pac1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class BlueStone {
   @Test
   public void blueStone() {
	   WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.bluestone.com");
		WebElement wb1=driver.findElement(By.xpath("//nav[@class='wh-navbar']/descendant::li/a[text()='Rings ']"));
		Actions act=new Actions(driver);
		act.moveToElement(wb1).perform();
		WebElement wb2=driver.findElement(By.xpath("//a[@title='Diamond Rings' and text()='Diamond']"));
		wb2.click();
		List<WebElement> wb3=driver.findElements(By.xpath("//div[@class='p-image']/following-sibling::span[@class='p-wrap']/descendant::span[@id='bst-discounted-price']"));
		int n=wb3.size();
		for(int i=0;i<=n;i++) {
			String s1=wb3.get(i).getText();
			System.out.println(s1);
		}
		WebElement d=driver.findElement(By.xpath("//span[@class='view-by-wrap title style-outyline i-right']"));
		act.moveToElement(d).perform();
		WebElement d1=driver.findElement(By.xpath("//span[@class='view-by-wrap title style-outline i-right']/following-sibling::div/descendant::a[text()='Price Low to High']"));
		act.moveToElement(d1).click();
		List<WebElement> wb4=driver.findElements(By.xpath("//div[@class='p-image']/following-sibling::span/descendant::span[@class='new-price']"));
        int m=wb4.size();
        for(int j=0;j<=m;j++) {
        	String s2=wb4.get(j).getText();
        	System.out.println(s2);
        }
   }
}

