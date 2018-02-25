package googleAPI;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import org.testng.annotations.Test;

import common.Write;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import java.io.IOException;

public class PostRequest 
{
	@Test
	
	public void post_Test() throws IOException
	{
		RestAssured.baseURI="https://maps.googleapis.com/";
		
		Response res=given().
		
	    	queryParam("key", "AIzaSyCz5Phl40YIsAySFwt0bMam0SHX0Ml6TNQ").
		
		body("{\r\n" + 
				"  \"location\": {\r\n" + 
				"    \"lat\": -33.8669710,\r\n" + 
				"    \"lng\": 151.1958750\r\n" + 
				"  },\r\n" + 
				"  \"accuracy\": 50,\r\n" + 
				"  \"name\": \"Google Shoes!\",\r\n" + 
				"  \"phone_number\": \"(02) 9374 4000\",\r\n" + 
				"  \"address\": \"48 Pirrama Road, Pyrmont, NSW 2009, Australia\",\r\n" + 
				"  \"types\": [\"shoe_store\"],\r\n" + 
				"  \"website\": \"http://www.google.com.au/\",\r\n" + 
				"  \"language\": \"en-AU\"\r\n" + 
				"}").
		
		when().
		
		post("maps/api/place/add/json").
		
		then().
		
		assertThat().statusCode(200).contentType(ContentType.JSON).
		
		body("status", equalTo("OK")).extract().response();
		
		String responseString=res.asString();
		
		JsonPath js=new JsonPath(responseString);
		
		String place_id=js.get("place_id");
		
		Write obj=new Write();
		
		obj.writeData("E:\\POSTRequest.txt", "palce_id :"+place_id);
		
		System.out.println("Testcase 2 is completed");
	}
	}
	

