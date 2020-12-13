package InitialPractice;

import static com.jayway.restassured.RestAssured.*;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

public class Get {
	public static void main(String[] args) {
			
		
		 
		 Response res = when() .get("http://localhost:3000/StudentDetails/");
		 System.out.println("Status code is"+": "+res.statusCode()+ "\n"+"The response body is"+"\n"+res.asString());
		
		
	} 
}
