package org.reshotel;

import java.util.ResourceBundle;

public class MathHotel {
	
	//Atributos
	private double price;
	static ResourceBundle myBundle = ResourceBundle.getBundle("MessagesBundle");
	
	public MathHotel() {
		
	}

	public MathHotel(double price) {
		
		this.price = price;
	}
	
	//Calcula el precio total gastado de todas las reservas que se hayan hecho
	public double priceApp() {

		System.out.print(myBundle.getString("price"));

		price = Math.round(price * 100);
		return price/100;
	}
	
	
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
