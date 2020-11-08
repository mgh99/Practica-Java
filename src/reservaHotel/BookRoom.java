package reservaHotel;

import java.util.ResourceBundle;

public class BookRoom {

	//Atributos
	private Ecommerce ecommerces[] = null;
	private double price;
	private int cantRoom;
	private int count = 0;

	static ResourceBundle my_bundle = ResourceBundle.getBundle("MessagesBundle");

	//Se instancian y cargan los hoteles
	//Hotel(Nombre, dirección, ciudad, precio habitación suit, precio habitación standard, número de habitaciones suit, número de habitaciones standard, numero de estrellas, 
	//abierto/cerrado, disponible, capcidad total, piscina)


	// HOTELES ***** (5 estrellas)
	Ecommerce hotel9 = new Hotel("Hotel Puerta América", "Avenida América, 41", "Madrid", 
			296, (float) 135.23, 3, 40, 5, true, true, 170, true);
	Ecommerce hotel10 = new Hotel("Four Seasons", "Sevilla, 3", "Madrid", 
			2007, 578, 7, 50, 5, true, true, 300, true);
	Ecommerce hotel11 = new Hotel("The Westin Palace", "Plaza de las Cortes, 7", "Madrid", 
			1293, 230, 8, 50, 5, true, true, 150, true);
	Ecommerce hotel21 = new Hotel("Eurostars Torre Sevilla", "Calle Gonzálo Jiménez de Quesada, 2", "Sevilla", 
			349, 99, 8, 25, 5, true, true, 200, false);
	Ecommerce hotel22 = new Hotel("Hotel Alfonso XIII", "San Fernando, 2", "Sevilla", 
			1029, (float) 231.25, 10, 150, 5, true, true, 350, true);
	Ecommerce hotel41 = new Hotel("Hotel Reina Petronila", "Avenida Alcalde Sáinz de Varanda, 2", "Zaragoza", 
			200, 98, 6, 150, 5, true, true, 380, true);
	Ecommerce hotel42 = new Hotel("Alma Pamplona", "Beloso Bajo, 11", "Pamplona", 
			250, 130, 5, 155, 5, true, true, 356, true);
	Ecommerce hotel49 = new Hotel("Gran Hotel Lakua", "Tarragona, 8", "Vitoria", 
			135, 71, 12, 178, 5, true, true, 356, true);


	//HOTELES **** (4 estrellas)
	Ecommerce hotel1 = new Hotel("Soho Boutique Opera", "Calle Veneras, 2", "Madrid", 
			107, 65, 5, 20, 4, true, true, 100, false);
	Ecommerce hotel2 = new Hotel("Riu Plaza España", "Calle Gran Vía, 84", "Madrid", 
			165, 95, 4, 100, 4, true, true, 500, true);
	Ecommerce hotel3  = new Hotel("NH Madrid Zurbano", "Zurbano, 79 - 81", "Madrid", 
			128, (float) 76.14, 3, 10, 4, true, true, 200, false);
	Ecommerce hotel4 = new Hotel("Catalonia El Pilar", "Manifestación, 16", "Zaragoza", 
			157, 83, 2, 50, 4, true, true, 70, false);
	Ecommerce hotel25 = new Hotel("Avenida Palace", "Gran Vía, 605", "Barcelona", 
			232, 73, 1, 75, 4, true, true, 86, true);
	Ecommerce hotel26 = new Hotel("Catalonia Ramblas 4* Sup", "Pelai, 28", "Barcelona", 
			376, 86, 3, 50, 4, true, true, 70, true);
	Ecommerce hotel27 = new Hotel("Vincci Frontaura", "Paseo de Zorrilla, 332 - 334", "Valladolid", 
			200, 103, 3, 50, 4, true, true, 70, false);
	Ecommerce hotel30 = new Hotel("NH Collection Gran Hotel de Zaragoza", "Joaquín Costa, 5", "Zaragoza", 
			152, (float) 72.09, 5, 68, 4, true, true, 70, false);
	Ecommerce hotel34 = new Hotel("Eurostars Palacio de Cristal", "Policarpo Herrero", "Oviedo", 
			126, (float) 53.29, 5, 70, 4, true, true, 95, false);
	Ecommerce hotel36 = new Hotel("Gran Hotel Sardinero", "Plaza de Italia, 1", "Santander", 
			236, 75, 5, 70, 4, true, true, 95, false);
	Ecommerce hotel31 = new Hotel("Hotel Calle Mayoy", "Marqués de San Nicolás, 71", "Logroño", 
			235, 74, 6, 150, 4, true, true, 380, false);
	Ecommerce hotel40 = new Hotel("Eurostars Fuerte Ruavieja", "Ruavieja, 22", "Logroño", 
			200, 74, 3, 180, 4, true, true, 380, false);
	Ecommerce hotel44 = new Hotel("Pamplona Catedral Hotel", "Dos de Mayo, 4", "Pamplona", 
			106, 48, 3, 230, 4, true, true, 320, false);
	Ecommerce hotel43 = new Hotel("Hotel Tres Reyes", "Jardines de La Taconera", "Pamplona", 
			200, 89, 5, 130, 4, true, true, 280, true);
	Ecommerce hotel47 = new Hotel("Vincci Mercat", "Linterna, 31", "Valencia", 
			312, 121, 7, 129, 4, true, true, 280, true);
	Ecommerce hotel51 = new Hotel("Silken Ciudad de Vitoria", "Portald de Castilla, 8", "Vitoria", 
			140, 64, 4, 180, 4, false, false, 320, false);
	Ecommerce hotel50 = new Hotel("NH Canciller Ayala Vitoria", "Ramón y Cajal, 5", "Vitoria", 
			102, (float) 64.58, 0, 129, 4, true, true, 280, false);


