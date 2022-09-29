package serializationAndDeserialization;

import java.io.File;
import java.io.IOException;

import org.apache.commons.math3.analysis.function.Cbrt;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import com.pojo.ContactPojo;
import com.pojo.Family;

public class Deserialization {
	@Test
	public void deserializationmethod() throws JsonParseException, IOException, IOException
	{
		ObjectMapper opj=new ObjectMapper();
	
		 ContactPojo cn1 = opj.readValue(new File("./Contact.json"), ContactPojo.class);
		System.out.println(cn1.getAddress());
		System.out.println(cn1.getFirstName());
		System.out.println(cn1.getLastName());
		
	}

}
