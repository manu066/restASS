package testcaseBDD;

import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class DeleteProjectWithoutProjectId {
	
	@Test
	public void DeleteProjectWithoutProj()
	{
		baseURI="http://localhost";
		port=8084;
		
		when()
				.delete()
		.then()
		      .assertThat()
		      				.statusCode(204)
		      				.contentType(ContentType.JSON)
		      				.log().all();
		
	}
}
