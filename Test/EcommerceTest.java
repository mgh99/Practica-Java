package org.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class EcommerceTest {

	@Test
	final void testGetName () {
		
		Ecommerce hotels = new Hotel("H10 Puerta de Alcalá", "Alcala, 66", "Madrid", 
				130, 80, 10, 40, 4, true, true, 200, true);
		
		assertEquals("H10 Puerta de Alcalá", hotels.getName());
	}
	
	@Test
	final void testGetAdress () {
		
		Ecommerce hotels = new Hotel("H10 Puerta de Alcalá", "Alcala, 66", "Madrid", 
				130, 80, 10, 40, 4, true, true, 200, true);
		
		assertEquals("Alcala, 66", hotels.getAdress());
	}
	
	@Test
	final void testGetCity () {
		
		Ecommerce hotels = new Hotel("H10 Puerta de Alcalá", "Alcala, 66", "Madrid", 
				130, 80, 10, 40, 4, true, true, 200, true);
		
		assertEquals("Madrid", hotels.getCity());
	}
	
	@Test
	final void testGetPriceRoomSuit () {
		
		Ecommerce hotels = new Hotel("H10 Puerta de Alcalá", "Alcala, 66", "Madrid", 
				130, 80, 10, 40, 4, true, true, 200, true);
		
		assertEquals(130, hotels.getPriceRoomSuit());
	}
	
	@Test
	final void testGetPriceRoomStandard () {
		
		Ecommerce hotels = new Hotel("H10 Puerta de Alcalá", "Alcala, 66", "Madrid", 
				130, 80, 10, 40, 4, true, true, 200, true);
		
		assertEquals(80, hotels.getPriceRoomStandard());
	}
	
	@Test
	final void testGetNumRoomSuit () {
		
		Ecommerce hotels = new Hotel("H10 Puerta de Alcalá", "Alcala, 66", "Madrid", 
				130, 80, 10, 40, 4, true, true, 200, true);
		
		assertEquals(10, hotels.getNumRoomSuit());
	}
	
	@Test
	final void testGetNumRoomStandard() {
		
		Ecommerce hotels = new Hotel("H10 Puerta de Alcalá", "Alcala, 66", "Madrid", 
				130, 80, 10, 40, 4, true, true, 200, true);
		
		assertEquals(40, hotels.getNumRoomStandard());
	}
	
	@Test
	final void testIsAvaible() {
		
		Ecommerce hotels = new Hotel("H10 Puerta de Alcalá", "Alcala, 66", "Madrid", 
				130, 80, 10, 40, 4, true, true, 200, true);
		
		assertEquals(true, hotels.isAvaible());
	}
	
	
	
}
