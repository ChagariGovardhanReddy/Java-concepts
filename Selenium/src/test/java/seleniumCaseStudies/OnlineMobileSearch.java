package seleniumCaseStudies;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OnlineMobileSearch {
	public WebDriver driver;
	
	@BeforeMethod
	public void launchingBrowser( ) {
		String Browser="edge";
		if (Browser.equalsIgnoreCase("chrome")){
			driver=new ChromeDriver();
		}
		else {
			driver=new EdgeDriver();
			
		}
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	@Test
	public void searchingMobile() throws InterruptedException {
		Thread.sleep(5000);
		WebElement searchBox=driver.findElement(By.xpath("//input[@aria-label='Search Amazon.in']"));
		searchBox.click();
		searchBox.sendKeys("mobile smartphones under 30000");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
WebElement text=driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']/child::span[1]"));
 String msg=text.getText();
 String ActualMsg="1-16 of over 1,000 results for";
 Assert.assertEquals(ActualMsg, msg);
 WebElement DropdownEle=driver.findElement(By.xpath("//select[@name='s']"));
 Select select=new Select(DropdownEle);
 select.selectByValue("date-desc-rank");
 String selectedText=select.getFirstSelectedOption().getText();
 System.out.println(selectedText);
 Assert.assertEquals("Newest Arrivals", selectedText);
 

	}
	@AfterMethod
	public void closeBrowser() {
	driver.close();
	}
	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		OnlineMobileSearch  mobile=new OnlineMobileSearch();
//		mobile.launchingBrowser("Edge");
//		mobile.searchingMobile();
//		
//	}

}
