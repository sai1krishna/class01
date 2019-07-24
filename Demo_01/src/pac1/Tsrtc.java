package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

@Test
public class Tsrtc {
	WebDriver driver;
  public void f() throws InterruptedException {
	  driver = new ChromeDriver();
			driver.get("https://www.spicejet.com/");
			driver.manage().window().maximize();
			WebElement El=driver.findElement(By.xpath("//a[text()='Add-Ons']"));
			Actions a1=new Actions(driver);
			a1.moveToElement(El).build().perform();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//a[text()='MyFlexiPlan']")).click();
//			Actions a2=new Actions(driver);
//			a2.moveToElement(E2).build().perform();
//			E2.click();
			
////			WebElement E1=driver.findElement(By.xpath("//a[text()='Gmail']"));
////			Actions a1=new Actions(driver);
////			a1.contextClick().build().perform();
//			WebElement E1=driver.findElement(By.xpath("//b[text()='sign-in here']"));
//			Actions a1=new Actions(driver);
//			a1.doubleClick(E1).build().perform();
  }
}
