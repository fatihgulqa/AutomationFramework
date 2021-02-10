package testbase;

import pages.LoginPage;
import pages.MainPage;

public class PageInitializer extends testbase.BaseClass {

	public static LoginPage loginPage;
	public static MainPage mainPage;

	public static void initialize() {
		// initialize pages
		loginPage = new LoginPage();
		mainPage = new MainPage();
	}

}
