 package API_Practice;

import com.jayway.restassured.response.Response;
import static com.jayway.restassured.RestAssured.*;

import java.util.Scanner;
import java.util.Set;

import org.json.JSONArray;
import org.json.JSONObject;

public class ResRead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Response res = when().get("http://localhost:3000/EmployeeDetails");

		JSONArray obj = new JSONArray(res.asString());		
		JSONObject ob = obj.getJSONObject(0);
		Set<String> allKey = ob.keySet();
		int count = allKey.size();
		
		/*
		 * System.out.println("Please enter the key you want to print"); Scanner sc =
		 * new Scanner(System.in); String key = sc.next();
		 */
		for (String s : allKey) {
		
			try {
				JSONArray a = new JSONArray(ob.get(s).toString());
				System.out.println("The key name is: " + s + " and value is: " + a);
			}
			catch (Exception e) {
				// TODO: handle exception
				System.out.println("The key name is: " + s + " and value is: " + ob.get(s).toString());
			}
			
			/*
			 * if (ob.get(s).toString().startsWith("[")) { System.out.println("The key: " +
			 * s + " is an array hence, value can't be print"); } else {
			 * System.out.println("The key name is: " + s + " and value is: " +
			 * ob.get(s).toString()); }
			 */

		}

	}

}
