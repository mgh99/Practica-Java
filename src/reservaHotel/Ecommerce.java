package reservaHotel;

import java.util.Locale;
import java.util.ResourceBundle;

public class Ecommerce {

	//Atributos
	private String name;
	private String adress;
	private String city;
	
	private float priceRoomSuit;
	private float priceRoomStandard;
	
	private int numRoomSuit;
	private int numRoomStandard;
	private int stars;
	private int capacity;

	private boolean openClose;
	private boolean swimmingPool;	
	private boolean avaible;
	
	public static int dimensionArray;
	static ResourceBundle my_bundle = ResourceBundle.getBundle("MessagesBundle");
	
	//Constructor por defecto
	public Ecommerce() {

	}

	public void setLocale(ResourceBundle m){
		this.my_bundle = m;
	}
	
	public static ResourceBundle getLocale() {
		return my_bundle;
	}

	public Ecommerce (String name, String adress, String city, float priceRoomSuit, float priceRoomStandard,
			int numRoomSuit, int numRoomStandard, int stars, boolean openClose, boolean avaible, int capacity,
			boolean swimmingPool) {

		this.name   = name;
		this.adress = adress;
		this.city  = city;
		this.priceRoomSuit = priceRoomSuit;
		this.priceRoomStandard = priceRoomStandard;
		this.numRoomSuit = numRoomSuit;
		this.numRoomStandard = numRoomStandard;
		this.avaible = avaible;
		this.stars = stars;
		this.capacity = capacity;
		this.openClose = openClose;
		this.swimmingPool = swimmingPool;

		dimensionArray++;//Se obtiene con esta variable la dimensión del array. Según número de instancias del constructor
	}
	
	//Constructor con parámetros
	public Ecommerce (String name, String adress, String city, float priceRoomSuit, float priceRoomStandard,
			int numRoomSuit, int numRoomStandard, boolean avaible) {

		this.name   = name;
		this.adress = adress;
		this.city  = city;
		this.priceRoomSuit = priceRoomSuit;
		this.priceRoomStandard = priceRoomStandard;
		this.numRoomSuit = numRoomSuit;
		this.numRoomStandard = numRoomStandard;
		this.avaible = avaible;

		dimensionArray++;//Se obtiene con esta variable la dimensión del array. Según número de instancias del constructor
	}


	//Métodos
	public String toString() {
		
		return  my_bundle.getString("name") + " " + this.getName() + "\n"+
				my_bundle.getString("adress") + " " + this.getAdress() + " \n"+
				my_bundle.getString("city") + " " + this.getCity() + "\n" +
				my_bundle.getString("priceroomsuit") + " "  + String.format("%.2f", this.getPriceRoomSuit()) + "€ \n" + 
				my_bundle.getString("priceroomstandard") + " "  + String.format("%.2f", this.getPriceRoomStandard()) + "€ \n" +
				my_bundle.getString("numroomsuit") + " " + this.getNumRoomSuit() + "\n" + 
				my_bundle.getString("numroomstandard") + " " + this.getNumRoomStandard() + 
				"\n" + my_bundle.getString("numstars") + " " + this.getStars() + 
				"\n" + my_bundle.getString("capacity") + " " + this.getCapacity() + 
				"\n" + my_bundle.getString("openclose") + " " + this.isOpenClose() +
				"\n" + my_bundle.getString("swimmingpool") + " " + this.isSwimmingPool();	
	
	} 

	
	//Getter y Setter	  
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getPriceRoomSuit() {
		return priceRoomSuit;
	}

	public void setPriceRoomSuit(float priceRoomSuit) {
		this.priceRoomSuit = priceRoomSuit;
	}

	public double getPriceRoomStandard() {
		return priceRoomStandard;
	}

	public void setPriceRoomStandard(float priceRoomStandard) {
		this.priceRoomStandard = priceRoomStandard;
	}

	public int getNumRoomSuit() {
		return numRoomSuit;
	}

	public void setNumRoomSuit(int numRoomSuit) {
		this.numRoomSuit = numRoomSuit;
	}

	public int getNumRoomStandard() {
		return numRoomStandard;
	}

	public void setNumRoomStandard(int numRoomStandard) {
		this.numRoomStandard = numRoomStandard;
	}

	public boolean isAvaible() {

		if(getNumRoomSuit() > 0) {
			this.avaible = true;
		}else if(getNumRoomStandard() > 0) {
			this.avaible = true;
		}

		return this.avaible;
	}

	public void setAvaible(boolean avaible) {
		this.avaible = avaible;
	}
	
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
