package com.ati.pune.automation.selenium.work;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\BasicJavaWork\\Automation\\Driver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://demo.automationtesting.in/Alerts.html");
        System.out.println("Browser Opened");
        driver.manage().window().maximize();
        
        driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button")).click();
       Alert alt= driver.switchTo().alert();
       System.out.println(alt.getText());
       alt.accept();
       
       driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
       driver.findElement(By.xpath("//*[@id=\"CancelTab\"]/button")).click();
       Alert alt2= driver.switchTo().alert();
       System.out.println(alt2.getText());
       alt2.dismiss();
       driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")).click();
       driver.findElement(By.xpath("//*[@id=\"Textbox\"]/button")).click();
       Alert alt3= driver.switchTo().alert();
       System.out.println(alt3.getText());
       alt3.sendKeys("Amol");
       alt3.accept();

      String actualvalue=driver.findElement(By.xpath("//*[@id=\"demo1\"]")).getText();
      String expectedvalue="Hello Amol How Are You Today";
      if(expectedvalue.equalsIgnoreCase(actualvalue))
      {
    	  System.out.println("PASS");
    	  
      }
      else {
    	  System.out.println("FAIL");
      }
         
        
	}

}
