package pac1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class sbi {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://retail.onlinesbi.com/retail/login.htm");
		String W_Name1= driver.getWindowHandle();
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//img[@src='/sbijava/retail/images/HomeLoanButton.png']")).click();
		Thread.sleep(5000);
		Set<String> T_win=driver.getWindowHandles();
		int c_win=T_win.size();
		System.out.println(c_win);
		for(String S : T_win) {
			driver.switchTo().window(S);
			System.out.println(driver.getWindowHandle());
		}
		 driver.findElement(By.linkText("Apply Now")).click();
  }
}
