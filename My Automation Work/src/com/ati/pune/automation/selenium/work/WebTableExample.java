package com.ati.pune.automation.selenium.work;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableExample {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\BasicJavaWork\\Automation\\Driver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("file:///C:/TESTING%20MY%20WORK/JAVA%20AUTOMATION%20CLASS%20VIDEOS/SOFTWARE%20DATA/DemoATIPune.html");
        System.out.println("Browser Opened");
        driver.manage().window().maximize();
        
        WebElement table=driver.findElement(By.tagName("table"));
        List<WebElement> rowes=table.findElements(By.tagName("tr"));//getting all the rows
        
        for (WebElement eachroes : rowes) { //1=>5
        	//th
        	 List<WebElement> thead=eachroes.findElements(By.tagName("th"));
        	for (WebElement th : thead) {//th1=>3
        		System.out.print(th.getText()+"  ");
				
			}
        	//td
       	 List<WebElement> data=eachroes.findElements(By.tagName("td"));
     	for (WebElement td : data) { //td 1=>3
     		System.out.print(td.getText()+"  ");
				
			
		}
     	System.out.println();
        }
	}
}