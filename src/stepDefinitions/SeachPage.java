package stepDefinitions;

import static org.junit.Assert.assertTrue;

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

public class SeachPage extends DriverInitailizer {
	
	//WebDriver driver;
	
	@Given("test multiple scenario case1")
	public void testmultiplescenariouc1() {
		System.out.println("other scenario- 1");
	}
	
	@Given("test multiple scenario case2")
	public void testmultiplescenariouc2() {
		System.out.println("other scenario-2");
	}
	
	@Given("user is in Search page")
	public void navigateSearchPage() {
//		System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
//		driver=new ChromeDriver();
		driver.get("http://tutorialsninja.com/demo");
		//driver.navigate().to("http://tutorialsninja.com/demo");
	}
	@When("user enters {string} product")
	public void enterProduct(String product) {
		driver.findElement(By.name("search")).sendKeys(product);
	}
	
	@And("Click on Search button")
	public void clickSearch() {
		driver.findElement(By.xpath("//div[@id='search']//button")).click();
		
	}
	
	@Then("Product {string} should be displayed")
	public void verifyProduct(String sProduct)
	{
		assertTrue(driver.findElement(By.xpath("//a[contains(text(),'"+sProduct+"')]")).isDisplayed());
		driver.quit();
	}
	
}
