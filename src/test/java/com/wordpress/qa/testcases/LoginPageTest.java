package com.wordpress.qa.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.amazon.qa.base.TestBase;

import com.amazon.qa.pages.IndexPage;

import com.amazon.qa.pages.LoginPage;
import com.amazon.qa.util.testUtil;

public class LoginPageTest extends TestBase {

	IndexPage IndexPag;
	LoginPage LoginPage;

	@BeforeMethod
	public void setup() {
		initialization();
		IndexPag = new IndexPage();
	}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}

	@Test(dataProvider = "getData")
	public void AddtocartTest(String user, String Pass) throws Throwable {
		IndexPag.clickonsingin(user, Pass);
		boolean logo = IndexPag.verifyLoginPage();
		Assert.assertTrue(logo);
	}

/*	@Test()
	public void veryfi(String user, String Pass) throws Throwable {
		IndexPag.clickonsingin(user, Pass);
		boolean logo = IndexPag.verifyLoginPage();
		Assert.assertTrue(logo);
	}*/

	@DataProvider
	public static Object[][] getData() {
		return testUtil.getData("LoginTest");
	}

}
