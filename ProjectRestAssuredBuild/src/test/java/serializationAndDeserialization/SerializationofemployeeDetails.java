package serializationAndDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import com.pojo.ObjectClass;
import com.pojo.PojoClassForSerializationAndDeserialization;
import com.pojo.WifeDetails;

public class SerializationofemployeeDetails {
	@Test
	public void serialization() throws JsonGenerationException, Exception, Throwable
	{
	//Step 1: create object of pojo class
	PojoClassForSerializationAndDeserialization emp=new PojoClassForSerializationAndDeserialization("manu", "ty001", 785845, "abcn@gmail.com", "bangaluru");
	//step 2: Create object of ObjectMapper from jackson mapper
	ObjectMapper objmp=new ObjectMapper();
	//step 3: write data into json file
	
	objmp.writeValue(new File("./employee.xml"), emp);
	
	}
}
