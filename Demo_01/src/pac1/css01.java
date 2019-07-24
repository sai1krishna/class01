package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class css01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
		
		driver.findElement(By.cssSelector("input#userName")).sendKeys("Sai");
		driver.findElement(By.cssSelector("input.password")).sendKeys("Sai");
//		driver.findElement(By.cssSelector("input.")).click();

	}

}
