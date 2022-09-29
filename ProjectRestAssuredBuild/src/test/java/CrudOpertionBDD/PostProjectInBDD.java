package CrudOpertionBDD;

import org.codehaus.jackson.map.deser.ValueInstantiators.Base;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import com.mysql.cj.conf.DatabaseUrlContainer;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;



public class PostProjectInBDD {
	@Test
	public void AddProjectUsingBDDandPostMethod()
	{
      //step 1: create jsonObject
		
		JSONObject jsonobj=new JSONObject();
		jsonobj.put("createdBy", "mahela");
		jsonobj.put("projectName", "AcrWorkproject");
		jsonobj.put("status", "completed");
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
