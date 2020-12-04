package org.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.reshotel.Register;

class RegisterTest <T> {
	
	static Register actualRegister;

	@SuppressWarnings("unchecked")
	@Test
	void testLogin() {
		
		T id = (T) "mgh";
		T id2 = (T) "mgh";
		
		T password = (T) "1111";
		T password2 = (T) "1111";
		
		@SuppressWarnings("unused")
		boolean login = false;

			if(id.equals(id2) && password.equals(password2)) {

				login = true;
			}
			
		assertEquals("mgh", id);
		assertEquals("1111", password);
		
	}

}



