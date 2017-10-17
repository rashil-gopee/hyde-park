package model;

public class IncidentOutcome {
	private int userId;
	private int incidentId;
	private String comments;
	
	public IncidentOutcome(int userId, int incidentId, String comments) {
		super();
		this.userId = userId;
		this.incidentId = incidentId;
		this.comments = comments;
	}
	
	public IncidentOutcome(){}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getIncidentId() {
		return incidentId;
	}

	public void setIncidentId(int incidentId) {
		this.incidentId = incidentId;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}
	
}
