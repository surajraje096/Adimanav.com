package com.amazon.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.qa.actiondriver.Action;
import com.amazon.qa.base.TestBase;

public class IndexPage extends TestBase {

	@FindBy(xpath = "(//span[@class='tools_button_icon']//i)[2]")
	WebElement signin;

	
	@FindBy(xpath = "//img[@alt='Adimanav.com']")
	WebElement logo;
	
	@FindBy(id = "search_query_top")
	WebElement searchProductBox;
	
	@FindBy(xpath = "//li[@id='shopkeeper-menu-item-66']//a")
	WebElement shop;

	@FindBy(linkText = "Login")
	WebElement login;
	
	
	public IndexPage() {
		PageFactory.initElements(driver, this);
	}

	public void clickonsingin(String user, String pass) throws Throwable {
		Action.click(driver, signin);
		driver.findElement(By.id("username")).sendKeys(user);
		driver.findElement(By.id("password")).sendKeys(pass);
	}

	public boolean validatelogo() throws Throwable {
		return Action.isDisplayed(driver, logo);
	}

	
	public void LoginBtn() throws Throwable {
		Action.click(driver, signin);
	}
	
	public String getmystoarTital() {
		String mystoarTital = driver.getTitle();
		return mystoarTital;
	}
	public void SearchProduct() throws Throwable {
		Thread.sleep(3000);
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//li[@id='shopkeeper-menu-item-66']//a"))).build().perform();
		driver.findElement(By.xpath("//a[@href='https://adimanav.com/product-category/marathi/']")).click();
		
	}
	
	public boolean verifyLoginPage() {
		boolean lo=login.isDisplayed();
		return lo;
	}
	
}
