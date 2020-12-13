package API_GetReq;

import java.util.Scanner;

import javax.xml.bind.SchemaOutputResolver;

import org.json.JSONArray;
import org.json.JSONObject;
import static com.jayway.restassured.RestAssured.*;
import com.jayway.restassured.specification.*;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;


public class Postreq extends TestData {
	
	
	public static void main(String[] args) {
		
		Postreq obj = new Postreq();
		
		obj.dec();
		JSONObject innerobj = new JSONObject();		
		JSONObject innerobj1 = new JSONObject();
		JSONArray arrObj = new JSONArray();
		JSONArray arrObj1 = new JSONArray();		
		JSONObject outerobj = new JSONObject();
		
		
		innerobj.put("Designation", Designation);
		innerobj.put("Exp", Exp);
		innerobj.put("Salary", sal);
		innerobj1.put("Address", Addr);
		innerobj1.put("City", city);
		innerobj1.put("Postal Code", PostCode);
		outerobj.put("fname", fname);
		outerobj.put("lname", lname);
		outerobj.put("Employee ID", empID);
		outerobj.put("Department", Dept);
		outerobj.put("Address",arrObj.put(innerobj1));
		outerobj.put("SalaryStructure", arrObj1.put(innerobj));
		
//		System.out.println(outerobj.toString());	
//		
		Response res = given().contentType(ContentType.JSON).when().body(outerobj.toString()).post("http://localhost:3000/EmployeeDetails");
		
		System.out.println("Status Code for the post body is:"+" "+res.statusCode());
		System.out.println("Postbody is:"+res.asString());
	
	}

}
