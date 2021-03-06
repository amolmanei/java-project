package com.ati.pune.automation.selenium.work;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindoweHandelesExample {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\\\BasicJavaWork\\\\Automation\\\\Driver\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Windows.html");
        driver.manage().window().maximize();
        
        // parent window which is the one first opened
        String pwindow=driver.getWindowHandle();
        System.out.println("parent window handle id:"+pwindow);
        System.out.println("parent window title:"+driver.getTitle());
        
        //started opening new window/tab
        
       // driver.findElement(By.xpath("//*[@id=\"Tabbed\"]/a/button")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
        
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"Seperate\"]/button")).click();
        
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"Multiple\"]/button")).click();

        
         //switch to a perticuler window,then print the unique id and print title
        Set<String> allwindows=driver.getWindowHandles();
        
        
        for (String currentwin : allwindows) {
        	if(!currentwin.equalsIgnoreCase(pwindow))
        	{
        	driver.switchTo().window(currentwin);
        	System.out.println(currentwin);
        	System.out.println(driver.getTitle());
        	driver.close();
        	}
        	
			
		
        }    
        
	}

}
