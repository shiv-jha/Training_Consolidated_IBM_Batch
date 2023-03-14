package seleniumtests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Testng1 {
	WebDriver driver;
	String myprice;

	@Test(groups = {"regression", "smoke"}, priority=1)
	public void addTocart() {
		driver.get("http://tutorialsninja.com/demo");
		driver.findElement(By.xpath("//a[text()='iPhone']")).click();
		myprice = driver.findElement(By.xpath("//div[@id='content']//h2[contains(text(),'$')]")).getText();
		driver.findElement(By.name("quantity")).clear();
		driver.findElement(By.name("quantity")).sendKeys("2");
		driver.findElement(By.id("button-cart")).click();
	}

	@Test(groups= {"regression"},priority=2)
	public void verifyMycart() {
		assertTrue(driver.findElement(By.xpath("//div[@id='product-product']/div[contains(text(),'Success: You have added ')]"))
				.isDisplayed());
		driver.findElement(By.xpath("//button[@type='button' and @data-toggle='dropdown']")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//p/a[@href='http://tutorialsninja.com/demo/index.php?route=checkout/cart']")));
		driver.findElement(By.xpath("//p/a[@href='http://tutorialsninja.com/demo/index.php?route=checkout/cart']"))
				.click();
		String qty = driver.findElement(By.xpath("//div[@class='input-group btn-block']/input")).getAttribute("value");
		assertEquals("2", "2");
		driver.findElement(By.xpath("//td[text()='" + myprice + "']")).isDisplayed();
	}

	@BeforeClass(groups = {"setup"})
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@AfterClass(groups = {"setup"})
	public void afterClass() {
		driver.quit();
	}
	


}