	//HOTELES *** (3 estrellas)
	Ecommerce hotel5 = new Hotel("Erase un hotel", "Bravo Murillo, 304", "Madrid", 
			62, 40, 7, 50, 3, true, true, 75, false);
	Ecommerce hotel6 = new Hotel("Regente Hotel", "Mesonero Romanos, 9", "Madrid", 
			175, 59, 7, 10, 3, true, true, 120, false);
	Ecommerce hotel7 = new Hotel("Gran Vía 63 Rooms", "Gran Vía, 63", "Madrid", 
			150, 33, 4, 50, 3, true, true, 100, false);
	Ecommerce hotel8 = new Hotel("Mozart", "Menéndez Pelayo, 7", "Valladolid", 
			80, 57, 1, 50, 3, true, true, 87, false);
	Ecommerce hotel23 = new Hotel("Hotel Market", "Comte Borrell, 68", "Barcelona", 
			105, 45, 0, 0, 3, false, false, 85, true);
	Ecommerce hotel24 = new Hotel("Evenia Rocafort", "Rocafort, 23 - 25", "Barcelona", 
			117, 62, 3, 40, 3, true, true, 98, false);
	Ecommerce hotel35 = new Hotel("Hotel Chiqui", "Avenida García Lago, 9", "Santander", 
			117, 60, 7, 50, 3, true, true, 98, true);
	Ecommerce hotel38 = new Hotel("Princesa Galiana", "Paseo de la Rosa, 58", "Toledo", 
			100, 39, 0, 55, 3, true, true, 70, false);
	Ecommerce hotel37 = new Hotel("Hotel Carlos V", "Plaza Horno de la Magdalena", "Toledo", 
			72, 44, 7, 50, 3, true, true, 98, false);
	Ecommerce hotel45 = new Hotel("F&G Logroño", "Avenida de Viana, 2 - 6", "Logroño", 
			78, 55, 3, 53, 3, true, true, 103, false);
	Ecommerce hotel48 = new Hotel("Sweet Hotel Renasa", "Avenida de Cataluña, 5", "Valencia", 
			116, 41, 2, 60, 3, true, true, 120, false);
	Ecommerce hotel46 = new Hotel("Hotel Malcom and Barret", "Avenida Ausias March, 59", "Valencia", 
			82, 47, 10, 120, 3, true, true, 210, false);


	// HOTELES ** (2 estrellas)
	Ecommerce hotel12 = new Hotel("Hostal Vicky", "Marte 2, Barajas", "Madrid", 
			80, 50, 5, 50, 2, true, true, 70, false);
	Ecommerce hotel13 = new Hotel("Hotel Ballesta", "Ballesta 5", "Madrid", 
			90, (float) 32.50, 5, 20, 2, false, false, 70, false);
	Ecommerce hotel19 = new Hotel("Welldone Quality", "Calle Cerrajería, 29", "Sevilla", 
			225, 67, 5, 40, 2, true, true, 180, true);
	Ecommerce hotel20 = new Hotel("Hostal Atenas", "Caballerizas, 1", "Sevilla", 
			75, 43, 3, 35, 2, false, false, 70, false);
	Ecommerce hotel28 = new Hotel("Astorga Boutique Hostal", "Ferrocarril, 1", "Valladolid", 
			90, 45, 3, 37, 2, true, true, 64, false);
	Ecommerce hotel29 = new Hotel("San Cristobal", "Carretera de Soria, km 5.500", "Valladolid", 
			75, 39, 1, 20, 2, false, false, 40, false);
	Ecommerce hotel39 = new Hotel("Yit Puerta Visagra", "Callejón del Potro, 5", "Toledo", 
			110, 38, 6, 78, 2, true, true, 98, false);

