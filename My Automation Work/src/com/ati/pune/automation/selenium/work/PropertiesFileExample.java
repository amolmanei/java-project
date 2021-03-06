package com.ati.pune.automation.selenium.work;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PropertiesFileExample {

	static WebDriver driver;
	static String browser;
	
	public static void main(String[] args) throws IOException {

		FileInputStream fin=new FileInputStream("C:\\BasicJavaWork\\Java_Basic_Work\\Java_my_work\\My Automation Work\\Resorses\\config.properties");
		Properties prop=new Properties();
		prop.load(fin);
		browser=prop.getProperty("browser");
		if("chrome".equalsIgnoreCase(browser))
		{
			System.setProperty("webdriver.chrome.driver", prop.getProperty("chromeexepath"));
            driver=new ChromeDriver();
		}else if("firefox".equalsIgnoreCase(browser))
		{
	        System.setProperty("webdriver.gecko.driver", prop.getProperty("firefoxexepath"));
            driver=new FirefoxDriver();
		}
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get(prop.getProperty("baseurl"));
        System.out.println("Browser Opened");
        driver.manage().window().maximize();
        driver.quit();
		
		
	}

}
