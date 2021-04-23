package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class HomePage extends TestBase {
	
	@FindBy(linkText="Become a Teacher")
	WebElement becomeATeacher;
	
	@FindBy(linkText="Profile")
	WebElement profile;
	
	@FindBy(xpath="//li[@id=\"menu-item-4555\"]/a")
	WebElement aboutUsFootLink;
	
	@FindBy(xpath="//li[@id='menu-item-4125']")
	public WebElement aboutUsMenuLink;
	
	@FindBy(xpath="//li[@id='menu-item-4061']")
	public WebElement servicesMenuLink;
	
	@FindBy(xpath="//li[@id='menu-item-3850']")
	public WebElement coursesMenuLink;
	
	
	
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
		 aboutUsFootLink.click();
	 }
}
