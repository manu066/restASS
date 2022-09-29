package CRUDoperationWithoutBDD;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class GetProjectFromTestScript {
	@Test
	public void getResponse()
	{
		RestAssured rstAssd=new RestAssured();
		Response resp = rstAssd.get("http://localhost:8084/projects");
		
		 ValidatableResponse valResp = resp.then();
		  valResp.contentType(ContentType.JSON);
		   valResp.statusCode(200);
		   valResp.log().all();
		
		
	}

}
