package testNgassertsion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestAssertions {
	WebDriver driver;

	@BeforeMethod
	public void launchBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}

	@Test 
	public void testAssert() {
		driver.get("http://live.techpanda.org/");
		String expectedTitle = "THIS IS A DEMO SITE";
		String actualtitle = driver.findElement(By.xpath("//h2[1]")).getText();
		System.out.println(actualtitle);

		Assert.assertEquals(actualtitle, expectedTitle, "Title does not match");

		driver.findElement(By.xpath("//a[normalize-space()='Mobile']")).click();
		String expected = "MOBILE";

		String actmsg = driver.findElement(By.xpath("//h1[normalize-space()='Mobile']")).getText();

		Assert.assertEquals(actmsg, expected);
	}

	@Test
	public void testSoftAssert() {
		SoftAssert softassert = new SoftAssert();
		driver.get("http://live.techpanda.org/");
		String expectedTitle = "THIS IS A DEMO SITE";
		String actualtitle = driver.findElement(By.xpath("//h2[1]")).getText();
		System.out.println(actualtitle);

		softassert.assertEquals(actualtitle, expectedTitle, "Title does not match");

		driver.findElement(By.xpath("//a[normalize-space()='Mobile']")).click();
		String expected = "MOBILE";

		String actmsg = driver.findElement(By.xpath("//h1[normalize-space()='Mobile']")).getText();

		softassert.assertEquals(actmsg, expected);
		
		softassert.assertAll();
	}

}
