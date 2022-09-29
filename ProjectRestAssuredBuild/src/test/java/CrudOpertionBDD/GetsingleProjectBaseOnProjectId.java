package CrudOpertionBDD;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class GetsingleProjectBaseOnProjectId {
	
	@Test
	public void getprojectBaseonprojectIdUsingBDD()
	{
		baseURI="http://localhost";
		port=8084;
		
		when()
			.get("/projects/TY_PROJ_803")
		.then()
		     .assertThat()
		                 .statusCode(200)
		                 .contentType(ContentType.JSON)
		                 .log().all();
		     
		
	}
	
	

}
