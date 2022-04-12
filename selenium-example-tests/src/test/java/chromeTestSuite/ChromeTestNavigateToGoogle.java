package chromeTestSuite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeTestNavigateToGoogle {

	public static void main(String[] args) {
		// Specify the path to the desired browser driver
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Open chrome browser and navigate to google
		driver.navigate().to("https://google.com");
		// Close the opened browser
		driver.quit();
	}

}
