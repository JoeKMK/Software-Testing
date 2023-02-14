package StepDefinations;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class hooksLearning {
@Before
public void StartUP()  {
System.out.println("StartUp");
}
@After
public void EndUp()  {
System.out.println("EndUp");
}
@Given("^User is Homepage of HN$")
public void user_is_Homepage_of_HN()  {
System.out.println("1-1");
}

@When("^User should see menu links$")
public void user_should_see_menu_links()  {
	System.out.println("2-1");
}

@Then("^click on Account link from menu$")
public void click_on_Account_link_from_menu()  {
	System.out.println("3-1");
}

@Then("^system should navigate to login to my account screen$")
public void system_should_navigate_to_login_to_my_account_screen()  {
	System.out.println("4-1");
}



}
