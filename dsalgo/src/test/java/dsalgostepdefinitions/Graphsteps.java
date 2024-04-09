package dsalgostepdefinitions;
import java.io.IOException;
import dsalgodrivers.DriverFactory;
import io.cucumber.java.en.*;
import dsalgopages.Arraypages;
import dsalgopages.DataStructuresPages;
import dsalgopages.GraphPages;

public class Graphsteps {
	GraphPages graph = new GraphPages(DriverFactory.getDriver());
	DataStructuresPages data = new DataStructuresPages(DriverFactory.getDriver());
	Arraypages array = new Arraypages(DriverFactory.getDriver());
	

	@Then(": The user clicks on {string} button..")
	public void the_user_clicks_on_button(String string) {
		 data.clickOnTryHere();
	}




	@When(": The user clicks on Get Started button of Graph")
	public void the_user_clicks_on_get_started_button_of_graph() {
		graph.getStarted();
	}

	@Then(": The user should be navigated to the Graph page")
	public void the_user_should_be_navigated_to_the_graph_page() {
		System.out.println("User navigated to Graph page");

	}

	@When(": The user clicks on Graph")
	public void the_user_clicks_on_graph() {
		graph.clickOnGraph();

	}

	@Then(": The user should be directed to the {string} of Graph Page")
	public void the_user_should_be_directed_to_the_of_graph_page(String string) {

		System.out.println("User redirected to "+string+" page");

	}

	@Then(": user should be redirected to a page having an TryEditor with a Run button to test")
	public void user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test() throws IOException {
		 array.pythonEditor();
	}

	@When(": The user clicks on Graph Representations")
	public void the_user_clicks_on_graph_representations() {
		graph.graphicalRepresentation();
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
//
//	}

}
