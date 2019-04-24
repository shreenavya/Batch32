package pac1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Ass3 {
@Test
public void checkDisplay() {
	ChromeDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://www.bluestone.com"); 
	JavascriptExecutor js=(JavascriptExecutor)driver;
	for(int i=0;i<=3;i++) {
		js.executeScript("window.scrollBy(0,500)","");
	}
	WebElement  w1=driver.findElement(By.xpath("//a[@title='BlueStone']"));
	boolean status=w1.isDisplayed();
	if(status) {
		w1.click();
		System.out.println("visible");
	}
	else {
		System.out.println("not visible");
	}
}
}
