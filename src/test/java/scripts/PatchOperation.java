package scripts;
import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class PatchOperation {
	@Test
	public void tc3() {
		JSONObject jobj=new JSONObject();
		jobj.put("title","abcxyz");
		
		given()
		.contentType(ContentType.JSON)
		.body(jobj)
		
		
		.when()
		.patch("http://localhost:3000/posts/009")
		
		.then().log().all();
	}
	
	

}
