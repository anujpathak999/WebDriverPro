package com;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup {
	public static void main(String[] args) throws InterruptedException{
	String path = System.getProperty("user.dir");
	System.setProperty("webdriver.chrome.driver", path+ "\\src\\test\\resources\\drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.naukri.com/");
	
	String parentWindow = driver.getWindowHandle();
	System.out.println("parent handel>>>>"+parentWindow);
	Set<String> childwindow = driver.getWindowHandles();
	System.out.println("all handel>>>>"+childwindow);
	
        for (String handle : childwindow) {
		System.out.println("Switching to window - > " + handle);
		driver.switchTo().window(handle);}
	    driver.close();
	
	    driver.switchTo().window(parentWindow);
	   
	    driver.findElement(By.xpath("//span[@class='topIcon jobs Login']")).click();
	
}}