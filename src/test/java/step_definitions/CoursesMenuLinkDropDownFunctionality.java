package step_definitions;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import base.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.FullStackQAEngineerPage;
import pages.HomePage;

public class CoursesMenuLinkDropDownFunctionality extends TestBase {
	
	HomePage hp;
	FullStackQAEngineerPage qap;
	
	public CoursesMenuLinkDropDownFunctionality() {
		hp = new HomePage();
		qap = new FullStackQAEngineerPage();
	}
	
	
	@Given("user moves cursor to Courses menu link")
	public void user_moves_cursor_to_courses_menu_link() {
		hp.moveToCoursesMenuLink();
	}

	@When("user clicks on Full Stack QA Engineer link")
	public void user_clicks_on_full_stack_qa_engineer_link() throws InterruptedException {
		hp.moveToCoursesMenuLink();
		Thread.sleep(3000);
	    hp.clickFullStackQACourse();
	}

	@Then("user should land on Full Stack QA Engineer page")
	public void user_should_land_on_full_stack_qa_engineer_page() {
	    Assert.assertTrue(qap.qaEngineerPageImageVisibility());
	}

	@When("user clicks on Cyber Security Professional link")
	public void user_clicks_on_cyber_security_professional_link() throws InterruptedException {
		hp.moveToCoursesMenuLink();
		Thread.sleep(3000);
	    hp.clickCyberSecurityProfessionalCourseLink();
	}

	@Then("user should land on Cyber Security Professional page")
	public void user_should_land_on_cyber_security_professional_page() {
	   // Assert
	}

	@When("user clicks on Cloud Engineering link")
	public void user_clicks_on_cloud_engineering_link() throws InterruptedException {
	    hp.moveToCoursesMenuLink();
	    Thread.sleep(3000);
	    hp.clickCloudEngineeringCourseLink();
	}

	@Then("user should land on Cloud Engineering page")
	public void user_should_land_on_cloud_engineering_page() {
	    //Assert
	}

	@When("user clicks on Business Analyst link")
	public void user_clicks_on_business_analyst_link() throws InterruptedException {
	    hp.moveToCoursesMenuLink();
	    Thread.sleep(3000);
	    hp.clickBusinessAnalystCourseLink();
	}

	@Then("user should land on Business Analyst page")
	public void user_should_land_on_business_analyst_page() {
	    // Assert
	}

	@When("user clicks on Data Analytics & Visualization link")
	public void user_clicks_on_data_analytics_visualization_link() throws InterruptedException {
	    hp.moveToCoursesMenuLink();
	    Thread.sleep(3000);
	    hp.clickDataAnalyticsVisualizationCourseLink();
	}

	@Then("user should land on Data Analytics & Visualization page")
	public void user_should_land_on_data_analytics_visualization_page() {
	    //Assert
	}


}
