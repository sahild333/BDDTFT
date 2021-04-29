package step_definitions;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import base.TestBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AboutUsPage;
import pages.HomePage;
import pages.OurInstructorsPage;
import pages.OurTeamPage;

public class AboutUsDropDownFunctionality extends TestBase {
	
	HomePage hp;
	AboutUsPage aup;
	OurTeamPage otp;
	OurInstructorsPage oip;
	
	public AboutUsDropDownFunctionality() {
	
	super();
	
	hp = new HomePage();
	aup = new AboutUsPage();
	otp = new OurTeamPage();
	oip = new OurInstructorsPage();
	
	}
	
	@Given("user is in homepage")
	public void user_is_in_homepage() {
	    System.out.println(driver.getTitle());
	}

	@When("user moves cursor to About Us menu link")
	public void user_moves_cursor_to_about_us_menu_link() throws InterruptedException {
	    hp.moveToAboutUsMenuLink();
	    Thread.sleep(5000);
	}

	@And("user clicks on Our Story link")
	public void user_clicks_on_our_story_link() throws InterruptedException {
	    hp.clickOurStory();
	}

	@Then("user should land on Our Story page")
	public void user_should_land_on_our_story_page() {
//		Assert.assertTrue(driver.findElement(By.xpath("//h1[@class='entry-title']")).isDisplayed());
		Assert.assertTrue(aup.ourStoryEntryTitleVisibility());
	}

	@When("user clicks on Our Team link")
	public void user_clicks_on_our_team_link() throws InterruptedException {
		hp.moveToAboutUsMenuLink();
		Thread.sleep(5000);
	    hp.clickOurTeam();
	}
	
	@Then("user should land on the Our Team page")
	public void user_should_land_on_the_our_team_page() {
	    Assert.assertTrue(otp.leadershipTitleVisibility());
	}

	@When("user clicks on Our Instructors link")
	public void user_clicks_on_our_instructors_link() throws InterruptedException {
		hp.moveToAboutUsMenuLink();
		Thread.sleep(5000);
	    hp.clickOurInstructors();
	}

	@Then("user should land on Our Instructors page")
	public void user_should_land_on_our_instructors_page() {
		Assert.assertTrue(oip.ourInstructorsPageElementVisibility());
	}

	
	
//	@Given("user is in homepage")
//	public void user_is_in_homepage() {
//		System.out.println(driver.getTitle()); //Assert
//	}
//
//	@When("user moves cursor to About Us menu link")
//	public void user_moves_cursor_to_about_us_menu_link() throws InterruptedException {
////		action.moveToElement(driver.findElement(By.xpath("//li[@id='menu-item-4125']/a[@href='#']"))).build().perform();
//		action.moveToElement(hp.aboutUsMenuLink).build().perform();
//		Thread.sleep(5000);	
//	}
//
//	@Then("user should be able to view different About Us options")
//	public void user_should_be_able_to_view_different_about_us_options() {
//		Assert.assertTrue(driver.findElement(By.xpath("//li[@id='menu-item-3867']")).isDisplayed());
//	}
//
//	@When("user moves cursor to Services menu link")
//	public void user_moves_cursor_to_services_menu_link() throws InterruptedException {
//	    action.moveToElement(hp.servicesMenuLink).build().perform();
//	    Thread.sleep(5000);
//	}
//
//	@Then("user should be able to view different Services options")
//	public void user_should_be_able_to_view_different_services_options() {
//		Assert.assertTrue(driver.findElement(By.xpath("//li[@id='menu-item-4064']")).isDisplayed());
//	}
//	@When("user moves cursor to Courses menu link")
//	public void user_moves_cursor_to_courses_menu_link() throws InterruptedException {
//	    action.moveToElement(hp.coursesMenuLink).build().perform();
//	    Thread.sleep(5000);
//	}
//
//	@Then("user should be able to view different Courses options")
//	public void user_should_be_able_to_view_different_courses_options() {
//		Assert.assertTrue(driver.findElement(By.xpath("//li[@id='menu-item-4822']")).isDisplayed());
//	}
	
}