	// HOTELES * (1 estrella)
	Ecommerce hotel14 = new Hotel("Best Price Alcalá", "Calle San Miguel Yuste, 10", "Madrid", 
			60, 35, 1, 30, 1, true, true, 70, false);
	Ecommerce hotel15 = new Hotel("Diezmadrid", "Calle de la Cruz, 26", "Madrid", 
			57, 30, 0, 50, 1, false, false, 70, false);
	Ecommerce hotel16 = new Hotel("Hotel Boutique Las Brisas", "La Braña, 14", "Santander", 
			104, 49, 0, 2, 1, true, true, 90, false);
	Ecommerce hotel17 = new Hotel("Ibis Budget Sevilla Aeropuerto", "Plaza Gota de Leche, 1", "Sevilla", 
			56, 46, 2, 30, 1, true, true, 120, false);
	Ecommerce hotel18 = new Hotel("Giraldilla", "Gravina, 23", "Sevilla", 
			50, 17, 5, 40, 1, true, true, 70, false);
	Ecommerce hotel32 = new Hotel("GIbis Budget Oviedo", "Ernesto Winter Blanco", "Oviedo", 
			49, 31, 0, 60, 1, true, true, 70, true);
	Ecommerce hotel33 = new Hotel("Santacruz", "Marqués de Santa Cruz, 6", "Oviedo", 
			70, 45, 5, 40, 1, false, false, 70, true);



	//Se crea el array "catalogue" para contener los hoteles. Su dimensión viene del número de veces que se
	//instancia el contructor de Ecommerce
	Ecommerce catalogue[] = new Ecommerce[Ecommerce.dimensionArray];

	//Constructor por defecto
	public BookRoom() { 

	}

	//constructor con parámetros
	public BookRoom(Ecommerce[] ecommerces) {

		this.ecommerces = ecommerces;
		this.cantRoom = cantRoom;
		this.price = price;
	}

	//getter y setter	
	public int getCantRoom() {
		return cantRoom;
	}

	public void setCantRoom(int cantRoom) {
		this.cantRoom = cantRoom;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}


	//Métodos

	//Carga todos los hoteles
	public Ecommerce[] loadHotels() {

		return ecommerces;
	}

	//Mostrar todos los hoteles guardados
	public void showHotels (Ecommerce[] ecommerces) { 

		for (int i = 0; i < ecommerces.length; i++) {

			System.out.print(ecommerces[i]+"\n--------\n");
		}
	} 

