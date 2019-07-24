package pac1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Demo2 {
	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver","C:\\Drivers\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//synchronization time
//		WebDriverWait wait = new WebDriverWait(driver,30);//exist
//		wait.until(ExpectedConditions.presenceofElementLocated(By.linkText("SignIn")));
		driver.get("http://10.232.237.143:443/TestMeApp/");
		WebElement Href = driver.findElement(By.href("login.htm"))
		Href.click();
		WebElement Uname = driver.findElement(By.name("userName"));
		WebElement Pswrd=  driver.findElement(By.name("password"));
		WebElement Sbmt=  driver.findElement(By.name("Login"));
//		WebElement Uname = driver.findElement(By.name("userName"));
//		WebElement Pswrd=  driver.findElement(By.name("password"));
//		WebElement Sbmt=  driver.findElement(By.name("login"));
		Uname.sendKeys("demo");
		Pswrd.sendKeys("demo");
		Sbmt.click();
		driver.close();
	
	
	
	}
}
