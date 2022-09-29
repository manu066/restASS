package testcaseBDD;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.port;
import static io.restassured.RestAssured.when;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class DeleteProjectWithOutEndPoint {
	
	@Test
	public void DeleteProjectWithoutEndpoint()
	{
		baseURI="http://localhost";
		port=8084;
		
		when()
				.delete("")
		.then()
		      .assertThat()
		      				.statusCode(204)
		      				.contentType(ContentType.JSON)
		      				.log().all();
		
		
		
	}

}
