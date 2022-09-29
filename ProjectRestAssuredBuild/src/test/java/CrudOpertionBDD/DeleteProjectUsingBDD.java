package CrudOpertionBDD;

import static io.restassured.RestAssured.*;

import java.util.concurrent.TimeUnit;

import org.hamcrest.Matcher;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
public class DeleteProjectUsingBDD {
	
	@Test
	public void deleteProjectUsingDeleteBDD()
	{
		baseURI="http://localhost";
		port=8084;
		when()
		     .delete("/projects/TY_PROJ_607")
		.then()
		       .assertThat()
		       				.statusCode(204)
		       				.contentType(ContentType.JSON)
		       				.log().all();
			 
	}

	

	

}
