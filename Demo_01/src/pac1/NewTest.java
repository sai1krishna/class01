package pac1;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

public class NewTest {
  @Test(dataProvider = "dp")
  public void fedryf(String n, String s) {
	  System.out.println("username :"+n);
	  System.out.println("username :"+s);
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "demo", "sk" },
      new Object[] { "mahi", "netha" },
    };
  }
  @AfterMethod
  public void logout() {
	  System.out.println("code for logout");
  }
  @BeforeMethod
  public void login() {
	  System.out.println("code for clear history");
	 
  }
  
}
