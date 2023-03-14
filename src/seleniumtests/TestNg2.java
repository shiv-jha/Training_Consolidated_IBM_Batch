package seleniumtests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class TestNg2 {
	
	//,groups = {"regression", "smoke"}
@Test(dataProvider = "mydata")
  public void testng2method(String data) {
	  System.out.println(data);
  }

@DataProvider(name="mydata")
public Object[][] datamethod(){
	return new Object[][] {{"data1"},{"data2"},{"data1"}};
}
}