	//Muestrar los hoteles para seleccionarlos con un número asociado
	public void showHotelsName (Ecommerce[] ecommerces) { 

		for (int i = 0; i < ecommerces.length; i++) {

			System.out.println(i+1 +" "+ecommerces[i].getName()+"\n");
		}

		System.out.println("\n-------------------\n");
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

	//Buscar los hoteles de una ciudad en concreto
	public void searchCity (Ecommerce[] ecommerces, String city) {

		for (int i = 0; i < ecommerces.length ; i++) {

			if (city.equals((ecommerces[i].getCity()))) {

				System.out.print(ecommerces[i]+"\n--------\n");

			}
		}

	}

	//Calcula el precio total gastado de todas las reservas que se hayan hecho
	public double totalPrice() {

		System.out.print(my_bundle.getString("price"));

		price = Math.round(price * 100);
		return price/100;
	}

	//Reservar una habitación suit
	public double buyRoomSuit (Ecommerce[] ecommerces, int num, int cantRoom) {

		//double price = 1;

		if (ecommerces[num-1].isAvaible()) {

			if (ecommerces[num-1].getNumRoomSuit() >= cantRoom){

				System.out.println(" ");
				System.out.println(my_bundle.getString("booksuit"));
				ecommerces[num -1].setNumRoomSuit(ecommerces[num -1].getNumRoomSuit() - cantRoom);

				return this.price += cantRoom * ecommerces [num-1].getPriceRoomSuit();

			} else {

				System.out.println(my_bundle.getString("notavaibleroom"));
			}

		} else {
			System.out.println(my_bundle.getString("notavaibleroom"));
		}

		return this.getPrice();
	}

	//Reservar una habitación standard
	public double buyRoomStandard (Ecommerce[] ecommerces, int num, int cantRoom) {

		//double price;
		@SuppressWarnings("unused")
		BookRoom bookroom = new BookRoom();

		cantRoom = 1; //minimo reservo una habitacion/dia

		if(ecommerces[num - 1].isAvaible() ) {

			if(ecommerces[num-1].getNumRoomStandard() >= this.getCantRoom()) {

				System.out.println(" ");
				System.out.println(my_bundle.getString("bookstandard"));
				ecommerces[num - 1].setNumRoomStandard(ecommerces[num - 1].getNumRoomStandard() - this.getCantRoom());
				System.out.println("-------------------------------------------------");

				return this.price += this.getCantRoom() * ecommerces [num - 1].getPriceRoomStandard();
			}else {

				System.out.println(my_bundle.getString("notavaibleroom"));
			}

		}else {
			System.out.println(my_bundle.getString("notavaibleroom"));
		}

		return this.getPrice();
	}

	//habitación suit o standard
	public void bookRoomSave(int readHotel, int readAmount, char opcion) {
		BookRoom bookroom = new BookRoom(); 

		if(opcion == '1') {
			//SUIT

			System.out.print(my_bundle.getString("numroom") + " ");
			readAmount = Read.factInt();

			//Se carga el hotel y la cantidad solicitada por el usuario
			bookroom.buyRoomSuit(catalogue, readHotel, readAmount);

		}else if(opcion == '2'){
			//STANDARD

			System.out.print(my_bundle.getString("numroom") + " ");
			readAmount = Read.factInt();

			//Se carga el hotel y la cantidad solicitada por el usuario
			bookroom.buyRoomStandard(catalogue, readHotel, readAmount);

		}else {
			System.out.print(my_bundle.getString("incorrect"));
		}

	}

	//Hotel(Nombre, dirección, ciudad, precio habitación suit, precio habitación standard, número de habitaciones suit, número de habitaciones standard, numero de estrellas, 
	//abierto/cerrado, disponible, capcidad total, piscina)

	//Se busca si ya hay hoteles con esas caracteristicas
	public void SearchH(String name, String adress, String city, float priceRoomSuit, float priceRoomStandard, int numRoomSuite,
			int numRoomStandard, int stars, boolean openClose, boolean avaible, int capacity, boolean swimmingPool) {


		for (int i = 0; i < this.count; i++) {

			if (name.equals(this.catalogue[i].getName()) && city.equals(this.catalogue[i].getCity())) {
				System.out.println(my_bundle.getString("exstsh"));
			}
		}

	}

	//El jefe añade nuevos hoteles
	public void newHotelBoss(String name, String adress, String city, float priceRoomSuit, float priceRoomStandard, int numRoomSuite,
			int numRoomStandard, int stars, boolean openClose, boolean avaible, int capacity, boolean swimmingPool) {

		if (count < 100) {

			//Ecommerce hotel12 = new Hotel("Hostal Vicky", "Marte 2, Barajas", "Madrid", 
			//80, 50, 5, 50, 2, true, true, 70, false);

			this.catalogue[count] = new Hotel();
			this.catalogue[count].setName(name);
			this.catalogue[count].setAdress(adress);
			this.catalogue[count].setCity(city);
			this.catalogue[count].setPriceRoomSuit(priceRoomSuit);
			this.catalogue[count].setPriceRoomStandard(priceRoomStandard);
			this.catalogue[count].setNumRoomSuit(numRoomSuite);
			this.catalogue[count].setNumRoomStandard(numRoomStandard);
			this.catalogue[count].setStars(stars);
			this.catalogue[count].setOpenClose(openClose);
			this.catalogue[count].setCapacity(capacity);
			this.catalogue[count].setSwimmingPool(swimmingPool);


			this.count++;
		}else {
			System.out.println(my_bundle.getString("nomore"));
		}


	}

	//Muestra todos los hoteles
	public void showH() {

		for (int i = 0; i < this.count; i++) {

			System.out.println("\t HOTELES \n");
			System.out.println(my_bundle.getString("name")+ " " + this.catalogue[i].getName() + "\n" + 
					my_bundle.getString("adress") + " " + this.catalogue[i].getAdress() + "\n" +
					my_bundle.getString("city") + " " + this.catalogue[i].getCity() + "\n" +
					my_bundle.getString("priceroomsuit") + " " + this.catalogue[i].getPriceRoomSuit() + "\n" +
					my_bundle.getString("priceroomstandard") + " " + this.catalogue[i].getPriceRoomStandard() + "\n" +
					my_bundle.getString("numroomsuit") + " " + this.catalogue[i].getNumRoomSuit() + "\n" + 
					my_bundle.getString("numroomstandard") + " " + this.catalogue[i].getNumRoomStandard() + "\n" +
					my_bundle.getString("numstars") + " " + this.catalogue[i].getStars() + "\n" + 
					my_bundle.getString("capacity") + " " + this.catalogue[i].getCapacity() + "\n" + 
					my_bundle.getString("openclose") + " " + this.catalogue[i].isOpenClose() + "\n" +
					my_bundle.getString("swimmingpool") + " "  + this.catalogue[i].isSwimmingPool());
			System.out.println("--------");
		}
	}

}
