package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class HomePage extends TestBase {
	
	@FindBy(linkText="Become a Teacher")
	WebElement becomeATeacher;
	
	@FindBy(linkText="Profile")
	WebElement profile;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	 public void clickbecomeATeacher() {
		 becomeATeacher.click();
	 }
	 public void clickprofile() {
		 profile.click();
	 }
	 

}
