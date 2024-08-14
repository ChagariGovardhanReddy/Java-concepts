/*Case study 8: Working with Alerts and Pop-ups

Objective: To understand the basic selenium operations like invoking the driver, identifying the web element and specifically to work with alert.
Application Information
We will be using a web page (http://demo.seleniumeasy.com/javascript-alert-box-demo.html) for this exercise. 



Tasks:
1. Open the URL in browser.
2. Locate the element “click me” button
3. Click on “click me” button.
4. Handel the alert.
5. Click “ok” on the alert box.

*/


package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class CaseStudy8 {
	public static WebDriver driver;
	String Url="http://demo.seleniumeasy.com/javascript-alert-box-demo.html";
	
	@Test
	public void alertsAndPopUps() throws InterruptedException {
         driver=new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get(Url);
		WebElement Clickme=driver.findElement(By.xpath("//button[@class='btn btn-default']"));
		Clickme.click();
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']")).click();
        Thread.sleep(3000);
        driver.switchTo().alert().accept();
        Thread.sleep(3000);
        
        driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']")).click();
        Thread.sleep(3000);
        driver.switchTo().alert().dismiss();

        driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']")).click();
        Thread.sleep(3000);
        driver.switchTo().alert().sendKeys("Selenium");

        Thread.sleep(3000);

        driver.switchTo().alert().accept();
        Thread.sleep(3000);


		driver.quit();
		
	}


}
