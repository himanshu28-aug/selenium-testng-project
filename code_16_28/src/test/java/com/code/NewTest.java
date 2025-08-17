package com.code;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
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
