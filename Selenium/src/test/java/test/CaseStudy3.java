/*Case study 3: Launching browser and location elements
Objective:
To understand the basic selenium operations like invoking the driver and locating the elements.

Description:
Amazon is a popular online shopping site. You must launch the browser and locate the various elements on the webpage. You must use different Web Element methods that are available.

Application Information
We will be using a web page(http://www.amazon.in/) for this exercise. 
Tasks:

1. Go to the URL provided.

2. Locate the search text box and enter “Redmi note 12”. 
3. Click on the search button.
4. Select price range as “10000 - 20000” and select Top brands check box.
5. Choose the first model displayed and fetch the name of the model and display it in the console.
6. Close the browser.
*/


package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class CaseStudy3 {
WebDriver driver=null;
	
	@Test
	public void LocationElements() throws InterruptedException {
	String URL="https://www.amazon.in";

     driver = new EdgeDriver();
	
     driver.manage().window().maximize();
			
	 driver.get(URL);
	//searching text box and enter “Redmi note 12”
	WebElement SearchBox=driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
	SearchBox.sendKeys("Redmi note 12");
	// Clicking on the search button
	driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
	
	
	//Selecting price range as “10000 - 20000”
	driver.findElement(By.xpath("//*[@id=\"p_36/1318506031\"]/span/a/span")).click();
	
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	//selecting Top brands check box
	driver.findElement(By.xpath("//*[@id=\"p_n_format_browse-bin/30678580031\"]/span/a/span")).click();
	
	Thread.sleep(5000);
	
	//fetching the name of the model and display it in the console//div[@class='sg-col-inner'])[4]
	WebElement nameOfTheModel = driver.findElement(By.xpath("(//span[@class=\"a-size-medium a-color-base a-text-normal\"])[1]"));
	System.out.println("We get the name of the model Like :" +nameOfTheModel.getText());

	
    //To Close the Browser
	driver.quit();
}

}
