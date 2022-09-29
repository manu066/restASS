package CrudOpertionBDD;

import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;



public class PutMethodProjectUsingBDD {
	
	@Test
	public void PutmethodinBDD()
	{
			JSONObject jsonobj=new JSONObject();
		
		jsonobj.put("createdBy", "walter");
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
