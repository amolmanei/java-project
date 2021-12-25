package com.ati.pune.automation.selenium.work;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownExample {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\BasicJavaWork\\Automation\\Driver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("file:///C:/TESTING%20MY%20WORK/JAVA%20AUTOMATION%20CLASS%20VIDEOS/SOFTWARE%20DATA/DemoATIPune.html");
        System.out.println("Browser Opened");
        driver.manage().window().maximize();
        System.out.println("------------------------Singleselection-------------------------------------------");
        WebElement dropdown=driver.findElement(By.xpath("//*[@id=\"form1\"]/select"));
        
        Select sle=new Select(dropdown);
		
		sle.selectByValue("yellow");
		Thread.sleep(5000);
		sle.selectByVisibleText("Green");
		Thread.sleep(5000);
		sle.selectByIndex(0);
		//sle.deselectByValue("blue");
		//sle.deselectAll();
		List<WebElement> ele= sle.getOptions();
		for (WebElement we : ele) {
		System.out.println(we.getText());
			
		}
		System.out.println("-------------------------Multiselection--------------------------------------------");
	     
        WebElement multidropdown=driver.findElement(By.xpath("//*[@id=\"form2\"]/select"));
        
        Select msle=new Select(multidropdown);
		
		msle.selectByValue("yellow");
		Thread.sleep(5000);
		msle.selectByVisibleText("Green");
		Thread.sleep(5000);
		msle.selectByIndex(0);
		msle.deselectByIndex(1);
		System.out.println("****************************************");
		List<WebElement> opnsellist=msle.getAllSelectedOptions();
		for (WebElement options : opnsellist) {
			System.out.println(options.getText());
		}		
		System.out.println("****************************************");
		
		List<WebElement> ops= msle.getOptions();
		for (WebElement op : ops) {
		System.out.println(op.getText());
		}	
	  }
}	


 
