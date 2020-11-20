package org.reshotel;

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
	static ResourceBundle mybundle = ResourceBundle.getBundle("MessagesBundle");
	
	//Constructor por defecto
	public Ecommerce() {

	}

	@SuppressWarnings("static-access")
	public void setLocale(ResourceBundle m){
		this.mybundle = m;
	}
	
	public static ResourceBundle getLocale() {
		return mybundle;
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
		
		return  mybundle.getString("name") + " " + this.getName() + "\n"+
				mybundle.getString("adress") + " " + this.getAdress() + " \n"+
				mybundle.getString("city") + " " + this.getCity() + "\n" +
				mybundle.getString("priceroomsuit") + " "  + String.format("%.2f", this.getPriceRoomSuit()) + "€ \n" + 
				mybundle.getString("priceroomstandard") + " "  + String.format("%.2f", this.getPriceRoomStandard()) + "€ \n" +
				mybundle.getString("numroomsuit") + " " + this.getNumRoomSuit() + "\n" + 
				mybundle.getString("numroomstandard") + " " + this.getNumRoomStandard() + 
				"\n" + mybundle.getString("numstars") + " " + this.getStars() + 
				"\n" + mybundle.getString("capacity") + " " + this.getCapacity() + 
				"\n" + mybundle.getString("openclose") + " " + this.isOpenClose() +
				"\n" + mybundle.getString("swimmingpool") + " " + this.isSwimmingPool();	
	
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

	public static int getDimensionArray() {
		return dimensionArray;
	}

	public static void setDimensionArray(int dimensionArray) {
		Ecommerce.dimensionArray = dimensionArray;
	}	


}

