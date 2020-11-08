package reservaHotel;

import java.time.LocalDate;
import org.junit.jupiter.api.Test;

class DateTest {

	@Test
	final void testDate() {
		LocalDate today = LocalDate.now();
		
		assertsEquals("2020-11-08", today);
	}

	private void assertsEquals(String string, LocalDate today) {
		// TODO Auto-generated method stub
		
	}

}
