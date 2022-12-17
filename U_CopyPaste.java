package practice;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class U_CopyPaste extends all{
	
	@Test (priority = 0)
	public void open() {
		
		driver.get("https://demoqa.com/text-box");
		driver.manage().window().maximize();
		
	}

	@Test (priority = 1)
	public void copypaste() throws InterruptedException {
		
		
		
		WebElement name = driver.findElement(By.xpath("//input[@id='userName']"));
		WebElement email = driver.findElement(By.xpath("//input[@id='userEmail']"));
		WebElement Current_address = driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
		WebElement permanent_address = driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));
		
		name.sendKeys("ishu");
		Thread.sleep(3000);
		email.sendKeys("test@gmail.com");
		Thread.sleep(3000);
		Current_address.sendKeys("Naogaon");
		Thread.sleep(3000);
	
		//select control a
		Actions action = new Actions(driver);
		action.keyDown(Keys.CONTROL);
		action.sendKeys("a");
		action.keyUp(Keys.CONTROL);
		action.build().perform();
		
		
		//copy
		action.keyDown(Keys.CONTROL);
		action.sendKeys("c");
		action.keyUp(Keys.CONTROL);
		action.build().perform();
		
		
		//tab
		action.sendKeys(Keys.TAB);
		action.build().perform();
		
		//paste	
		action.keyDown(Keys.CONTROL);		
		action.sendKeys("v");
		action.keyUp(Keys.CONTROL);
		action.build().perform();
		Thread.sleep(3000);
		
		WebElement submit = driver.findElement(By.xpath("//button[@id='submit']"));
		submit.click();
		Thread.sleep(9000);
		
	}
}
