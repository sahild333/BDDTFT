package step_definitions;

import org.openqa.selenium.By;
import org.testng.Assert;

import base.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;

public class FooterLinkFunctionality extends TestBase{
	

	HomePage hp;{
		
	hp = new HomePage();
	
	}
	
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
		Assert.assertTrue(driver.findElement(By.xpath("//h1[@class=\"entry-title\"]")).isDisplayed());
	}
//
//	@When("user clicks on Our Team footerlink")
//	public void user_clicks_on_our_team_footerlink() {
//	  hp.clickOurTeamFooterLink();
//	}
//
//	@Then("user should land on Our Team page")
//	public void user_should_land_on_our_team_page() {
//		Assert.assertEquals(driver.getTitle(), "Our Team - Transfotech Academy");
//	}
//
//	@When("user clicks on Our Instructors footerlink")
//	public void user_clicks_on_our_instructors_footerlink() {
//	  hp.clickOurInstructorsFooterLink();
//	}
//
//	@Then("user should land on Our Instructor page")
//	public void user_should_land_on_our_instructor_page() {
//		Assert.assertEquals(driver.getTitle(), "Our Instructors - Transfotech Academy");
//	}
//
//	@When("user clicks onTuition & Financing footerlink")
//	public void user_clicks_on_tuition_financing_footerlink() {
//	 hp.clickTuitionFinancingFooterLink();
//	}
//
//	@Then("user should land on Tuition & Financing page")
//	public void user_should_land_on_tuition_financing_page() {
//		Assert.assertEquals(driver.getTitle(), "Tuition & Financing - Transfotech Academy");
//	}
//
//	@When("user clicks on Our Events footerlink")
//	public void user_clicks_on_our_events_footerlink() {
//	hp.clickOurEventsFooterLink();
//	}
//
//	@Then("user should land on Our Events page")
//	public void user_should_land_on_our_events_page() {
//		Assert.assertEquals(driver.getTitle(), "Our Events - Transfotech Academy");
//	}
}
