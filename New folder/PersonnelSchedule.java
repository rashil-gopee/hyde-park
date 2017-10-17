package model;

public class PersonnelSchedule {
	private int userId;
	private String Date;
	private String TimeIn;
	private String TimeOut;
	
	public PersonnelSchedule(int userId, String date, String timeIn, String timeOut) {
		this.userId = userId;
		Date = date;
		TimeIn = timeIn;
		TimeOut = timeOut;
	}
	
	public PersonnelSchedule(){}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getDate() {
		return Date;
	}

	public void setDate(String date) {
		Date = date;
	}

	public String getTimeIn() {
		return TimeIn;
	}

	public void setTimeIn(String timeIn) {
		TimeIn = timeIn;
	}

	public String getTimeOut() {
		return TimeOut;
	}

	public void setTimeOut(String timeOut) {
		TimeOut = timeOut;
	}
		
}
