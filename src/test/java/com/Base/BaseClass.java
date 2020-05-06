package com.Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;

	public void browserLaunch() {
	WebDriverManager.chromedriver().version("80").setup();
		driver = new ChromeDriver();
		driver.get("https://starthreesixty.com/");
	}

	public void fill(WebElement e, String value) {
		e.sendKeys(value);
	}

	public void click(WebElement e) {
		e.click();
	}

}
