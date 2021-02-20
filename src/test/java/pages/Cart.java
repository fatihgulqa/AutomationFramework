package pages;

import utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cart extends CommonMethods{

	
	
	@FindBy(xpath = "//*[@id='cart_contents_container']/div/div[2]/a[2]")
	public WebElement checkoutBtn;
	
	public Cart()
	{
		PageFactory.initElements(driver, this);	
	}
	
	
	
}
