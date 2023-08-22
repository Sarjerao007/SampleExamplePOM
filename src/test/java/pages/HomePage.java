package pages;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class HomePage extends TestBase {
	
	@FindBy(name="searchbar")
	WebElement srcBox;
	
	@FindBy(id="button-search")
	WebElement srcBtn;
	
	@FindBy(id="cart")
	WebElement btnCart;

	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public void searchItem(String item) {
		srcBox.sendKeys(item);
		srcBtn.click();
	}
}
