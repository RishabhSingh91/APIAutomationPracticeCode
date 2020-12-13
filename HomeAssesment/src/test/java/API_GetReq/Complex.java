package API_GetReq;

import static com.jayway.restassured.RestAssured.given;

import org.json.JSONObject;
import com.jayway.restassured.*;
import com.jayway.restassured.response.Response;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.specification.RequestSpecification;


import groovy.grape.GrapeIvy;


public class Complex {
	
	public static void main(String []a)
	{
		Complex obj = new Complex();
		obj.postdetails();
		obj.getdetails();
	}
	public void getdetails()
	{
		Response res = given().contentType(ContentType.JSON).get("http://localhost:3000/DeptDetails");
		System.out.println(res.asString());
	}
	public void postdetails()
	{
		JSONObject obj = new JSONObject();
		obj.put("Dept Name", "QA");
		obj.put("Total employee", 75);
		obj.put("Started at", "06/02/2014");
		
		Response res = given().contentType(ContentType.JSON).when().body(obj.toString()).post("http://localhost:3000/DeptDetails");
	}

}
