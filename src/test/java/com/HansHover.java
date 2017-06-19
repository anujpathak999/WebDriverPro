package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HansHover {

	public static void main(String[] args) {
		String path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path+ "\\src\\test\\resources\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://hansrajcollege.ac.in");
		try{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[text()='Academics']"))));
		WebElement element = driver.findElement(By.xpath("//a[text()='Academics']"));
	
		Actions action = new Actions(driver);
		Actions act1 =action.moveToElement(element);
		act1.moveToElement(driver.findElement(By.xpath("//a[text()='Admissions']"))).build().perform();
		
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//ul[@class='MenuBarSubmenuVisible']"))));
		
		
		WebElement department = driver.findElement(By.xpath(".//*[@id='MenuBar1']/li[3]/ul/li[4]/a"));
		action.moveToElement(department).perform();
		
		WebElement arts = driver.findElement(By.xpath(".//*[@id='MenuBar1']/li[3]/ul/li[4]/ul/li[2]/a"));
		action.moveToElement(arts).perform();
		
		WebElement com = driver.findElement(By.xpath(".//*[@id='MenuBar1']/li[3]/ul/li[4]/ul/li[2]/ul/li[1]/a"));
		action.moveToElement(com).perform();
		action.click();
		
		driver.quit();
		}catch(Exception e){
			e.printStackTrace();
		}
		
}
}