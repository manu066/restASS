package CRUDoperationWithoutBDD;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class GetSingleProject {
	@Test
	public void singleProject()
	{ 
		// get single project get() method
		Response resp = RestAssured.get("http://localhost:8084/projects/TY_PROJ_1003");
		ValidatableResponse valresp = resp.then();
		valresp.assertThat().statusCode(200);
		valresp.assertThat().contentType(ContentType.JSON);
		//valresp.log().all();
		 resp.prettyPrint();
		
	}

}
