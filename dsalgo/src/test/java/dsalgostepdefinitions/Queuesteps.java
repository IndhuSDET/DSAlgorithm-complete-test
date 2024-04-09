package dsalgostepdefinitions;
import java.io.IOException;

import dsalgodrivers.DriverFactory;
import io.cucumber.java.en.*;
import dsalgopages.Arraypages;
import dsalgopages.QueuePages;
public class Queuesteps {

	QueuePages queue=new QueuePages(DriverFactory.getDriver());
	Arraypages array = new Arraypages(DriverFactory.getDriver());
	

	@When(": The user clicks on Get Started button of Queue")
	public void the_user_clicks_on_get_started_button_of_queue() {
		queue.getStarted();
	}

	@Then(": The user should be navigated to the Queue page")
	public void the_user_should_be_navigated_to_the_queue_page() {
		System.out.println("User navigated to Queue Page");

	}

	@When(": The user clicks on Implementation of Queue in Python")
	public void the_user_clicks_on_implementation_of_queue_in_python() {
		 queue.implementationOfQueue();

	}

	@Then(": The user should be directed to the {string} of Queue Page")
	public void the_user_should_be_directed_to_the_of_queue_page(String string) {

		System.out.println("User redirected to the "+string+" page");

	}
	@Then(": The user clicks on a {string} button")
	public void the_user_clicks_on_a_button(String string) {
		queue.tryHere();
	}
	

	@Then(": user should be redirected to a page having an tryEditor with a Run button to test")
	public void user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test1() throws IOException {
		 queue.pythonEditor();
	}

	@When(": The user clicks on Implementation using collections dequeue")
	public void the_user_clicks_on_implementation_using_collections_dequeue() {
		 queue.Queuedequeue();
	}

	@When(": The user clicks on Implementation using array")
	public void the_user_clicks_on_implementation_using_array() {
		 queue.implementationUsingArray();

	}

	@When(": The user clicks on Queue Operations")
	public void the_user_clicks_on_queue_operations() {
		queue.queueOperations();

	}

	@Then(":  user should be redirected to a page having an tryEditor with a Run button to test")
	public void user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test() throws IOException {
		queue.pythonEditor();
	}
//	@Given(": The user is on DS Algo Portal homepage")
//	public void the_user_is_on_ds_algo_portal_homepage() {
//	   
//	}
//
//	@When(": The user clicks on Signin button")
//	public void the_user_clicks_on_signin_button() {
//	   
//	}
//
//	@When(": The user enters {string} as username and {string} as password and clicks on login button")
//	public void the_user_enters_as_username_and_as_password_and_clicks_on_login_button(String string, String string2) {
//	    
//	}
//
//	@Then(":The user should get message as {string} in homepage")
//	public void the_user_should_get_message_as_in_homepage(String string) {
//	    
//	}

	



}
