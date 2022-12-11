package testngParamterandgroups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNgParameter {

	WebDriver driver;

	@Parameters("browser")
	@BeforeMethod
	public void launchBrowser(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}else if(browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();

	}

	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}

	@Test 
	public void testAssert() {
		driver.get("http://live.techpanda.org/");
		String expectedTitle = "THIS IS A DEMO SITE FOR ";
		String actualtitle = driver.findElement(By.xpath("//h2[1]")).getText();
		System.out.println(actualtitle);

		Assert.assertEquals(actualtitle, expectedTitle, "Title does not match");

		driver.findElement(By.xpath("//a[normalize-space()='Mobile']")).click();
		String expected = "MOBILE";

		String actmsg = driver.findElement(By.xpath("//h1[normalize-space()='Mobile']")).getText();

		Assert.assertEquals(actmsg, expected);
	}
}
