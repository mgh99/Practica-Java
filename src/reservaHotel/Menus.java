package org.reshotel;

import java.util.ResourceBundle;

public class Menus {

	//se puede cambiar el idioma
	static ResourceBundle myBundle = ResourceBundle.getBundle("MessagesBundle", Internacionalization.getCurrentLocale());
	int op;
	
	//Menu de registro
	public static void menulogin() {
		
		System.out.println(" ");
		System.out.println("1) " + myBundle.getString("id1"));
		System.out.println("2) " + myBundle.getString("id2"));
		System.out.println("3) " + myBundle.getString("id3"));
		System.out.println("4) " + myBundle.getString("id4"));
		System.out.println("5) " + myBundle.getString("id5"));
		System.out.print(myBundle.getString("option0"));
		System.out.println("  --> " + myBundle.getString("other"));
		System.out.println("-----------------------------------------");
		System.out.print(myBundle.getString("option"));
		
	}
	
	// Menu clientes y trabajadores
	public static void menu1 () {
		
		System.out.println(" ");
		System.out.println("-- " + myBundle.getString("menuapp") + " --");
		System.out.println("1) " + myBundle.getString("clientmin"));
		System.out.println("2) " + myBundle.getString("workermin"));
		System.out.println("3) " + myBundle.getString("others"));
		System.out.print(myBundle.getString("option0"));
		System.out.println("  --> " + myBundle.getString("other"));
		System.out.println("-----------------------------------------");
		System.out.print(myBundle.getString("option"));	
		
		/* op = JOptionPane.showInputDialog(("-- " + my_bundle.getString("menuapp") + " --" + 
					"\n" + "1) " + my_bundle.getString("clientmin") + "\n" + 
					"2) " + my_bundle.getString("workermin") + "\n" + my_bundle.getString("option0") + " " +
					" --> " + my_bundle.getString("other") + "\n\n" + my_bundle.getString("option")));*/
		
	}

	// Menu clientes
	public static void menuClient () {
		
		System.out.println("-------------------------");
		System.out.println("-- " + myBundle.getString("clientmay") + " --");
		System.out.println("-------------------------");
		
		System.out.println(" ");
		System.out.println("-- " + myBundle.getString("menuapp") + " --");
		System.out.println("1) " + myBundle.getString("option1"));
		System.out.println("2) " + myBundle.getString("option2"));
		System.out.println("3) " + myBundle.getString("option3"));
		System.out.println("4) " + myBundle.getString("option4"));
		System.out.println("5) " + myBundle.getString("option6"));
		System.out.print(myBundle.getString("option0"));
		System.out.println("  --> " + myBundle.getString("other"));
		System.out.println("-----------------------------------------");
		System.out.print(myBundle.getString("option"));
		
	}
	
	// Menu de trabajadores
	public static void menu3() {
		
		System.out.println(" ");
		System.out.println("-- " + myBundle.getString("menuapp") + " --");
		System.out.println("1) " + myBundle.getString("employee"));
		System.out.println("2) " + myBundle.getString("boss"));
		System.out.print(myBundle.getString("option0"));
		System.out.println("  --> " + myBundle.getString("other"));
		System.out.println("-----------------------------------------");
		System.out.print(myBundle.getString("option"));
		
		
	}
	
	public static void menu4() {
		
		System.out.println(" ");
		System.out.println("1) " + myBundle.getString("qemployee"));
		System.out.println("2) " + myBundle.getString("qchange"));
		System.out.println("3) " + myBundle.getString("qmoney"));
		System.out.print(myBundle.getString("option0"));
		System.out.println("  --> " + myBundle.getString("other"));
		System.out.println("-----------------------------------------");
		System.out.print(myBundle.getString("option"));
		
	}
	
	// Menu de información sobre el programa
	public static void menuInfo() {
		
		System.out.println(myBundle.getString("title"));
		System.out.println("---------------------------------------------------------");
		System.out.println("-" + myBundle.getString("program1"));
		System.out.println("-" + myBundle.getString("program2"));
		System.out.println("-" + myBundle.getString("program3"));
		System.out.println("---------------------------------------------------------");
		System.out.println("\t" + myBundle.getString("clientinfo"));
		System.out.println(" *" + myBundle.getString("client1"));
		System.out.println(" *" + myBundle.getString("client2"));
		System.out.println(" *" + myBundle.getString("client3"));
		System.out.println(" *" + myBundle.getString("client4"));
		System.out.println("\t" + myBundle.getString("workerinfo"));
		System.out.println(" *" + myBundle.getString("worker1"));
		System.out.println(" *" + myBundle.getString("worker2"));
		System.out.println("\t" + myBundle.getString("workerinfo2"));
		System.out.println(" *" + myBundle.getString("worker3"));
		System.out.println(" *" + myBundle.getString("worker"));
		System.out.println(" ");
		
	}
	
	// Menu empleados 1
	public static void menuEmpl1() {
		
		System.out.println("-------------------------");
		System.out.println("-- " + myBundle.getString("workermay") + " --");
		System.out.println("-------------------------");
		System.out.println(" ");
			
	}
	
	// Menu propietarios
	public static void menuBoss() {
		
		System.out.println("-------------------------");
		System.out.println("-- " + myBundle.getString("bossmay") + " --");
		System.out.println("-------------------------");
		System.out.println(" ");
		
	}
	
	// Menu empleados 2
	public static void menuEmpl2() {
		
		System.out.println(" ");
		System.out.println("1) " + myBundle.getString(""));
		System.out.println("2) " + myBundle.getString(""));
		System.out.println("3) " + myBundle.getString(""));
		System.out.print(myBundle.getString("option0"));
		System.out.println("  --> " + myBundle.getString("other"));
		System.out.println("-----------------------------------------");
		System.out.println(myBundle.getString("option"));
		
		
	}
	
	public static void jobEmployee() {
		
		System.out.println(" ");
		System.out.println( myBundle.getString("menujob"));
		System.out.println( myBundle.getString("opcjob"));
		System.out.println("-----------------------------------------");
		System.out.print(myBundle.getString("option"));

	}

	public static String menuBoss2() {

		return (" " + "\n" + myBundle.getString("menuboss2") + "\n" + myBundle.getString("option0") + "  --> " + myBundle.getString("other") +
				"\n" + "-----------------------------------------" + "\n" + myBundle.getString("option"));
		
	}
	
	public static void citiesH() {
		
		System.out.println(" ");
		System.out.println(" Madrid \n Sevilla \n Barcelona \n Valladolid \n Zaragoza \n Oviedo \n "
		  + "Santander \n Toledo \n Logroño \n Pamplona \n Valencia \n Vitoria \n");
		System.out.println("-----------------------------------------");
		System.out.print(myBundle.getString("citiesh") + " ");
	}
	

}

