package step_definitions;

import org.openqa.selenium.By;
import org.testng.Assert;

import base.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;

public class BlogsFunctionality extends TestBase {
	
	HomePage hp;
	public BlogsFunctionality() {
		hp = new HomePage();		
	}

	@Given("user lands on Homepage")
	public void user_lands_on_homepage() {
		System.out.println(driver.getTitle());
	    
	}

	@When("user click on the Blogs menu link")
	public void user_click_on_the_blogs_menu_link() {
		hp.clickBlogs();
	    
	}

	@Then("user should land on blogs page")
	public void user_should_land_on_blogs_page() {
		Assert.assertTrue(driver.findElement(By.xpath("//li[@id='menu-item-3866']/a")).isDisplayed());
	}
}
