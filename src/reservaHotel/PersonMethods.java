package reservaHotel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PersonMethods {
	
	static ResourceBundle my_bundle = ResourceBundle.getBundle("MessagesBundle");
	private Worker workers[] = null;
	private int count = 0;
	Date date = new Date();
	boolean find = true;
	
	//Se instacian y cargan algunos empleados y jefes de hoteles

	Worker empl1 = new Employee("71962630T", "María", "Herrera", "Soho Boutique Opera", "Recepcionista");
	Worker empl2 = new Employee("75482861N", "Juan", "Pérez", "GIbis Budget Oviedo", "Cocinero");
	Worker empl3 = new Employee("31558075M", "Ana", "García", "Mozart", "Limpiadora");
	Worker empl4 = new Employee("70156553K", "Óscar", "Pelaz", "Hotel Malcom and Barret", "Camarero");
	Worker empl5 = new Employee("66443645A", "Pablo", "Vaquero", "Hotel Puerta América", "Socorrista");
	Worker empl6 = new Employee("34136107J", "Sandra", "Ginmo", "Erase un hotel", "Recepcionista");
	Worker empl7 = new Employee("39956430W", "Sara", "Hernández", "Hotel Alfonso XIII", "Socorrista");
	Worker empl8 = new Employee("97124486V", "Paula", "Ortega", "Hostal Vicky", "Limpiadora");
	Worker empl9 = new Employee("42837013L", "Pedro", "López", "NH Madrid Zurbano", "Limpiador");
	Worker empl10 = new Employee("63614029P", "Carmen", "Ruiz", "Vincci Frontaura", "Recepcionista");
	
	//Se crea el array "facts" para contener los trabajadores. Su dimensión viene del número de veces que se
	//instancia el contructor de Worker
	Worker facts[] = new Worker[Worker.dimensionArray];
	
	public PersonMethods() {
		
	}
	
	public PersonMethods(Worker[] worker) {

		this.workers = workers;
	}

	//Métodos

	//Carga los trabajadores
	public Worker[] loadWorkers() {

		return workers;
	}

	//Mostrar los trabajadores guardados
	public void showWorkers (Worker[] workers) {

		for (int i = 0; i < workers.length; i++) {

			System.out.print(workers[i]+"\n--------\n");
		}
	}

	//Muestrar los trabajadores para seleccionarlos con un número asociado
	public void showNumWorkers (Worker[] workers) { 

		for (int i = 0; i < workers.length; i++) {

			System.out.println( i+1 + " "+ workers[i].getName() +", " + workers[i].getSurname()
					+  "\t" + workers[i].getDni());
		}

		System.out.println("\n-------------------\n");
	}
	
	public void opcJobEmployee(int op, int days) {
		
		double salary;
		
		switch(op) {
		case 1:
			//RECEPCIONISTA: 48,90 €/dia
			
			salary = 48.90 * days; 
			System.out.println(my_bundle.getString("salary") + " " + String.format("%.3f", salary) + "€ " + my_bundle.getString("salary2"));

			break;
			
		case 2:
			//COCINERO: 50,5 €/dia
			
			salary = 50.50 * days; 
			System.out.println(my_bundle.getString("salary") + " " + String.format("%.3f", salary) + "€ " + my_bundle.getString("salary2"));

			break;
			
		case 3:
			//LIMPIADORA: 30 €/dia
			
			salary = 30.0 * days; 
			System.out.println(my_bundle.getString("salary") + " " + String.format("%.3f", salary) + "€ " + my_bundle.getString("salary2"));
			break;
			
		case 4:
			//CAMARERO: 35,2 €/dia

			salary = 35.2 * days; 
			System.out.println(my_bundle.getString("salary") + " " + String.format("%.3f", salary) + "€ " + my_bundle.getString("salary2"));

			break;
		
		case 5:
			//SOCORRISTA: 36,5 €/dia

			salary = 36.5 * days; 
			System.out.println(my_bundle.getString("salary") + " " + String.format("%.3f", salary) + "€ " + my_bundle.getString("salary2"));

			break;


		default:

			find = false;
		}
		
	}

	public void showsEmployeeForDni(Worker[] workers, String dni) {

		for(int i = 0; i < workers.length; i++) {

			if (dni.equals((workers[i].getDni()))) {

				System.out.print(workers[i]+"\n--------\n");

			}
		}

	}

	//Se busca si ya hay empleados con esas caracteristicas
	public void SearchHireEmployee(String dni, String name, String surname, String  nameHotel, String job) {

		for (int i = 0; i < this.count; i++) {

			if (dni.equals(this.facts[i].getDni())) {
				System.out.println(my_bundle.getString("empldni"));
			}
		}

	}
	
	//El jefe contrata a nuevos empleados
	public void newEmployeeBoss(String dni, String name, String surname, String  nameHotel, String job) {
		
		if (count < 100) {
			
			//Ecommerce hotel12 = new Hotel("Hostal Vicky", "Marte 2, Barajas", "Madrid", 
			//80, 50, 5, 50, 2, true, true, 70, false);
			
			this.facts[count] = new Employee();
			this.facts[count].setDni(dni);
			this.facts[count].setName(name);
			this.facts[count].setSurname(surname);
			this.facts[count].setNameHotel(nameHotel);
			this.facts[count].setJob(job);
			
			this.count++;
		}else {
			System.out.println(my_bundle.getString("emplnewnot"));
		}	
		
	}
	
	//Muestra los empleados
	public void showE() {

		for (int i = 0; i < this.count; i++) {

			System.out.println(this.facts[i].getDni() + "   \t" + 
					 this.facts[i].getName() + ",  " +
					this.facts[i].getSurname() + "\n" + " " +
					my_bundle.getString("hotel") + ": " + this.facts[i].getNameHotel() + "\n" +
					this.facts[i].getJob() + "\n" );
			System.out.println("--------");
		}
	}
	
	//Busca a empleados por dni
	public void SearchallEmployee(String dni) {
		
		 boolean find = true;

	        for (int i = 0; i < count; i++) {
	        	
	        	if (dni.equals(this.facts[i].getDni())) {
	        	
	        		System.out.println("-------------------------------------------------");           	
	        		System.out.println(my_bundle.getString("dni") + " " + this.facts[i].getDni() + "\n" +
	        				my_bundle.getString("name") + " " + this.facts[i].getName() + "\n" + 
	        				my_bundle.getString("surname") + " " + this.facts[i].getSurname() + "\n" + 
	        				my_bundle.getString("namehotel") + " " + this.facts[i].getNameHotel() + "\n" +
	        				my_bundle.getString("workstation") + " " + this.facts[i].getJob());
	        		System.out.println("-------------------------------------------------");

	        		find = true;
	        	}
	        }
	        if (!find) {
	        	System.out.println("");
	        }
	}
	
	//elimina a empleados de la lista => los despiden
	public void fireEmployee() throws IOException {
		
		PersonMethods pm = new PersonMethods();
		
		 boolean find = false;
		
		//mostramos los empleados para ver quienes hay
		pm.showE();
		
		//metemos el dni del empleado a despedir     
		System.out.println(my_bundle.getString("dni2") + " ");
		String remove = Read.fact();
		
		if (count == 0) {
		    System.out.println(my_bundle.getString("noemployee"));
		} else {
			for (int i = 0; i < count; i++) {

				if (remove.equals(this.facts[i].getDni())) {
					System.out.println(i + 1 + ". " + my_bundle.getString("dni") + " " + this.facts[i].getDni() + "\n" +
							my_bundle.getString("name") + " " + this.facts[i].getName() + "\n" + 
							my_bundle.getString("surname") + " " + this.facts[i].getSurname() + "\n" + 
							my_bundle.getString("namehotel") + " " +	this.facts[i].getNameHotel() + "\n" +
							my_bundle.getString("workstation") + " " + this.facts[i].getJob());

					find = true;
				}
		    }
		    if (find) {
		    	
		        System.out.print(my_bundle.getString("fireemployee")+ " ");
		        int remove_num = Read.factInt();
		        remove_num--;
		        
		        System.out.print(my_bundle.getString("questionfire") + " ");
		        
		        String answer;
		        answer = Read.fact();
		        answer = answer.toUpperCase();
		        
		        if (answer.equals(my_bundle.getString("yes"))) {
		        	
		            Worker[] temporal = new Worker[99];

		            for (int i = 0; i < this.count; i++) {
		            }
		            this.count--;
		            System.out.println(my_bundle.getString("fire"));
		            
		            for (int j = 0; j < this.count; j++) {
		                this.facts[j] = temporal[j];

		            }

		        }

		    } else {
		        System.out.println(my_bundle.getString("fire2"));
		    }
		}
	}

}
