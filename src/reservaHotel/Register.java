package org.reshotel;

import java.util.ArrayList;
import java.util.ResourceBundle;

public class Register<T> implements IRegister<T>{

	static ResourceBundle myBundle = ResourceBundle.getBundle("MessagesBundle");

	public static class personRegister {

		private String id;
		private String name;
		private String surname;
		private String password;

		public personRegister(String name, String surname, String id, String password) {

			this.id = id;
			this.name = name;
			this.surname = surname;
			this.password = password;

		}

		@SuppressWarnings("rawtypes")
		public Register build() {

			@SuppressWarnings("unused")
			Register register = new Register(this);
			return new Register(this);
		}
	}

	@SuppressWarnings("rawtypes")
	static Register actualRegister;

	private String id;
	private String name;
	private String surname;
	private String password;

	public Register (personRegister register) {

		this.id = register.id;
		this.name = register.name;
		this.surname = register.surname;
		this.password = register.password;
	}
	
	@SuppressWarnings("rawtypes")
	public static boolean login(String id, String password,  ArrayList<Register> Reglist) {

		boolean login = false;

		for(int i = 0; i < Reglist.size(); i++) {

			if(id.equals(Reglist.get(i).getId()) && password.equals(Reglist.get(i).getPassword())) {

				login = true;
				actualRegister = Reglist.get(i);
			}
		}
		return login;
	}

	public String toString() {

		return myBundle.getString("name") + " " + this.name + "\t " + myBundle.getString("surname") + " " + this.surname + 
				"\t " + myBundle.getString("id") + " " + this.id;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@SuppressWarnings("unchecked")
	public T getName() {
		return (T) name;
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

	@SuppressWarnings("unchecked")
	public T getPassword() {
		return (T) password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public T getDni() {
		
		return null;
	}

	@Override
	public void setDni(String dni) {
		

	}
}
