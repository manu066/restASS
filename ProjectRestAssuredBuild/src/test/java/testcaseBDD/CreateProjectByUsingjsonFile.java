package testcaseBDD;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.port;
import static io.restassured.RestAssured.when;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class CreateProjectByUsingjsonFile {
@Test
public void CreateProjectUsingFile()
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
		 		.post("/addProject")
		 .then()
		 		.assertThat()
		 					.statusCode(201)
		 					.contentType(ContentType.JSON)
		 					.log().all();
	

	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	

  }
}
