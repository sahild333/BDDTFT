package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class HomePage extends TestBase {
	
	
	@FindBy(linkText="Become a Teacher")
	WebElement becomeATeacher;
	
	@FindBy(linkText="Profile")
	WebElement profile;
	
	@FindBy(xpath="//li[@id=\"menu-item-4555\"]/a")
	WebElement aboutUsFooterLink;
	
	@FindBy(linkText="Our Team")
	WebElement ourTeamFooterLink;
	
	@FindBy(linkText="Our Instructors")
	WebElement ourInstructorsFooterLink;
	
	@FindBy(id="menu-item-4554")
	WebElement tuitionFinancingFooterLink;
	
	@FindBy(id="menu-item-4553")
	WebElement ourEventsFooterLink;
	
	
	@FindBy(xpath="//li[@id='menu-item-4125']")
	WebElement aboutUsMenuLink;
	
	@FindBy(xpath="//li[@id='menu-item-4061']")
	WebElement servicesMenuLink;
	
	@FindBy(xpath="//li[@id='menu-item-3910']")
	WebElement ourEventsMenuLink;
	
	@FindBy(xpath="//li[@id='menu-item-3867']")
	WebElement ourStoryLink;
	
	@FindBy(xpath="//li[@id='menu-item-4506']")
	WebElement ourTeamLink;
	
	@FindBy(xpath="//li[@id='menu-item-4126']")
	WebElement ourInstructorsLink;
	
	@FindBy(linkText="Book an Appointment")
	WebElement bookAnAppointmentLink;
	
	@FindBy(xpath="//li[@id='menu-item-4822']")
	WebElement fullStackQACourseLink;
	
	@FindBy(xpath="//li[@id='menu-item-4826']")
	WebElement cyberSecurityProfessionalCourseLink;
	
	@FindBy(xpath="//li[@id='menu-item-4827']")
	WebElement cloudEngineeringCourseLink;
	
	@FindBy(xpath="//li[@id='menu-item-4824']")
	WebElement businessAnalystCourseLink;
	
	@FindBy(xpath="//li[@id='menu-item-4825']")
	WebElement dataAnalyticsVisualizationCourseLink;
	
	@FindBy(xpath="//li[@id='menu-item-3850']")
	WebElement coursesMenuLink;
	
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	 public void clickbecomeATeacher() {
		 becomeATeacher.click();
	 }
	 public void clickprofile() {
		 profile.click();
	 }
	 public void clickAboutUsFooterLink() {
		 aboutUsFooterLink.click();
	 }
	 public void clickOurTeamFooterLink() {
		 ourTeamFooterLink.click();
	 }
	 public void clickOurInstructorsFooterLink() {
		 ourInstructorsFooterLink.click();
	 }
	 public void clickTuitionFinancingFooterLink() {
		 tuitionFinancingFooterLink.click();
	 }
	 public void clickOurEventsFooterLink() {
		 ourEventsFooterLink.click();
	 }
	 public void clickOurEventsMenuLink() {
		 ourEventsMenuLink.click();
	 }
	 public void moveToAboutUsMenuLink() {
		 Actions action = new Actions(driver);
		 action.moveToElement(aboutUsMenuLink).build().perform();
	 }
	 public void clickOurStory() {
		 Actions action = new Actions(driver);
		 action.moveToElement(ourStoryLink).click().build().perform();
	 }
	 public void clickOurTeam() {
		 Actions action = new Actions(driver);
		 action.moveToElement(ourTeamLink).click().build().perform();
	 }
	 public void clickOurInstructors() {
		 Actions action = new Actions(driver);
		 action.moveToElement(ourInstructorsLink).click().build().perform();
	 }
	 public void moveToCoursesMenuLink() {
		 Actions action = new Actions(driver);
		 action.moveToElement(coursesMenuLink).build().perform();
	 }
	 public void clickFullStackQACourse() {
		 Actions action = new Actions(driver);
		 action.moveToElement(fullStackQACourseLink).click().build().perform();
	 }
	 public void clickCyberSecurityProfessionalCourseLink() {
		 Actions action = new Actions(driver);
		 action.moveToElement(cyberSecurityProfessionalCourseLink).click().build().perform();
	 }
	 public void clickCloudEngineeringCourseLink() {
		 Actions action = new Actions(driver);
		 action.moveToElement(cloudEngineeringCourseLink).click().build().perform();
	 }
	 public void clickBusinessAnalystCourseLink() {
		 Actions action = new Actions(driver);
		 action.moveToElement(businessAnalystCourseLink).click().build().perform();
	 }
	 public void clickDataAnalyticsVisualizationCourseLink() {
		 Actions action = new Actions(driver);
		 action.moveToElement(dataAnalyticsVisualizationCourseLink).click().build().perform();
	 }
}
