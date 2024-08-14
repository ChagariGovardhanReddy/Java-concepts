package test;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CaseStudy2 {
WebDriver driver=null;
String URL="https://www.google.com";
	
	@Test
	public  void  testOpenDifferentBrowsers() {
		
		
		CaseStudy2 cs=new CaseStudy2();
		cs.invokeBrowser("chrome");
	
	}
  public void invokeBrowser(String BrowserName) {
		
		//Scanner sc =new Scanner(System.in);
		//System.out.println("Enter Browser Name : ");
	   // BrowserName=sc.next();
		
		if(BrowserName.equalsIgnoreCase("chrome")) {
			
		     driver=new ChromeDriver();
		}
		else if(BrowserName.equalsIgnoreCase("edge")) {
			
			driver=new EdgeDriver();
	}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		        //Open url		
				driver.get(URL);
				
				
		       //Extract greeting msg
				String greetingmsg = driver.getTitle();
			System.out.println("We get the Title Like :" +greetingmsg);
				
				//Verifies greeting msg is correct or not
				Assert.assertEquals(greetingmsg,"Google");
				
			   //To Close the Browser
				driver.quit();
		
		

	}
	

}
