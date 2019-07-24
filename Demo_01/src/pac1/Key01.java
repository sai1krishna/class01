package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Key01 {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		WebElement E1=driver.findElement(By.xpath("//input[@name='q']"));
		Actions a1=new Actions(driver);
		E1.sendKeys("computer");
		a1.keyDown(E1,Keys.ALT);
		Thread.sleep(5000);
		a1.sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.ENTER).keyUp(Keys.ALT).build().perform();
		String s= "http://demowebshop.tricentis.com/build-your-own-expensive-computer-2";
		String h= driver.getCurrentUrl();
		Assert.assertEquals("11","11");
		SoftAssert ast=new SoftAssert();
		String s1= "LM";
		String s2= "LMAD";
		ast.assertEquals(s1, s2);
		  System.out.println("Login succesful");
  
  }
  
}
