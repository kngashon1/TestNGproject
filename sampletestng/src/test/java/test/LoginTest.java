package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.LoginPage;
import util.BrowserFactory;

public class LoginTest {
	
	@Test
	
	public void loginTest() {
		WebDriver driver = BrowserFactory.startBrowser();
		driver.get("http://techfios.com/test/billing/?ng=admin/");
		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		loginpage.login("techfiosdemo@gmail.com","abc123");
	}

}
