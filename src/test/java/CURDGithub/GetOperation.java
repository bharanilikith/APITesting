package CURDGithub;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class GetOperation {
	
	@Test
	public void tc1() {
		
		when()
		.get("https://api.github.com/repos/bharanilikith/hybridramework")
		
		.then().log().all();
		
	}

}
