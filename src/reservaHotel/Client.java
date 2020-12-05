package org.reshotel;

import java.util.*;

public class Client {

	// Atributos
	private String dni;
	private String name;
	private String surname;
	private String gender;
	private int age;
	private int[] shopping;
	static ResourceBundle myBundle = ResourceBundle.getBundle("MessagesBundle");
	
	// Contructor por defecto
	public Client () {
		
	}
	
	//Constructor con parametros
	public Client (String dni, String name, String surname, String gender,
			int age) {
		
		this.dni = dni;
		this.name = name;
		this.surname = surname;
		this.gender = gender;
		this.age = age;
		
	}

	public Client(String name, int[] shopping) {
		
		this.name = name;
		this.shopping = shopping;
		
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int[] getShopping() {
		return shopping;
	}

	public void setShopping(int[] shopping) {
		this.shopping = shopping;
	}

}
