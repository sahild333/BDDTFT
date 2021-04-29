package step_definitions;

import org.openqa.selenium.By;
import org.testng.Assert;

import base.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;

public class OurEventsMenuLinkFunctionality extends TestBase {
	
	HomePage hp;
	
	public OurEventsMenuLinkFunctionality() {
		hp = new HomePage();
	}
	
	@Given("user lands on the homepage")
	public void user_lands_on_the_homepage() {
		System.out.println(driver.getTitle());
	}

	@When("user clicks on the Our Events menu link")
	public void user_clicks_on_the_our_events_menu_link() {
		hp.clickOurEventsMenuLink();
	}

	@Then("user should land on Our Events page")
	public void user_should_land_on_our_events_page() {
		Assert.assertTrue(driver.findElement(By.xpath("//h1[@class='entry-title']")).isDisplayed());
	}
	
}
