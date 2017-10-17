
import static org.junit.Assert.*;

import java.util.Scanner;

import model.IncidentOutcome;
import org.junit.Before;
import org.junit.Test;

public class IncidentOutcomeTest {

	private IncidentOutcome Terry;
	private Scanner reader;
	@Before
	public void setUp() throws Exception {
		Terry = new IncidentOutcome(3127,3672,"murder");	
		reader = new Scanner(System.in);
	}

	@Test
	public void test() {
		try{
			setUp();
		}
		catch(Exception e){
			e.getMessage();
		}
		
		assertEquals(3127, Terry.getUserId());
		assertEquals(3672, Terry.getIncidentId());
		assertEquals("murder", Terry.getComments());
		
		Terry.setUserId(3998);
		assertEquals(3998, Terry.getUserId());
		Terry.setIncidentId(1234);
		assertEquals(1234, Terry.getIncidentId());
		Terry.setComments("robbery");
		assertEquals("robbery", Terry.getComments());
	}

}
