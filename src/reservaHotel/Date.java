package reservaHotel;

import java.time.LocalDate;

public class Date {

	// Muestra la fecha de este momento
	public void DateNow() {

		LocalDate today = LocalDate.now();
		System.out.println("\t******************\n" +
				"\t**  " + today + "  **\n" +
				"\t******************");

	}

}
