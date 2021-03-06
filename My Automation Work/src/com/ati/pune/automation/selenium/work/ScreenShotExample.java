package com.ati.pune.automation.selenium.work;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;


public class ScreenShotExample {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\BasicJavaWork\\Automation\\Driver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://google.com");
        System.out.println("Browser Opened");
        driver.manage().window().maximize();
        
        TakesScreenshot ts=(TakesScreenshot)driver;
        File srcFile=ts.getScreenshotAs(OutputType.FILE);
        String filepath="C:\\screenshot\\SCREENSHOT";
        
        File destFile=new File(filepath+System.currentTimeMillis()+"screenshot.jpg");
        Files.copy(srcFile, destFile);
        Thread.sleep(5000);
        driver.quit();
        
	}

}
