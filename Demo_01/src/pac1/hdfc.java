package pac1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class hdfc {
  
	WebDriver driver;
	@Test
  
  public void f() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.hdfcbank.com/htdocs/common/onlineservices/netbankingloginsafe_nri.htm");
		String W_Name1= driver.getWindowHandle();
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@href='/htdocs/nri_banking/payments/BillPay/BillPay.htm']")).click();
		Thread.sleep(5000);
		Set<String> T_win=driver.getWindowHandles();
		int c_win=T_win.size();
		System.out.println(c_win);
		for(String S : T_win) {
			driver.switchTo().window(S);
			System.out.println(driver.getWindowHandle());
		}
		driver.findElement(By.xpath("//img[@src='/htdocs/nri_banking/product_page/images/primnav/loans.gif']")).click();
		String E_text="Attractive interest rates";
		  String A_text=driver.getText(By.xpath("//li[@text()='Attractive interest rates']"));

		 
	
	}
}
