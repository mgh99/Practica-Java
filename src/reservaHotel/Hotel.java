package reservaHotel;

import java.util.Locale;
import java.util.ResourceBundle;

public class Hotel extends Ecommerce {

	//Atributos
	private int stars;
	private int capacity;
	private boolean openClose;
	private boolean swimmingPool;
	
	static ResourceBundle my_bundle = ResourceBundle.getBundle("MessagesBundle");
	
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
	public String toString() {

		return "\t" + my_bundle.getString("hotel") + "\n" + 
				super.toString();
	}


	//Getter y Setter
	public int getStars() {
		return stars;
	}

	public void setStars(int stars) {
		this.stars = stars;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public boolean isOpenClose() {
		return openClose;
	}

	public void setOpenClose(boolean openClose) {
		this.openClose = openClose;
	}

	public boolean isSwimmingPool() {
		return swimmingPool;
	}

	public void setSwimmingPool(boolean swimmingPool) {
		this.swimmingPool = swimmingPool;
	}	

}
