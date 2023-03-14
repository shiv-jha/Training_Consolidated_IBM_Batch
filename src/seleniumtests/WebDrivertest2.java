package seleniumtests;

import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDrivertest2 {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("http://tutorialsninja.com/demo");
		
		//count number of product didplayed in the page
		List<WebElement> allProduct=driver.findElements(By.xpath("//div[starts-with(@class,'product-layout')]"));
		assertEquals(4, allProduct.size());
		driver.findElement(By.xpath("//a[text()='iPhone']")).click();
		String myprice=driver.findElement(By.xpath("//div[@id='content']//h2[contains(text(),'$')]")).getText();
		driver.findElement(By.name("quantity")).clear();
		driver.findElement(By.name("quantity")).sendKeys("2");
		driver.findElement(By.id("button-cart")).click();
		driver.findElement(By.xpath("//div[@id='product-product']/div[contains(text(),'Success: You have added ')]")).isDisplayed();
		driver.findElement(By.xpath("//button[@type='button' and @data-toggle='dropdown']")).click();
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//p/a[@href='http://tutorialsninja.com/demo/index.php?route=checkout/cart']")));
		driver.findElement(By.xpath("//p/a[@href='http://tutorialsninja.com/demo/index.php?route=checkout/cart']")).click();
		String qty=driver.findElement(By.xpath("//div[@class='input-group btn-block']/input")).getAttribute("value");
		driver.findElement(By.xpath("//td[text()='"+myprice+"']")).isDisplayed();
		
		driver.close();
	}
}
