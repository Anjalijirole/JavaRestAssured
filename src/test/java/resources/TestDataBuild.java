package resources;

import java.util.ArrayList;

import POJO.AppointmentDetail;
import POJO.DoctorDetails;
import POJO.Login;

public class TestDataBuild {
	
	public Login logindetails(String userName,String password)
	{   
		Login login = new Login();
		login.setUserName(userName);
		login.setPassword(password);
		return login;
		
	}
	
	public DoctorDetails BookAppointment(String doctorName, String patientName, String apointmentDate)
	{
		DoctorDetails doctorDetails = new DoctorDetails();
		AppointmentDetail detail= new AppointmentDetail();
		detail.setBookedTimeSlot(apointmentDate);
		detail.setPatientName(patientName);
		doctorDetails.setName(doctorName);
		ArrayList<AppointmentDetail> appDetails = new ArrayList<AppointmentDetail>();
		appDetails.add(detail);
		doctorDetails.setAppointmentDetails(appDetails);
		return doctorDetails;		
	}
	

}
