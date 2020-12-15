package restAssured;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class APItest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Specify the base URL to the RESTful web service
		RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city";

		
		RequestSpecification httpRequest = RestAssured.given();

		
		Response response = httpRequest.request(Method.GET, "/Hyderabad");

		
		String responseBody = response.getBody().asString();
		System.out.println("Response Body is =>  " + responseBody);

	}

}
