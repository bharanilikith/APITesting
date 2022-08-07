package scripts;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class DeleteOperation {
	@Test
	public void tc3() {
	
		
		when()
		.delete(" http://localhost:3000/posts/009")
		
		.then().log().all();
	}
	
	

}
