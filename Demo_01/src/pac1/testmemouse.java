package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class testmemouse {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  
	  driver = new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp");
		driver.manage().window().maximize();
//		Thread.sleep(5000);
		WebElement El=driver.findElement(By.xpath("//span[text()='AboutUs']"));
		Actions a1=new Actions(driver);
		a1.moveToElement(El).build().perform();
		WebElement E2=driver.findElement(By.xpath("//span[contains (text(),'Our')]"));
		Actions a2=new Actions(driver);
		a1.moveToElement(E2).build().perform();
		driver.findElement(By.xpath("//span[contains (text(),'Chennai')]")).click();
		

  }
  
  }

