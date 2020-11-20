package org.reshotel;

import java.io.BufferedReader;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Read {

	//Para leer un dato de tipo String
	public static String fact() {

		String sfact = " ";

		try {

			BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
			BufferedReader flujoE = new BufferedReader(keyboard);

			sfact = flujoE.readLine();

		} catch (IOException e) {
			System.out.println("ERROR, " + e.getMessage());
		}
		return sfact;

	}

	//Para leer un dato de tipo int
	public static int factInt() {
		return Integer.parseInt(fact());
	}

	//Para leer un dato de tipo float
	public static float factFloat() {
		return Float.parseFloat(fact());
	}

	//Para leer un dato de tipo char
	public static char factChar() {

		char c = ' ';
		try {

			BufferedInputStream b = new BufferedInputStream(System.in);
			c = (char) b.read();

		} catch (IOException e) {

			System.out.println("error");

			e.printStackTrace();
		}
		return c;
	}

	//Para leer un dato de tipo long
	public static long factLong() {
		return Long.parseLong(fact());
	}
	
	public static boolean factBoolean() {
		return Boolean.parseBoolean(fact());
	}

}


