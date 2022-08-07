package dataDriven;

import static io.restassured.RestAssured.given;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class Test0 {
	@Test
	public void tc1() throws FileNotFoundException, IOException {
	
	Properties p=new Properties();
	p.load(new FileInputStream("./data.properties"));
	
	given()
	.pathParam("ownerName",p.getProperty("username"))
	.pathParam("repoName",p.getProperty("reponame"))
	
	.when()
	.get("https://api.github.com/repos/{ownerName}/{repoName}")
	
	.then().log().all();
	
	
	

}
}