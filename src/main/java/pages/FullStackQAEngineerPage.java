package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class FullStackQAEngineerPage extends TestBase {
	
	@FindBy(xpath="//img[@class='img img-responsive img-rounded']")
	WebElement qaEngineerPageImage;
	
	public FullStackQAEngineerPage() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean qaEngineerPageImageVisibility() {
		return qaEngineerPageImage.isDisplayed();
	}

}
