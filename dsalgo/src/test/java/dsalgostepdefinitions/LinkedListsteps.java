package dsalgostepdefinitions;
import java.io.IOException;

import dsalgodrivers.DriverFactory;
import io.cucumber.java.en.*;
import dsalgopages.Arraypages;
import dsalgopages.DataStructuresPages;
import dsalgopages.LinkedListPages;

public class LinkedListsteps {
	LinkedListPages linkedlist = new LinkedListPages(DriverFactory.getDriver());
	DataStructuresPages data = new DataStructuresPages(DriverFactory.getDriver());
	Arraypages array = new Arraypages(DriverFactory.getDriver());
	

	@When(": The user clicks on Get Started button of Linked List")
	public void the_user_clicks_on_get_started_button_of_linked_list() {
		linkedlist.getStarted();
	}

	@Then(": The user should be navigated to  the Linked List page")
	public void the_user_should_be_navigated_to_the_linked_list_page() {
		System.out.println("User is navigated to Linked list page");

	}

	@When(": The user clicks on Introduction button")
	public void the_user_clicks_on_introduction_button() {
		linkedlist.clickOnIntroduction();

	}

	@Then(": The user should be directed to {string} of Linked List Page")
	public void the_user_should_be_directed_to_of_linked_list_page(String string) {
		System.out.println("User is redirected to "+string+" page");

	}

	
	@Then(": User should be redirected to the page having an tryEditor with a Run button to test")
	public void user_should_be_redirected_to_the_page_having_an_try_editor_with_a_run_button_to_test() throws IOException {
		System.out.println("User redirected to Python editor page");
		linkedlist.pythonEditor();

	}

	@When(": The user clicks  Creating a Linked List button")
	public void the_user_clicks_creating_a_linked_list_button() {
		linkedlist.creatingLinkedList();
	}

	@When(": User clicks the Types of Linked List button")
	public void user_clicks_the_types_of_linked_list_button() {
		linkedlist.typesOfLinkedList();

	}

	@When(": User clicks Implement Linked List in Python")
	public void user_clicks_implement_linked_list_in_python() {
		linkedlist.implementLinkedList();
	}

	@When(": User clicks on Traversal button")
	public void user_clicks_on_traversal_button() {
		linkedlist.implementLinkedList();
	}

	@When(": User clciks on Insertion button")
	public void user_clciks_on_insertion_button() {
		linkedlist.insertion();

	}

	@When(": User clicks on Deletion button")
	public void user_clicks_on_deletion_button() {
		linkedlist.deletion();

	}
	

	@Then(": The user clicks in the {string} button")
	public void the_user_clicks_in_the_button(String string) {
	   data.clickOnTryHere();
	}



}
