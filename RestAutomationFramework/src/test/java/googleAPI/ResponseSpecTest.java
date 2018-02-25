package googleAPI;

import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.ResponseSpecification;


import org.junit.BeforeClass;

public class ResponseSpecTest 
{
	
	public static ResponseSpecBuilder builder;
	
	public static ResponseSpecification responseSpec;
	
	@BeforeClass
	
	public static ResponseSpecification setupResponseSpecBuilder()
	{
		builder=new ResponseSpecBuilder();
		
		builder.expectStatusCode(200).expectContentType(ContentType.JSON);
		
		return responseSpec=builder.build();
			
	}

}
