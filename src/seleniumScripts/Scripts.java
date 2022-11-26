package seleniumScripts;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Scripts {

	/*
	 * http://marketplace.eclipse.org/marketplace-client-intro?mpc_install=1549
	 * webdriver.chrome.driver webdriver.gecko.driver webdriver.ie.driver
	 */

	WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		Scripts sc = new Scripts();
		sc.launchBrowser();
		sc.handleAlert();
	}
	
	public void handleAlert() {
		driver.get("http://www.tizag.com/javascriptT/javascriptprompt.php");
		WebElement btn = driver.findElement(By.xpath("//input[@value='Say my name!']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", btn);
		btn.click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.sendKeys("Arun");
		alert.accept();
		System.out.println(alert.getText());
		alert.dismiss();
		
		
		
	}

	public void scroll() {
		driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
		WebElement btn = driver.findElement(By.xpath("//input[@value='Confirmation Alert']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;

		// random scroll
		// js.executeScript("window.scrollBy(0,500)", "");
		
		// scroll till element into view
	//	js.executeScript("arguments[0].scrollIntoView();", btn);
		
		//scroll till document height
		
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
		

	}

	public void handleDropdown() throws InterruptedException {
		driver.get("https://bonigarcia.dev/selenium-webdriver-java/web-form.html");
		WebElement number = driver.findElement(By.name("my-select"));

		Select select = new Select(number);
		System.out.println(select.getFirstSelectedOption().getText());

		List<WebElement> option = select.getOptions();
		System.out.println("Number fo element : " + option.size());

		option.forEach(x -> {
			System.out.println(x.getText());
		});
		Thread.sleep(1000);

		select.selectByVisibleText("Two");
		Thread.sleep(1000);

		select.selectByValue("3");
		Thread.sleep(1000);

		select.selectByIndex(0);

		System.out.println(select.isMultiple());
	}

	public void handlecheckboxandradioButton() {
		driver.get("https://bonigarcia.dev/selenium-webdriver-java/web-form.html");
		WebElement img = driver.findElement(By.className("img-fluid"));
		System.out.println(img.isDisplayed());

		WebElement check1 = driver.findElement(By.id("my-check-1"));
		System.out.println(check1.isSelected()); // true
		check1.click();
		System.out.println(check1.isSelected());// false

		WebElement disablebox = driver.findElement(By.name("my-disabled"));

		System.out.println(disablebox.isEnabled());

	}

	public void senddataandClickonLInk() {
		driver.get("https://bonigarcia.dev/selenium-webdriver-java/web-form.html");
		WebElement textInput = driver.findElement(By.id("my-text-id"));
		textInput.sendKeys("Arun");

		WebElement pass = driver.findElement(By.name("my-password"));
		pass.sendKeys("ArunSingh");
	}

	public void navigationFunctions() {
		driver.navigate().to("https://bonigarcia.dev/selenium-webdriver-java/");
		System.out.println(driver.getCurrentUrl());

		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		System.out.println(driver.getCurrentUrl());

		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());

		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());

		driver.navigate().refresh();
	}

	public void basicFunction() {
		// to launch application
		driver.get("https://bonigarcia.dev/selenium-webdriver-java/");

		// get current url
		String url = driver.getCurrentUrl();
		System.out.println(url);
		String title = driver.getTitle();
		System.out.println(title);

		// get tabid
		String tabId = driver.getWindowHandle();
		System.out.println(tabId);

		Set<String> ids = driver.getWindowHandles();

		String pgsrc = driver.getPageSource();
		System.out.println(pgsrc);
	}

	public void launchBrowser() throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
//		Thread.sleep(1000);
//		driver.quit();

	}

	// till selenium version 4.5.0

//	public void launchBrowser() {
//	   System.setProperty("webdriver.chrome.driver", "D:\\Automationtools\\seljars1\\cd107\\chromedriver.exe");
//	   WebDriver driver = new ChromeDriver();
//	}

}
