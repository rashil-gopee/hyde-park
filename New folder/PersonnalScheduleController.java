package controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import model.PersonnelSchedule;
import utils.DbConnection;

public class PersonnalScheduleController {

	public void createPersonnelSchedule(PersonnelSchedule ps) {
        Statement stmt = null;
        try {
            stmt = DbConnection.getConnection().createStatement();
            String insertQuery = "INSERT INTO PersonnelSchedule(userId, Date, TimeIn, TimeOut) VALUES('"+ ps.getUserId()+"', '"+ ps.getDate()+"', '"+ps.getTimeIn()+"', '"+ps.getTimeOut()+"')";
            stmt.executeUpdate(insertQuery);

        } catch (SQLException se) {
            //Handle errors for JDBC
            se.printStackTrace();
        } catch (Exception e) {
            //Handle errors for Class.forName
            e.printStackTrace();
        }
    }

    public ArrayList<PersonnelSchedule> getPersonnelSchedule(int userId) {
    	ArrayList<PersonnelSchedule> result = new ArrayList<PersonnelSchedule>();
    	result = null;
        Statement stmt = null;
        try {
            stmt = DbConnection.getConnection().createStatement();

            String sql = "SELECT * FROM PersonnelSchedule WHERE userId = '" + userId + "';";
            ResultSet rs = stmt.executeQuery(sql);
            result = (ArrayList<PersonnelSchedule>)rs;

        } catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
    
}
