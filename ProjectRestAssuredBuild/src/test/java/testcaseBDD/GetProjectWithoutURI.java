package testcaseBDD;
import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;

public class GetProjectWithoutURI {
	
	public void getProjctWithuriUsingBDD()
	{
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
