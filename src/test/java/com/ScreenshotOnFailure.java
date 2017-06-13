package com;
	import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

	import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


	public class ScreenshotOnFailure extends TestListenerAdapter {

		static WebDriver driver;

		@BeforeClass
		public void getDriver() {
			String path = System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", path+ "\\src\\test\\resources\\drivers\\chromedriver.exe");
		    driver = new ChromeDriver();
		}

		@Override
		public void onTestFailure(ITestResult tr) {
			try {
				screenshot(tr);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}


		public void screenshot(ITestResult tr) throws IOException {
			System.out.println("***********");

//			File location = new File("./test-output");
//			Date date = new Date();
//			DateFormat dateFormat = new SimpleDateFormat("dd_MMM_yy_hh_mm_ssaa");
//			String scrName = location.getCanonicalPath() + "\\screenshots\\" +
//			tr.getName() + dateFormat.format(date) + ".png";
			
			//String filePath = "./src/test/resources/screenshots/";
			//String timestamp = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
			//String path = filePath + "_" + timestamp+".png";

			String path = "E:\\eclipse workspace\\WebDriverPro\\src\\test\\resources\\screenshot\\aaa.png";
			
			File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File(path));
		}

		@Test
		public void abc() throws InterruptedException {
			//driver.get("http://www.bbc.com/");
			driver.get("https://www.meritnation.com/");
			
			//Thread.sleep(20000);
			
			
			Assert.assertTrue(10 > 20);

		}

	}


