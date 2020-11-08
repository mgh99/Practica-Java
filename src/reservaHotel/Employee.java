package reservaHotel;

import java.util.*;
import java.time.*;

public class Employee extends Worker{
	
	// Atributos
	static ResourceBundle my_bundle = ResourceBundle.getBundle("MessagesBundle");
	private static List<Employee> employees;
	
	// Contructor por defecto
	public Employee() {
		
	}

	// Contructor con parámetros
	public Employee(String dni, String name, String surname, String nameHotel, String job) {

		super (dni, name, surname, nameHotel, job);

	}

	//Métodos
	public String toString() {

		return super.toString();
	}



}
