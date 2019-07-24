package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MyProgram_01 {
	 
	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/");
		driver.findElement(By.xpath("//a[contains(text(),'SignIn')]")).click();
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("sai");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("sai");
		driver.findElement(By.xpath("//input[@name='Login']")).click();
		
		
//		Dimension d= new Dimension(300,900);
//        driver.findElement(By.linkText("REGISTER")).click();
//        WebElement count = driver.findElement(By.name("country"));
//        Select sel1=new Select(count);
//        sel1.selectByVisibleText("GERMANY");
//		driver.manage().window().setSize(d);
//		WebElement Uname = driver.findElement(By.name("userName"));
//		WebElement Pswrd=  driver.findElement(By.name("password"));
//		WebElement Sbmt=  driver.findElement(By.name("login"));
//		Pswrd.sendKeys("demo");
//		Sbmt.click();
//		driver.close();
		// TODO Auto-generated method stub
//			int a = 10;
//			System.out.println(a);
		
//			driver.findElement(By.name("username")).sendKeys("saikrishna");
	}

}
