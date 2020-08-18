package com.amazon.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.qa.base.TestBase;

public class COLLABSPage extends TestBase{
	
	@FindBy(xpath = "//li[@id='shopkeeper-menu-item-66']//a")
	WebElement shop;

	public COLLABSPage() {
		PageFactory.initElements(driver, this);
	}

	
	public void MarathiBtn() {
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("(//a[@href='https://adimanav.com/product-category/marathi/'])[2]"))).build().perform();
		driver.findElement(By.xpath("(//a[@href='https://adimanav.com/product-category/marathi/'])[3]")).click();
	
		
	}

}
