package pages;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import base.TestBase;

public class SearchResultPage extends TestBase {
	
	@FindBy(css="ul>li.previw")
	WebElement ItemIcon;
	
	
public SearchResultPage(){
	PageFactory.initElements(driver, this);
}
public void viewDetails() {
	ItemIcon.click();
}

}
