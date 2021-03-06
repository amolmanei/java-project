package com.ati.pune.automation.selenium.work;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CookieExample {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\BasicJavaWork\\Automation\\Driver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://flipkart.com");
        System.out.println("Browser Opened");
        driver.manage().window().maximize();
        
        Cookie mycookie=new Cookie("username","Amol");//selenium import
        driver.manage().addCookie(mycookie);
        driver.manage().addCookie(new Cookie("life","long"));
        System.out.println(driver.manage().getCookieNamed("username"));
        Set<Cookie> cookies=driver.manage().getCookies();
        System.out.println(cookies);
        
        System.out.println("*************************************************");
        driver.manage().deleteCookie(mycookie);
        driver.manage().deleteCookieNamed("life");
        driver.manage().addCookie(new Cookie("GOOD","BYE"));
        System.out.println("***************************");
        Set<Cookie> cookiesnew=driver.manage().getCookies();
      System.out.println(cookiesnew);
      
      driver.manage().deleteAllCookies();
      
       System.out.println("*********************************************");
       Set<Cookie> afterdelete=driver.manage().getCookies();
       System.out.println(afterdelete);
       
       driver.quit();
       
        
        
        
        
        
        
        
        
        
        
        
	}

}
