package FileReader;

import com.jayway.restassured.response.Response;
import static com.jayway.restassured.RestAssured.*;

import java.util.Set;

import org.json.JSONArray;
import org.json.JSONObject;

public class ResReader {
	
	public JSONObject resRead(String API, int index)
	{
		Response res = when().get(API);
		JSONArray arr = new JSONArray(res.asString());
		JSONObject ob = arr.getJSONObject(index);
		return ob;
		
	}
	public void ResBody(JSONObject ob)
	{
		Set<String> allkeys = ob.keySet();
		for(String s: allkeys)
		{
			if(ob.get(s).toString().startsWith("["))
			{
				JSONArray arr = new JSONArray(ob.get(s).toString());
				JSONObject ob1 = arr.getJSONObject(0);
				Set<String> jsonKey = ob1.keySet();
				
				for(String s1:jsonKey)
				{		
				System.out.println("The Key is: "+s1+" and value is: "+ob1.get(s1).toString());
				}
			}
	/*	else if(ob.get(s).toString().startsWith("{"))
			{
				JSONArray arr1 = new JSONArray(ob.get(s).toString()); 
				JSONObject innerOb = arr1.getJSONObject(0);
				Set<String> key = ob.keySet();
				for(String s2: key)
				{
					System.out.println("The key is "+ s2+" and value is: "+ ob.get(s2));
				}
			}*/
			else
			{
				System.out.println("The Key is: "+s+" The value is: "+ob.get(s).toString());
			 
			}
		}
	}
	
	public static void main(String[] args) {
		ResReader obj = new ResReader();
		String API = "http://localhost:3000/StudentDetails";
		JSONObject ob;
		ob =obj.resRead(API,1);
		obj.ResBody(ob);
	}

}
