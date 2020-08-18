package com.wordpress.qa.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amazon.qa.base.TestBase;
import com.amazon.qa.pages.IndexPage;
import com.amazon.qa.pages.MarathiPage;

public class MarathiPageTest extends TestBase{

IndexPage IndexPag;
MarathiPage MarathiPag;	
	
	@BeforeMethod
	public void setup() {
		initialization();
		 app_logs.debug("lonch the chrome browser");
	}
	@AfterMethod
	public void teardown() {
		driver.quit();
		app_logs.debug("close the chrome browser");
	}
	@Test(priority =1)
	public void verifilogo()  {
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("(//a[@href='https://adimanav.com/product-category/marathi/'])[2]"))).build().perform();
		driver.findElement(By.xpath("(//a[@href='https://adimanav.com/product-category/marathi/'])[3]")).click();
	
	}
	
	@Test(priority =2)
	public void products()  {
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("(//a[@href='https://adimanav.com/product-category/marathi/'])[2]"))).build().perform();
		int count =driver.findElements(By.xpath("//*[@class='product_thumbnail ']")).size();
		System.out.println(count);
		
		
	}
}
