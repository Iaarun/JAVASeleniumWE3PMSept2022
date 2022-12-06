package seleniumScripts;

import java.awt.RenderingHints.Key;
import java.awt.Robot;
import java.time.Duration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Scripts {

	/*
	 * http://marketplace.eclipse.org/marketplace-client-intro?mpc_install=1549
	 * webdriver.chrome.driver webdriver.gecko.driver webdriver.ie.driver
	 */

	WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		Scripts sc = new Scripts();
		sc.launchBrowser();
		sc.selSynchronization();
	}
	
	
	
	public void selSynchronization() {
		driver.get("https://bonigarcia.dev/selenium-webdriver-java/loading-images.html");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//p[contains(text(), 'Done')]")));
		WebElement imgloaded= driver.findElement(By.xpath("//p[contains(text(), 'Done')]"));
		System.out.println(imgloaded.getText());
	}
	public void handleCalender() {
		driver.get("https://jqueryui.com/datepicker/");
		driver.switchTo().frame(0);
		driver.findElement(By.id("datepicker")).click();
		String caltitle = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
		System.out.println(caltitle);
		String month = caltitle.split(" ")[0].trim();
		String year = caltitle.split(" ")[1].trim();

		String nyear = String.valueOf(Integer.parseInt(year) + 1);

		while (!(month.equals("December") && year.equals(nyear))) {
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
			caltitle = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
			month = caltitle.split(" ")[0].trim();
			year = caltitle.split(" ")[1].trim();
		}

		driver.findElement(By.xpath("//a[normalize-space()='25']")).click();
	}

	public void handleTables() {
		driver.get("https://www.moneycontrol.com/markets/indian-indices/");
		List<WebElement> col = driver.findElements(By.xpath("//table[@id='indicesTable']/thead/tr/th"));
		int colnum = col.size();
		System.out.println("Column size " + colnum);

		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='indicesTable']/tbody/tr"));
		int rownum = rows.size();
		System.out.println("Rows " + rownum);
		// row data
		for (int i = 1; i <= colnum; i++) {
			String data = driver.findElement(By.xpath("//table[@id='indicesTable']/tbody/tr[1]/td[" + i + "]"))
					.getText();
			System.out.print(data + " | ");
		}
		System.out.println("====Column data====");
		// column data
		for (int i = 1; i <= rownum; i++) {
			String data = driver.findElement(By.xpath("//table[@id='indicesTable']/tbody/tr[" + i + "]/td[1]"))
					.getText();

			System.out.println(data);
		}

		System.out.println("====Complete table data====");
		for (int i = 1; i <= rownum; i++) {
			for (int j = 1; j <= colnum; j++) {
				String data = driver
						.findElement(By.xpath("//table[@id='indicesTable']/tbody/tr[" + i + "]/td[" + j + "]"))
						.getText();
				System.out.print(data + " | ");
			}
			System.out.println();
		}
	}

	public void multipletabs() {
		LinkedHashSet<String> lset = new LinkedHashSet<>();
		driver.get("https://www.naukri.com/");
		String firsttab = driver.getWindowHandle();
		lset.add(firsttab);
		WebElement servicestab = driver.findElement(By.xpath("//div[normalize-space()='Services']"));

		WebElement companiesTab = driver.findElement(By.xpath("//div[normalize-space()='Companies']"));

		Actions action = new Actions(driver);

		action.keyDown(Keys.CONTROL).click(servicestab).keyUp(Keys.CONTROL).build().perform();
		lset.addAll(driver.getWindowHandles());
		action.keyDown(Keys.CONTROL).click(companiesTab).keyUp(Keys.CONTROL).build().perform();
		lset.addAll(driver.getWindowHandles());
		// Set<String> allids = driver.getWindowHandles();

		Iterator<String> it = lset.iterator();
		String fid = it.next();
		System.out.println(fid + "\n" + driver.getTitle());

		String sid = it.next();
		driver.switchTo().window(sid);
		System.out.println(sid + "\n" + driver.getTitle());

		String tid = it.next();
		driver.switchTo().window(tid);
		System.out.println(tid + "\n" + driver.getTitle());
	}

	public void handlemultipleWindows() {
		driver.get("https://www.naukri.com/");
		String firstId = driver.getWindowHandle();
		System.out.println(driver.getCurrentUrl());
		WebElement services = driver.findElement(By.xpath("//div[normalize-space()='Services']"));
		services.click();

		Set<String> allId = driver.getWindowHandles();
		allId.forEach(x -> {
			if (!x.equals(firstId)) {
				driver.switchTo().window(x);
				System.out.println(driver.getCurrentUrl());
				// driver.close();
			}
		});

		driver.switchTo().window(firstId);
		System.out.println(driver.getCurrentUrl());
	}

	public void fileUpload() {
		driver.get("https://bonigarcia.dev/selenium-webdriver-java/web-form.html");
		WebElement fileUpload = driver.findElement(By.name("my-file"));
		fileUpload.sendKeys("D:\\screenshot");

		// Robot robot = new Robot();

	}

	public void handleautosuggestion() {
		driver.get("https://jqueryui.com/autocomplete/");
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@id='tags']")).sendKeys("t");
		List<WebElement> option = driver.findElements(By.xpath("//ul[@id='ui-id-1']/li"));
		System.out.println(option.size());
		option.forEach(x -> {
			if (x.getText().equalsIgnoreCase("Fortran")) {
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
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		Thread.sleep(1000);
//		driver.quit();

	}

	// till selenium version 4.5.0

//	public void launchBrowser() {
//	   System.setProperty("webdriver.chrome.driver", "D:\\Automationtools\\seljars1\\cd107\\chromedriver.exe");
//	   WebDriver driver = new ChromeDriver();
//	}

}
