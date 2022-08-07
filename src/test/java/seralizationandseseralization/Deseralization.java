package seralizationandseseralization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

public class Deseralization {
	@Test
	public void tc2() throws JsonParseException, JsonMappingException, IOException {
	ObjectMapper mapper=new ObjectMapper();
	Project pobj = mapper.readValue(new File("./project.json"),Project.class);
	System.out.println(pobj.projectId);
	System.out.println(pobj.ProjectName);
	System.out.println(pobj.teamsize);
	System.out.println(pobj.status);
	
	
	}

}
