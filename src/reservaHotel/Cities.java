package reservaHotel;

import java.util.ResourceBundle;

public class Cities {

	//Atributos
	private Ecommerce ecommerces[] = null;
	private double price;
	private int cantRoom;

	BookRoom bookroom = new BookRoom();
	static ResourceBundle my_bundle = ResourceBundle.getBundle("MessagesBundle");
	
	//Constructor por defecto
	public Cities() { 

	}

	//constructor con parámetros
	public 	Cities(Ecommerce[] ecommerces) {

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
	public void BookingHotelCity (Ecommerce[] ecommerces, String nameCity, char answer, char opcion, int readHotel, int readAmount) {

		//String nameCity = " ";
		//char answer;


		BookRoom bookroom = new BookRoom();

		System.out.println (" ");
		System.out.print(my_bundle.getString("question1") + " " + nameCity + my_bundle.getString("question2") + " ");
		answer = Read.factChar();

		if(answer == 'S' || answer == 's') {

			System.out.println(my_bundle.getString("roomhotel"));
			System.out.println (" ");
			bookroom.showHotelsNameCity(ecommerces, nameCity);

			System.out.print(my_bundle.getString("numhotel") + " ");
			readHotel = Read.factInt();

			System.out.println (" ");
			System.out.print(my_bundle.getString("prefer") + " ");
			opcion = Read.factChar();
			System.out.println (" ");

			if(opcion == '1') {
				//SUIT

				System.out.print(my_bundle.getString("numroom") + " ");
				readAmount = Read.factInt();

				bookroom.buyRoomSuit(ecommerces, readHotel, readAmount);

			}else if(opcion == '2'){
				//STANDARD

				System.out.print(my_bundle.getString("numroom") + " ");
				readAmount = Read.factInt();

				bookroom.buyRoomStandard(ecommerces, readHotel, readAmount);

			}else {
				System.out.print(my_bundle.getString("incorrect"));
			}

		}
	}


}
