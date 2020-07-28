package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.junit.Cucumber;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.junit.Assert.*;

import org.junit.Assert;

public class loginstepdefinition {

	WebDriver driver;

	@Given("^user is already on Login Page$")
	public void user_already_on_login_page(){
		System.setProperty("webdriver.chrome.driver","C:\\sanjeev\\Software learning\\software testing\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://ui.freecrm.com/");
	}

	@When("^title of login page is Cogmento CRM$")
	public void title_of_login_page_is_free_CRM(){
		String title = driver.getTitle();
		System.out.println(title);
		assertEquals("Cogmento CRM", title);
	}

	//@Then("^user enters email and password$")
	//driver.findElement(By.name("email")).sendKeys("naveenk");
	//driver.findElement(By.name("password")).sendKeys("test@123");
	
	
	//Reg Exp:
//	 //1. \"([^\"]*)\"
//	 //2. \"(.*)\"
	
	
	@Then("^user enters \"(.*)\" and \"(.*)\"$")
	public void user_enters_email_and_password(String email, String password) {
		driver.findElement(By.name("email")).sendKeys(email);
		driver.findElement(By.name("password")).sendKeys(password);
	}
	
	@Then("^user clicks on login button")
	public void userclicksonlogin() {
		WebElement loginBtn = driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", loginBtn);
	}
	
	@Then("^Close the browser$")
	public void closebrowser() {
		driver.quit();
	}
	
}
