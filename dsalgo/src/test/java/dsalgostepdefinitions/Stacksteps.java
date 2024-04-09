package dsalgostepdefinitions;
import java.io.IOException;

import dsalgodrivers.DriverFactory;
import io.cucumber.java.en.*;
import dsalgopages.Arraypages;
import dsalgopages.StackPages;


public class Stacksteps {

	StackPages stack = new StackPages(DriverFactory.getDriver());
	Arraypages array = new Arraypages(DriverFactory.getDriver());
	@When(": The user clicks on Get Started button of Stack")
	public void the_user_clicks_on_get_started_button_of_stack() {
	    stack.getStarted();
	}

	@Then(": The user should be navigated to  the Stack page")
	public void the_user_should_be_navigated_to_the_stack_page() {
		System.out.println("User is navigated to Stack Page");

	}

	@When(": The user clicks on Opeartions in Stack")
	public void the_user_clicks_on_opeartions_in_stack() {
		stack.operationInStack();
	}

	@Then(": The user should be directed to the {string} of stack Page")
	public void the_user_should_be_directed_to_the_of_stack_page(String string) {
		System.out.println("User is navigated to "+string+" page");

	}
	@Then(": User clicks {string} button.")
	public void user_clicks_button(String string) {
		stack.clickTryHere();
	}

	@Then(": user should be redirected to the page having an tryEditor with a Run button to test")
	public void user_should_be_redirected_to_the_page_having_an_try_editor_with_a_run_button_to_test() throws IOException {
		stack.pythonEditor();

	}

	@When(": The user clicks on Implementation")
	public void the_user_clicks_on_implementation() {
		stack.clickOnImplementation();
	}

	@When(": The user clicks on Applications")
	public void the_user_clicks_on_applications() {
		stack.clickOnApplication();
	}

//	@Given(": The user is on DS Algo Portal homepage")
//	public void the_user_is_on_ds_algo_portal_homepage() {
//	}
//
//	@When(": The user clicks on Signin button")
//	public void the_user_clicks_on_signin_button() {
//	    
//	}
//
//	@When(": The user enters {string} as username and {string} as password and clicks on login button")
//	public void the_user_enters_as_username_and_as_password_and_clicks_on_login_button(String string, String string2) {
//	} 
//
//	@Then(":The user should get message as {string} in homepage")
//	public void the_user_should_get_message_as_in_homepage(String string) {
//	  
//	}

	




}
