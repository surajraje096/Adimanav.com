package com.amazon.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.qa.actiondriver.Action;
import com.amazon.qa.base.TestBase;

public class MarathiPage extends TestBase{
	
	@FindBy(xpath = "//li[@id='shopkeeper-menu-item-66']//a")
	WebElement shop;
	
	@FindBy(xpath = "//*[@class='product_thumbnail ']")
	WebElement products;

	public MarathiPage() {
		PageFactory.initElements(driver, this);
	}

	
	public void MarathiBtn() {
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("(//a[@href='https://adimanav.com/product-category/marathi/'])[2]"))).build().perform();
		driver.findElement(By.xpath("(//a[@href='https://adimanav.com/product-category/marathi/'])[3]")).click();	
	}
	
	public void countProduct() {
	int count =driver.findElements(By.xpath("//*[@class='product_thumbnail ']")).size();
	System.out.println(count);
	}
	
	
	
	
	
	

}
