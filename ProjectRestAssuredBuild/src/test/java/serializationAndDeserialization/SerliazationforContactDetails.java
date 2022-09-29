package serializationAndDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import com.pojo.ContactPojo;
import com.pojo.Family;

@Test
public class SerliazationforContactDetails {
	
	public void serlizationContact() throws JsonGenerationException, IOException, Throwable
	{
		
     String[] relatedName= {"mohan","manoj"};
		ContactPojo cn=new ContactPojo("manu", "BN", "TY",9845,"http://loca","BLR","06DEC",relatedName,new Family("Sharath","HSN",78458));
	
	ObjectMapper objmp=new ObjectMapper();
	
	objmp.writeValue(new File("./Contact.json"), cn);
	}

}
