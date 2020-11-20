package org.reshotel;

import java.util.ArrayList;
import java.util.ResourceBundle;

public class Register implements IRegister{

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

		public Register build() {

			@SuppressWarnings("unused")
			Register register = new Register(this);
			return new Register(this);
		}
	}

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

	public static boolean login(String id, String password, ArrayList<Register> Reglist) {

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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String getDni() {
		
		return null;
	}

	@Override
	public void setDni(String dni) {
		

	}
}
