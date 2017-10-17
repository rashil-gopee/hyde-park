package controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import model.IncidentOutcome;
import model.PersonnelSchedule;
import utils.DbConnection;

public class IncidentOutcomeController {
	public void createIncidentOutcome( IncidentOutcome io) {
        Statement stmt = null;
        try {
            stmt = DbConnection.getConnection().createStatement();
            String insertQuery = "INSERT INTO  IncidentOutcome(userId, incidentId, comments) VALUES('"+ io.getUserId()+"', '"+ io.getIncidentId()+"', '"+io.getComments()+"')";
            stmt.executeUpdate(insertQuery);

        } catch (SQLException se) {
            //Handle errors for JDBC
            se.printStackTrace();
        } catch (Exception e) {
            //Handle errors for Class.forName
            e.printStackTrace();
        }
    }

    public ArrayList<IncidentOutcome> getIncidentOutcomeByUserID(int userId) {
    	ArrayList<IncidentOutcome> result = new ArrayList<IncidentOutcome>();
    	result = null;
        Statement stmt = null;
        try {
            stmt = DbConnection.getConnection().createStatement();

            String sql = "SELECT * FROM IncidentOutcome WHERE userId = '" + userId + "';";
            ResultSet rs = stmt.executeQuery(sql);
            result = (ArrayList<IncidentOutcome>)rs;

        } catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
    public ArrayList<IncidentOutcome> getIncidentOutcomeByIncidentID(int incidentId) {
    	ArrayList<IncidentOutcome> result = new ArrayList<IncidentOutcome>();
    	result = null;
        Statement stmt = null;
        try {
            stmt = DbConnection.getConnection().createStatement();

            String sql = "SELECT * FROM IncidentOutcome WHERE incidentId = '" + incidentId + "';";
            ResultSet rs = stmt.executeQuery(sql);
            result = (ArrayList<IncidentOutcome>)rs;

        } catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
