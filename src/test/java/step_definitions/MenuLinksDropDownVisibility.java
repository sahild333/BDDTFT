package step_definitions;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import base.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;

public class MenuLinksDropDownVisibility extends TestBase {
	
	HomePage hp; 
	Actions action = new Actions(driver); {
	
	hp = new HomePage();
	
	}
	
	@Given("user is in homepage")
	public void user_is_in_homepage() {
		driver.get(prop.getProperty("url"));
	}

	@When("user moves cursor to About Us menu link")
	public void user_moves_cursor_to_about_us_menu_link() throws InterruptedException {
//		action.moveToElement(driver.findElement(By.xpath("//li[@id='menu-item-4125']/a[@href='#']"))).build().perform();
		action.moveToElement(hp.aboutUsMenuLink).build().perform();
		Thread.sleep(5000);	
	}

	@Then("user should be able to view different About Us options")
	public void user_should_be_able_to_view_different_about_us_options() {
		Assert.assertTrue(driver.findElement(By.xpath("//li[@id='menu-item-3867']")).isDisplayed());
	}

	@When("user moves cursor to Services menu link")
	public void user_moves_cursor_to_services_menu_link() throws InterruptedException {
	    action.moveToElement(hp.servicesMenuLink).build().perform();
	    Thread.sleep(5000);
	}

	@Then("user should be able to view different Services options")
	public void user_should_be_able_to_view_different_services_options() {
		Assert.assertTrue(driver.findElement(By.xpath("//li[@id='menu-item-4064']")).isDisplayed());
	}
	@When("user moves cursor to Courses menu link")
	public void user_moves_cursor_to_courses_menu_link() throws InterruptedException {
	    action.moveToElement(hp.coursesMenuLink).build().perform();
	    Thread.sleep(5000);
	}

	@Then("user should be able to view different Courses options")
	public void user_should_be_able_to_view_different_courses_options() {
		Assert.assertTrue(driver.findElement(By.xpath("//li[@id='menu-item-4822']")).isDisplayed());
	}
	
}
