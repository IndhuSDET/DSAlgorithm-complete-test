package dsalgostepdefinitions;
import java.io.IOException;
import dsalgodrivers.DriverFactory;
import io.cucumber.java.en.*;
import dsalgopages.Arraypages;
import dsalgopages.TreePages;
public class Treesteps {
	TreePages tree = new TreePages(DriverFactory.getDriver());
	Arraypages array = new Arraypages(DriverFactory.getDriver());
	@When(": The user clicks on Get Started button of Tree")
	public void the_user_clicks_on_get_started_button_of_tree() {
		tree.getStarted();
	}

	@Then(": The user should be navigated to the Tree page")
	public void the_user_should_be_navigated_to_the_tree_page() {
		System.out.println("User navigated to Tree page");

	}

	@When(": The user clicks on Overview of Trees")
	public void the_user_clicks_on_overview_of_trees() {
		tree.clickOnOverview();
	}

	@Then(": The user should be directed to the {string} of Tree Page")
	public void the_user_should_be_directed_to_the_of_tree_page(String string) {
		System.out.println("User navigated to "+string+" page");
	}
	@Then(": The user clicks the {string} button.")
	public void the_user_clicks_the_button(String string) {
	  tree.tryHere();
	}
	

	@Then(": user should be redirected to a page having a TryEditor with a Run button to test")
	public void user_should_be_redirected_to_a_page_having_a_try_editor_with_a_run_button_to_test() throws IOException {
		tree.pythonEditor();

	}

	@When(": The user clicks on Terminologies")
	public void the_user_clicks_on_terminologies() {
		tree.clickTerminologies();
	}

	@When(": The user clicks on Types of Trees")
	public void the_user_clicks_on_types_of_trees() {
		tree.typesOfTrees();
	}

	@When(":  The user clicks on Tree Traversals")
	public void the_user_clicks_on_tree_traversals() {
		tree.treeTraversal();
	}

	@When(":  The user clicks on Traversal Illustration")
	public void the_user_clicks_on_traversal_illustration() {
		tree.traversalIllustration();
	}

	@When(":  The user clicks on Binary Trees")
	public void the_user_clicks_on_binary_trees() {
		tree.binaryTrees();

	}

	@When(":  The user clicks on Types of Binary Trees")
	public void the_user_clicks_on_types_of_binary_trees() {
		tree.typesOfBinaryTrees();

	}

	@When(":  The user clicks on Implementation in Python")
	public void the_user_clicks_on_implementation_in_python() {
	    tree.implementationInPython();
	}

	@When(":  The user clicks on Binary Tree traversals")
	public void the_user_clicks_on_binary_tree_traversals() {
		tree.binaryTreeTraversal();
	}

	@When(":  The user clicks on Implementation of Binary Trees")
	public void the_user_clicks_on_implementation_of_binary_trees() {
		tree.implementationOfBinaryTrees();
	}

	@When(":  The user clicks on Binary Search Trees")
	public void the_user_clicks_on_binary_search_trees() {
		 tree.binarySearchTree();
	}

	@When(":  The user clicks on Implementation of BST")
	public void the_user_clicks_on_implementation_of_bst() {
		tree.implementationOfBST();
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
