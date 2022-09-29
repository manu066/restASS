package testcaseBDD;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;


public class GetProjectWithoutPathVariable {
	@Test
	public void geProjectWithoutPathVariable()
	{
		baseURI="http://localhost";
		port=8084;
		
		when()
			.get()
		.then()
		     .assertThat()
		                 .statusCode(200)
		                 .contentType(ContentType.JSON)
		                 .log().all();
	}

}
