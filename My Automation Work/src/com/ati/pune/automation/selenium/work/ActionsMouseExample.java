package com.ati.pune.automation.selenium.work;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionsMouseExample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\BasicJavaWork\\Automation\\Driver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://demoqa.com/droppable");
        System.out.println("Browser Opened");
        driver.manage().window().maximize();
        
        Actions builder=new Actions(driver);

        
        //move the mouse to a perrticuler element and perform the opertion
        WebElement ele=driver.findElement(By.xpath("//*[@id=\"droppableExample-tab-accept\"]"));
        builder.moveToElement(ele).click().perform();
        
        WebElement ele1=driver.findElement(By.xpath("//*[@id=\"droppableExample-tab-simple\"]"));
        builder.moveToElement(ele1).click().perform();
        //drag and drop
        WebElement from=driver.findElement(By.xpath(" //*[@id=\"draggable\"]"));
        WebElement to=driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
        Action act=builder.dragAndDrop(from, to).build();
        act.perform();
        System.out.println(to.getText());
        
        Thread.sleep(5000);
        
        //double click
        WebElement doubleclick=driver.findElement(By.xpath(" //*[@id=\"app\"]/div/div/div[1]/div"));
        Action act3=builder.doubleClick(doubleclick).build();
        act3.perform();
        
        Thread.sleep(5000);

        //right click
        WebElement rightclick=driver.findElement(By.xpath(" //*[@id=\"app\"]/div/div/div[1]/div"));
        Action act4=builder.contextClick(rightclick).build();
        
        Thread.sleep(5000);

        act4.perform();
        
        driver.close();
	}

}
