package step_definitions;

import org.openqa.selenium.By;
import org.testng.Assert;

import base.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;

public class ContactUsMenuFunctionality extends TestBase{
	
	HomePage hp;
	public ContactUsMenuFunctionality() {
		hp = new HomePage();		
	}

	@Given("User in in home page application")
	public void user_in_in_home_page_application() {
		System.out.println(driver.getTitle());
	}

	@When("user click on Contact Us menu link")
	public void user_click_on_contact_us_menu_link() {
		hp.clickContactUs();
	}

	@Then("user should land on Contact Us page")
	public void user_should_land_on_contact_us_page() {
		Assert.assertTrue(driver.findElement(By.xpath("//li[@id='menu-item-3862']/a")).isDisplayed());
	}

}


