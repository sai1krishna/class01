package pac1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class java123 {

	public static WebDriver getDriver(String browser) {
		if(browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
			return new ChromeDriver();
		}
		// TODO Auto-generated method stub
		return null;

	}

}
