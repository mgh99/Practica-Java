package org.reshotel;

import java.util.*;

public class Employee extends Worker{
	
	// Atributos
	static ResourceBundle myBundle = ResourceBundle.getBundle("MessagesBundle");
	
	@SuppressWarnings("unused")
	private static List<Employee> employees;
	
	// Contructor por defecto
	public Employee() {
		
	}

	// Contructor con parámetros
	public Employee(String dni, String name, String surname, String nameHotel, String job) {

		super (dni, name, surname, nameHotel, job);

	}

	//Métodos
	
	@Override
	public String toString() {

		return super.toString();
	}



}
