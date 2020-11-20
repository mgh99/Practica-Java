package reservaHotel;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MathHotelTest {

	@Test
	void testPriceApp() {
		
		double price = 22.1;
		double resultadoReal;
		double resultadoEsperado = 22.10;
		
		price = Math.round(price * 100);
		resultadoReal =  price/100;
		
		assertEquals(resultadoReal, resultadoEsperado);
	}

}

