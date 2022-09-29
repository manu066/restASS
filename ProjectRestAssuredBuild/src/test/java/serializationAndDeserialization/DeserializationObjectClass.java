package serializationAndDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import com.pojo.ObjectClass;


public class DeserializationObjectClass {
	@Test
	public void deserializationObjectClass() throws JsonParseException, JsonMappingException, IOException
	{
		ObjectMapper opj=new ObjectMapper();
		ObjectClass val = opj.readValue(new File("./empldetails.json"), ObjectClass.class);
	    System.out.println(val.geteName());
	    System.out.println(val.getEmail());
	    System.out.println(val.geteID());
	    System.out.println(val.getWife().getName());
	   for(int i=0;i<=val.getPhoneNo().length-1;i++)
	   {
	    System.out.println(val.getPhoneNo()[i]);
	   }
	}
}
