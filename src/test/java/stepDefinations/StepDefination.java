package stepDefinations;


import io.cucumber.java.en.*;
import static io.restassured.RestAssured.*;
import static org.junit.Assert.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import POJO.DoctorDetails;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import resources.APIResources;
import resources.TestDataBuild;
import resources.utils;

public class StepDefination extends utils {
	RequestSpecification res;
	ResponseSpecification resspec;
	Response response;
	TestDataBuild data =new TestDataBuild();
	
	
	@Given("Login payload with {string}  {string}")
	public void login_payload_with(String userName, String password) throws IOException {
		res=given().spec(requestSpecification())
				.body(data.logindetails(userName, password));
	}
	
	@Given("provide valid endpoint to fetch all list of doctors and available timeslot details")
	public void provide_valid_endpoint_to_fetch_all_list_of_doctors_and_available_timeslot_details() throws IOException {
	   res=given().spec(requestSpecification());
	}
	
	@Given("{string} {string} {string} user should be able to book an apointment")
	public void user_should_be_able_to_book_an_apointment(String doctorName, String patientName, String dateTimeSlot) throws IOException {
		res=given().spec(requestSpecification())
				.body(data.BookAppointment(doctorName, patientName, dateTimeSlot));
	}

	
	@When("user calls {string} with {string} http request")
	public void user_calls_with_http_request(String resource, String method) {
		APIResources resourceAPI=APIResources.valueOf(resource);
		System.out.println(resourceAPI.getResource());
		
		
		resspec =new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();
		
		if(method.equalsIgnoreCase("POST"))
		 response =res.when().post(resourceAPI.getResource());
		else if(method.equalsIgnoreCase("GET"))
			 response =res.when().get(resourceAPI.getResource());
	}
	@Then("the API call got success with status code {int}")
	public void the_api_call_got_success_with_status_code(int statusCode) {
	    // Write code here that turns the phrase above into concrete actions
		assertEquals(statusCode,response.getStatusCode());
	}
	@Then("{string} in response body is {string}")
	public void in_response_body_is(String keyValue, String expectedValue) {
	    // Write code here that turns the phrase above into concrete actions
		 assertEquals(expectedValue,getJsonPath(response,keyValue));
	}
	
	@Then("first doctor name is {string}")
	public void fist_name_check(String expectedValue) {
	    // Write code here that turns the phrase above into concrete actions
		 assertEquals(expectedValue,getDetails(response).get(0).name);
	}
	
	@Then("Reponse of the api has count greater than {int}")
	public void available_time_slots_greater_than_count(int count) 
	{
		ArrayList<DoctorDetails> doctorDetails = getDetails(response);
		DoctorDetails firstDoctorDetails = doctorDetails.get(0);
		assertEquals(firstDoctorDetails.availableDateTimeSlots.size()> count, true );
	}
	
	
	


	


	
	

}
