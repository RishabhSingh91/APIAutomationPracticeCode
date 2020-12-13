package API_Practice;
import static com.jayway.restassured.RestAssured.*;

import org.json.JSONArray;
import org.json.JSONObject;

import com.jayway.restassured.response.Response;

public class SpecRead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Response res = given().param("studentID", "1001").when().get(" http://localhost:3000/EmployeeDetails");
		
		System.out.println(res.asString());
		JSONArray arr = new JSONArray(res.asString());
		int count = arr.length();
		
		/*
		   for(int i=0; i<count;i++) { JSONObject ob = arr.getJSONObject(i); String
		   FirstName = ob.getString("firstname"); String id = ob.get("id").toString();
		   System.out.println("The value of FirstName at index: "+i+" is: "+FirstName +
		   " and id is: "+ id);
		   
		   }
		 */
	}
	
}


