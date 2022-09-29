package CRUDoperationWithoutBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class AddProject {
	@Test
	public void createProjectTest()
	{
		// create object to empty body -- JSONObject //post
		JSONObject jobj=new JSONObject();
		//create the body using json simple
		jobj.put("createdBy", "manu");
		jobj.put("projectName","IT consultcy");
		jobj.put("status", "Ongoing ");
		jobj.put("teamsize",4);
		//precondition body and content type
		RequestSpecification reqsp=RestAssured.given();
		reqsp.body(jobj);
		reqsp.contentType(ContentType.JSON);
		// Actions
		 Response response = reqsp.post("http://localhost:8084/addProject");
		  ValidatableResponse valResp = response.then();
		valResp.assertThat().contentType(ContentType.JSON);
		valResp.assertThat().statusCode(201);
		valResp.log().all();
		
	} 
	

}
