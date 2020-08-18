package com.wordpress.qa.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amazon.qa.base.TestBase;
import com.amazon.qa.pages.COLLABSPage;
import com.amazon.qa.pages.IndexPage;
import com.amazon.qa.pages.MarathiPage;

public class COLLABSPageTest extends TestBase {

	IndexPage IndexPag;
	COLLABSPage COLLABSPage;	
		
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
			action.moveToElement(driver.findElement(By.xpath("//li[@id='shopkeeper-menu-item-5026']/a[1]"))).build().perform();
			driver.findElement(By.xpath("//a[@href='https://adimanav.com/girlfriend/']")).click();
		
		}
}
