package CRUDoperationWithoutBDD;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class DeleteProject {
	@Test
	public void deleteProjectId()
	{
		 Response resp = RestAssured.delete("http://localhost:8084/projects/TY_PROJ_612");
		 ValidatableResponse valresp = resp.then();
		  valresp.statusCode(200);
		  //valresp.contentType(ContentType.JSON);
		  valresp.log().all();
		  
		
		
	}

}
