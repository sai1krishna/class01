package pac1;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class driver21 {
	  WebDriver driver;
  @Test
  public void f() {
	driver=java123.getDriver("chrome");
	driver.get("http://newtours.demoaut.com/");
	  
  }
  @Test
  public void g() {
	driver=java123.getDriver("ie");
	driver.get("http://newtours.demoaut.com/");
	  
  }
  @Test
  public void h() {
	driver=java123.getDriver("ff");
	driver.get("http://newtours.demoaut.com/");
	  
  }
}
