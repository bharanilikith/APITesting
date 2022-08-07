package scripts;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class PostOperation {
	
	@Test
	public void tc2() {
		JSONObject jobj=new JSONObject();
		jobj.put("name","qwerty");
		jobj.put("title","demo");
		jobj.put("id","009");
		
		given()
		.contentType(ContentType.JSON)
		.body(jobj)
		
		.when()
		.post(" http://localhost:3000/posts")
		
		.then().log().all();
		
	}

}
