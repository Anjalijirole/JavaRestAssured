package resources;

public enum APIResources {
	
	
	LoginAPI("/login"),
	LoginFailedAPI("/login/failed"),
	AllDoctorDetailsAPI("/doctors/details"),
	BookAppointmentAPI("/doctors/appointment"),
	BookAppointmentFailedAPI("/doctors/appointment/failed");
	
	private String resource;
	
	APIResources(String resource)
	{
		this.resource=resource;
	}
	
	public String getResource()
	{
		return resource;
	}
	

}

