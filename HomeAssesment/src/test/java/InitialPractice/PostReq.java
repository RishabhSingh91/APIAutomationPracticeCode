package InitialPractice;

import org.json.JSONArray;
import org.json.JSONObject;

import com.google.gson.JsonObject;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

import static com.jayway.restassured.RestAssured.*;

public class PostReq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PostReq obj = new PostReq();
		obj.ArrayJson();
	}

	public void SimpleJson() {
		JSONObject js = new JSONObject();
		js.put("firstName", "Rishabh");
		js.put("lastName", "Singh");
		js.put("id", 1);
		js.put("age", 29);

//		System.out.println(js.toString());
		Response res = given().contentType(ContentType.JSON).when().body(js.toString())
				.post("http://localhost:3000/StudentDetails");

		System.out.println("Status code after posting request is:" + res.statusCode());
		System.out.println("The response body is: " + res.asString());
	}

	public void ComplexJson() {
		JSONObject InnerObj = new JSONObject();
		JSONObject outerobj = new JSONObject();

		InnerObj.put("HouseNumber", "480");
		InnerObj.put("Sector", "C");
		InnerObj.put("city", "Jammu");

		outerobj.put("firstName", "Sharad");
		outerobj.put("lastname", "Sharma");
		outerobj.put("id", 4);
		outerobj.put("age", 31);
		outerobj.put("Address", InnerObj);

//		System.out.println(outerobj.toString());
		Response res = given().contentType(ContentType.JSON).when().body(outerobj.toString())
				.post("http://localhost:3000/StudentDetails");
		System.out.println("Status code after posting request is:" + res.statusCode());
		System.out.println("The response body is: " + res.asString());

	}
	
		public void ArrayJson()
		{
			JSONObject innerobj = new JSONObject();
			JSONObject innerobj1 = new JSONObject();
			JSONArray arrayObj = new JSONArray();
			JSONObject outerobj = new JSONObject();
			
			innerobj.put("HouseNumber", "A-8 Noida");
			innerobj1.put("Street", "DharampalSatyapal road");
			outerobj.put("Address", arrayObj.put(0, innerobj));
			outerobj.put("Address", arrayObj.put(1, innerobj1));
			outerobj.put("Age", 30);
			outerobj.put("id", 5);
			outerobj.put("lastName", "Gupta");
			outerobj.put("firstname", "Alok");
			
//			System.out.println(outerobj.toString());
			Response res = given().contentType(ContentType.JSON).when().body(outerobj.toString()).post("http://localhost:3000/StudentDetails");
			System.out.println("Response code for execution is"+ res.statusCode());
			System.out.println("Response body of the post data is"+ res.asString());

			
		}

}
