/*Case Study 4 : Handling Dropdown
Objective: To understand the basic selenium operations like handling drop-down and capturing the error message.

Description:
Pick one of the popular social websites. You must choose options from drop-down and display the error message in the console(Example: Facebook)
Application Information
We will be using a web page(http://www.facebook.com) for this exercise. 
Tasks:

1. Go to the URL provided.
2. Click on Create New Account.
3. Fill in the first name, last name and give a 9-digit mobile number. Enter a password.
4. Select the date of birth from the drop-down using Select class.
5. Select gender and click on sign up button.
6. Fetch the error message and display it in the console.
7. Close the browser.
*/



package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class CaseStudy4 {
	
	public static WebDriver driver;
	String Url="http://www.facebook.com";
	@Test
	public void handlingDropdown() throws InterruptedException {
		
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get(Url);
		
		driver.findElement(By.xpath("//a[@role='button' and @rel='async']")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//Fill in the first name, last name and give a 9-digit mobile number. Enter a password.
		
		WebElement firstName=driver.findElement(By.xpath("//input[@name='firstname']"));
		firstName.sendKeys("selenium");
		WebElement lastName=driver.findElement(By.xpath("//input[@name='lastname']"));
		lastName.sendKeys("training");
		WebElement mobilenum=driver.findElement(By.xpath("//input[@name='reg_email__']"));
		mobilenum.sendKeys("123456789");
		WebElement passwd=driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
		passwd.sendKeys("Sele123@");
		
		//Select the date of birth from the drop-down using Select class.
		
		Select dayDropdown=new Select(driver.findElement(By.xpath("//select[@name='birthday_day']")));
		dayDropdown.selectByValue("14");
		
		Select monthDropdown=new Select(driver.findElement(By.xpath("//select[@name='birthday_month']")));
		monthDropdown.selectByVisibleText("Aug");
		
		Select yearDropdown=new Select(driver.findElement(By.xpath("//select[@name='birthday_year']")));
		yearDropdown.selectByVisibleText("2001");
		
		//Select gender and click on sign up button.
		WebElement genderRadioBtn=driver.findElement(By.xpath("(//label[@class='_58mt'])[1]"));
		genderRadioBtn.click();
		
		WebElement signUpBtn= driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		signUpBtn.click();
		
		Thread.sleep(3000);
		//Fetch the error message and display it in the console.
		String errorMsg=driver.findElement(By.xpath("/html/body/div[4]/div/div/div")).getText();

        System.out.println(errorMsg);
		
      
		driver.quit();
	}

}
