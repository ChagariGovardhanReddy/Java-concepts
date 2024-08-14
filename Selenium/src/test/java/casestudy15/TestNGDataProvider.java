/*
Case study 15: TestNG annotations
Objective: To understand the testNG annotations and know the purpose of using data provider annotations

Description: Create a minimum of 3 test data to test the test case. Use data provider concept in testNG to pass the test data to the test case. (Execute same test case for different data multiple times)



Application Information
We will be using a web page (https://phptravels.org/login) for this exercise.

Tasks:
1.	Go to the URL given above.
2.	Enter username and password by using data provider annotation.
3.	Execute the same test case for at least 3 different sets of data.
4.	Capture the error message for each set of data and display it in the console.
5.	Close the browser.
*/


package casestudy15;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGDataProvider {
	
	public static WebDriver driver;
	String Url="https://phptravels.org/login";
	
	@BeforeClass
	
	public void invokeBrowser() {
         driver=new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		
	}
	
	@Test(dataProvider="dp")
	
	public void testNGDataProvider (String email,String password) {
         
		
		driver.get(Url);
		
		driver.findElement(By.id("inputEmail")).sendKeys(email);
		
		driver.findElement(By.id("inputPassword")).sendKeys(password);;
		
		WebElement submit=driver.findElement(By.id("login"));
		submit.click();
		
		String errorMsg=driver.findElement(By.xpath("//*[@id=\"main-body\"]/div/div[1]/div/form/div/div[1]/div[2]")).getText();
		System.out.println(errorMsg);
		

     }
	
	
	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}
	
	
	
	@DataProvider(name="dp")
	String[][] loginData(){
		
		String testData[][]= {
				{"abc@gmail.com","abc123@"},
				{"selenium@gmail.com","abcd123@"},
				{"test@gmail.com","abcdf123@"}
		};
		return testData;
		
	}
	
	
}
