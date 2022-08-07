package CURDGithub;
import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class PostOperation {
	@Test
	public void tc3() {
		JSONObject jobj=new JSONObject();
		jobj.put("name","QwertAPI");
		jobj.put("description","demorepro");
		
		
		given()
		.contentType(ContentType.JSON)
		.body(jobj)
		.auth().oauth2("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")
		
		
		.when()
		.post("https://api.github.com/user/repos")
		
		.then().log().all();
		
		
	}

}
