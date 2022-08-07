package CURDGithub;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class DeleteOpertaion {
	@Test
	public void tc4() {
		given()
		.auth().oauth2("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")
		
		.when()
		.delete("https://api.github.com/repos/bharanilikith/QwertAPI")
		
		.then().log().all();
		
	}

}
