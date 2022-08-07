package seralizationandseseralization;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class PostOperation {
	@Test
	public void tc1() {
		Demo d=new Demo(12,"qwerty","Paul");
		
		given()
		.contentType(ContentType.JSON)
		.body(d)
		
		
		.when()
		.post("http://localhost:3000/posts")
		
		.then().log().all();
		
	}

}
