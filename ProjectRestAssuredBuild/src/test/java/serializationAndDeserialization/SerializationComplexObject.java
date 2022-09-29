package serializationAndDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import com.pojo.ObjectClass;
import com.pojo.WifeDetails;

public class SerializationComplexObject {
	
	@Test
	public void serializaiton() throws JsonGenerationException, JsonMappingException, IOException
	{
	
	//step1 create Object of pojo class
		int[] phone= {7854,78488};
		
		 ObjectClass emp = new ObjectClass("manu", "ty003",phone,"abcn@gmail", "bagnaluru", new WifeDetails("abc", "785485488"));
		//step2: create Object mapper class
		 ObjectMapper objmp=new ObjectMapper();
		 
		 //step3:write data into json file
		 
		 objmp.writeValue(new File("./empldetails.json"), emp);
	}
	
	}

