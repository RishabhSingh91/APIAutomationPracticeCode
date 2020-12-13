package API_Practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Pattern;

import org.json.JSONObject;
import org.json.JSONTokener;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;
import static com.jayway.restassured.RestAssured.*;


public class FileReader {

	public static void main(String[] args) throws FileNotFoundException {
		
		File f = new File("D:\\Workspace\\HomeAssesment\\Body.json");
		java.io.FileReader fr = new java.io.FileReader(f);
		JSONTokener js1 = new JSONTokener(fr);
		JSONObject obj = new JSONObject(js1);
		
		
		   String id; Scanner s= new Scanner(System.in);
		   System.out.println("Plea  se enter the id"); id = s.next(); 
		   String var =   obj.toString();
		   var = var.replaceAll(Pattern.quote("{{id}}"), id);
		  
		  
		   System.out.println(var); Response res =
		   given().contentType(ContentType.JSON).when().body(var).post(
		   "http://localhost:3000/EmployeeDetails");
		   System.out.println("Status code is: "+ res.statusCode());
		   System.out.println(res.asString());
		 
		System.out.println(obj);
		
	}

}
