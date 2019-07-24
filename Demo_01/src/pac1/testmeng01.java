package pac1;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
public class testmeng01 {
	WebDriver driver;
  @Test(dataProvider = "cred")
  public void f(String n, String s) {
	  System.out.println("code for login");
	  driver.findElement(By.xpath("//input[@id='userName']")).sendKeys(n);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(s);
		driver.findElement(By.xpath("//input[@name='Login']")).click();
	  String E_title="Home";
	  String A_title=driver.getTitle();
//	  if(E_title.equals(A_title)) {
//		  System.out.println("login succesful");
//	  }
//	  else {
//		  System.out.println("Login error");
//	  }
	  Assert.assertEquals(E_title, A_title);
	  System.out.println("Login succesful");
  }

  @DataProvider
  public Object[][] cred() {
    return new Object[][] {
      new Object[] { "sai", "krishna" },
      
    };
  }
  @BeforeClass
  public void beforeClass() {
	  
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
		
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("logout");
	  
	  
	  
  }

}
