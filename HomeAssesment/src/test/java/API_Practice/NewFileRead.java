package API_Practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Set;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

import com.jayway.restassured.path.json.JsonPath;
import com.jayway.restassured.response.Response;
import static com.jayway.restassured.RestAssured.*;

public class NewFileRead {
	public static void main(String[] args) throws FileNotFoundException {
		File f = new File("D:\\Workspace\\HomeAssesment\\Body.json");
		java.io.FileReader fr = new java.io.FileReader(f);
		JSONTokener js = new JSONTokener(fr);
		JSONObject obj = new JSONObject(js);

		Response res = when().get("http://localhost:3000/EmployeeDetails");
		
		JSONArray ar = new JSONArray(res.asString());
		JSONObject Jsobj = ar.getJSONObject(0);
		Set<String> allkeys = Jsobj.keySet();
//		System.out.println(allkeys);
		

	/*	for (String s : allkeys) {
			try {
				JSONArray a = new JSONArray(obj.get(s).toString());
				System.out.println("Key is " + s + " value is " + a);
			} catch (Exception e) {
				System.out.println("Key is " + s + " value is " + Jsobj.get(s).toString());
			}
		}*/

	}

}
