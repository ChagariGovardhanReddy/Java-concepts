/*Case study 14: TestNG Implementation
Objective: To understand the testNG annotations and know the purpose of using annotations in the program

Description: Create a minimum of 3 test cases for the below scenarios. Use appropriate annotations and describe the test cases based on the priority (priority attribute must be used). Also use TestNG assertions to verify the name of the product searched.
Application Information
We will be using a web page (http://www.flipkart.com/) for this exercise.

Tasks:
1.	Go to the URL given above.
2.	Search for “Sony headphones” in the search box.
3.	Click on the book “SONY ZX110A Wired without Mic Headset” from the list of headphones in the search result. 
4.	Click on “Add to cart” option to buy the item from Flipkart site.
5.	Using TestNG assertions verify the Model name and number in the Add to cart page under product details. If the names match, print “Item name matched” in the console.
6.	Click on place order.
7.	Close the browser.

*/

package test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CaseStudy14 {
	String Url="http://www.flipkart.com/";
	public WebDriver driver;
	
	@BeforeTest
	public void testNGImplementation(){
	
	driver=new EdgeDriver();
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	
	driver.get(Url);
	}
	
	@Test(priority=0)
	public void searchingForDevice() {
//	WebElement searchBtn=driver.findElement(By.xpath("//input[@type='text']"));
//	searchBtn.click();
	WebElement searchItem=driver.findElement(By.xpath("//input[@type='text']"));
	searchItem.sendKeys("Sony headphones");
	searchItem.sendKeys(Keys.ENTER);
	
	}
	
	@Test(priority=1)
	public void addToCart() throws InterruptedException {
		
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,3500)");
		
		Thread.sleep(5000);
		WebElement item=driver.findElement(By.xpath("//a[@title='SONY ZX110A Wired without Mic Headset']"));
		item.sendKeys(Keys.ENTER);
		Set<String> s=driver.getWindowHandles();
		ArrayList<String> ar= new ArrayList<String>(s);
		
		System.out.println(ar.get(0));
		System.out.println(ar.get(1));
		driver.switchTo().window((String)ar.get(1));
		
		WebElement AddToCart=driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']"));
		AddToCart.click();
		
	}
	@Test(priority=2)
	public void placingOrder() {
		String ExpectedProductDetails="SONY ZX110A Wired without Mic Headset";
		String actualProductDetails=driver.findElement(By.linkText("SONY ZX110A Wired without Mic Headset")).getText();
		Assert.assertEquals(actualProductDetails, ExpectedProductDetails,"Item not matched");
		if(actualProductDetails.equals(ExpectedProductDetails))
			
		{
			System.out.println("Item name matched");
			
		}

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2ObVJD _3AWRsL']")).click();
		
	}
	
	@AfterTest
	public void closeBrowser() {
		driver.quit();
	}
	
}
