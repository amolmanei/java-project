package com.ati.pune.automation.selenium.work;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SynchronisedWait {

	public static void main(String[] args) throws InterruptedException {
    
		System.setProperty("webdriver.chrome.driver", "C:\\BasicJavaWork\\Automation\\Driver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://demoqa.com/dynamic-properties");
        System.out.println("Browser Opened");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"visibleAfter\"]")).click();
        
        
    	System.setProperty("webdriver.chrome.driver", "C:\\BasicJavaWork\\Automation\\Driver\\chromedriver.exe");
        WebDriver driver2=new ChromeDriver();
        driver2.get("https://demoqa.com/dynamic-properties");
        System.out.println("Browser Opened");
        driver2.manage().window().maximize();
        WebDriverWait w=new WebDriverWait(driver,10);
        w.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"visibleAfter\"]")));
        
        @SuppressWarnings("deprecation")
		Wait<WebDriver> wait=new FluentWait<WebDriver>(driver).withTimeout(10,TimeUnit.SECONDS)
        		.pollingEvery(100, TimeUnit.MILLISECONDS)
        		.ignoring(Exception.class);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"visibleAfter\"]")));
        
        
        
	}

	}


