package testbase;

import pages.*;

public class PageInitializer extends BaseClass {

	public static LoginPage loginPage;
	public static MainPage mainPage;
	public static InventoryItemPage inventoryItemPage;
	public static Cart cart;
	public static CheckoutStepOne checkoutStepOne;
	public static CheckoutStepTwo checkoutStepTwo;

	public static void initialize() {
		// initialize pages
		loginPage = new LoginPage();
		mainPage = new MainPage();
		cart =new Cart();
		checkoutStepOne = new CheckoutStepOne();
		checkoutStepTwo = new CheckoutStepTwo();
	}

}
