package reservaHotel;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.reshotel.Register;

class RegisterTest {
	
	static Register actualRegister;

	@Test
	void testLogin() {
		
		String id = "mgh";
		String id2 = "mgh";
		
		String password = "1111";
		String password2 = "1111";
		
		@SuppressWarnings("unused")
		boolean login = false;

			if(id.equals(id2) && password.equals(password2)) {

				login = true;
			}
			
		assertEquals("mgh", id);
		assertEquals("1111", password);
		
	}

}


