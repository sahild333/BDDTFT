package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class AboutUsPage extends TestBase {

	@FindBy(xpath="//h1[@class='entry-title']")
	WebElement ourStoryEntryTitle;
	
	public AboutUsPage() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean ourStoryEntryTitleVisibility() {
		return ourStoryEntryTitle.isDisplayed();
	}
	
}
