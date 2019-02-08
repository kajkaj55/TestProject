package de.jacob.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RadioButtonTest {
	private WebDriver driver;
	private String baseUrl;

	@BeforeMethod
	public void setUp() {

		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir" + "\\src\\test\\resources\\executables\\chromedriver.exe"));
		// System.setProperty("webdriver.chrome.driver",
		// "E:\\SeleniumDateien\\WebDriver_Selenium");

		driver = new ChromeDriver();
		baseUrl = "https://learn.letskodeit.com/p/practice";

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		driver.get(baseUrl);
	}

	@Test
	public void radioButtonBmwTest() {
		WebElement radioButtonBmw = driver.findElement(By.id("bmwradio"));
		radioButtonBmw.click();

		Assert.assertTrue(radioButtonBmw.isSelected());
	}

	@Test
	public void radioButtonBenzTest() {
		WebElement radioButtonBenz = driver.findElement(By.id("benzradio"));
		radioButtonBenz.click();

		Assert.assertTrue(radioButtonBenz.isSelected());
	}

	@AfterClass
	public void radioButton() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}

}
