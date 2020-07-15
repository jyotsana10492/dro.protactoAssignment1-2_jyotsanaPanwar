package com.droprotactoApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/**
 * 
 * @author jyotsana
 */

public class dro_protactoApp2 {
	
	@Test
	
	public static void create_Tc01(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\jars\\chromedriver.exe");  
	 WebDriver driver=new ChromeDriver();  
		  
	// Launch Website  
	driver.navigate().to("https://dro.protacto.com/login"); 
	//uname
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("dro@admin.com"); 
	//password
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("password"); 
	//submit button
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	//click on admin setting
	driver.findElement(By.xpath("//ul[contains(@class,'nav navbar-nav navbar-right navbar-top-links m-0')]//button[@class='btn btn-default dropdown-toggle']")).click();
	//click on admin details
	driver.findElement(By.xpath("//div[@class='dropdown open']//a[contains(text(),'Users')]")).click();
    //click on show details
	driver.findElement(By.linkText("Show")).click();

	}

}
