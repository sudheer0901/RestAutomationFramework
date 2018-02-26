package googleAPI;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;

import common.Read;
import io.restassured.RestAssured;

public class DeleteRequest 
{
	@Test
	
	public void delete_Test()
	{
		System.out.println("Test case 3 is started");
		
		Read obj=new Read();
		
		RestAssured.baseURI="https://maps.googleapis.com/";
		
		String place_id=obj.readData("E:\\POSTRequest.txt","place_id");
		
		/*System.out.println("till1");
		
		String[] results=place_id.split(":");
		
		System.out.println(results[1]);*/
		
		given().
		
		queryParam("key", "AIzaSyCz5Phl40YIsAySFwt0bMam0SHX0Ml6TNQ").
		
		body
		("{\r\n" + 
				"  \"place_id\": \""+place_id+"\"\r\n" + 
				"}").
		when().
		post("/maps/api/place/delete/json").
		then().
		assertThat().statusCode(200).and().body("status",equalTo("OK"));	

	}

}
