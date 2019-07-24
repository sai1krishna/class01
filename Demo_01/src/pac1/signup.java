package pac1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class signup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/");
		driver.findElement(By.xpath("//a[contains(text(),'SignUp')]")).click();
//		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("saihghjdfg");
//		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("sai");
//		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("sai");
//		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("fndifdfkQ12");
//		driver.findElement(By.xpath("//input[@id='pass_confirmation']")).sendKeys("fndifdfkQ12");
//		driver.findElement(By.xpath("//input[@value='Male']")).click();
//		driver.findElement(By.xpath("//input[@id='emailAddress']")).sendKeys("saihghgh12@gmail.com");
//		driver.findElement(By.xpath("//input[@id='mobileNumber']")).sendKeys("9676792205");
//		driver.findElement(By.xpath("//input[@id='dob']")).sendKeys("20/05/1985");
//		driver.findElement(By.xpath("//textarea[@id='address']")).sendKeys("sai");
//		driver.findElement(By.xpath("//option[@value='411011']")).click();
//		driver.findElement(By.xpath("//input[@id='answer']")).sendKeys("blue");
		List<WebElement> T_links = driver.findElements(By.tagName("a"));
		int c_links = T_links.size();
		System.out.println(c_links);
		for(int i=0;i<c_links;i++) {
			String Links=T_links.get(i).getText();
			System.out.println(Links);
		}
//		driver.findElement(By.xpath("//input[@name='Submit']")).click();
		
		
		
	}

}
