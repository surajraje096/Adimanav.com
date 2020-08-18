package com.wordpress.qa.testcases;


import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.amazon.qa.base.TestBase;
import com.amazon.qa.pages.IndexPage;



public class IndexPageTest extends TestBase{
	
	IndexPage IndexPag;
	
	
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
	public void verifilogo() throws Throwable {
		IndexPag = new IndexPage();
		boolean result =IndexPag.validatelogo();
		Assert.assertTrue(result);
		app_logs.debug("verifi logo");
	}
	
	@Test(priority=2)
	public void verifieTital() throws Throwable {
		app_logs.debug("verifi tital");
	String actTital=IndexPag.getmystoarTital();
	Assert.assertEquals(actTital, "Adimanav.com - Geekiest online store of graphic t-shirts, badges, mugs");
	}

	@Test(priority=3)
	public void searchProduct() throws Throwable {
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//li[@id='shopkeeper-menu-item-66']//a"))).build().perform();
		driver.findElement(By.xpath("//a[@href='https://adimanav.com/product-category/marathi/']")).click();
		driver.findElement(By.xpath("//span[@class='product_thumbnail_background']")).click();
		Select select = new Select(driver.findElement(By.id("pa_size")));
		select.selectByIndex(1);
		driver.findElement(By.name("quantity")).click();
		driver.findElement(By.xpath("//button[contains(@class,'single_add_to_cart_button button')]")).click();
		
	}

}
