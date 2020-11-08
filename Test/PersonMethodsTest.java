package reservaHotel;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PersonMethodsTest {

	@Test
	void testOpcJobEmployee() {
		double salary = 48.90;
		int days = 25;
		
		salary = salary * days;
		
		assertEquals(salary, 1222.5);
		
		
	}

}
