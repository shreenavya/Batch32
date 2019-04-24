package Test;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class ParticularPage {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.get("http://www.qspiders.com/");
WebElement move = driver.findElement(By.xpath("//a[contains(.,'About us ')]"));
Actions act=new Actions(driver);
act.moveToElement(move).build().perform();
Thread.sleep(2000);
driver.findElement(By.xpath("//a[contains(.,'Faculty')]")).click();

TakesScreenshot ts=(TakesScreenshot)driver;


WebElement ele=driver.findElement(By.xpath("//img[@alt='Home']"));
File src=ts.getScreenshotAs(OutputType.FILE);
File dest=new File("D:\\Photon\\Testyantra\\Screen\\qspiders.png");
Files.copy(src, dest);


	}

}
