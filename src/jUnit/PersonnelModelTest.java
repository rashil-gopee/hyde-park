package jUnit;

import static org.junit.Assert.*;

import controller.PersonnelController;
import org.junit.Before;
import org.junit.Test;

import model.PersonnelModel;

public class PersonnelModelTest {

    private PersonnelModel personnelModel;

    @Before
    public void setUp(){
        PersonnelController personnelController = new PersonnelController();
        personnelModel = personnelController.getPersonnel(2);
    }

    @Test
    public void checkPassword() {
        assertTrue(personnelModel.checkPassword("Hello"));
    }

    @Test
    public void checkAvailability(){
        assertTrue(personnelModel.checkAvailability());
    }

    @Test
    public void createPersonnel(){
        PersonnelModel personnel = new PersonnelModel("Mark", "Legend", "Hello", "Law Enforcement");
        PersonnelController personnelController = new PersonnelController();
        personnelController.createPersonnel(personnel);
    }

}
