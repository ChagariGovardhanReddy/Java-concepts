/*Case Study 7 : Executing JavaScript
Objective: To understand the basic selenium of JavaScript executor.  Do the selenium operations like finding elements and submitting the form using JavaScript executor.

Application Information
We will be using a web page(https://www.globalsqa.com/samplepagetest/) for this exercise.

Task: 
Use JavaScript executor to submit the form.
(Uploading file is not mandatory)
*/

package test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CaseStudy7 {
	public static WebDriver driver;
	String Url="https://www.globalsqa.com/samplepagetest/";
	
	@Test
	public void ExecutingJavaScript() {
         driver=new ChromeDriver();
		
		driver.manage().window().maximize();

		driver.get(Url);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.getElementById('g2599-name').value='Selenium'");
        js.executeScript("document.getElementById('g2599-email').value='Abc123@gmail.com'");
        js.executeScript("document.getElementById('g2599-website').value='https://www.globalsqa.com/samplepagetest/'");
        
        js.executeScript("return document.getElementById('g2599-experienceinyears').selectedIndex = '2' ");
        
        js.executeScript("document.getElementsByClassName('grunion-checkbox-multiple-label checkbox-multiple')[1].click()");
        js.executeScript("document.getElementsByClassName('grunion-radio-label radio')[0].click()");
        
        driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
        driver.switchTo().alert().accept();
        driver.switchTo().alert().accept();
        
        js.executeScript("document.getElementById('contact-form-comment-g2599-comment').value='JavaScript executor'");  
        js.executeScript("document.getElementsByClassName('pushbutton-wide')[0].click()");
        
        driver.quit();
        
	}

}
