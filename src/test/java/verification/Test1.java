package verification;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

public class Test1 {
	@Test
	public void tc2() {
		when()
		.get("http://localhost:3000/posts")
		
		.then().log().all()
		.assertThat().body("[5].id",equalTo(9000))
		.assertThat().body("[5].author",containsString("Bharanigramesh"))
		.assertThat().body("[5].title",is("qwsedrty"));
	}

}
