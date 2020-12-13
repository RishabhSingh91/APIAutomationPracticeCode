package API_GetReq;

import static com.jayway.restassured.RestAssured.*;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

public class Get {

	public static void main(String[] args) {
	Response res =	given()
		.contentType(ContentType.JSON)
		.when()
		.get("http://localhost:3000/StudentDetails");
		// TODO Auto-generated method stub
	System.out.println(res.statusCode()+"\n"+res.asString());
	}

}
