/*Case Study 5 : Window handling
Objective: To invoke the concept of window handling	

Description:
Amazon is a popular online shopping site. You must launch the browser and handle a new window that is opened 
and locate an element in the new window.

Application Information
We will be using a web page(http://www.amazon.in) for this exercise. 
Tasks:
1. Go to the URL provided.
2. Search for any one item and add it to the cart.
3. Click on the “Go to Cart” button.
4. In the cart window, delete the item that you have added to the cart.
5. Close the browser.

*/ 



package test;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class CaseStudy5 {
	public static WebDriver driver;
	String Url="http://www.amazon.in";
	@Test
	public void windowHandling() throws InterruptedException {
        driver=new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get(Url);
		
		//String mainPageWindow = driver.getWindowHandle();
		//System.out.println("Main Page ID : " +mainPageWindow);
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("redmi 12");
		driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
		//String headsetPage = driver.getWindowHandle();
		
		driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")).click();
		
		//window handling
		Set<String> s=driver.getWindowHandles();
		ArrayList<String> ar= new ArrayList<String>(s);
		
		System.out.println(ar.get(0));
		System.out.println(ar.get(1));
		driver.switchTo().window((String)ar.get(1));
		
		//window handling using iterator
		/*Set<String> windows = driver.getWindowHandles();

	    System.out.println();

	    Iterator<String> it = windows.iterator();

	    while(it.hasNext())

	    {

	        child =it.next();

	    }

	    driver.switchTo().window(child);
	    */
		
		//add to the cart
		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
		
		//Click on the “Go to Cart” button.
		WebElement GoToCart=driver.findElement(By.xpath("//a[@href='/cart?ref_=sw_gtc']"));
		GoToCart.click();
		
		//In the cart window, delete the item that you have added to the cart.
		WebElement Delete=driver.findElement(By.xpath("//input[@data-action='delete']"));
		Delete.click();
		
		driver.quit();
	}

}
