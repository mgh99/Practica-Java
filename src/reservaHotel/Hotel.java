package org.reshotel;

import java.util.ResourceBundle;

public class Hotel extends Ecommerce {

	//Atributos
	private int stars;
	private int capacity;
	private boolean openClose;
	private boolean swimmingPool;
	
	static ResourceBundle myBundle = ResourceBundle.getBundle("MessagesBundle");
	
	//constructor por defecto
	public Hotel() {

		this.stars = 1; //por defecto tiene minimo 1 estrella
		this.capacity = 1;  //por defecto tiene minimo 1 persona de capacidad
		this.openClose = true; //por defecto esta abiero
		this.swimmingPool = false;

	}


	//constructor con parametros
	public Hotel(String name, String adress, String city, float priceRoomSuit, float priceRoomStandard,
			int numRoomSuit, int numRoomStandard, int stars, boolean openClose, boolean avaible, int capacity,
			boolean swimmingPool) {

		super(name, adress, city, priceRoomSuit, priceRoomStandard, numRoomSuit, numRoomStandard, avaible);

		this.stars = stars;
		this.capacity = capacity;
		this.openClose = openClose;
		this.swimmingPool = swimmingPool;


	}


	//Métodos
	@Override
	public String toString() {

		return "\t" + myBundle.getString("hotel") + "\n" + 
				super.toString();
	}


	//Getter y Setter
	@Override
	public int getStars() {
		return stars;
	}

	@Override
	public void setStars(int stars) {
		this.stars = stars;
	}

	@Override
	public int getCapacity() {
		return capacity;
	}

	@Override
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	@Override
	public boolean isOpenClose() {
		return openClose;
	}

	@Override
	public void setOpenClose(boolean openClose) {
		this.openClose = openClose;
	}

	@Override
	public boolean isSwimmingPool() {
		return swimmingPool;
	}

	@Override
	public void setSwimmingPool(boolean swimmingPool) {
		this.swimmingPool = swimmingPool;
	}	

}

