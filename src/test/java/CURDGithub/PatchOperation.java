package CURDGithub;
import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class PatchOperation {
	@Test
	public void tc3() {
		JSONObject jobj=new JSONObject();
		jobj.put("description","dummy repo");
		jobj.put("private",false);
		
		given()
		.contentType(ContentType.JSON)
		.body(jobj)
		.auth().oauth2("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")
		
		
		.when()
		.patch("https://api.github.com/repos/bharanilikith/QwertAPI")
		
		.then().log().all();
	}

}
