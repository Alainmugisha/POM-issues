package testing_area;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import multiple_pages.Login_page;
import util.BrowserFactory;

public class Login_test {
	static WebDriver driver;
	
	
	@Test
	public static void validUserloginTest()  {
		
		driver = BrowserFactory.init();
		
		Login_page loginpage = PageFactory.initElements(driver, Login_page.class);
		
		loginpage.user_name_method("demo@techfios");
		loginpage.password_method("abc123");
		loginpage.sign_in_method();
		
		
		
	}
}
