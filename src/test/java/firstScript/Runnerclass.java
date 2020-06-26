package firstScript;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class Runnerclass {

	WebDriver login;
	
@Given("^The gmail page is opened$")
	public void the_gmail_page_is_opened() throws Throwable {
	    
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mohan.reddy.a\\Downloads\\chromedriver_win32\\chromedriver.exe");    
    login = new ChromeDriver();
    login.get("https://accounts.google.com/");
}
@When("^valid id password is supplied$")
    
    public void valid_id_password_is_supplied()throws Throwable
{
	login.findElement(By.xpath("//*[@id=\"identifierId\"]"));
    	
    }
    
}
