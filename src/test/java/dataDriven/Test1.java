package dataDriven;

import static io.restassured.RestAssured.given;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class Test1 {
	@Test
	public void tc1() throws FileNotFoundException, IOException {
	
	Properties p=new Properties();
	p.load(new FileInputStream("./data.properties"));
	
	given()
	.queryParam("q",p.getProperty("name"))
	.queryParam("sort",p.getProperty("sortit"))

	.when()
	.get("https://api.github.com/search/users")
	
	.then().log().all();
	
	
}
}
