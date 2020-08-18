/**
 * 
 */
package com.amazon.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.amazon.qa.actiondriver.Action;
import com.amazon.qa.base.TestBase;

public class LoginPage extends TestBase {

	@FindBy(xpath = "//*[@id=\"post-10\"]/div/div/div/div/div/ul/li[3]/a")
	WebElement Register;

	@FindBy(xpath = "(//input[contains(@class,'woocommerce-Input woocommerce-Input--text')])[3]")
	WebElement EMAILADDRESS;

	@FindBy(id = "username")
	WebElement user;
	
	@FindBy(id = "password")
	WebElement pass;
	
	@FindBy(id = "login")
	WebElement signbtn;

	@FindBy(xpath = "(//button[@class='woocommerce-Button button'])[2]")
	WebElement Registerbtn;

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	public boolean validateRegister() throws Throwable {
		return Action.isDisplayed(driver, Register);
	}

	public void registerClick() throws Throwable {
		driver.findElement(By.linkText("Register")).click();
	}
	public void loginDemo() throws Throwable {
		driver.findElement(By.id("username")).sendKeys("Surajraje096@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Suraj@123");
	}
	public void  Login(String use, String pas) throws Throwable {
	Action.type(user, use);
	Action.type(pass, pas);
	Action.click(driver, signbtn);

		}
	

	

}
