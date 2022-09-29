package testcaseBDD;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.port;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class AddProjectWithOutSatus {
	@Test
	public void AddProjectwithoutStatusCodeUsingBDD()
	{
		//step 1: create jsonObject
		
		
				JSONObject jsonobj=new JSONObject();
				jsonobj.put("createdBy", "mahela");	
				jsonobj.put("projectName", "AcrWorkproject1256");
				jsonobj.put("teamSize", 4);
				
			     baseURI="http://localhost";
			     port=8084;
			     
				//step 2:
				given()
				       .body(jsonobj)
				        .contentType(ContentType.JSON)
				.when()
				 		.post("/addProject")
				 .then()
				 		.assertThat()
				 					.statusCode(201)
				 					.contentType(ContentType.JSON).log().all();
				
	}

}
