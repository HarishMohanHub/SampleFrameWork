package getRequest;


import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class getData {
	
	@Test(priority=1)
 public void getresponse(){
	Response resp= RestAssured.get("https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22");
	int code= resp.getStatusCode();
	System.out.println("status code is "+code);
    Assert.assertEquals(code, 200);
    
    
 }
 @Test(priority=2)
 public void getbody(){
	 Response resp= RestAssured.get("https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22");
		String body= resp.asString(); 
		System.out.println("Data is"+body);
		System.out.println("Response time is "+resp.getTime());
 }
 
 @Test(priority=3)
 public void getbodyjson(){
	 Response resp= RestAssured.get("http://localhost:3000/posts/2");
		String body= resp.asString(); 
		System.out.println("Data is"+body);
		System.out.println("Response time is "+resp.getTime());
 }
 //json test
 @Test(priority=4)
 public void putMethod(){
	RequestSpecification Request= RestAssured.given();
	Request.header("Content-Type","application/json");
	
	JSONObject json=new JSONObject();
	json.put("id", "3");
	json.put("title", "HarishAPI");
	json.put("author", "Automation2");
	
	Request.body(json.toJSONString());
	Response response=Request.post("http://localhost:3000/posts/");
	System.out.println("Post value is" +response);
	int code=response.getStatusCode();
	Assert.assertEquals(code, 201);
 }
}        
           