package restapitesting;

import org.testng.annotations.Test;
 
import com.aventstack.extentreports.gherkin.model.Given;
 
import io.restassured.RestAssured;
import io.restassured.response.Response;
 
public class GET_User {
  @Test
  public void getuser() {
	  
	  RestAssured.baseURI="https://api.restful-api.dev/objects/7";
	  
	  RestAssured.given()
			  .when()
			  .get("/objects")
			  .then()
			  .statusCode(404)
			  .log().all();
			
	  
  }
}
 
 
