package testngLinstenersdemo;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import graphql.Assert;

@Listeners(MyListeners.class)
public class TestSelenium {
	
	WebDriver driver;
	@Test
	public void captureScreenShot() throws IOException {
		driver.get("https://jqueryui.com/slider/");
		driver.switchTo().frame(0);
		WebElement slider = driver.findElement(By.xpath("//div[@id='slider']/span"));

		Actions action = new Actions(driver);
		action.clickAndHold(slider).moveByOffset(500, 0).release().build().perform();
	
		Assert.assertTrue(true);

	}
	
	@BeforeMethod
	public void launchBrowser() throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	


	
	@AfterMethod
	public void closeBrowser(ITestResult result) {
		if(ITestResult.FAILURE==result.getStatus()) {
			TakesScreenshot ts = ((TakesScreenshot) driver);
			File file = ts.getScreenshotAs(OutputType.FILE);
			try {
				FileHandler.copy(file, new File("D:\\screenshot\\sliderNotupdated.png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		driver.quit();
	}
	


}
