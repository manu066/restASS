package testcaseBDD;

import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;


public class AddProjectWithOutContentType {
	@Test
	public void AddProjectWithOutContentTypeUsingBDD()
	{
		//step 1: create jsonObject
		
		JSONObject jsonobj=new JSONObject();
		jsonobj.put("createdBy", "mahela");				
		jsonobj.put("status", "completed");
		jsonobj.put("teamSize", 4);
		
	     baseURI="http://localhost";
	     port=8084;
	     
		//step 2:
		given()
		       .body(jsonobj)
		        
		.when()
		 		.post("/addProject")
		 .then()
		 		.assertThat()
		 					.statusCode(201)
		 					.contentType(ContentType.JSON).log().all();
		
	}

}
