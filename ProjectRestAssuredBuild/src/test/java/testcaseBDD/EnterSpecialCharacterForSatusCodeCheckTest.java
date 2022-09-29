package testcaseBDD;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.port;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class EnterSpecialCharacterForSatusCodeCheckTest {
	@Test
	public void SpecialCharacterForStatusCode()
	{
		JSONObject jsonobj=new JSONObject();
		jsonobj.put("createdBy", "$%^&*%^&*");
		jsonobj.put("projectName","AccountsProject31");
		jsonobj.put("status","!@#$%#$%");
		jsonobj.put("teamSize",5);
		
		
		baseURI="http://localhost";
		port=8084;
		
		given()
			   .body(jsonobj)
			   .contentType(ContentType.JSON)
	    .when()
	    	   .post("/projects/TY_PROJ_1202")
	     .then()
	     		.assertThat()
	     					.statusCode(200)
	     					.contentType(ContentType.JSON)
	     					.log().all();
	}

}
