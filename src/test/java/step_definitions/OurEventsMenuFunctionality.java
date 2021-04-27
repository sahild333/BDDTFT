package step_definitions;

import org.openqa.selenium.By;
import org.testng.Assert;

import base.TestBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;

public class OurEventsMenuFunctionality extends TestBase {
	
	HomePage hp;
	
	public OurEventsMenuFunctionality() {
		hp = new HomePage();
	}
	

	@Given("user in on Home Page application")
	public void user_in_on_home_page_application() {
		System.out.println(driver.getTitle()); //Add assertion
	}

	@When("user clicks on the Our Events button")
	public void user_clicks_on_the_our_events_button() {
		hp.clickOurEvents();
	}

	@Then("user is navigated to Our Events page")
	public void user_is_navigated_to_our_events_page() {
		Assert.assertTrue(driver.findElement(By.xpath("//h1[@class='entry-title']")).isDisplayed());
	}

	
}