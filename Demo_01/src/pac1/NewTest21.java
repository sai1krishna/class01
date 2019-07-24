package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class NewTest21 {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  driver = new ChromeDriver();
		driver.get("http://google.com/");
		driver.manage().window().maximize();
		WebElement E1=driver.findElement(By.xpath("//input[@name='q']"));
		Actions a1=new Actions(driver);
		E1.sendKeys("Accenture");
		a1.keyDown(E1,Keys.ALT).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.ENTER).keyUp(Keys.ALT).build().perform();
  }
}
