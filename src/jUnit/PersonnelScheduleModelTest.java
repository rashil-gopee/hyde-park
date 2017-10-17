//
//
//import static org.junit.Assert.*;
//
//import model.PersonnelScheduleModel;
//import org.junit.Before;
//import org.junit.Test;
//
//public class PersonnelScheduleModelTest {
//	private PersonnelScheduleModel Carter;
//	@Before
//	public void setUp() {
//		Carter = new PersonnelScheduleModel(1,"02/10/2017","10:00 AM","2:00 PM");
//	}
//
//	@Test
//	public void test() {
//		setUp();
//		assertEquals(1,Carter.getUserId());
//		assertEquals("02/10/2017",Carter.getDate());
//		assertEquals("10:00 AM",Carter.getTimeIn());
//		assertEquals("2:00 PM",Carter.getTimeOut());
//
//		Carter.setUserId(2);
//		assertEquals(2,Carter.getUserId());
//		Carter.setDate("03/10/2017");
//		assertEquals("03/10/2017",Carter.getDate());
//		Carter.setTimeIn("10:01 AM");
//		assertEquals("10:01 AM",Carter.getTimeIn());
//		Carter.setDate("2:01 PM");
//		assertEquals("2:01 PM",Carter.getTimeOut());
//	}
//}
