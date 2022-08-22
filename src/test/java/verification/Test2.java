package verification;

import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

import org.testng.annotations.Test;

public class Test2 {
	@Test
	public void tc2() {
		//demo
		when()
		.get("http://localhost:3000/posts")
		
		
		.then().log().all()
		.assertThat().statusCode(200)
		.assertThat().header("X-Powered-By","Express")
		.assertThat().body("[5].id",equalTo(9000))
		.assertThat().body("[5].author",containsString("Bharanigramesh"))
		.assertThat().body("[5].title",is("qwsedrty"));
	}

}
