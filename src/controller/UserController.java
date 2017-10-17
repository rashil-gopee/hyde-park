package controller;

import model.UserModel;
import utils.DbConnection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class UserController {
    public void createUser(UserModel user){
        Statement stmt = null;
        try{
            stmt = DbConnection.getConnection().createStatement();
            String sql = "INSERT INTO User(firstName, lastName, password) " +
                    "VALUES ('" + user.getFirstName() +"','" + user.getLastName() + "','" + user.getPassword() + "')";
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

    public ArrayList<UserModel> getUsers(){
        Statement stmt = null;
        ArrayList<UserModel> users = new ArrayList<>();
        try{
            stmt = DbConnection.getConnection().createStatement();

            String sql = "SELECT userId, firstName, lastName, password FROM User";
            ResultSet rs = stmt.executeQuery(sql);
            //STEP 5: Extract data from result set
            while(rs.next()){
                //Retrieve by column name
                int userId  = rs.getInt("userId");
                String firstName = rs.getString("firstName");
                String lastName = rs.getString("lastName");
                String password = rs.getString("password");
                String userType = rs.getString("userType");

                UserModel user = new UserModel(userId,firstName,lastName,password, userType);

                users.add(user);
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
        return users;
    }

    public UserModel getUser(int userId){
        UserModel userModel = new UserModel();
        Statement stmt = null;
        try{
            stmt = DbConnection.getConnection().createStatement();

            String sql = "SELECT * FROM User WHERE userId = '" + userId + "';";
            ResultSet rs = stmt.executeQuery(sql);
            //STEP 5: Extract data from result set
            if (rs.first()){
                //Retrieve by column name
                userId  = rs.getInt("userId");
                String firstName = rs.getString("firstName");
                String lastName = rs.getString("lastName");
                String password = rs.getString("password");
                String userType = rs.getString("userType");

                userModel = new UserModel(userId,firstName,lastName,password, userType);
            }
            DbConnection.closeConnection();
            //stmt.executeUpdate(sql);
        }catch(SQLException se){
            //Handle errors for JDBC
            se.printStackTrace();
        }catch(Exception e){
            //Handle errors for Class.forName
            e.printStackTrace();
        }
        return userModel;
    }

}
