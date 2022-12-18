package testngLinstenersdemo;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListeners extends TestSelenium implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println(result.getName() + " START ");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println(result.getName() + " : PASS" + " " + result.getStatus());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println(result.getName() + " : FAIL");
		
	}

}
