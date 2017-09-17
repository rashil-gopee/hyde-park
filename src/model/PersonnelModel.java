package model;

public class PersonnelModel extends UserModel {
    private String personnelType;

    public PersonnelModel(){}

    public PersonnelModel(String firstName, String lastName, String password, String userType, String personnelType) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.userType = userType;
        this.personnelType = personnelType;
    }

    public PersonnelModel(int userId,String firstName, String lastName, String password, String userType, String personnelType) {
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.userType = userType;
        this.personnelType = personnelType;
    }

    public String getPersonnelType() {
        return personnelType;
    }

    public void setPersonnelType(String personnelType) {
        this.personnelType = personnelType;
    }
}
