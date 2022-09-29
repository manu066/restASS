package testcaseBDD;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class GetProjectWithoutUriAndPort {
	
	@Test
	public void getProjectWithOutURIandPort()
	{
		when()
		 .get("/projects")
		                 
	.then()                    //validation
	      
		 .assertThat()
		 			 .contentType(ContentType.JSON)
		 			 .statusCode(200)
		 			 .log().all();
	}

}
