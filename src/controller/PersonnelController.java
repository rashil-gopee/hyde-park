package controller;

import model.*;
import utils.DbConnection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PersonnelController {
    public void createPersonnel(PersonnelModel personnelModel) {
        UserController userController = new UserController();
        userController.createUser(personnelModel);

        Statement stmt = null;
        int userId = 0;
        try {
            stmt = DbConnection.getConnection().createStatement();

            String sql = "SELECT userId FROM User WHERE firstName = '" + personnelModel.getFirstName() + "' AND lastName = '" + personnelModel.getLastName() + "';";
            ResultSet rs = stmt.executeQuery(sql);
            //STEP 5: Extract data from result set
            while (rs.first()) {
                //Retrieve by column name
                userId = rs.getInt("userId");
            }

            String insertQuery = "INSERT INTO Personnel VALUES ('" + userId + "','" + personnelModel.getPersonnelType() + "');";
            stmt.executeUpdate(insertQuery);

        } catch (SQLException se) {
            //Handle errors for JDBC
            se.printStackTrace();
        } catch (Exception e) {
            //Handle errors for Class.forName
            e.printStackTrace();
        }
    }

    public PersonnelModel getPersonnel(int personnelId) {
        UserController userController = new UserController();

        UserModel userModel = userController.getUser(personnelId);

        PersonnelModel personnelModel = new PersonnelModel();

        Statement stmt = null;
        try {
            stmt = DbConnection.getConnection().createStatement();

            String sql = "SELECT * FROM Personnel WHERE personnelId = '" + personnelId + "';";
            ResultSet rs = stmt.executeQuery(sql);
            //STEP 5: Extract data from result set
            while (rs.first()) {
                //Retrieve by column name
                int userId = rs.getInt("userId");
                String personnelType = rs.getString("personnelType");

                personnelModel = new PersonnelModel(userModel.getUserId(), userModel.getFirstName(), userModel.getLastName(), userModel.getPassword(), userModel.getUserType(), personnelType);
            }

        } catch (SQLException se) {
            //Handle errors for JDBC
            se.printStackTrace();
        } catch (Exception e) {
            //Handle errors for Class.forName
            e.printStackTrace();
        }
        return personnelModel;
    }
}
