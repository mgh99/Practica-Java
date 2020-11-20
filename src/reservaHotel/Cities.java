package org.reshotel;

import java.util.ResourceBundle;

public class Cities {

	//Atributos
	@SuppressWarnings("unused")
	private Ecommerce [] ecommerces = null;
	
	@SuppressWarnings("unused")
	private double price;
	
	private int cantRoom;

	BookRoom bookroom = new BookRoom();
	static ResourceBundle myBundle = ResourceBundle.getBundle("MessagesBundle");
	
	//Constructor por defecto
	public Cities() { 

	}

	//constructor con parámetros
	public 	Cities(Ecommerce[] ecommerces, int cantRoom) {

		this.ecommerces = ecommerces;
		this.cantRoom = cantRoom;
	}

	//getter y setter	
	public int getCantRoom() {
		return cantRoom;
	}

	public void setCantRoom(int cantRoom) {
		this.cantRoom = cantRoom;
	}

	//Métodos

	// Busca por el nombre de la ciudad y hace toda la gestion de reservas
	public void bookingHotelCity (Ecommerce[] ecommerces, String nameCity, char answer, char opcion, int readHotel, int readAmount) {

		System.out.println (" ");
		System.out.print(myBundle.getString("question1") + " " + nameCity + myBundle.getString("question2") + " ");
		answer = Read.factChar();

		if(answer == 'S' || answer == 's') {

			System.out.println(myBundle.getString("roomhotel"));
			System.out.println (" ");
			bookroom.showHotelsNameCity(ecommerces, nameCity);

			System.out.print(myBundle.getString("numhotel") + " ");
			readHotel = Read.factInt();

			System.out.println (" ");
			System.out.print(myBundle.getString("prefer") + " ");
			opcion = Read.factChar();
			System.out.println (" ");

			if(opcion == '1') {
				//SUIT

				System.out.print(myBundle.getString("numroom") + " ");
				readAmount = Read.factInt();

				bookroom.buyRoomSuit(ecommerces, readHotel, readAmount);

			}else if(opcion == '2'){
				//STANDARD

				System.out.print(myBundle.getString("numroom") + " ");
				readAmount = Read.factInt();

				bookroom.buyRoomStandard(ecommerces, readHotel, readAmount);

			}else {
				System.out.print(myBundle.getString("incorrect"));
			}

		}
	}


}
