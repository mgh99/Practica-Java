package org.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BookRoomTest {

	@Test
	void testTotalPrice() {
		
		double price = 10.1;
		double resultadoReal;
		double resultadoEsperado = 10.10;
		
		price = Math.round(price * 100);
		resultadoReal =  price/100;
		
		assertEquals(resultadoReal, resultadoEsperado);
	}
	

}
