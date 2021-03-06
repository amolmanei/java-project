package com.ati.pune.automation.selenium.work;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinksExample {
	
public static WebDriver driver;
public static void openBrowser()
{
	System.setProperty("webdriver.chrome.driver", "C:\\BasicJavaWork\\Automation\\Driver\\chromedriver.exe");
     driver=new ChromeDriver();
    driver.get("https://facebook.com");
    System.out.println("Browser Opened");
    driver.manage().window().maximize();
    
}
 public static void verifyBrokenlinks(String linkurl) throws IOException 
 {
	URL url=new URL(linkurl);
	//connection establish
	HttpURLConnection connection=(HttpURLConnection)url.openConnection();
	connection.setConnectTimeout(3000);
	connection.connect();
	//Responce
	if(connection.getResponseCode()==200)
	{
		System.out.println("valid link==>"+connection.getResponseMessage()+url);
	}
	if (connection.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND) {
	{
		System.out.println("Broken link==>"+connection.getResponseMessage()+url);

	}
		
	}
 }

	public static void main(String[] args) throws IOException {
        openBrowser();
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("Total links are:"+links.size());
		for (WebElement link : links) {
		String url=link.getAttribute("href");
		verifyBrokenlinks(url);
		
		
		}
		
		
		
		
	}

}
