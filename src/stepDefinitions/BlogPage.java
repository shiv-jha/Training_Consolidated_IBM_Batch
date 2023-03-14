package stepDefinitions;

import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import common.DriverInitailizer;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BlogPage extends DriverInitailizer {
	
	//WebDriver driver;
	
	
	@Given("user is in Blog page")
	public void navigateSearchPage() {
		//System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
	//	driver=new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
	}
	@When("user enters data in search field")
	public void enterProduct() {
		driver.findElement(By.name("q")).sendKeys("hello");
	}
	
	@Then("data should appear in search field")
	public void verifyProduct()
	{
		assertEquals("hello", driver.findElement(By.name("q")).getAttribute("value"));
		driver.quit();
	}
	
}
