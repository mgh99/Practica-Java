package org.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class HotelTest {

	@Test
	final void testGetStars() {
		
		Hotel myHotel = new Hotel("H10 Puerta de Alcalá", "Alcala, 66", "Madrid", 
				130, 80, 10, 40, 4, true, true, 200, true);
		
		assertEquals(4, myHotel.getStars());
	}
	
	@Test
	final void testGeCapacity() {
		
		Hotel myHotel = new Hotel("H10 Puerta de Alcalá", "Alcala, 66", "Madrid", 
				130, 80, 10, 40, 4, true, true, 200, true);
		
		assertEquals(200, myHotel.getCapacity());
	}
	
	@Test
	final void testGeOpenClose() {
		
		Hotel myHotel = new Hotel("H10 Puerta de Alcalá", "Alcala, 66", "Madrid", 
				130, 80, 10, 40, 4, true, true, 200, true);
		
		assertEquals(true, myHotel.isOpenClose());
	}
	
	@Test
	final void testGetSwimmingPool() {
		
		Hotel myHotel = new Hotel("H10 Puerta de Alcalá", "Alcala, 66", "Madrid", 
				130, 80, 10, 40, 4, true, true, 200, true);
		
		assertEquals(true, myHotel.isSwimmingPool());
	}

}
