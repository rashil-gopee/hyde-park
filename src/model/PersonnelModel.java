package model;

import controller.PersonnelScheduleController;

import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.util.ArrayList;

public class PersonnelModel extends UserModel {
    private String personnelType;
    private ArrayList<PersonnelScheduleModel> personnelSchdules = new ArrayList<PersonnelScheduleModel>();

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

        PersonnelScheduleController personnelScheduleController = new PersonnelScheduleController();
        this.personnelSchdules = personnelScheduleController.getPersonnelSchedules(userId);

        this.checkAvailability();
    }

    public String getPersonnelType() {
        return personnelType;
    }

    public void setPersonnelType(String personnelType) {
        this.personnelType = personnelType;
    }

    public boolean checkAvailability() {
        LocalTime now = LocalTime.now();
        int hour = now.get(ChronoField.HOUR_OF_DAY);
        int minute = now.get(ChronoField.MINUTE_OF_HOUR);
        int day = now.get(ChronoField.DAY_OF_WEEK);

        System.out.println("hour   = " + hour);
        System.out.println("minute = " + minute);
        System.out.println("day = " + day);

        return true;
    }
}
