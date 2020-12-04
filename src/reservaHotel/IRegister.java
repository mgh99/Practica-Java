package org.reshotel;

public interface IRegister<T> {
	
	public T getDni();
	public void setDni(String dni);
	
	public T getName();
	public void setName(String name);

	public T getPassword();
	public void setPassword(String password);
	
	public String toString();

}
