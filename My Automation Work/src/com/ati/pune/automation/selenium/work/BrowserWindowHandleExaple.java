package com.ati.pune.automation.selenium.work;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowHandleExaple {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\BasicJavaWork\\Automation\\Driver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://google.com");
        System.out.println("Browser Opened");
        //max
        driver.manage().window().maximize();
        
        Thread.sleep(5000);
        //get size
       Dimension windodowsize= driver.manage().window().getSize(); 
       System.out.println(windodowsize);
       
       Thread.sleep(5000);
        //set      new size
       Dimension settime=new Dimension(windodowsize.getWidth()/2,windodowsize.getHeight()/2);
       driver.manage().window().setSize(settime);
       System.out.println(driver.manage().window().getSize());
       
       Thread.sleep(5000);
       //get position
       Point windowposition=driver.manage().window().getPosition();
       System.out.println(windowposition);
       
       Thread.sleep(5000);
       //set window position
       Point newpoints=new Point(200,400);
       driver.manage().window().setPosition(newpoints);
       
       System.out.println(driver.manage().window().getPosition());
       
       
       
       
	}

}
