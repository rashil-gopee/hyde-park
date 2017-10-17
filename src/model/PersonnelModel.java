package model;

import controller.PersonnelScheduleController;

import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class PersonnelModel extends UserModel {
    private String personnelType;
    private ArrayList<PersonnelScheduleModel> personnelSchedules = new ArrayList<PersonnelScheduleModel>();

    public PersonnelModel(){}

    public PersonnelModel(String firstName, String lastName, String password, String personnelType) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.userType = "Personnel";
        this.personnelType = personnelType;
    }

    public PersonnelModel(int userId,String firstName, String lastName, String password, String personnelType) {
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.userType = "Personnel";
        this.personnelType = personnelType;

        PersonnelScheduleController personnelScheduleController = new PersonnelScheduleController();
        this.personnelSchedules = personnelScheduleController.getPersonnelSchedules(userId);

        System.out.println(this.checkAvailability());
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

        Date today = new Date();
        SimpleDateFormat simpleDateformat = new SimpleDateFormat("EEEE");
        String day = simpleDateformat.format(today);

        for (PersonnelScheduleModel schedule : personnelSchedules)
        {
            if (schedule.getDay().equals(day))
                if (hour > schedule.getTimeInHour() || (hour == schedule.getTimeInHour() && minute >= schedule.getTimeInMinutes()))
                    if (hour < schedule.getTimeOutHour() || (hour == schedule.getTimeOutHour() && minute <= schedule.getTimeInMinutes()))
                        return true;
        }

        return false;
    }
}
