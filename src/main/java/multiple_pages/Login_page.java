package multiple_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Login_page {
	
	WebDriver driver;
	
	Login_page (WebDriver driver) {
	this.driver= driver;
}
	
	@FindBy (how= How.XPATH,using ="//*[@id=\"username\"]")
	WebElement USER_NAME_FIELD;

	@FindBy(how = How.XPATH, using = "//*[@id=\"password\"]")
	WebElement PASSWORD_FIELD;
	
	@FindBy(how = How.XPATH, using = "/html/body/div/div/div/form/div[3]/button")
	WebElement SIGN_IN_FIELD;
	
	
	public void user_name_method(String validusername) {
		
		USER_NAME_FIELD.sendKeys(validusername);
				
	}
	
public void password_method( String validpassword) {
	PASSWORD_FIELD.sendKeys(validpassword);
			
		
	}
public void sign_in_method() {
	
	SIGN_IN_FIELD.click();
	
	
}
	
	
}