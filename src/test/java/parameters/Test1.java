package parameters;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class Test1 {
	@Test
	public void tc3() {
		given()
		.queryParam("q","API")
		.queryParam("sort","repositories")
	
		.when()
		.get("https://api.github.com/search/users")
		
		.then().log().all();
		
	}

}
