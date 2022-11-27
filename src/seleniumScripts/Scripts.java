package seleniumScripts;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
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
		sc.handleautosuggestion();
	}

	public void handleautosuggestion() {
		driver.get("https://jqueryui.com/autocomplete/");
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@id='tags']")).sendKeys("t");
		List<WebElement> option = driver.findElements(By.xpath("ui-menu-item-wrapper"));
		System.out.println(option.size());
		option.forEach(x->{
			if(x.getText().equalsIgnoreCase("Python")) {
				x.click();
			}
		});

	}

	public void handleMultiplecheckbox() {
		driver.get("https://bonigarcia.dev/selenium-webdriver-java/web-form.html");
		List<WebElement> allcheckbox = driver.findElements(By.xpath("//input[@type='checkbox']"));

		allcheckbox.forEach(x -> {
			if (!x.isSelected()) {
				x.click();
			}
		});

	}

	public void slider() {
		driver.get("https://jqueryui.com/slider/");
		driver.switchTo().frame(0);
		WebElement slider = driver.findElement(By.xpath("//div[@id='slider']/span"));

		Actions action = new Actions(driver);
		action.clickAndHold(slider).moveByOffset(500, 0).release().build().perform();
	}

	public void dragandDrop() {
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(0);
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));

		Actions action = new Actions(driver);

		// action.clickAndHold(drag).moveToElement(drop).release().build().perform();
		action.dragAndDrop(drag, drop).perform();

	}

	public void handleFrames() {
		driver.get("https://jqueryui.com/droppable/");
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(0);
		WebElement drag = driver.findElement(By.id("draggable"));
		System.out.println(drag.isDisplayed());

		driver.switchTo().defaultContent();
		WebElement img = driver.findElement(By.xpath("//a[@href='/']"));
		System.out.println(img.isDisplayed());
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
		// js.executeScript("arguments[0].scrollIntoView();", btn);

		// scroll till document height

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
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		Thread.sleep(1000);
//		driver.quit();

	}

	// till selenium version 4.5.0

//	public void launchBrowser() {
//	   System.setProperty("webdriver.chrome.driver", "D:\\Automationtools\\seljars1\\cd107\\chromedriver.exe");
//	   WebDriver driver = new ChromeDriver();
//	}

}
