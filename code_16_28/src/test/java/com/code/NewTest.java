package com.code;

import java.awt.print.Pageable;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest {
	WebDriver driver;
  @Test
  public void f() {
	  
	 System.setProperty("webdriver.edge.driver", "C:\\Users\\hg198\\Downloads\\edgedriver_win64 (1)\\msedgedriver.exe");
	 driver = new EdgeDriver();
	 
	 try {
		 driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(3000));
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		 driver.get("https://www.saucedemo.com/");
		 driver.manage().window().maximize();
		 System.out.println("Reached maximun screen");
		 Thread.sleep(5000);
		 
		WebElement logo= driver.findElement(By.xpath("//div[@class = 'login_logo']"));
		WebElement userName = driver.findElement(By.name("user-name"));
		userName.sendKeys("standard_user");
		System.out.println("Able to put userName");
		
		WebElement password=driver.findElement(By.name("password"));
		password.sendKeys("secret_sauce");
		System.out.println("Able to pass password");
		
		WebElement button=driver.findElement(By.id("login-button"));
		button.click();
		System.out.println("Able to click");
		Thread.sleep(5000);
		
		String actualTitle= driver.getTitle();
		String expectedTitle = "Swag Labs";
		Assert.assertEquals(actualTitle, expectedTitle,"Title do not match");
		System.out.println("Able to check ");
		
		WebElement product= driver.findElement(By.className("inventory_item_name"));
		product.click();
		Thread.sleep(2000);
		System.out.println("Now product is fetched successfully");
		
		
		WebElement cartAdd =driver.findElement(By.id("add-to-cart"));
		cartAdd.click();
		System.out.println("Now product is added to cart successfully");
		
		WebElement shoppingCart =driver.findElement(By.className("shopping_cart_link"));
		shoppingCart.click();
		System.out.println("Now product is added to shopping  successfully");
		
		WebElement checkoutButton =driver.findElement(By.id("checkout"));
		checkoutButton.click();
		System.out.println("Now product is checked out  successfully");
		
		WebElement firstName=driver.findElement(By.name("firstName"));
		firstName.sendKeys("Himanshu");
		
		WebElement lastName=driver.findElement(By.name("lastName"));
		lastName.sendKeys("Gupta");
		
		WebElement postalCode=driver.findElement(By.name("postalCode"));
		postalCode.sendKeys("485001");
		
		
		WebElement continueButton =driver.findElement(By.id("continue"));
		continueButton.click();
		System.out.println("Continued Successfully");
		
		WebElement finishButton =driver.findElement(By.id("finish"));
		finishButton.click();
		System.out.println("Finished Successfully");
		
		Thread.sleep(2000);
		
//		driver.navigate().back();
//		Thread.sleep(5000);
//		
		WebElement menuButton = driver.findElement(By.id("react-burger-menu-btn"));
		menuButton.click();
		System.out.println("Clicked menu button success");
		Thread.sleep(2000);
		
		WebElement logout = driver.findElement(By.id("logout_sidebar_link"));
		logout.click();
		System.out.println("Logged out successfully");
		Thread.sleep(2000);
	 }
	 catch (Exception e) {
		 System.out.println("Website is having error");
		// TODO: handle exception
	}
	 finally {
		 driver.quit();
		
	}
  }
  
}
