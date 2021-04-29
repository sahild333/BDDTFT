package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class OurInstructorsPage extends TestBase{
	
	@FindBy(xpath="//div[@class='tlp-row layout4']")
	WebElement instructorsLayout;
	
	public OurInstructorsPage() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean ourInstructorsPageElementVisibility() {
		return instructorsLayout.isDisplayed();
	}
}
