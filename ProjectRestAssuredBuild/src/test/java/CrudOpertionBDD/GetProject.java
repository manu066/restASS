package CrudOpertionBDD;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class GetProject {
	
	@Test
	public void getProject()
	{
		baseURI="http://localhost";
		port=8084;
		//step1:Action
		when()
			 .get("/projects")
			                 
		.then()                    //validation
		      
			 .assertThat()
			 			 .contentType(ContentType.JSON)
			 			 .statusCode(200)
			 			 .log().all();
	}

}
