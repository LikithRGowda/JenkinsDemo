package Test1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ProjectTest1 {
@Test
public void test1() {
	System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
	
	WebDriver driver =new ChromeDriver();
	driver.get("https://google.com");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.name("q")).sendKeys("TestYantra",Keys.ENTER);
	System.out.println(driver.getTitle());
}

}
