package googleAPI;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

public class GetRequest 
{
	
	@Test
	
	public void get_Test()
	{
		RestAssured.baseURI="https://maps.googleapis.com/";
		
		 given().
		 
		 param("location", "-33.8670522,151.1957362").
		 
		 param("radius","500").
		 
		 param("type","restaurant").
		 
		 param("keyword","cruise").
		 
		 param("key","AIzaSyCz5Phl40YIsAySFwt0bMam0SHX0Ml6TNQ").
		 
		 when().
		 
		 get("maps/api/place/nearbysearch/json").
		 
		 then().
		 
		 spec(ResponseSpecTest.setupResponseSpecBuilder());
		

	}

}
