package com.ati.pune.automation.selenium.work;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameExample {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\\\BasicJavaWork\\\\Automation\\\\Driver\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/frames");
        driver.manage().window().maximize();
        //simple frame
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"frame1\"]")));
        System.out.println(driver.findElement(By.xpath("//*[@id=\"sampleHeading\"]")).getText());
        
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"frame2\"]")));
        System.out.println(driver.findElement(By.xpath("//*[@id=\"sampleHeading\"]")).getText());
        
        driver.switchTo().defaultContent();
        System.out.println(driver.findElement(By.xpath("//*[@id=\"framesWrapper\"]/div[1]")).getText());

        
        
	}

}
