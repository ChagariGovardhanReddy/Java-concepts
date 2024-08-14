/*Case study 10: Handling Frames and Windows:
Objective: To understand the basic selenium operations like invoking the driver, finding the web element across multiple windows.

Application Information
We will be using a web page (https://www.globalsqa.com/demo-site/frames-and-windows/) for this exercise. 

Tasks:
1. This application runs on multiple windows. Click on “Open New Window” and then click on “Click Here”.
2. Handle the new window.
3. Check If the new window id is different from the parent window id.




*/
package test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
import org.testng.annotations.Test;

public class CaseStudy10 {
	
	public static WebDriver driver;
	String Url="https://www.globalsqa.com/demo-site/frames-and-windows/";
	
	@Test
	public void HandlingFramesAndWindows() throws InterruptedException {
         driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get(Url);
		Thread.sleep(3000);
		
		WebElement element = driver.findElement(By.xpath("//*[@id=\"post-2632\"]/div[2]/div/div/div[2]/div/em/strong"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);
		
		//WebElement OpenNewWindow=driver.findElement(By.xpath("//h2[contains(text(),'Open New Window')]"));
		//OpenNewWindow.click();
		
		
		WebElement clickHere=driver.findElement(By.xpath("//*[@id=\"post-2632\"]/div[2]/div/div/div[2]/a"));
		clickHere.click();
		 
		Set<String> s=driver.getWindowHandles();
		ArrayList<String> ar= new ArrayList<String>(s);
		
		System.out.println("parent window id" +ar.get(0));
		System.out.println("new window id" +ar.get(1));
		driver.switchTo().window((String)ar.get(1));
		

		WebElement ele1 = driver.findElement(By.xpath("//*[@id=\"post-2632\"]/div[2]/div/div/div[1]/div/em/strong"));
		JavascriptExecutor executor1 = (JavascriptExecutor)driver;
		executor1.executeScript("arguments[0].click();", ele1);
		
		if(ar.get(0)==ar.get(1))
			System.out.println("new window id is same as the parent window id");
		else
			System.out.println("new window id is different from the parent window id");
		
		driver.quit();
//		Assert.assertEquals(ar.get(0), ar.get(1),"Item not matched");
//		if(ar.get(0).equals(ar.get(1)))
//			
//		{
//			System.out.println("Item name matched");
//			
//		}
	}

}
