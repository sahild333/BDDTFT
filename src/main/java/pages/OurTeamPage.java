package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class OurTeamPage extends TestBase {
	
	@FindBy(xpath="//a[@title='Sheikh Galib Rahman']")
	WebElement leadershipTitle;
	
	public OurTeamPage() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean leadershipTitleVisibility() {
		return leadershipTitle.isDisplayed();
	}

}
