package reservaHotel;

public class Ecommerce {

	//Atributos
	private String name;
	private String adress;
	private String city;
	
	private double priceRoomSuit;
	private double priceRoomStandard;
	
	private int numRoomSuit;
	private int numRoomStandard;
	
	private boolean avaible;
	
	public static int dimensionArray;

	//Constructor por defecto
	public Ecommerce() {

	}

	//Constructor con parámetros
	public Ecommerce (String name, String adress, String city, double priceRoomSuit, double priceRoomStandard,
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
		return  "Nombre: "      +this.getName()+    "\n"+
				"Dirección: " +this.getAdress()+  " \n"+
				"Ciudad: "    +this.getCity()+ "\n" +
				"Precio habitación suit: " + this.getPriceRoomSuit() + "€ \n" + 
				"Precio habitación standard: " + this.getPriceRoomStandard() + "€ \n" +
				"Numero de habitaciones suit: " + this.getNumRoomSuit() + "\n" + 
				"Numero de habitaciones standard: " + this.getNumRoomStandard();
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

	public void setPriceRoomSuit(double priceRoomSuit) {
		this.priceRoomSuit = priceRoomSuit;
	}

	public double getPriceRoomStandard() {
		return priceRoomStandard;
	}

	public void setPriceRoomStandard(double priceRoomStandard) {
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



}
