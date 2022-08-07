package parameters;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class Test0 {
	
	@Test
	public void tc3() {
		given()
		.pathParam("ownerName","bharanilikith")
		.pathParam("repoName","advanceselenium")
		
		.when()
		.get("https://api.github.com/repos/{ownerName}/{repoName}")
		
		.then().log().all();
		
	}

}
