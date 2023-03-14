package seleniumtests;

import static org.testng.Assert.assertEquals;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Webdrivertest1 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");	
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.id("alert1")).click();
		driver.switchTo().alert().accept();
		driver.findElement(By.id("ta1")).sendKeys("Selenium training");  //text box
		driver.findElement(By.id("radio1")).click();   //click on radio button
		driver.findElement(By.id("checkbox2")).click();  //click on checkbox
		Select newLetter= new Select(driver.findElement(By.id("drop1")));
		newLetter.selectByVisibleText("doc 2");  //selecting from list box
		String text=driver.findElement(By.id("textbox1")).getAttribute("value");  //fetching vaue from application
		System.out.println("Text present in field is :"+text);
		driver.findElement(By.id("textbox1")).clear(); //clearing the text field
		driver.findElement(By.id("textbox1")).sendKeys("hello");
		driver.findElement(By.id("timerButton")).click(); //button
		Actions act= new Actions(driver);
		act.doubleClick(driver.findElement(By.xpath("//button[contains(text(),'Double click Here')]")));
		driver.switchTo().alert().accept();

	}

}
