package reservaHotel;

public class BookRoom {

	//Atributos
	private Ecommerce ecommerces[] = null;
	private double price;

	//Constructor por defecto
	public BookRoom() { 

	}

	//constructor con parámetros
	public BookRoom(Ecommerce[] ecommerces) {

		this.ecommerces = ecommerces;
	}

	//Métodos
	public Ecommerce[] loadHotels() {

		return ecommerces;
	}

	//Mostrar todos los hoteles guardados
	public void showHotels (Ecommerce[] ecommerces) { 

		for (int i = 0; i < ecommerces.length; i++) {

			System.out.print(ecommerces[i]+"\n--------\n");
		}
	}

	//Mostrar los hoteles por ciudades con un número asociado
	public void showHotelsNameCity (Ecommerce[] ecommerces, String city) { 

		for (int i = 0; i < ecommerces.length; i++) {

			if(city.equals((ecommerces[i].getCity()))) {
				System.out.println(i+1 +" "+ecommerces[i].getName()+"\n");
			}

		}

		System.out.println("\n-------------------\n");
	}   
	
	//Muestrar los hoteles para seleccionarlos con un número asociado
	public void showHotelsName (Ecommerce[] ecommerces) { 

		for (int i = 0; i < ecommerces.length; i++) {

			System.out.println(i+1 +" "+ecommerces[i].getName()+"\n");
		}

		System.out.println("\n-------------------\n");
	} 

	//Buscar los hoteles de una ciudad en concreto
	public void searchCity (Ecommerce[] ecommerces, String city) {

		for (int i = 0; i < ecommerces.length ; i++) {

			if (city.equals((ecommerces[i].getCity()))) {

				System.out.print(ecommerces[i]+"\n--------\n");
				
			}
		}
		
		
	}
	
	//Reservar una habitación suit
	public double buyRoomSuit (Ecommerce[] ecommerces, int num, int cantRoom) {

		if (ecommerces[num-1].isAvaible()) {

			if (ecommerces[num-1].getNumRoomSuit() >= cantRoom){

				System.out.println(" ");
				System.out.println("Has reservado tú suit del hotel con éxito");
				ecommerces[num -1].setNumRoomSuit(ecommerces[num -1].getNumRoomSuit() - cantRoom);

				return price += cantRoom * ecommerces [num-1].getPriceRoomSuit();

			} else {

				System.out.println("No hay suficientes habitaciones disponibles");
			}

		} else {
			System.out.println("No hay suficientes habitaciones disponibles");
		}

		return price;
	}
	
	//Reservar una habitación standard
	public double buyRoomStandard (Ecommerce[] ecommerces, int num, int cantRoom) {

		if(ecommerces[num - 1].isAvaible() ) {

			if(ecommerces[num-1].getNumRoomStandard() >= cantRoom) {

				System.out.println(" ");
				System.out.println("Has reservado tu habitación standard con éxito");
				ecommerces[num - 1].setNumRoomStandard(ecommerces[num - 1].getNumRoomStandard() - cantRoom);

				return price += cantRoom * ecommerces [num - 1].getPriceRoomStandard();
			}else {

				System.out.println("No hay suficientes habitaciones disponibles");
			}

		}else {
			System.out.println("No hay suficientes habitaciones disponibles");
		}

		return price;
	}

	//Calcula el precio total gastado de todas las reservas que se hayan hecho
	public double totalPrice() {

		System.out.print("El total de la caja es ");

		price = Math.round(price * 100);
		return price/100;
	} 

}
