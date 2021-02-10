package pages;

import testbase.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {

	@FindBy(xpath = "//div[@class='app_logo']")
	public WebElement appLogo;

	public MainPage() {
		PageFactory.initElements(BaseClass.driver, this);
	}

}
