package CRUDoperationWithoutBDD;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class PostjsonthroughFile {
	
	@Test
	public void postjsonfile()
	{
		RestAssured rstasrd=new RestAssured();
		RequestSpecification rqstspctn = rstasrd.given();
		try
		{
		rqstspctn.body(new File("C:\\Users\\Manu\\Desktop\\contrtprojepostman.json"));
		}
		catch(Exception E)
		{
			E.printStackTrace();
		}
		rqstspctn.contentType(ContentType.JSON);
		// Actions
		 Response response = rqstspctn.post("http://localhost:8084/addProject");
		  ValidatableResponse valResp = response.then();
		valResp.assertThat().contentType(ContentType.JSON);
		valResp.assertThat().statusCode(201);
		valResp.log().all();
		
	}

}
