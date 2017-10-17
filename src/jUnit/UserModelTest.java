package jUnit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.UserModel;

public class UserModelTest {

    private UserModel user;
    @Before
    public void setUp() {
        user = new UserModel(1,"TIANYU","TAN","123456","PUBLIC");
    }

    @Test
    public void test() {
        assertEquals(1,user.getUserId());

        assertEquals("TIANYU",user.getFirstName());

        assertEquals("TAN",user.getLastName());

        assertEquals("123456",user.getPassword());

        assertEquals("PUBLIC",user.getUserType());


        user.setFirstName("TIANYU2");
        assertEquals("TIANYU2",user.getFirstName());

        user.setLastName("carter");
        assertEquals("carter",user.getLastName());

        user.setUserType("hero");
        assertEquals("hero",user.getUserType());

        user.setPassword("abcdef");
        assertEquals("abcdef",user.getPassword());

        char[] password = {'a','b','c','d','e','f'};
        assertTrue(user.checkPassword(new String(password)));



    }
}
