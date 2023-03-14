package seleniumtests;
import static io.restassured.RestAssured.*;
public class restAssuredtest {

	public static void main(String[] args) {
		
		given().when().get("https://api.genderize.io/?name=shiv").then().log()
	      .all();
	}

}
