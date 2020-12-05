package org.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.reshotel.Client;
import org.reshotel.Hotel;

class ClientTest {

	@Test
	final void testGetName() {
		
		Client cliente1 = new Client("Pepe", new int[] { 2, 2, 1, 5, 2, 3 });
		
		assertEquals("Pepe", cliente1.getName());
	}
	

}
