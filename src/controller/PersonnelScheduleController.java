package controller;

import model.PersonnelScheduleModel;
import utils.DbConnection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class PersonnelScheduleController {
    public void createPersonnelSchedule(PersonnelScheduleModel personnelScheduleModel){
        Statement stmt = null;
        try{
            stmt = DbConnection.getConnection().createStatement();
            String sql = "INSERT INTO PersonnelSchedule(personnelId, day, timeInHour, timeInMinutes, timeOutHour, timeOutMinutes) " +
                    "VALUES ('" + personnelScheduleModel.getUserId() +"','" + personnelScheduleModel.getDay() + "','" + personnelScheduleModel.getTimeInHour()+"','" + personnelScheduleModel.getTimeInMinutes() +"','" + personnelScheduleModel.getTimeOutHour()+"','" + personnelScheduleModel.getTimeOutMinutes() + "')";
            stmt.executeUpdate(sql);
        }catch(SQLException se){
            //Handle errors for JDBC
            se.printStackTrace();
        }catch(Exception e){
            //Handle errors for Class.forName
            e.printStackTrace();
        }
    }

    public ArrayList<PersonnelScheduleModel> getPersonnelSchedules(int personnelId){
        Statement stmt = null;
        ArrayList<PersonnelScheduleModel> personnelSchedules = new ArrayList<>();
        try{
            stmt = DbConnection.getConnection().createStatement();

            String sql = "SELECT personnelId, day, timeInHour, timeInMinutes, timeOutHour, timeOutMinutes FROM PersonnelSchedule WHERE personnelId ='" + personnelId +"';";
            ResultSet rs = stmt.executeQuery(sql);
            //STEP 5: Extract data from result set
            while(rs.next()){
                //Retrieve by column name
                int userId  = rs.getInt("personnelId");
                String day = rs.getString("day");
                int timeInHour = rs.getInt("timeInHour");
                int timeInMinutes = rs.getInt("timeInMinutes");
                int timeOutHour = rs.getInt("timeOutHour");
                int timeOutMinutes = rs.getInt("timeOutMinutes");

                PersonnelScheduleModel user = new PersonnelScheduleModel(userId,day,timeInHour,timeInMinutes, timeOutHour, timeOutMinutes);

                personnelSchedules.add(user);
            }
            rs.close();
        }catch(SQLException se){
            //Handle errors for JDBC
            se.printStackTrace();
        }catch(Exception e){
            //Handle errors for Class.forName
            e.printStackTrace();
        }
        return personnelSchedules;
    }

//    public UserModel getUser(int userId){
//        UserModel userModel = new UserModel();
//        Statement stmt = null;
//        try{
//            stmt = DbConnection.getConnection().createStatement();
//
//            String sql = "SELECT * FROM User WHERE userId = '" + userId + "';";
//            ResultSet rs = stmt.executeQuery(sql);
//            //STEP 5: Extract data from result set
//            if (rs.first()){
//                //Retrieve by column name
//                userId  = rs.getInt("userId");
//                String firstName = rs.getString("firstName");
//                String lastName = rs.getString("lastName");
//                String password = rs.getString("password");
//                String userType = rs.getString("userType");
//
//                userModel = new UserModel(userId,firstName,lastName,password, userType);
//            }
//            //stmt.executeUpdate(sql);
//        }catch(SQLException se){
//            //Handle errors for JDBC
//            se.printStackTrace();
//        }catch(Exception e){
//            //Handle errors for Class.forName
//            e.printStackTrace();
//        }
//        return userModel;
//    }
}
