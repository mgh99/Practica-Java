package reservaHotel;

public class Menu {

	public static void main(String[] args) {

		System.out.println("BIENVENIDO A LA RESERVA DE HOTELES \n"+
				"---------------------------------------------------------\n" +
				"-El programa es un simulador de reservas de hoteles para clientes \n"+
				"-Las habitaciones de hoteles sólo se pueden reservar si están disponibles \n"+
				"---------------------------------------------------------\n" +
				"\tEl cliente puede: \n"+
				" *Reservar habitaciones de los hoteles existentes\n"+
				" *Consultar el importe de la cuenta\n" +
				" *Buscar hoteles por ciudades");

		boolean find = true;
		int readHotel, readAmount; //Variables para seleccionar el hotel y el número de habitaciones que quieres reservar
		char opcion = '1';
		String nameCity;
		char answer;

		//Se instancian y cargan los hoteles
		//Hotel(Nombre, dirección, ciudad, precio habitación suit, precio habitación standard, número de habitaciones suit, número de habitaciones standard, numero de estrellas, 
		//abierto/cerrado, disponible, capcidad total, piscina)


		// HOTELES ***** (5 estrellas)
		Ecommerce hotel9 = new Hotel("Hotel Puerta América", "Avenida América, 41", "Madrid", 
				296, 135.23, 3, 40, 5, true, true, 170, true);
		Ecommerce hotel10 = new Hotel("Four Seasons", "Sevilla, 3", "Madrid", 
				2007, 578, 7, 50, 5, true, true, 300, true);
		Ecommerce hotel11 = new Hotel("The Westin Palace", "Plaza de las Cortes, 7", "Madrid", 
				1293, 230, 8, 50, 5, true, true, 150, true);
		Ecommerce hotel21 = new Hotel("Eurostars Torre Sevilla", "Calle Gonzálo Jiménez de Quesada, 2", "Sevilla", 
				349, 99, 8, 25, 5, true, true, 200, false);
		Ecommerce hotel22 = new Hotel("Hotel Alfonso XIII", "San Fernando, 2", "Sevilla", 
				1029, 231.25, 10, 150, 5, true, true, 350, true);
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
				128, 76.14, 3, 10, 4, true, true, 200, false);
		Ecommerce hotel4 = new Hotel("Catalonia El Pilar", "Manifestación, 16", "Zaragoza", 
				157, 83, 2, 50, 4, true, true, 70, false);
		Ecommerce hotel25 = new Hotel("Avenida Palace", "Gran Vía, 605", "Barcelona", 
				232, 73, 1, 75, 4, true, true, 86, true);
		Ecommerce hotel26 = new Hotel("Catalonia Ramblas 4* Sup", "Pelai, 28", "Barcelona", 
				376, 86, 3, 50, 4, true, true, 70, true);
		Ecommerce hotel27 = new Hotel("Vincci Frontaura", "Paseo de Zorrilla, 332 - 334", "Valladolid", 
				200, 103, 3, 50, 4, true, true, 70, false);
		Ecommerce hotel30 = new Hotel("NH Collection Gran Hotel de Zaragoza", "Joaquín Costa, 5", "Zaragoza", 
				152, 72.09, 5, 68, 4, true, true, 70, false);
		Ecommerce hotel34 = new Hotel("Eurostars Palacio de Cristal", "Policarpo Herrero", "Oviedo", 
				126, 53.29, 5, 70, 4, true, true, 95, false);
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
				102, 64.58, 0, 129, 4, true, true, 280, false);


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
				90, 32.50, 5, 20, 2, false, false, 70, false);
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

		//Se crea el objeto "bookroom" para reservar (mostrar todos los hoteles o por ciudades,
		// reservar habiatciones de hoteles, la cantidad de habitacones y mostrar el dinero gastado en total)
		BookRoom bookroom = new BookRoom();

		//Se rellena el array catalogue
		catalogue[0] = hotel1;     catalogue[1] = hotel2;     catalogue[2] = hotel3;     catalogue[3] = hotel4;
		catalogue[4] = hotel5;     catalogue[5] = hotel6;     catalogue[6] = hotel7;     catalogue[7] = hotel8;
		catalogue[8] = hotel9;     catalogue[9] = hotel10;    catalogue[10] = hotel11;   catalogue[11] = hotel12;
		catalogue[12] = hotel13;   catalogue[13] = hotel14;   catalogue[14] = hotel15;   catalogue[15] = hotel16;
		catalogue[16] = hotel17;   catalogue[17] = hotel18;   catalogue[18] = hotel19;   catalogue[19] = hotel20;
		catalogue[20] = hotel21;   catalogue[21] = hotel22;   catalogue[22] = hotel23;   catalogue[23] = hotel24;
		catalogue[24] = hotel25;   catalogue[25] = hotel26;   catalogue[26] = hotel27;   catalogue[27] = hotel28;
		catalogue[28] = hotel29;   catalogue[29] = hotel30;   catalogue[30] = hotel31;   catalogue[31] = hotel32;
		catalogue[32] = hotel33;   catalogue[33] = hotel34;   catalogue[34] = hotel35;   catalogue[35] = hotel36;
		catalogue[36] = hotel37;   catalogue[37] = hotel38;   catalogue[38] = hotel39;   catalogue[39] = hotel40;
		catalogue[40] = hotel41;   catalogue[41] = hotel42;   catalogue[42] = hotel43;   catalogue[43] = hotel44;
		catalogue[44] = hotel45;   catalogue[45] = hotel46;   catalogue[46] = hotel47;   catalogue[47] = hotel48;
		catalogue[48] = hotel49;   catalogue[49] = hotel50;   catalogue[50] = hotel51;


		do {

			System.out.println(" ");
			System.out.println(" -- MENU --");
			System.out.print( "1) Mostrar todos los hoteles\n" +
					"2) Reservar habitaciones \n" +
					"3) Mostrar dinero gastado en total en la app\n" +
					"4) Bucar hoteles por ciudades" + "\n" +
					"SALIR --> Pulse cualquier otro número\n" +
					"-----------------------------------------\n" + 
					"Introduce una opcion:" );

			switch (Read.factInt()) {

			case 1:

				//MOSTRAR TODOS LOS HOTELES GUARDADOS

				bookroom.showHotels(catalogue);
				break;

			case 2:

				//RESERVAR HABITACIONES DE LOS HOTELES GUARDADOS

				System.out.println("¿En qué hotel quieres reservar una habitación?: ");
				bookroom.showHotelsName(catalogue);

				System.out.print("Introduce el número del hotel que quieras reservar una habitación: ");
				readHotel = Read.factInt();

				System.out.print("Qué prefieres reservar?\n" + "1) Habitación suit\n" + "2) Habitacion standard\n" + "Introduce una opcion: ");
				opcion = Read.factChar();

				if(opcion == '1') {
					//SUIT

					System.out.print("¿Cuántas habitaciones deseas reservar?: ");
					readAmount = Read.factInt();

					//Se carga el hotel y la cantidad solicitada por el usuario
					bookroom.buyRoomSuit(catalogue, readHotel, readAmount);

				}else if(opcion == '2'){
					//STANDARD

					System.out.print("¿Cuántas habitaciones deseas reservar?: ");
					readAmount = Read.factInt();

					//Se carga el hotel y la cantidad solicitada por el usuario
					bookroom.buyRoomStandard(catalogue, readHotel, readAmount);

				}else {
					System.out.print("Opción incorrecta");
				}

				break;

			case 3:

				//TOTAL DE DINERO GASTADO EN LA APP

				System.out.println(bookroom.totalPrice() +" €");
				break;

			case 4:

				int c;

				System.out.println (" ");
				System.out.println(" 1) Madrid \n 2) Sevilla \n 3) Barcelona \n 4) Valladolid \n 5) Zaragoza \n 6) Oviedo \n "
						+ "7) Santander \n 8) Toledo \n 9) Logroño \n 10) Pamplona \n 11) Valencia \n 12) Vitoria \n"
						+ " 0) Salir");

				System.out.println (" ");
				System.out.print("Introduce una opcion: ");
				c = Read.factInt();

				if (c == 1 || c == 2 || c == 3 || c == 3 || c == 4 || c == 5 || c == 6 || c == 7 || c == 8 ||
						c == 9 || c == 10 || c == 11 || c == 12 ) {

					if(c == 1) {

						nameCity = "Madrid";
						bookroom.searchCity(catalogue, nameCity);	

						System.out.println (" ");
						System.out.print("¿Quieres reservar un hotel en " + nameCity + "? S/N: ");
						answer = Read.factChar();

						if(answer == 'S' || answer == 's') {

							System.out.println("¿En qué hotel quieres reservar una habitación?");
							System.out.println (" ");
							bookroom.showHotelsNameCity(catalogue, nameCity);

							System.out.print("Introduce el número del hotel que quieras reservar una habitación: ");
							readHotel = Read.factInt();

							System.out.println (" ");
							System.out.print("Qué prefieres reservar?\n" + "1) Habitación suit\n" + "2) Habitacion standard\n" + "Introduce una opcion: ");
							opcion = Read.factChar();
							System.out.println (" ");

							if(opcion == '1') {
								//SUIT

								System.out.print("¿Cuántas habitaciones deseas reservar?: ");
								readAmount = Read.factInt();

								bookroom.buyRoomSuit(catalogue, readHotel, readAmount);

							}else if(opcion == '2'){
								//STANDARD

								System.out.print("¿Cuántas habitaciones deseas reservar?: ");
								readAmount = Read.factInt();

								bookroom.buyRoomStandard(catalogue, readHotel, readAmount);

							}else {
								System.out.print("Opción incorrecta");
							}

						}
					} else 	if(c == 2) {

						nameCity = "Sevilla";
						bookroom.searchCity(catalogue, nameCity);	

						System.out.println (" ");
						System.out.print("¿Quieres reservar un hotel en " + nameCity + "? S/N: ");
						answer = Read.factChar();

						if(answer == 'S' || answer == 's') {

							System.out.println("¿En qué hotel quieres reservar una habitación?");
							System.out.println (" ");
							bookroom.showHotelsNameCity(catalogue, nameCity);

							System.out.print("Introduce el número del hotel que quieras reservar una habitación: ");
							readHotel = Read.factInt();

							System.out.println (" ");
							System.out.print("Qué prefieres reservar?\n" + "1) Habitación suit\n" + "2) Habitacion standard\n" + "Introduce una opcion: ");
							opcion = Read.factChar();
							System.out.println (" ");

							if(opcion == '1') {
								//SUIT

								System.out.print("¿Cuántas habitaciones deseas reservar?: ");
								readAmount = Read.factInt();

								bookroom.buyRoomSuit(catalogue, readHotel, readAmount);

							}else if(opcion == '2'){
								//STANDARD

								System.out.print("¿Cuántas habitaciones deseas reservar?: ");
								readAmount = Read.factInt();

								bookroom.buyRoomStandard(catalogue, readHotel, readAmount);

							}else {
								System.out.print("Opción incorrecta");
							}

						}
					} else 	if(c == 3) {

						nameCity = "Barcelona";
						bookroom.searchCity(catalogue, nameCity);	

						System.out.println (" ");
						System.out.print("¿Quieres reservar un hotel en " + nameCity + "? S/N: ");
						answer = Read.factChar();

						if(answer == 'S' || answer == 's') {

							System.out.println("¿En qué hotel quieres reservar una habitación?");
							System.out.println (" ");
							bookroom.showHotelsNameCity(catalogue, nameCity);

							System.out.print("Introduce el número del hotel que quieras reservar una habitación: ");
							readHotel = Read.factInt();

							System.out.println (" ");
							System.out.print("Qué prefieres reservar?\n" + "1) Habitación suit\n" + "2) Habitacion standard\n" + "Introduce una opcion: ");
							opcion = Read.factChar();
							System.out.println (" ");

							if(opcion == '1') {
								//SUIT

								System.out.print("¿Cuántas habitaciones deseas reservar?: ");
								readAmount = Read.factInt();

								bookroom.buyRoomSuit(catalogue, readHotel, readAmount);

							}else if(opcion == '2'){
								//STANDARD

								System.out.print("¿Cuántas habitaciones deseas reservar?: ");
								readAmount = Read.factInt();

								bookroom.buyRoomStandard(catalogue, readHotel, readAmount);

							}else {
								System.out.print("Opción incorrecta");
							}

						}
					} else if(c == 4) {

						nameCity = "Valladolid";
						bookroom.searchCity(catalogue, nameCity);	

						System.out.println (" ");
						System.out.print("¿Quieres reservar un hotel en " + nameCity + "? S/N: ");
						answer = Read.factChar();

						if(answer == 'S' || answer == 's') {

							System.out.println("¿En qué hotel quieres reservar una habitación?");
							System.out.println (" ");
							bookroom.showHotelsNameCity(catalogue, nameCity);

							System.out.print("Introduce el número del hotel que quieras reservar una habitación: ");
							readHotel = Read.factInt();

							System.out.println (" ");
							System.out.print("Qué prefieres reservar?\n" + "1) Habitación suit\n" + "2) Habitacion standard\n" + "Introduce una opcion: ");
							opcion = Read.factChar();
							System.out.println (" ");

							if(opcion == '1') {
								//SUIT

								System.out.print("¿Cuántas habitaciones deseas reservar?: ");
								readAmount = Read.factInt();

								bookroom.buyRoomSuit(catalogue, readHotel, readAmount);

							}else if(opcion == '2'){
								//STANDARD

								System.out.print("¿Cuántas habitaciones deseas reservar?: ");
								readAmount = Read.factInt();

								bookroom.buyRoomStandard(catalogue, readHotel, readAmount);

							}else {
								System.out.print("Opción incorrecta");
							}

						}
					} else if(c == 5) {

						nameCity = "Zaragoza";
						bookroom.searchCity(catalogue, nameCity);	

						System.out.println (" ");
						System.out.print("¿Quieres reservar un hotel en " + nameCity + "? S/N: ");
						answer = Read.factChar();

						if(answer == 'S' || answer == 's') {

							System.out.println("¿En qué hotel quieres reservar una habitación?");
							System.out.println (" ");
							bookroom.showHotelsNameCity(catalogue, nameCity);

							System.out.print("Introduce el número del hotel que quieras reservar una habitación: ");
							readHotel = Read.factInt();

							System.out.println (" ");
							System.out.print("Qué prefieres reservar?\n" + "1) Habitación suit\n" + "2) Habitacion standard\n" + "Introduce una opcion: ");
							opcion = Read.factChar();
							System.out.println (" ");

							if(opcion == '1') {
								//SUIT

								System.out.print("¿Cuántas habitaciones deseas reservar?: ");
								readAmount = Read.factInt();

								bookroom.buyRoomSuit(catalogue, readHotel, readAmount);

							}else if(opcion == '2'){
								//STANDARD

								System.out.print("¿Cuántas habitaciones deseas reservar?: ");
								readAmount = Read.factInt();

								bookroom.buyRoomStandard(catalogue, readHotel, readAmount);

							}else {
								System.out.print("Opción incorrecta");
							}

						}
					} else if(c == 6) {

						nameCity = "Oviedo";
						bookroom.searchCity(catalogue, nameCity);	

						System.out.println (" ");
						System.out.print("¿Quieres reservar un hotel en " + nameCity + "? S/N: ");
						answer = Read.factChar();

						if(answer == 'S' || answer == 's') {

							System.out.println("¿En qué hotel quieres reservar una habitación?");
							System.out.println (" ");
							bookroom.showHotelsNameCity(catalogue, nameCity);

							System.out.print("Introduce el número del hotel que quieras reservar una habitación: ");
							readHotel = Read.factInt();

							System.out.println (" ");
							System.out.print("Qué prefieres reservar?\n" + "1) Habitación suit\n" + "2) Habitacion standard\n" + "Introduce una opcion: ");
							opcion = Read.factChar();
							System.out.println (" ");

							if(opcion == '1') {
								//SUIT

								System.out.print("¿Cuántas habitaciones deseas reservar?: ");
								readAmount = Read.factInt();

								bookroom.buyRoomSuit(catalogue, readHotel, readAmount);

							}else if(opcion == '2'){
								//STANDARD

								System.out.print("¿Cuántas habitaciones deseas reservar?: ");
								readAmount = Read.factInt();

								bookroom.buyRoomStandard(catalogue, readHotel, readAmount);

							}else {
								System.out.print("Opción incorrecta");
							}

						}
					} else if(c == 7) {

						nameCity = "Santander";
						bookroom.searchCity(catalogue, nameCity);	

						System.out.println (" ");
						System.out.print("¿Quieres reservar un hotel en " + nameCity + "? S/N: ");
						answer = Read.factChar();

						if(answer == 'S' || answer == 's') {

							System.out.println("¿En qué hotel quieres reservar una habitación?");
							System.out.println (" ");
							bookroom.showHotelsNameCity(catalogue, nameCity);

							System.out.print("Introduce el número del hotel que quieras reservar una habitación: ");
							readHotel = Read.factInt();

							System.out.println (" ");
							System.out.print("Qué prefieres reservar?\n" + "1) Habitación suit\n" + "2) Habitacion standard\n" + "Introduce una opcion: ");
							opcion = Read.factChar();
							System.out.println (" ");

							if(opcion == '1') {
								//SUIT

								System.out.print("¿Cuántas habitaciones deseas reservar?: ");
								readAmount = Read.factInt();

								bookroom.buyRoomSuit(catalogue, readHotel, readAmount);

							}else if(opcion == '2'){
								//STANDARD

								System.out.print("¿Cuántas habitaciones deseas reservar?: ");
								readAmount = Read.factInt();

								bookroom.buyRoomStandard(catalogue, readHotel, readAmount);

							}else {
								System.out.print("Opción incorrecta");
							}

						}
					} else if(c == 8) {

						nameCity = "Toledo";
						bookroom.searchCity(catalogue, nameCity);	

						System.out.println (" ");
						System.out.print("¿Quieres reservar un hotel en " + nameCity + "? S/N: ");
						answer = Read.factChar();

						if(answer == 'S' || answer == 's') {

							System.out.println("¿En qué hotel quieres reservar una habitación?");
							System.out.println (" ");
							bookroom.showHotelsNameCity(catalogue, nameCity);

							System.out.print("Introduce el número del hotel que quieras reservar una habitación: ");
							readHotel = Read.factInt();

							System.out.println (" ");
							System.out.print("Qué prefieres reservar?\n" + "1) Habitación suit\n" + "2) Habitacion standard\n" + "Introduce una opcion: ");
							opcion = Read.factChar();
							System.out.println (" ");

							if(opcion == '1') {
								//SUIT

								System.out.print("¿Cuántas habitaciones deseas reservar?: ");
								readAmount = Read.factInt();

								bookroom.buyRoomSuit(catalogue, readHotel, readAmount);

							}else if(opcion == '2'){
								//STANDARD

								System.out.print("¿Cuántas habitaciones deseas reservar?: ");
								readAmount = Read.factInt();

								bookroom.buyRoomStandard(catalogue, readHotel, readAmount);

							}else {
								System.out.print("Opción incorrecta");
							}

						}
					} if(c == 9) {

						nameCity = "Logroño";
						bookroom.searchCity(catalogue, nameCity);	

						System.out.println (" ");
						System.out.print("¿Quieres reservar un hotel en " + nameCity + "? S/N: ");
						answer = Read.factChar();

						if(answer == 'S' || answer == 's') {

							System.out.println("¿En qué hotel quieres reservar una habitación?");
							System.out.println (" ");
							bookroom.showHotelsNameCity(catalogue, nameCity);

							System.out.print("Introduce el número del hotel que quieras reservar una habitación: ");
							readHotel = Read.factInt();

							System.out.println (" ");
							System.out.print("Qué prefieres reservar?\n" + "1) Habitación suit\n" + "2) Habitacion standard\n" + "Introduce una opcion: ");
							opcion = Read.factChar();
							System.out.println (" ");

							if(opcion == '1') {
								//SUIT

								System.out.print("¿Cuántas habitaciones deseas reservar?: ");
								readAmount = Read.factInt();

								bookroom.buyRoomSuit(catalogue, readHotel, readAmount);

							}else if(opcion == '2'){
								//STANDARD

								System.out.print("¿Cuántas habitaciones deseas reservar?: ");
								readAmount = Read.factInt();

								bookroom.buyRoomStandard(catalogue, readHotel, readAmount);

							}else {
								System.out.print("Opción incorrecta");
							}

						}
					} else if(c == 10) {

						nameCity = "Pamplona";
						bookroom.searchCity(catalogue, nameCity);	

						System.out.println (" ");
						System.out.print("¿Quieres reservar un hotel en " + nameCity + "? S/N: ");
						answer = Read.factChar();

						if(answer == 'S' || answer == 's') {

							System.out.println("¿En qué hotel quieres reservar una habitación?");
							System.out.println (" ");
							bookroom.showHotelsNameCity(catalogue, nameCity);

							System.out.print("Introduce el número del hotel que quieras reservar una habitación: ");
							readHotel = Read.factInt();

							System.out.println (" ");
							System.out.print("Qué prefieres reservar?\n" + "1) Habitación suit\n" + "2) Habitacion standard\n" + "Introduce una opcion: ");
							opcion = Read.factChar();
							System.out.println (" ");

							if(opcion == '1') {
								//SUIT

								System.out.print("¿Cuántas habitaciones deseas reservar?: ");
								readAmount = Read.factInt();

								bookroom.buyRoomSuit(catalogue, readHotel, readAmount);

							}else if(opcion == '2'){
								//STANDARD

								System.out.print("¿Cuántas habitaciones deseas reservar?: ");
								readAmount = Read.factInt();

								bookroom.buyRoomStandard(catalogue, readHotel, readAmount);

							}else {
								System.out.print("Opción incorrecta");
							}

						}
					} else if(c == 11) {

						nameCity = "Valencia";
						bookroom.searchCity(catalogue, nameCity);	

						System.out.println (" ");
						System.out.print("¿Quieres reservar un hotel en " + nameCity + "? S/N: ");
						answer = Read.factChar();

						if(answer == 'S' || answer == 's') {

							System.out.println("¿En qué hotel quieres reservar una habitación?");
							System.out.println (" ");
							bookroom.showHotelsNameCity(catalogue, nameCity);

							System.out.print("Introduce el número del hotel que quieras reservar una habitación: ");
							readHotel = Read.factInt();

							System.out.println (" ");
							System.out.print("Qué prefieres reservar?\n" + "1) Habitación suit\n" + "2) Habitacion standard\n" + "Introduce una opcion: ");
							opcion = Read.factChar();
							System.out.println (" ");

							if(opcion == '1') {
								//SUIT

								System.out.print("¿Cuántas habitaciones deseas reservar?: ");
								readAmount = Read.factInt();

								bookroom.buyRoomSuit(catalogue, readHotel, readAmount);

							}else if(opcion == '2'){
								//STANDARD

								System.out.print("¿Cuántas habitaciones deseas reservar?: ");
								readAmount = Read.factInt();

								bookroom.buyRoomStandard(catalogue, readHotel, readAmount);

							}else {
								System.out.print("Opción incorrecta");
							}

						}
					} else if(c == 12) {

						nameCity = "Vitoria";
						bookroom.searchCity(catalogue, nameCity);	

						System.out.println (" ");
						System.out.print("¿Quieres reservar un hotel en " + nameCity + "? S/N: ");
						answer = Read.factChar();

						if(answer == 'S' || answer == 's') {

							System.out.println("¿En qué hotel quieres reservar una habitación?");
							System.out.println (" ");
							bookroom.showHotelsNameCity(catalogue, nameCity);

							System.out.print("Introduce el número del hotel que quieras reservar una habitación: ");
							readHotel = Read.factInt();

							System.out.println (" ");
							System.out.print("Qué prefieres reservar?\n" + "1) Habitación suit\n" + "2) Habitacion standard\n" + "Introduce una opcion: ");
							opcion = Read.factChar();
							System.out.println (" ");

							if(opcion == '1') {
								//SUIT

								System.out.print("¿Cuántas habitaciones deseas reservar?: ");
								readAmount = Read.factInt();

								bookroom.buyRoomSuit(catalogue, readHotel, readAmount);

							}else if(opcion == '2'){
								//STANDARD

								System.out.print("¿Cuántas habitaciones deseas reservar?: ");
								readAmount = Read.factInt();

								bookroom.buyRoomStandard(catalogue, readHotel, readAmount);

							}else {
								System.out.print("Opción incorrecta");
							}

						}
					} 

				}

				break;

			default:

				//Se sale del programa
				find = false;
			}


		} while(find);

		System.out.println("---- Hasta la próxima ----");

	}

}
