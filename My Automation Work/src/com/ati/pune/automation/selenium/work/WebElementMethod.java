package com.ati.pune.automation.selenium.work;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethod {

	

	public static void main(String[] args){
//1.identify the element
//2.actions on the element.
		System.out.println("chrome brower started");
		System.setProperty("webdriver.chrome.driver", "C:\\\\BasicJavaWork\\\\Automation\\\\Driver\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/ap/register?showRememberMe=true&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2F%3Fref_%3Dnav_ya_signin&prevRID=F9B01GMPFFNCPYZRCM8Z&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&prepopulatedLoginId=&failedSignInCount=0&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&pageId=usflex&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
        driver.manage().window().maximize();
        
        WebElement login_header=driver.findElement(By.xpath("//*[@id=\"ap_register_form\"]/div/div/h1"));
        String ActualHeadertext=login_header.getText();
        System.out.println(ActualHeadertext);
        String expectedtext="Creat Account";
        if(expectedtext.equalsIgnoreCase(ActualHeadertext))
        {
        	System.out.println("TEST CASE PASS");
        }
        else
        	System.out.println("TEST CASE FAIL");
        
        
        
        WebElement yuor_Name_Element=driver.findElement(By.name("customerName"));
        yuor_Name_Element.sendKeys("AMOL INDRAJEET MANE");
        
        
        System.out.println(yuor_Name_Element.getAttribute("name"));
        System.out.println(yuor_Name_Element.getAttribute("type"));
        System.out.println(yuor_Name_Element.getAttribute("id"));
        System.out.println(yuor_Name_Element.getLocation());
        System.out.println(yuor_Name_Element.isDisplayed());
        System.out.println(yuor_Name_Element.isEnabled());
        System.out.println(yuor_Name_Element.isSelected());
       
    
        
       // driver.findElement(By.xpath("//*[@id=\"ap_customer_name\"]"));
       // driver.findElement(By.id("ap_customer_name"));
        
        WebElement your_Email_Id=driver.findElement(By.xpath("//*[@id=\"ap_email\"]"));


        
        your_Email_Id.sendKeys("amolmanedhanno@gmail.com");
        
        WebElement your_Password=driver.findElement(By.xpath("//*[@id=\"ap_password\"]"));
        your_Password.sendKeys("Amolraje@143");
         
        WebElement your_Re_enter_Password=driver.findElement(By.xpath("//*[@id=\"ap_password_check\"]"));
        your_Re_enter_Password.sendKeys("Amolraje@143");
        
        
        WebElement click_buttun=driver.findElement(By.xpath("//*[@id=\"continue\"]"));
        click_buttun.click();
        
        driver.navigate().to("https://www.amazon.com/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2Fb%2F%3F_encoding%3DUTF8%26node%3D13270229011%26ref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
        WebElement dvr=driver.findElement(By.linkText("Conditions of Use"));
        dvr.click();
       driver.navigate().back();
       
       WebElement Pdvr=driver.findElement(By.partialLinkText("Conditions"));
       Pdvr.click();
       
       WebElement class_fm=driver.findElement(By.className("cs-help-title"));
      System.out.println(class_fm.getText());
       
    System.out.println("PROGRAM IS SUCCESSFUL AUTOMATED");
    
        driver.close();
        


	
        
        
        
        
        
        
	}

}
