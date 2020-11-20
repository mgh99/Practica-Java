package org.reshotel;

import java.time.LocalDate;

public class Date {

	// Muestra la fecha de este momento
	public void dateNow() {

		LocalDate today = LocalDate.now();
		System.out.println("\t******************\n" +
				"\t**  " + today + "  **\n" +
				"\t******************");

	}

}
