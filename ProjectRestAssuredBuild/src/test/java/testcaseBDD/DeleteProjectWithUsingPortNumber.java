package testcaseBDD;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.port;
import static io.restassured.RestAssured.when;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class DeleteProjectWithUsingPortNumber {
	
	@Test
	public void DeleteProwithoutPortNu()
	{
		baseURI="http://localhost";
		
		
		when()
				.delete("/projects/TY_PROJ_610")
		.then()
		      .assertThat()
		      				.statusCode(204)
		      				.contentType(ContentType.JSON)
		      				
		      				.log().all();
		
	}

}
