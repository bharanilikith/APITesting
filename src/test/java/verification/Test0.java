package verification;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class Test0 {
	@Test
	public void tc1() {
		
		when()
		.get("http://localhost:3000/posts")
		
		.then().log().all()
		.assertThat().statusCode(200)
		.contentType(ContentType.JSON)
		.assertThat().header("Cache-Control","no-cache")
		.assertThat().header("X-Powered-By","Express");
		
		
	}

}
