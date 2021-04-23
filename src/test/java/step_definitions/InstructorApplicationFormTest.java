package step_definitions;

import org.openqa.selenium.By;
import org.testng.Assert;

import base.TestBase;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BecomeATeacher;
import pages.HomePage;


public class InstructorApplicationFormTest extends TestBase{
	
	HomePage hp;
	BecomeATeacher bat; {
	
	hp = new HomePage();
	bat = new BecomeATeacher();
	
	}
	
//	@Given("user is in homepage of application")
//	public void user_is_in_homepage_of_application() {
//	    driver.get(prop.getProperty("url"));
//	}
//
//	@When("user clicks on Become a Teacher link")
//	public void user_clicks_on_become_a_teacher_link() {
//		hp.clickbecomeATeacher();
//	}
//
//	@Then("user should land on Become a Teacher page")
//	public void user_should_land_on_become_a_teacher_page() {
//	    Assert.assertEquals(driver.getTitle(), "Become a Teacher - Transfotech Academy");
//	}
	@Given("user lands on homepage of application")
	public void user_lands_on_homepage_of_application() {
		driver.get(prop.getProperty("url"));
	}

	@And("user clicks Become A Teacher link")
	public void user_clicks_become_a_teacher_link() {
	    hp.clickbecomeATeacher();
	}

	@When("user enters the required information")
	public void user_enters_the_required_information() {
	    bat.typeFirstName();
	    bat.typeLastName();
	    bat.typeEmail();
	    bat.typePhoneNumber();
	    bat.typeMessage();
	}

	@And("clicks Send Your Message button")
	public void clicks_send_your_message_button() {
		bat.clicksendYourMessage();
	}

	@Then("user should be able to Send their Message")
	public void user_should_be_able_to_send_their_message() {
		
	}
}
