/*Case study 9: Drag and Drop Actions

Objective: To understand the basic selenium operations invoking the driver, identifying the specified web elements, implementing drag and drop functionality. 

Application Information
We will be using a web page (https://www.globalsqa.com/demo-site/draganddrop/#Photo%20Manager) for this exercise. 

Tasks:
1. Open the URL in browser.
2.Locate the element High Taras1 using XPATH
3.Drag “High Taras1” in the trash.
4.Locate the element High Taras1 using XPATH
5.Drag “High Taras3” in the trash.

*/

package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class CaseStudy9 {
	public static WebDriver driver;
	String Url="https://www.globalsqa.com/demo-site/draganddrop/#Photo%20Manager";
	
	@Test
	public void DragAndDrop() {
        driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get(Url);
		
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"post-2669\"]/div[2]/div/div/div[1]/p/iframe")));
		WebElement highTaras1=driver.findElement(By.xpath("//*[@id=\"gallery\"]/li[4]/img"));
		WebElement trash=driver.findElement(By.xpath("//*[@id=\"trash\"]/h4"));
		
		Actions action=new Actions(driver);
		action.dragAndDrop(highTaras1, trash).build().perform();
		
		WebElement highTaras3=driver.findElement(By.xpath("//*[@id=\"gallery\"]/li[3]/img"));
		//WebElement trash1=driver.findElement(By.xpath("//*[@id=\"trash\"]/h4"));
		
		//Actions action1=new Actions(driver);
		action.dragAndDrop(highTaras3, trash).build().perform();
		
		driver.quit();
		
	}

}
