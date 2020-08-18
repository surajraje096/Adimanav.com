package com.wordpress.qa.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\JARs\\chromeSelinium\\Chrome83\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://adimanav.com/");
		driver.manage().window().maximize();
		/*Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//li[@id='shopkeeper-menu-item-66']//a"))).build().perform();
		driver.findElement(By.xpath("//a[@href='https://adimanav.com/product-category/marathi/']")).click();
		*/
		driver.findElement(By.xpath("(//span[@class='tools_button_icon'])[2]")).click();
		driver.findElement(By.linkText("Register")).click();
		Thread.sleep(3000);
		//driver.findElement(By.id("reg_email")).sendKeys("Surajraje096@gmail.com");
		driver.findElement(By.id("reg_email")).sendKeys("hello");
		
		driver.findElement(By.name("register")).click();
		
	 String str=driver.findElement(By.xpath("")).getText();
	 System.out.println(str);
		
		
		
	}

}
