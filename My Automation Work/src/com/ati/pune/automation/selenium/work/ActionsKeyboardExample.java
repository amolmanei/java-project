package com.ati.pune.automation.selenium.work;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsKeyboardExample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\BasicJavaWork\\Automation\\Driver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://demoqa.com/text-box");
        System.out.println("Browser Opened");
        driver.manage().window().maximize();
        
        Actions builder=new Actions(driver);
        
        driver.findElement(By.xpath("//*[@id=\"currentAddress\"]")).sendKeys("latur");
        
        //ctrl+
        builder.keyDown(Keys.CONTROL)
               .sendKeys("a")
               .keyUp(Keys.CONTROL)
               .build().perform();
               
        
        //ctrl+c
        builder.keyDown(Keys.CONTROL)
        .sendKeys("c")
        .keyUp(Keys.CONTROL)
        .build().perform();
 
       builder.sendKeys(Keys.TAB).build().perform(); 
       
       //ctrl+v
       builder.keyDown(Keys.CONTROL)
       .sendKeys("v")
       .keyUp(Keys.CONTROL)
       .build().perform();

       
       Thread.sleep(5000);
       

	}

}
