package FileReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Pattern;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;
import static com.jayway.restassured.RestAssured.*;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

public class FileReader {
	
	public JSONObject ObjectRead(String FilePath) throws FileNotFoundException
	{
		File f = new File(FilePath);
		java.io.FileReader fr = new java.io.FileReader(f);
		JSONTokener tk = new JSONTokener(fr);
		JSONObject ob = new JSONObject(tk);
		return ob;
	}
	public String UpID(JSONObject fr) {
		System.out.println("Please enter the ip you want to pass");
		Scanner s = new Scanner(System.in);
		String id = s.next();
		String up = fr.toString();
		up = up.replaceAll(Pattern.quote("{{id}}"), id);
		return up;
	}
	
	public Response Post(String API, String body)
	{
		Response res= given().contentType(ContentType.JSON).when().body(body).post(API);
		return res;
	}
	public Response Get(String API)
	{
		Response res = given().contentType(ContentType.JSON).when().get(API);
		return res;
	}
	public static void main(String[] args) throws FileNotFoundException {
		FileReader obj = new FileReader();
		
		JSONObject jsob = new JSONObject();
		jsob = obj.ObjectRead("D:\\Workspace\\HomeAssesment\\Body.json");
		String as =obj.UpID(jsob);
		String API = " http://localhost:3000/StudentDetails";
		System.out.println(obj.Post(API, as).asString());
		
	}
}
