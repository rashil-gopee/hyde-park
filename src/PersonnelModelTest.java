import static org.junit.Assert.*;

import org.junit.Test;

import model.PersonnelModel;

public class PersonnelModelTest {

    private PersonnelModel p;
    @Test
    public void test() {
        setUp();
        assertEquals("student",p.getPersonnelType());
        p.setPersonnelType("Test1");
        assertEquals("Test1",p.getPersonnelType());
    }

    public void setUp(){
        p = new PersonnelModel("chen","yining","123456","govermentpersonnel","student");
    }

}
