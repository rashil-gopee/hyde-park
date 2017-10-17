package model;

public class PersonnelScheduleModel {
	private int userId;
	private String day;
	private int timeInHour;
	private int timeInMinutes;
	private int timeOutHour;
	private int timeOutMinutes;

	public PersonnelScheduleModel(int userId, String day, int timeInHour, int timeInMinutes, int timeOutHour, int timeOutMinutes) {
		this.userId = userId;
		this.day = day;
		this.timeInHour = timeInHour;
		this.timeInMinutes = timeInMinutes;
		this.timeOutHour = timeOutHour;
		this.timeOutMinutes = timeOutMinutes;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public int getTimeInHour() {
		return timeInHour;
	}

	public void setTimeInHour(int timeInHour) {
		this.timeInHour = timeInHour;
	}

	public int getTimeInMinutes() {
		return timeInMinutes;
	}

	public void setTimeInMinutes(int timeInMinutes) {
		this.timeInMinutes = timeInMinutes;
	}

	public int getTimeOutHour() {
		return timeOutHour;
	}

	public void setTimeOutHour(int timeOutHour) {
		this.timeOutHour = timeOutHour;
	}

	public int getTimeOutMinutes() {
		return timeOutMinutes;
	}

	public void setTimeOutMinutes(int timeOutMinutes) {
		this.timeOutMinutes = timeOutMinutes;
	}
}
