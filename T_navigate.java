package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class T_navigate extends all{
	
	@Test (priority = 0)
	public void test1() {
		driver.get("https://member.daraz.com.bd/user/register?spm=a2a0e.login_signup.0.0.1bcf2829I2ViYh&redirect=https%3A%2F%2Fwww.daraz.com.bd%2F");
		driver.manage().window().maximize();
	}
	
	@Test (priority = 1)
	public void navigate() throws InterruptedException {
		
		//driver.findElement(By.linkText("Login")).click();
		
		WebElement login = driver.findElement(By.linkText("Login"));
		login.click();
		Thread.sleep(1000);
		
		driver.navigate().back();
		Thread.sleep(3000);
		
		driver.navigate().forward();
		Thread.sleep(3000);
		
		driver.navigate().refresh();
		Thread.sleep(3000);
	}

}
