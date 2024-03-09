
Feature: QA Technical Assignment

  Scenario Outline: Verify that user is able to login with valid details
    Given Login payload with "<UserName>"  "<Password>"
    When user calls "LoginAPI" with "POST" http request
    Then the API call got success with status code 200
    And "message" in response body is "Login Successfull"
     

    Examples: 
      | username  | password | 
      | Anjali |     test| 
      
   Scenario Outline: Verify that user is not able to login with invalid details
    Given Login payload with "<UserName>"  "<Password>"
    When user calls "LoginFailedAPI" with "POST" http request
    Then the API call got success with status code 401
    And "message" in response body is "Login failed"
    

    Examples: 
      | username  | password | 
      | Anjali |     test2| 
  	
  