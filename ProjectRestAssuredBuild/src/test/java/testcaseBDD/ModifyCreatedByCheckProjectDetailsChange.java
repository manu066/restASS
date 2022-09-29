package testcaseBDD;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.port;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;


public class ModifyCreatedByCheckProjectDetailsChange {
	@Test
	public void ModifyCreatedByCheckProjectDetailsChangeUsingBDD()
	{
			JSONObject jsonobj=new JSONObject();
		
		jsonobj.put("createdBy", "w");
		jsonobj.put("projectName","AccountsProject31");
		jsonobj.put("status","Completed");
		jsonobj.put("teamSize",5);
		
		
		baseURI="http://localhost";
		port=8084;
		
		given()
			   .body(jsonobj)
			   .contentType(ContentType.JSON)
	    .when()
	    	   .put("/projects/TY_PROJ_1202")
	     .then()
	     		.assertThat()
	     					.statusCode(200)
	     					.contentType(ContentType.JSON)
	     					.log().all();
				
		
	}

}
