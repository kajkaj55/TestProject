package de.jacob.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleSearchTest {
	private WebDriver driver;
	private String baseUrl;
	
	@BeforeMethod
	public void setUp() {

		//driver = new ChromeDriver();
		driver = new FirefoxDriver();
		baseUrl = "https://www.google.com/";

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		driver.get(baseUrl);
	}

	@Test
	public void radioButtonBmwTest() {
		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys("hallo");
	}

	@AfterClass
	public void radioButton() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}


}
