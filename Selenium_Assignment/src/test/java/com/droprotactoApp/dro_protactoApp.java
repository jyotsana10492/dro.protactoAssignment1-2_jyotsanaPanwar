package com.droprotactoApp;

import java.awt.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * 
 * @author jyotsana
 */

public class dro_protactoApp {
	
	private static final String LoginTitle = null;
	private static final String Homepage = null;

	@Test
	public static void Demo_tc02(String[] args) {  
	System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\jars\\chromedriver.exe");  
	 WebDriver driver=new ChromeDriver();  
	  
     // Launch Website  
driver.navigate().to("https://dro.protacto.com/login"); 
// enter the username
driver.findElement(By.xpath("//input[@type='text']")).sendKeys("dro@admin.com"); 
//enter the password
driver.findElement(By.xpath("//input[@name='password']")).sendKeys("password"); 
//click on submit button
driver.findElement(By.xpath("//button[@type='submit']")).click(); 

// click on add investment
driver.findElement(By.xpath("//a[contains(@class,'btn btn btn-default d-inline-block v-align-middle')]")).click();

//click on investment  navigator after creating dummy investment
driver.findElement(By.xpath("//li[contains(@class,'mb-2')]//i[contains(@class,'fa fa-envelope')]")).click();

//click on investment by portfolio 
driver.findElement(By.linkText("Investments by Portfolio")).click();


//click on portfolio analysis
driver.findElement(By.xpath("//li[contains(@class,'mb-2')]//i[contains(@class,'fa fa-edit')]")).click();

//click on All portfolio
driver.findElement(By.linkText("All Portfolio")).click();

//click on view investment
//driver.findElement(By.linkText("View")).click();

//click on dashboard
driver.findElement(By.xpath("//li[contains(@class,'mb-2')]//i[contains(@class,'fa fa-th-large')]")).click();

//click on view investment in recent activities
driver.findElement(By.linkText("View Investment")).click();


//verification of home page
Assert.assertEquals(Homepage, "https://dro.protacto.com");
Assert.assertEquals(LoginTitle,"https://dro.protacto.com/login");
 



}}