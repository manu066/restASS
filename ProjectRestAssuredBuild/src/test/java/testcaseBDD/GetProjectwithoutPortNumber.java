package testcaseBDD;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;

public class GetProjectwithoutPortNumber {
	
	public void GetProjectWithoutProtNumberUsingBDD()
	{
		baseURI="http://localhost";
		
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
