package scripts;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class getOperation {
	
	@Test
	public void tc1() {
		when()
		.get("http://localhost:3000/posts")
		
		.then().log().all();
		
		
		
	}

}
