package restAssured;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.hamcrest.core.IsNull;
import org.json.JSONObject;
import org.junit.jupiter.api.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import net.bytebuddy.NamingStrategy.Suffixing.BaseNameResolver.ForGivenType;
class RestAssuredTest {

	 @Test
	void genderfetchApi() {
		RestAssured.baseURI = "https://api.genderize.io/";
		RequestSpecification myRequest = RestAssured.given();
		myRequest.queryParam("name", "shiv");
		Response response = myRequest.get("");
		int statusCode = response.getStatusCode();
		assertEquals(200, statusCode);
		System.out.println(response.getStatusLine());
		assertEquals("HTTP/1.1 200 OK", response.getStatusLine());
		response.headers();
		for (Header hd : response.headers()) {
			System.out.println("name:=" + hd.getName());
			System.out.println("value:=" + hd.getValue());
		}
		ResponseBody resBody = response.getBody();
		JsonPath responsePath = response.jsonPath();
		String myName = responsePath.get("name");
		assertEquals("shiv", myName);

	}

	 @Test
	void universityListApi() {
		RestAssured.baseURI = "http://universities.hipolabs.com/search?/";
		RequestSpecification myRequest = RestAssured.given();
		myRequest.queryParam("country", "india");
		Response response = myRequest.get("");
		int statusCode = response.getStatusCode();
		assertEquals(200, statusCode);
		JsonPath responsePath = response.jsonPath();
		List<String> countries = responsePath.getList("country");
		List<String> names = responsePath.getList("name");
		List<String> states = responsePath.getList("state-province");
		for (int i = 0; i < names.size(); i++) {
			if (names.get(i).equals("NorthCap University")) {
				System.out.println(states.get(i));
				break;
			}
		}
		int counter = 0;
		for (int j = 0; j < states.size(); j++) {
			if (states.get(j) != null) {
				if (states.get(j).equals("Punjab")) {
					counter++;
				}
			}
		}
		System.out.println("number of university in punjab is:" + counter);

	}

	@Test
	public void authBasedApi() {
		RequestSpecification myReq=
				RestAssured.given().auth().preemptive().basic("postman", "password");
		Response response=myReq.get("https://postman-echo.com/basic-auth");
		ResponseBody resBody= response.body();
		String res= resBody.asString();
		System.out.println(res);
		
	}
	
	@Test
	public void callPostApi() {
		String requestBody = "{\n" +
	            "  \"title\": \"foo\",\n" +
	            "  \"body\": \"bar\",\n" +
	            "  \"userId\": \"1\" \n}";
		RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
		Response response=
				RestAssured.given()
                .header("Content-type", "application/json")
                .and()
                .body(requestBody)
                .when()
                .post("/posts")
                .then()
                .extract().response();
		System.out.println(response.statusCode());
		
	}
	
	
	
	
	

	
}
