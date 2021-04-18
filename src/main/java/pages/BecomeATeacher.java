package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class BecomeATeacher extends TestBase {
	
	@FindBy(xpath="//input[@placeholder=\"First Name\"]")
	WebElement firstNameField;
	
	@FindBy(xpath="//input[@placeholder=\"Last Name\"]")
	WebElement lastNameField;
	
	@FindBy(name="your-email")
	WebElement emailField;
	
	@FindBy(name="your-phone")
	WebElement phoneNumberField;
	
	@FindBy(name="your-message")
	WebElement messageField;
	
	@FindBy(linkText="Send Your Message")
	WebElement sendYourMessageLink;
	
	public BecomeATeacher() {
		PageFactory.initElements(driver, this);
	}
	public void clicksendYourMessage() {
		sendYourMessageLink.click();
	 }
	public void typeFirstName() {
		firstNameField.sendKeys("Tom");
	}
	public void typeLastName() {
		lastNameField.sendKeys("Jefferson");
	}
	public void typeEmail() {
		emailField.sendKeys("tomjefferson123@aim.com");
	}
	public void typePhoneNumber() {
		phoneNumberField.sendKeys("111-222-3333");
	}
	public void typeMessage() {
		messageField.sendKeys("Hi");
	}

}
