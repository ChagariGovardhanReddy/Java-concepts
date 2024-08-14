package seleniumCaseStudies;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;

public class OnlineShoppingAutomation {
	public static WebDriver driver;

	@BeforeTest
	void invokeBrowser() {
		String Browser = "Edge";
		if (Browser == "Edge") {
      driver = new EdgeDriver();
		}
		else {
			driver=new ChromeDriver();
		}
		driver.get("http://demo.automationtesting.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(500));
	}
	
	void handilingAlerts() {
		Actions da=new Actions(driver);
        WebElement Ele = driver.findElement(By.linkText("SwitchTo"));
        da.moveToElement(Ele);
        
		//driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Home appliances");
		//driver.findElement(By.xpath("//button[@class='_2iLD__']")).click();
	}
}
