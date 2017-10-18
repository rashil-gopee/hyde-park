package controller;

import model.IncidentModel;
import utils.DbConnection;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class IncidentController {
    public void createIncident(IncidentModel incidentModel){
        Statement stmt = null;
        try{
            stmt = DbConnection.getConnection().createStatement();
            String isOpen = incidentModel.getOpen().toString();
            String sql = "INSERT INTO Incident(type, reporterName, reporterContactNo, location, isOpen, date) " +
                    "VALUES ('" + incidentModel.getType()+"','" + incidentModel.getReporterName()  +"','" + incidentModel.getReporterContactNo() + "','" + incidentModel.getLocation() +"','" + isOpen +"','" + incidentModel.getDate() + "')";
            stmt.executeUpdate(sql);

            DbConnection.closeConnection();
        }catch(SQLException se){
            //Handle errors for JDBC
            se.printStackTrace();
        }catch(Exception e){
            //Handle errors for Class.forName
            e.printStackTrace();
        }
    }

    public void closeIncident(int incidentId){
        Statement stmt = null;
        try{
            stmt = DbConnection.getConnection().createStatement();
            String sql = "UPDATE Incident SET isOpen = false WHERE incidentId='" + incidentId + "';";
            stmt.executeUpdate(sql);

            DbConnection.closeConnection();
        }catch(SQLException se){
            //Handle errors for JDBC
            se.printStackTrace();
        }catch(Exception e){
            //Handle errors for Class.forName
            e.printStackTrace();
        }
    }

    public ArrayList<IncidentModel> getIncidents(String status){
        String isIncidentOpen;

        if (status.equals("Open"))
            isIncidentOpen = "true";
        else
            isIncidentOpen = "false";

        Statement stmt = null;
        ArrayList<IncidentModel> incidentModels = new ArrayList<>();
        try{
            stmt = DbConnection.getConnection().createStatement();

            String sql = "SELECT incidentId, type, reporterName, reporterContactNo, location, isOpen, date, responsiblePersonnelId FROM Incident WHERE isOpen='" + isIncidentOpen + "';";
            ResultSet rs = stmt.executeQuery(sql);
            //STEP 5: Extract data from result set
            while(rs.next()){
                //Retrieve by column name
                int incidentId  = rs.getInt("incidentId");
                String type = rs.getString("type");
                String reporterName = rs.getString("reporterName");
                String reporterContactNo = rs.getString("reporterContactNo");
                String location = rs.getString("location");
                String OpenStatus = rs.getString("isOpen");
                Boolean isOpen;
                if (OpenStatus.equals("true"))
                    isOpen = true;
                else
                    isOpen = false;

                Date date = rs.getDate("date");
                int responsiblePersonnelId = rs.getInt("responsiblePersonnelId");

                IncidentModel incidentModel = new IncidentModel(incidentId, type, reporterName, reporterContactNo, location, isOpen, date, responsiblePersonnelId);

                incidentModels.add(incidentModel);
            }
            rs.close();
            DbConnection.closeConnection();
        }catch(SQLException se){
            //Handle errors for JDBC
            se.printStackTrace();
        }catch(Exception e){
            //Handle errors for Class.forName
            e.printStackTrace();
        }
        return incidentModels;
    }
}
