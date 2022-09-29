package CRUDoperationWithoutBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class PostMethodEmployee {
     @Test
	public void employee()
	{
	   //step 1: create object json body
    	 JSONObject jobj=new JSONObject();
    	 jobj.put("designation", "DevelopmentLead");
    	 jobj.put("dob","07/12/1999");
    	 jobj.put("email","mnabn@gmail.com");
    	 jobj.put("empName","jorge");
    	 jobj.put("experience",0);
    	 jobj.put("mobileNo","78452545");
    	 jobj.put("project","accountproj");
    	 jobj.put("role","lead");
    	 jobj.put("username","jorge");
    	 
    	 //precondtion 
             RequestSpecification rqspn = RestAssured.given();
             rqspn.body(jobj);
             rqspn.contentType(ContentType.JSON);
             
             //Step2 : 
             Response response = rqspn.post("http://localhost:8084/employees");
           ValidatableResponse valresp = response.then();
           valresp.assertThat().statusCode(201);
           valresp.assertThat().contentType(ContentType.JSON);
           valresp.log().all();
             
	}
}
