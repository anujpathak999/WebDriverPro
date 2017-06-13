package com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

 class Openclose {
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

		}


