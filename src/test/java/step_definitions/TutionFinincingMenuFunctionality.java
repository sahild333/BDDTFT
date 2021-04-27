package step_definitions;

import org.openqa.selenium.By;
import org.testng.Assert;

import base.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;

public class TutionFinincingMenuFunctionality extends TestBase{

	HomePage hp;
	public void TutionFinancingMenuFunctionality() {
		hp = new HomePage();		
	}
		
	@Given("user is in Homepage application")
	public void user_is_in_homepage_application() {
	System.out.println(driver.getTitle());
	}

	@When("user click on Tuition Financing menu link")
	public void user_click_on_tuition_financing_menu_link() {
		hp.clickTutionFinancing();   
	}

	@Then("user should land on Tuition Financing page")
	public void user_should_land_on_tuition_financing_page() {
		Assert.assertTrue(driver.findElement(By.xpath("//li[@id='menu-item-4009']/a")).isDisplayed());  
	
	}
}
