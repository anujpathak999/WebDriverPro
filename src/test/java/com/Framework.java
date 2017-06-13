package com;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

     class  Framework extends Openclose{
    
	@Test
	public void framework()
	{
		driver.findElement(By.xpath(".//input[@id='search']")).sendKeys("anujpathak");
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath(".//input[@id='search']"))).doubleClick().build().perform();
	}
}

   /* class Openclose {
    WebDriver driver;
    @BeforeMethod
    public void method1(){
    	String path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path+ "\\src\\test\\resources\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.jabong.com");		
    }
    @AfterMethod
    public void method2(){
    driver.quit();	
    }

}*/
