package epam.pep.CustomCollections;

import static org.junit.Assert.*;

import org.junit.Test;

public class AppTest {

	@Test
	public void test() {
		//fail("Not yet implemented");
		try {
			//Asserting if operation is successful
			assertEquals(true, App.operateOnList(App.sendList()));
		} catch (sizeLessThanExpectedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
