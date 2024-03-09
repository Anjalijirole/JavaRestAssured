Feature: QA Technical Assignment


Scenario Outline: Verify that we are able to get the list of doctors and available timeslot details
    Given provide valid endpoint to fetch all list of doctors and available timeslot details 
    When user calls "AllDoctorDetailsAPI" with "GET" http request
    Then the API call got success with status code 200
    And  first doctor name is "<Name>"
    And  Reponse of the api has count greater than 1
  	
  	   Examples: 
      | Name  |
      | Dr.Vikas Kumar|
      
  Scenario Outline: Verify that we are able to book an appointment 
    Given "<DoctorName>" "<PatientName>" "<TimeSlot>" user should be able to book an apointment
    When user calls "BookAppointmentAPI" with "POST" http request
    Then the API call got success with status code 201
    And "message" in response body is "Appointment Booked"
    
  	   Examples: 
      | DoctorName  | PatientName | TimeSlot |
      | Dr.Vikas Kumar| Suresh    | 2023-03-09 18:00:00|
      
    Scenario Outline: Verify that we are not able to book same appointment again
    Given "<DoctorName>" "<PatientName>" "<TimeSlot>" user should be able to book an apointment
    When user calls "BookAppointmentFailedAPI" with "POST" http request
    Then the API call got success with status code 400
    And "message" in response body is "Appointment for the required timeslot is already booked"
    
  	   Examples: 
      | DoctorName  | PatientName | TimeSlot |
      | Dr.Vikas Kumar| Suresh    | 2023-03-09 18:00:00|
   
