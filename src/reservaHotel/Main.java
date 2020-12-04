package org.reshotel;

import java.util.*;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.reshotel.Register.personRegister;

public class Main {

	//Inicializar los mensajes de la internacionalización
	static ResourceBundle myBundle = ResourceBundle.getBundle("MessagesBundle"); 

	public static void main(String[] args) throws ParseException, IOException, InvalidKeyException, NoSuchAlgorithmException, NoSuchPaddingException, IllegalBlockSizeException, BadPaddingException {

		Menus.menuInfo();

		@SuppressWarnings("unused")
		boolean find1 = true, find2 = true, find3 = true, find4 = true;
		int readHotel = 0; // Variable para seleccionar el hotel que quieres reservar
		int readAmount = 1; //Variables para seleccionar el número de habitaciones que quieres reservar
		char opcion = '1', answer = 's';
		String dni = null, id, password;
		String name, adress, cityH, job, surname, nameHotel, nameCity;
		float  priceSuite, priceStandard;
		int numRoomSuite, numRoomStandard, stars, capacity, op;
		boolean openClose, avaible, swimmingPool;

		//Se crea el objeto "bookroom" para reservar (mostrar todos los hoteles o por ciudades,
		// reservar habiatciones de hoteles, la cantidad de habitacones y mostrar el dinero gastado en total)
		BookRoom bookroom = new BookRoom();
		PersonMethods pm = new PersonMethods();
		Cities city = new Cities();
		AESSymetricCrypto cripto = new AESSymetricCrypto();

		@SuppressWarnings("unused")
		Ecommerce ecom = new Ecommerce();

		//Se crea el objeto "localdate" para asignar una fecha actual y 
		//hasta que día dura la reserva, teniendo en cuenta que el numero de habitaciones se refiere
		//a una por noche
		Date localdate = new Date();

		//Se rellena el array catalogue para los hoteles
		bookroom.catalogue[0] = bookroom.hotel1;     bookroom.catalogue[1] = bookroom.hotel2;     bookroom.catalogue[2] = bookroom.hotel3;     bookroom.catalogue[3] = bookroom.hotel4;
		bookroom.catalogue[4] = bookroom.hotel5;     bookroom.catalogue[5] = bookroom.hotel6;     bookroom.catalogue[6] = bookroom.hotel7;     bookroom.catalogue[7] = bookroom.hotel8;
		bookroom.catalogue[8] = bookroom.hotel9;     bookroom.catalogue[9] = bookroom.hotel10;    bookroom.catalogue[10] = bookroom.hotel11;   bookroom.catalogue[11] = bookroom.hotel12;
		bookroom.catalogue[12] = bookroom.hotel13;   bookroom.catalogue[13] = bookroom.hotel14;   bookroom.catalogue[14] = bookroom.hotel15;   bookroom.catalogue[15] = bookroom.hotel16;
		bookroom.catalogue[16] = bookroom.hotel17;   bookroom.catalogue[17] = bookroom.hotel18;   bookroom.catalogue[18] = bookroom.hotel19;   bookroom.catalogue[19] = bookroom.hotel20;
		bookroom.catalogue[20] = bookroom.hotel21;   bookroom.catalogue[21] = bookroom.hotel22;   bookroom.catalogue[22] = bookroom.hotel23;   bookroom.catalogue[23] = bookroom.hotel24;
		bookroom.catalogue[24] = bookroom.hotel25;   bookroom.catalogue[25] = bookroom.hotel26;   bookroom.catalogue[26] = bookroom.hotel27;   bookroom.catalogue[27] = bookroom.hotel28;
		bookroom.catalogue[28] = bookroom.hotel29;   bookroom.catalogue[29] = bookroom.hotel30;   bookroom.catalogue[30] = bookroom.hotel31;   bookroom.catalogue[31] = bookroom.hotel32;
		bookroom.catalogue[32] = bookroom.hotel33;   bookroom.catalogue[33] = bookroom.hotel34;   bookroom.catalogue[34] = bookroom.hotel35;   bookroom.catalogue[35] = bookroom.hotel36;
		bookroom.catalogue[36] = bookroom.hotel37;   bookroom.catalogue[37] = bookroom.hotel38;   bookroom.catalogue[38] = bookroom.hotel39;   bookroom.catalogue[39] = bookroom.hotel40;
		bookroom.catalogue[40] = bookroom.hotel41;   bookroom.catalogue[41] = bookroom.hotel42;   bookroom.catalogue[42] = bookroom.hotel43;   bookroom.catalogue[43] = bookroom.hotel44;
		bookroom.catalogue[44] = bookroom.hotel45;   bookroom.catalogue[45] = bookroom.hotel46;   bookroom.catalogue[46] = bookroom.hotel47;   bookroom.catalogue[47] = bookroom.hotel48;
		bookroom.catalogue[48] = bookroom.hotel49;   bookroom.catalogue[49] = bookroom.hotel50;   bookroom.catalogue[50] = bookroom.hotel51;

		//Se rellena el array facts para los empleados
		pm.facts[0] = pm.empl1;      pm.facts[1] = pm.empl2;    pm.facts[2] = pm.empl3;     pm.facts[3] = pm.empl4;     pm.facts[4] = pm.empl5;
		pm.facts[5] = pm.empl6;      pm.facts[6] = pm.empl7;    pm.facts[7] = pm.empl8;     pm.facts[8] = pm.empl9;     pm.facts[9] = pm.empl10;

		//Llamamos a la interface de las contraseñas
		ArrayList<Register> Reglist = new ArrayList<>();

		//Muestra la fecha del día actual
		localdate.dateNow();

		do {

			try {

				Menus.menu1();
				op = Read.factInt();

				switch(op) {

				case 1:
					//{
					//CLIENTE
					//do {

					Menus.menulogin();
					op = Read.factInt();

					switch(op) {

					case 1:
						//INICIAR SESION

						System.out.print(myBundle.getString("iduser"));
						id = Read.fact();
						System.out.print(myBundle.getString("passworduser"));
						password = Read.fact();

						if (Register.login(id, password, Reglist)){			

							try {

								do{

									Menus.menuClient();
									op = Read.factInt();
									switch (op) {

									case 1:
										//MOSTRAR TODOS LOS HOTELES GUARDADOS

										bookroom.showHotels(bookroom.catalogue);
										break;
									case 2:
										//RESERVAR HABITACIONES DE LOS HOTELES GUARDADOS

										System.out.println(myBundle.getString("roomhotel"));
										bookroom.showHotelsName(bookroom.catalogue);

										System.out.print(myBundle.getString("numhotel"));
										readHotel = Read.factInt();

										System.out.print(myBundle.getString("prefer"));
										opcion = Read.factChar();

										bookroom.bookRoomSave(readHotel, readAmount, opcion);
										break;
									case 4:
										//TOTAL DE DINERO GASTADO EN LA APP

										System.out.println(bookroom.totalPrice() +" €");
										break;
									case 3:
										//BUSCAR HOTELES POR CIUDADES

										int c;

										System.out.println (" ");
										System.out.println(" 1) Madrid \n 2) Sevilla \n 3) Barcelona \n 4) Valladolid \n 5) Zaragoza \n 6) Oviedo \n "
												+ "7) Santander \n 8) Toledo \n 9) Logroño \n 10) Pamplona \n 11) Valencia \n 12) Vitoria \n"
												+ " 0) Salir");

										System.out.println (" ");
										System.out.print(myBundle.getString("option") + " ");
										c = Read.factInt();

										if (c == 1 || c == 2 || c == 3 || c == 3 || c == 4 || c == 5 || c == 6 || c == 7 || c == 8 ||
												c == 9 || c == 10 || c == 11 || c == 12 ) {

											if(c == 1) {
												nameCity = "Madrid";
												bookroom.searchCity(bookroom.catalogue, nameCity);
												city.bookingHotelCity(bookroom.catalogue, nameCity, answer, opcion, readHotel, readAmount);

											} else if(c == 2) {
												nameCity = "Sevilla";
												bookroom.searchCity(bookroom.catalogue, nameCity);	
												city.bookingHotelCity(bookroom.catalogue, nameCity, answer, opcion, readHotel, readAmount);

											} else 	if(c == 3) {
												nameCity = "Barcelona";
												bookroom.searchCity(bookroom.catalogue, nameCity);	
												city.bookingHotelCity(bookroom.catalogue, nameCity, answer, opcion, readHotel, readAmount);

											} else if(c == 4) {
												nameCity = "Valladolid";
												bookroom.searchCity(bookroom.catalogue, nameCity);	
												city.bookingHotelCity(bookroom.catalogue, nameCity, answer, opcion, readHotel, readAmount);

											} else if(c == 5) {
												nameCity = "Zaragoza";
												bookroom.searchCity(bookroom.catalogue, nameCity);	
												city.bookingHotelCity(bookroom.catalogue, nameCity, answer, opcion, readHotel, readAmount);

											} else if(c == 6) {
												nameCity = "Oviedo";
												bookroom.searchCity(bookroom.catalogue, nameCity);	
												city.bookingHotelCity(bookroom.catalogue, nameCity, answer, opcion, readHotel, readAmount);

											} else if(c == 7) {
												nameCity = "Santander";
												bookroom.searchCity(bookroom.catalogue, nameCity);	
												city.bookingHotelCity(bookroom.catalogue, nameCity, answer, opcion, readHotel, readAmount);

											} else if(c == 8) {
												nameCity = "Toledo";
												bookroom.searchCity(bookroom.catalogue, nameCity);	
												city.bookingHotelCity(bookroom.catalogue, nameCity, answer, opcion, readHotel, readAmount);

											} if(c == 9) {
												nameCity = "Logroño";
												bookroom.searchCity(bookroom.catalogue, nameCity);	
												city.bookingHotelCity(bookroom.catalogue, nameCity, answer, opcion, readHotel, readAmount);

											} else if(c == 10) {
												nameCity = "Pamplona";
												bookroom.searchCity(bookroom.catalogue, nameCity);	
												city.bookingHotelCity(bookroom.catalogue, nameCity, answer, opcion, readHotel, readAmount);

											} else if(c == 11) {
												nameCity = "Valencia";
												bookroom.searchCity(bookroom.catalogue, nameCity);	
												city.bookingHotelCity(bookroom.catalogue, nameCity, answer, opcion, readHotel, readAmount);

											} else if(c == 12) {
												nameCity = "Vitoria";
												bookroom.searchCity(bookroom.catalogue, nameCity);	
												city.bookingHotelCity(bookroom.catalogue, nameCity, answer, opcion, readHotel, readAmount);
											}
										}
										break;
									case 5:
										//CAMBIAR EL IDIOMA	

										System.out.println("---" + myBundle.getString("title") + "---");
										System.out.println("Current Locale: " + Internacionalization.getCurrentLocale());							
										Internacionalization.selectLanguage();	
										break;

									default:
										//Se va al menu de clientes o trabajadores
										find3 = false;
									}

								}while(!find3);

							} catch (InputMismatchException e) {
								System.out.println(" ");
							}

						}


						break;
					case 2:
						//REGISTRAR USUARIO

						System.out.print(myBundle.getString("name"));
						name = Read.fact();

						System.out.print(myBundle.getString("surname"));
						surname = Read.fact();

						System.out.print(myBundle.getString("id"));
						id = Read.fact();

						System.out.print(myBundle.getString("password"));
						password = Read.fact();

						personRegister personRegister = new personRegister(name, surname , id , password);
						Register register = new Register(personRegister);
						Reglist.add(register);

						break;
					case 3:
						//LISTA DE USUARIOS

						if(Reglist.isEmpty()) {

							System.out.println(myBundle.getString("id7"));
						} else {
							for(int i = 0; i < Reglist.size(); i++) {

								System.out.println(i + " - " + Reglist.get(i).toString());
							}
						}

						break;
					case 4:
						//ELIMINAR USUARIO

						if(Reglist.isEmpty()) {

							System.out.println(myBundle.getString("id7"));
						} else {
							for(int i = 0; i < Reglist.size(); i++) {

								System.out.println(i + " - " + Reglist.get(i).toString());
							}

							System.out.print(myBundle.getString("id8")); 

							if(op > Reglist.size()) {
								System.out.println(myBundle.getString("id7"));

							} else {
								Reglist.remove(op);

								System.out.println(myBundle.getString("id9")); 
							}
						}

						break;
					case 5:
						//CAMBIAR DE IDIOMA

						System.out.println("---" + myBundle.getString("title") + "---");
						System.out.println("Current Locale: " + Internacionalization.getCurrentLocale());							
						Internacionalization.selectLanguage();	

						break;
					default:
						find1 = false;
					}



					//}  while(find1);
					break;

					//} // fin case 1 cliente

				case 2:
					
/*---------------------------------------------------------------------------------------------------					
---------------------------------------------- TRABAJADOR -------------------------------------------
-----------------------------------------------------------------------------------------------------*/
					
					Menus.menulogin();
					op = Read.factInt();

					switch(op) {

					case 1:
						//INICIAR SESION

						System.out.print(myBundle.getString("iduser"));
						id = Read.fact();
						System.out.print(myBundle.getString("passworduser"));
						password = Read.fact();

						if (Register.login(id, password, Reglist)){			

							Menus.menu3();
							op = Read.factInt();

							switch(op) {
							case 1:
								do {
									Menus.menuEmpl1();
									Menus.menu4();
									op = Read.factInt();

									switch (op) {
									case 1:
										//MOSTRAR TODOS LOS EMPLEADOS GUARDADOS

										System.out.println(" ");
										pm.showWorkers(pm.facts);
										break;
									case 2:
										//BUSCAR EMPLEADOS Y MOSTRARLOS POR PANTALLA

										pm.showNumWorkers(pm.facts);
										System.out.print(myBundle.getString("dni3") + " ");
										dni = Read.fact();
										pm.showsEmployeeForDni(pm.facts, dni);
										break;
									case 3:
										//CONSULTAR SUELDO

										//fecha de contratación del trbajador
										String iniDate = "";
										//fecha actual
										String todayDate = "";

										SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

										System.out.print(myBundle.getString("datestart") + " ");
										iniDate = Read.fact();
										java.util.Date inicialDate = dateFormat.parse(iniDate);

										System.out.print(myBundle.getString("dateend") + " ");
										todayDate = Read.fact();
										java.util.Date finalDate = dateFormat.parse(todayDate);
										//Date.check(todayDate);*/

										//Calculamos el número de días estre las fechas
										//86400000 son los milisegundos en 1 día
										int days = (int) ((finalDate.getTime() - inicialDate.getTime()) / 86400000);

										//preguntar que puesto de trabajo tiene
										Menus.jobEmployee();	
										op = Read.factInt();
										System.out.println(" ");

										pm.opcJobEmployee(op, days);
										break;

									default:
										find3 = false;
									}

								}while(find3);
								break;

							case 2:
								do {
									
/*---------------------------------------------------------------------------------------------------					
---------------------------------------------- PROPIETARIO -------------------------------------------
-----------------------------------------------------------------------------------------------------*/
									
									//menu de propietario encriptado
									cripto.encriptDesc();
									op = Read.factInt();

									switch(op) {
									case 1:
										//MOSTRAR TODOS LOS EMPLEADOS

										System.out.println(" ");
										pm.showWorkers(pm.facts);
										break;

									case 2:
										//MOSTRAR TODOS LOS HOTELES POR CIUDADES

										int c;

										System.out.println (" ");
										System.out.println(" 1) Madrid \n 2) Sevilla \n 3) Barcelona \n 4) Valladolid \n 5) Zaragoza \n 6) Oviedo \n "
												+ "7) Santander \n 8) Toledo \n 9) Logroño \n 10) Pamplona \n 11) Valencia \n 12) Vitoria \n");

										System.out.println (" ");
										System.out.print(myBundle.getString("option") + " ");
										c = Read.factInt();
										System.out.println (" ");

										if (c == 1 || c == 2 || c == 3 || c == 3 || c == 4 || c == 5 || c == 6 || c == 7 || c == 8 ||
												c == 9 || c == 10 || c == 11 || c == 12 ) {

											if(c == 1) {
												nameCity = "Madrid";
												bookroom.searchCity(bookroom.catalogue, nameCity);

											} else if(c == 2) {
												nameCity = "Sevilla";
												bookroom.searchCity(bookroom.catalogue, nameCity);	

											} else 	if(c == 3) {
												nameCity = "Barcelona";
												bookroom.searchCity(bookroom.catalogue, nameCity);	

											} else if(c == 4) {
												nameCity = "Valladolid";
												bookroom.searchCity(bookroom.catalogue, nameCity);	

											} else if(c == 5) {
												nameCity = "Zaragoza";
												bookroom.searchCity(bookroom.catalogue, nameCity);	

											} else if(c == 6) {
												nameCity = "Oviedo";
												bookroom.searchCity(bookroom.catalogue, nameCity);	

											} else if(c == 7) {
												nameCity = "Santander";
												bookroom.searchCity(bookroom.catalogue, nameCity);

											} else if(c == 8) {
												nameCity = "Toledo";
												bookroom.searchCity(bookroom.catalogue, nameCity);	

											} if(c == 9) {
												nameCity = "Logroño";
												bookroom.searchCity(bookroom.catalogue, nameCity);

											} else if(c == 10) {
												nameCity = "Pamplona";
												bookroom.searchCity(bookroom.catalogue, nameCity);	

											} else if(c == 11) {
												nameCity = "Valencia";
												bookroom.searchCity(bookroom.catalogue, nameCity);	

											} else if(c == 12) {
												nameCity = "Vitoria";
												bookroom.searchCity(bookroom.catalogue, nameCity);	
											}
										}
										break;
									case 3:
										//AÑADIR NUEVO HOTEL 

										System.out.print(myBundle.getString("nameh") + " ");
										name = Read.fact();

										System.out.print(myBundle.getString("adressh") + " ");
										adress = Read.fact();   

										System.out.println(myBundle.getString("cityh"));
										Menus.citiesH();
										cityH = Read.fact();

										System.out.print(myBundle.getString("pricesuith") + " ");
										priceSuite = Read.factFloat();  

										System.out.print(myBundle.getString("pricestandh") + " ");
										priceStandard = Read.factFloat();

										System.out.print(myBundle.getString("numsuiteh") + " ");
										numRoomSuite = Read.factInt();

										System.out.print(myBundle.getString("numstandh") + " ");
										numRoomStandard = Read.factInt();

										System.out.print(myBundle.getString("numstarsh") + " ");
										stars = Read.factInt();

										System.out.print(myBundle.getString("opencloseh") + " ");
										openClose = Read.factBoolean();

										System.out.print(myBundle.getString("avaibleh") + " ");
										avaible = Read.factBoolean();

										System.out.print(myBundle.getString("capacityh") + " ");
										capacity = Read.factInt();

										System.out.print(myBundle.getString("swimmingpoolh") + " ");
										swimmingPool = Read.factBoolean();

										bookroom.searchHot(name, adress, cityH, priceSuite, priceStandard, numRoomSuite,
												numRoomStandard, stars, openClose, avaible, capacity, swimmingPool);
										bookroom.newHotelboss(name, adress, cityH, priceSuite, priceStandard, numRoomSuite, 
												numRoomStandard, stars, openClose, avaible, capacity, swimmingPool);
										break;

									case 4:
										//CONTRATAR NUEVOS EMPLEADOS

										System.out.print(myBundle.getString("dni3") + " ");
										dni = Read.fact();

										System.out.print(myBundle.getString("namee") + " ");
										name = Read.fact();

										System.out.print(myBundle.getString("surnamee") + " ");
										surname = Read.fact();

										System.out.print(myBundle.getString("namehotele") + " ");
										nameHotel = Read.fact();

										System.out.print(myBundle.getString("workstatione") + " ");
										job = Read.fact();
										System.out.println(" ");

										pm.searchHireEmployee(dni, name, surname, nameHotel, job);
										pm.newEmployeeBoss(dni, name, surname, nameHotel, job);

										System.out.println(" ");
										System.out.println(myBundle.getString("hiregood"));
										System.out.println(" ");

										pm.showE();
										break;
									case 5:
										//BUSCAR EMPLEADO DNI

										System.out.println(" ");
										System.out.print(myBundle.getString("dni3"));
										dni = Read.fact();
										System.out.println(" ");
										pm.searchallEmployee(dni);	
										break;

									case 6:
										//DESPEDIR A UN EMPLEADO

										System.out.println(" ");
										pm.fireEmployee();
										break;
									case 7:
										//CAMBIAR EL IDIOMA

										System.out.println("---" + myBundle.getString("title") + "---");
										System.out.println("Current Locale: " + Internacionalization.getCurrentLocale());							
										Internacionalization.selectLanguage();
										break;
										
									case 8:
										//LISTA DE JEFES
										
										try {

									        // Se crea un arreglo de cadenas de texto con las palabras que deben ser omitidas
									        String[] textos_a_ignorar = new String[]{"Nombre:", "Hotel:", "Ciudades:", "Edad:", "Empleados:"};

									        // Se llama el método de la clase Main, se envía el archivo y el arreglo
									        new ReadBossHotels().leerArchivo(new File("MyFileReader.txt"), textos_a_ignorar);

									    } catch (FileNotFoundException e) { // si el archivo no se encuentra
									        System.out.println("El jefe no existe");
									    } catch (IOException e) { // si ocurre un error leyendo el archivo
									        System.out.println("Error leyendo el archivo " + e);
									    }

									default:
										//Se sale del programa
										find2 = false;
									}
								}while(find4);
								//}	// el switch de trabajador/propietario	
							default:					
								find2 = false;
							} //switch propietario y empleado

						} // if del login de propietarios y empleados

						break;

					case 2:
						//REGISTRAR USUARIO

						System.out.print(myBundle.getString("name"));
						name = Read.fact();

						System.out.print(myBundle.getString("surname"));
						surname = Read.fact();

						System.out.print(myBundle.getString("id"));
						id = Read.fact();

						System.out.print(myBundle.getString("password"));
						password = Read.fact();

						personRegister personRegister = new personRegister(name, surname , id , password);
						Register register = new Register(personRegister);
						Reglist.add(register);

						break;
					case 3:
						//LISTA DE USUARIOS

						if(Reglist.isEmpty()) {

							System.out.println(myBundle.getString("id7"));
						} else {
							for(int i = 0; i < Reglist.size(); i++) {

								System.out.println(i + " - " + Reglist.get(i).toString());
							}
						}

						break;
					case 4:
						//ELIMINAR USUARIO

						if(Reglist.isEmpty()) {

							System.out.println(myBundle.getString("id7"));
						} else {
							for(int i = 0; i < Reglist.size(); i++) {

								System.out.println(i + " - " + Reglist.get(i).toString());
							}

							System.out.print(myBundle.getString("id8")); 

							if(op > Reglist.size()) {
								System.out.println(myBundle.getString("id7"));

							} else {
								Reglist.remove(op);

								System.out.println(myBundle.getString("id9")); 
							}
						}

						break;
					case 5:
						//CAMBIAR DE IDIOMA

						System.out.println("---" + myBundle.getString("title") + "---");
						System.out.println("Current Locale: " + Internacionalization.getCurrentLocale());							
						Internacionalization.selectLanguage();	

						break;
					default:
						find3 = false;

					}// switch de inicio sesesion propietario/empleados

				default:
					find1 = false;
				}// switch principal

			} catch(InputMismatchException e) {

				System.out.println(" ");
			}

			System.out.println(" ");

		}while(find2);

		//despedida
		System.out.println("---- " + myBundle.getString("final") + " ----");
	}
}
