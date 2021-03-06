package com.ati.pune.automation.selenium.work;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollbarExample {

	public static void main(String[] args) throws  InterruptedException{

		System.setProperty("webdriver.chrome.driver", "C:\\BasicJavaWork\\Automation\\Driver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://stackoverflow.com/");
        System.out.println("Browser Opened");
        driver.manage().window().maximize();
        JavascriptExecutor js =(JavascriptExecutor)driver;
        //scroll down y valu
        js.executeScript("window.scrollBy(0,350)","");
        //scoll up y value negative
        Thread.sleep(5000);
        js.executeScript("window.scrollBy(0,-350)","");
        //scroll to height
        Thread.sleep(5000);

        js.executeScript("window.scrollBy(0,document.body.scrollHeight)","");
        Thread.sleep(5000);

        driver.navigate().refresh();
        //scoll to element in focus
        	WebElement ele=driver.findElement(By.xpath("//*[@id=\"p-pricing-grid-free\"]/div"));
        			js.executeScript("arguments[0].scrollIntoView();", ele);
        		    Thread.sleep(5000);	
        	driver.quit();


        
		
	}

}
