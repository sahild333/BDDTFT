package step_definitions;

import org.testng.Assert;

import base.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;

public class FooterLinkFunctionality extends TestBase{
	
	HomePage hp;

	@Given("user is in homepage of application")
	public void user_is_in_homepage_of_application() {
		driver.get(prop.getProperty("url"));
	}

	@When("user clicks on About Us footerlink")
	public void user_clicks_on_about_us_footerlink() {
	    hp.clickAboutUsFooterLink();
	}

	@Then("user should land on About Us page")
	public void user_should_land_on_about_us_page() {
	    Assert.assertEquals(driver.getTitle(), "About Us - Transfotech Academy");
	}
}
