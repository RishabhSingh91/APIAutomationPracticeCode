package API_GetReq;

import static com.jayway.restassured.RestAssured.*;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

public class GenerateReq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SimpleObject simple = new SimpleObject();
		simple.setAge("30");
		simple.setDesignation("TL");
		simple.setFirstname("Himanshu");
		simple.setLastname("Mishra");
		simple.setId("4243");

		AddressInfo add = new AddressInfo();
		add.setCity("Jammu");
		add.setHousenum("1212");
		add.setPostCode("180001");
		add.setSector("F");
		add.setSocietyName("SainikColony");
		
		arrayData obj = new arrayData();
		obj.setDeptCount("150");
		obj.setDeptName("IT");
		obj.setFirstname("Rishabh");
		obj.setLastname("Jamwal");
		obj.setId("4244");

		BasicInfo info = new BasicInfo();
		
		info.setFirstname("Rishabh");
		info.setLastname("Jamwal");
		info.setId("1");
		info.setAddress(add);

		Response res = given().contentType(ContentType.JSON).when().body(info)
				.post("http://localhost:3000/AddressDetails");
		System.out.println("Status code for the request is " + res.statusCode());
		System.out.println("Response Body " + res.asString());

	}

}
