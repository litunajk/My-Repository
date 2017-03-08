package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrimsTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "‪F:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://primusbank.qedgetech.com");
		driver.manage().window().maximize();
	}

}
