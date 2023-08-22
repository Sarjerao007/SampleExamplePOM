package testScripts;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.TestBase;
import pages.HomePage;
import pages.SearchResultPage;

public class PlaceOrder extends TestBase {
	HomePage homePage;
	SearchResultPage resultPage;
	@BeforeMethod
	public void setup() {
		initialize();
		
	}
	@Test
	public void searchItemTest() {
		homePage= new HomePage();
		homePage.searchItem("Parry Hotter");
		resultPage = new SearchResultPage();
		resultPage.viewDetails();
	}
	
	//@Test
public void addItemTest() {
	
}

}
