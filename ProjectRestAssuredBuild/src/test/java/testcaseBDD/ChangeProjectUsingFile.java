package testcaseBDD;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.port;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class ChangeProjectUsingFile {
	
	@Test
	public void ChangeProjectUsingFileInPUTmethod()
	{
		try
		{
			baseURI="http://localhost";
		     port=8084;
		     
			//step 2:
			given()
			       .body( new File("C:\\Users\\Manu\\Desktop\\contrtprojepostman.json"))
			        .contentType(ContentType.JSON)
			        
			.when()
			 		.put("/projects/projectId")
			 .then()
			 		.assertThat()
			 					.statusCode(200)
			 					.contentType(ContentType.JSON)
			 					.log().all();
		

		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
