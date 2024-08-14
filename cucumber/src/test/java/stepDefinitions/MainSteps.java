package stepDefinitions;

import java.util.List;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MainSteps {
	 @Given ("User is on NetBanking landing page")
	 public void user_is_on_net_banking_landing_page() {
		 System.out.println("user");
	
	 }
	/* @When("User login into application")
	 public void user_login_into_application(){
		 System.out.println("u");
		 
	  
	 }*/
	 //regular Expression
	 /* @When("User login into application with {string} and password {string}")
	 public void user_login_into_application_with_and_password(String username, String password ){
	 
		 System.out.println("usernmae+" "+password);
		 
	  
	 }*/
	/* @When("User login into application with {string} and password {string}")
	 public void user_login_into_application_with_and_password_combination(String username, String password ){
	 
		 System.out.println("username"+" "+"password");
	 }*/
	 //Regex pattern.
	 //It dont check which kind of data type we pass
	/* @When("^User login into application with (.+) and password (.+)$")
	 public void user_login_into_application_with_and_password_combination(String username, String password ){
	 
		 System.out.println("username"+" "+"password");
	 }
	  */
	 @When ("User Signup into application")
	 public void user_signup_into_application(List<String> data) {
		 System.out.println(data.get(0));
		 System.out.println(data.get(1));
		 System.out.println(data.get(2));
		 System.out.println(data.get(3));
	 }
	 @Then("Home Page is displayed")
	 public void home_page_is_displayed() {
		 System.out.println("use");
		 
	 }
	 
}
