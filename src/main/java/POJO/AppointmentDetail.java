package POJO;

import java.util.ArrayList;

public class AppointmentDetail{
    public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public String getBookedTimeSlot() {
		return bookedTimeSlot;
	}
	public void setBookedTimeSlot(String bookedTimeSlot) {
		this.bookedTimeSlot = bookedTimeSlot;
	}
	public int patientId;
    public String patientName;
    public String bookedTimeSlot;
}