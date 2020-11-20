package org.reshotel;

import java.util.*;

public class Worker {
	
	//Atributos
	private String dni;
	private String name;
	private String surname;
	private String nameHotel;
	private String job;
	
	static ResourceBundle myBundle = ResourceBundle.getBundle("MessagesBundle");
	
	public static int dimensionArray;
	
	//Contructor por defecto
	public Worker() {

	}
	
	//Contructor con parámetros
	public Worker(String dni, String name, String surname) {

		this.dni = dni;
		this.name = name;
		this.surname = surname;

		dimensionArray++;
	}

	public Worker(String dni, String name, String surname, String nameHotel, String job) {

		this.dni = dni;
		this.name = name;
		this.surname = surname;
		this.nameHotel = nameHotel;
		this.job = job;
		
		dimensionArray++;
	}
	
	//Métodos
	public String toString() {

		return " " + this.getDni() + "\t" + this.getName() +
				", " + this.getSurname() + "\n" + " " + 
				myBundle.getString("hotel") + ": " + this.getNameHotel() + "\n" + 
				this.getJob() + "\n" + "--------" + "\n";
	}

	public String toString2() {

		return " " + this.getDni() + "\t" + this.getName() +
				", " + this.getSurname() + "\n";
	}

	//Getters y Setters
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getNameHotel() {
		return nameHotel;
	}

	public void setNameHotel(String nameHotel) {
		this.nameHotel = nameHotel;
	}

	public String getJob() {

		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

}

