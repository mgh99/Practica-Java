package reservaHotel;

import java.util.Locale;
import java.util.ResourceBundle;

public class Menus {

	//se puede cambiar el idioma
	static ResourceBundle my_bundle = ResourceBundle.getBundle("MessagesBundle", Internacionalization.getCurrentLocale());
	
	// Menu clientes y trabajadores
	public static void menu1 () {
		
		System.out.println(" ");
		System.out.println("-- " + my_bundle.getString("menuapp") + " --");
		System.out.println("1) " + my_bundle.getString("clientmin"));
		System.out.println("2) " + my_bundle.getString("workermin"));
		System.out.print(my_bundle.getString("option0"));
		System.out.println("  --> " + my_bundle.getString("other"));
		System.out.println("-----------------------------------------");
		System.out.print(my_bundle.getString("option"));	
		
	}

	// Menu clientes
	public static void menuClient () {
		
		System.out.println("-------------------------");
		System.out.println("-- " + my_bundle.getString("clientmay") + " --");
		System.out.println("-------------------------");
		
		System.out.println(" ");
		System.out.println("-- " + my_bundle.getString("menuapp") + " --");
		System.out.println("1) " + my_bundle.getString("option1"));
		System.out.println("2) " + my_bundle.getString("option2"));
		System.out.println("3) " + my_bundle.getString("option3"));
		System.out.println("4) " + my_bundle.getString("option4"));
		System.out.println("5) " + my_bundle.getString("option5"));
		System.out.println("6) " + my_bundle.getString("option6"));
		System.out.print(my_bundle.getString("option0"));
		System.out.println("  --> " + my_bundle.getString("other"));
		System.out.println("-----------------------------------------");
		System.out.print(my_bundle.getString("option"));
		
	}
	
	// Menu de trabajadores
	public static void menu3() {
		
		System.out.println(" ");
		System.out.println("-- " + my_bundle.getString("menuapp") + " --");
		System.out.println("1) " + my_bundle.getString("employee"));
		System.out.println("2) " + my_bundle.getString("boss"));
		System.out.print(my_bundle.getString("option0"));
		System.out.println("  --> " + my_bundle.getString("other"));
		System.out.println("-----------------------------------------");
		System.out.print(my_bundle.getString("option"));
		
		
	}
	
	public static void menu4() {
		
		System.out.println(" ");
		System.out.println("1) " + my_bundle.getString("qemployee"));
		System.out.println("2) " + my_bundle.getString("qchange"));
		System.out.println("3) " + my_bundle.getString("qmoney"));
		System.out.print(my_bundle.getString("option0"));
		System.out.println("  --> " + my_bundle.getString("other"));
		System.out.println("-----------------------------------------");
		System.out.print(my_bundle.getString("option"));
		
	}
	
	// Menu de información sobre el programa
	public static void menuInfo() {
		
			System.out.println(my_bundle.getString("title"));
		System.out.println("---------------------------------------------------------");
		System.out.println("-" + my_bundle.getString("program1"));
		System.out.println("-" + my_bundle.getString("program2"));
		System.out.println("-" + my_bundle.getString("program3"));
		System.out.println("---------------------------------------------------------");
		System.out.println("\t" + my_bundle.getString("clientinfo"));
		System.out.println(" *" + my_bundle.getString("client1"));
		System.out.println(" *" + my_bundle.getString("client2"));
		System.out.println(" *" + my_bundle.getString("client3"));
		System.out.println(" *" + my_bundle.getString("client4"));
		System.out.println("\t" + my_bundle.getString("workerinfo"));
		System.out.println(" *" + my_bundle.getString("worker1"));
		System.out.println(" *" + my_bundle.getString("worker2"));
		System.out.println("\t" + my_bundle.getString("workerinfo2"));
		System.out.println(" *" + my_bundle.getString("worker3"));
		System.out.println(" *" + my_bundle.getString("worker"));
		System.out.println(" ");
		
	}
	
	// Menu empleados 1
	public static void menuEmpl1() {
		
		System.out.println("-------------------------");
		System.out.println("-- " + my_bundle.getString("workermay") + " --");
		System.out.println("-------------------------");
		System.out.println(" ");
			
	}
	
	// Menu propietarios
	public static void menuBoss() {
		
		System.out.println("-------------------------");
		System.out.println("-- " + my_bundle.getString("bossmay") + " --");
		System.out.println("-------------------------");
		System.out.println(" ");
		
	}
	
	// Menu empleados 2
	public static void menuEmpl2() {
		
		System.out.println(" ");
		System.out.println("1) " + my_bundle.getString(""));
		System.out.println("2) " + my_bundle.getString(""));
		System.out.println("3) " + my_bundle.getString(""));
		System.out.print(my_bundle.getString("option0"));
		System.out.println("  --> " + my_bundle.getString("other"));
		System.out.println("-----------------------------------------");
		System.out.println(my_bundle.getString("option"));
		
		
	}
	
	public static void jobEmployee() {
		
		System.out.println(" ");
		System.out.println( my_bundle.getString("menujob"));
		System.out.println( my_bundle.getString("opcjob"));
		System.out.println("-----------------------------------------");
		System.out.print(my_bundle.getString("option"));
		
	}
	
	public static void menuBoss2() {
		
		System.out.println(" ");
		System.out.println(my_bundle.getString("menuboss2"));
		System.out.print(my_bundle.getString("option0"));
		System.out.println("  --> " + my_bundle.getString("other"));
		System.out.println("-----------------------------------------");
		System.out.print(my_bundle.getString("option"));
		
	}
	
	public static void citiesH() {
		
		System.out.println(" ");
		System.out.println(" Madrid \n Sevilla \n Barcelona \n Valladolid \n Zaragoza \n Oviedo \n "
		  + "Santander \n Toledo \n Logroño \n Pamplona \n Valencia \n Vitoria \n");
		System.out.println("-----------------------------------------");
		System.out.print(my_bundle.getString("citiesH") + " ");
	}
	

}
