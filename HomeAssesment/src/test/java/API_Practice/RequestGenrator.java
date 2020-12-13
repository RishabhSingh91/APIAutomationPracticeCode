 package API_Practice;

import static com.jayway.restassured.RestAssured.*;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

import API_GetReq.SimpleObject;

public class RequestGenrator {
	
	public static void main(String[] args) {
		RequestGenrator obj = new RequestGenrator();
//		obj.PostReq();
		obj.GetReq();
	}
	
	public void PostReq()
	{
		AddressInfo[] obj = new AddressInfo[2];
		obj[0] = new AddressInfo();
		obj[0].setHno("480");
		obj[0].setSector("E");
		obj[0].setSociety("Sainik Colony");
		obj[0].setCity("Jammu");
		obj[0].setPincode("180001"); 
		obj[0].setStreetName("Near Babbar chowk");
		
		obj[1] = new AddressInfo();
		obj[1].setHno("111");
		obj[1].setSector("A");
		obj[1].setSociety("Channi");
		obj[1].setCity("Jammu");
		obj[1].setPincode("180001");
		obj[1].setStreetName("Near EyeCare");
		
		Marks mar = new Marks();
		mar.setDivision("FirstDiv");
		mar.setSubject("Non-Med");
		mar.setPercentage("70");
		
		SimpleObject sim = new SimpleObject();
		sim.setFirstname("Rishabh");
		sim.setLastname("Jamwal");

		
		Response res = given().contentType(ContentType.JSON)
				.when().body(sim).post("http://localhost:3000/StudentDetails");
		System.out.println("Status code is: " +res.statusCode());
		System.out.println(res.asString());
	}
	public void GetReq()
	{
		Response res = given().contentType(ContentType.JSON).when().queryParams("studentID", "1001").get("http://localhost:3000/EmployeeDetails");
		System.out.println(res.asString());
	}
}
