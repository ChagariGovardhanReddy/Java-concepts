/*Case Study 6 : JavaScript Executor and Screenshot
Objective: To invoke the concept of JavaScript executor and to take a screenshot.	

Description:
You must use the concept of JavaScript executor to perform the actions on the located elements. 
(Use JavaScript executor for entering text, clicking on element, scrolling page, highlighting).

Application Information
We will be using a web page(http://www.google.com/) for this exercise. 

Tasks: 
1. Go to the URL provided.
2. Enter the text “Selenium” in the search box.
3. Highlight the search text box with yellow color.
4. Click on the Search button.
5. Take a screenshot of the search results page. 
6. Close the browser.
*/

package test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CaseStudy6 {
	public static WebDriver driver;
	String Url="http://www.google.com/";
	
	@Test
	public void javaScriptExecutorAndScreenshot() throws IOException {
         driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get(Url);
		
		WebElement searchBox = driver.findElement(By.id("APjFqb"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].value='Selenium'",searchBox);
        js.executeScript("arguments[0].style.background= 'yellow'", searchBox);
        js.executeScript("arguments[0].click();",searchBox);
        
        
        TakesScreenshot SS =((TakesScreenshot)driver);
        File SrcFile=SS.getScreenshotAs(OutputType.FILE);
        File DestFile=new File(".\\ScreenShots\\caseStudy6Result.png"); 
        FileUtils.copyFile(SrcFile, DestFile);
        
        js.executeScript("window.scrollBy(0,250)");
        
        driver.quit();
	}

}
