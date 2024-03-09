package POJO;

import java.util.ArrayList;
import java.util.Date;

import io.cucumber.core.internal.com.fasterxml.jackson.annotation.JsonFormat;
import io.cucumber.core.internal.com.fasterxml.jackson.databind.JsonDeserializer;
import io.cucumber.core.internal.com.fasterxml.jackson.databind.annotation.JsonSerialize;



public class DoctorDetails{
    public int id;
    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public ArrayList<String> getAvailableDateTimeSlots() {
		return availableDateTimeSlots;
	}
	public void setAvailableDateTimeSlots(ArrayList<String> availableDateTimeSlots) {
		this.availableDateTimeSlots = availableDateTimeSlots;
	}
	public ArrayList<AppointmentDetail> getAppointmentDetails() {
		return appointmentDetails;
	}
	public void setAppointmentDetails(ArrayList<AppointmentDetail> appointmentDetails) {
		this.appointmentDetails = appointmentDetails;
	}	
	
	public String name;
    public String specialization;
    public String location;
    public ArrayList<String> availableDateTimeSlots;
    public ArrayList<AppointmentDetail> appointmentDetails;
}
