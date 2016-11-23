package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Utils {
	public static WebDriver driver = null;

	public static WebDriver OpenBrowser() {
		String sBrowserName;

		try {
			sBrowserName = Constant.Browser;

			if (sBrowserName.equals("Chrome")) {
				System.setProperty("webdriver.chrome.driver",
						"D:\\final_framework\\Drivers\\chromedriver.exe");
				driver = new ChromeDriver();
				driver.manage().window().maximize();
			}

			else if (sBrowserName.equals("Mozilla") || sBrowserName.equals("mozilla")) {
				driver = new FirefoxDriver();

				driver.manage().window().maximize();
			}

		} catch (Exception e) {

		}
		return driver;
	}

}
