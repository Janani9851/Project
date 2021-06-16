package org.dropdown;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultiDrop {
	@Test
	public void test() throws Exception
	{
	//public static WebDriverManager driver1;
	//public static WebDriver driver;
	WebDriverManager.chromedriver().setup();
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://demoqa.com/auto-complete");
	WebElement auto= driver.findElement(By.xpath("(//div[@class='auto-complete__control css-yk16xz-control'])[1]"));
	auto.sendKeys("Green");
	Robot r = new Robot();
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_ENTER);
	//auto.sendKeys("Green");
	
	
	
	}
}
