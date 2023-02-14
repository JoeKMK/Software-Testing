package StepDefinations;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BeforeAfterHooksConcept {
@Before("@First")
public void BeforeForFirstStep()  {
	System.out.println("BeforeForFirstStep");
}

@After("@First")
public void AfterForFirstStep()  {
	System.out.println("AfterForFirstStep");
}

	@Given("^User is Homepage of HN BeforeAfter$")
	public void user_is_Homepage_of_HN_BeforeAfter()  {
		System.out.println("1");
	}

	@When("^User should see menu links BeforeAfter$")
	public void user_should_see_menu_links_BeforeAfter()  {
		System.out.println("2");
	}

	@Then("^click on Account link from menu BeforeAfter$")
	public void click_on_Account_link_from_menu_BeforeAfter()  {
		System.out.println("3");
	}

	@Then("^system should navigate to login to my account screen BeforeAfter$")
	public void system_should_navigate_to_login_to_my_account_screen_BeforeAfter()  {
		System.out.println("4");
	}
	@Given("^User is Homepage of HN BeforeAfter1$")
	public void user_is_Homepage_of_HN_BeforeAfter1()  {
		System.out.println("5");
	}

	@When("^User should see menu links BeforeAfter1$")
	public void user_should_see_menu_links_BeforeAfter1()  {
		System.out.println("6");
	}

	@Then("^click on Account link from menu BeforeAfter1$")
	public void click_on_Account_link_from_menu_BeforeAfter1()  {
		System.out.println("7");
	}

	@Then("^system should navigate to login to my account screen BeforeAfter1$")
	public void system_should_navigate_to_login_to_my_account_screen_BeforeAfter1()  {
		System.out.println("8");
	}

}
