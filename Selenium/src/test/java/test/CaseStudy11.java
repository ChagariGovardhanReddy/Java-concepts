/*Case study 11: Mouse Hovering and Keyboard Interactions

Objective: To understand the basic selenium operations invoking the driver, identifying the specified web elements and use action class to complete mouse operation.

Application Information
We will be using a web page (https://www.globalsqa.com/demo-site/sliders/#Range) for this exercise. 

Tasks:
1.Open the URL in browser.
2.Locate the highest & lowest range in the slider.
3.Fix the price lower range to 100$ using mouse operation  33
4.Fix the price upper range to 400$ using mouse operation.  137
*/

package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class CaseStudy11 {
	public static WebDriver driver;
	String Url="https://www.globalsqa.com/demo-site/sliders/#Range";
	
	@Test
	public void MouseHoveringAndKeyboardInteractions () {
         driver=new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.get(Url);
		
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"post-2673\"]/div[2]/div/div/div[2]/p/iframe")));
		
		WebElement lowerRangeSrc=driver.findElement(By.xpath("//*[@id=\"slider-range\"]/span[1]"));
		System.out.println("location of lower range src" +lowerRangeSrc.getLocation());
		
		WebElement upperRangeSrc=driver.findElement(By.xpath("//*[@id=\"slider-range\"]/span[2]"));
		System.out.println("Location of upper range src" +upperRangeSrc.getLocation());
		
		Actions action=new Actions(driver);
		
		
		action.dragAndDropBy(lowerRangeSrc, 33, 46).perform();
		System.out.println("location of lower range src" +lowerRangeSrc.getLocation());
		
		
		action.dragAndDropBy(upperRangeSrc, 137, 46).perform();
		System.out.println("location of lower range src" +upperRangeSrc.getLocation());
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.quit();
		
	}


}
