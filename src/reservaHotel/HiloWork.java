package org.reshotel;

import java.util.ResourceBundle;

public class HiloWork extends Thread{
	
	HiloWork(Runnable target) {
		super(target);	
		
	}
	
	private String name;
	static ResourceBundle myBundle = ResourceBundle.getBundle("MessagesBundle");

	public HiloWork(String name) {
		this.name = name;
	}

	//Calcula el teimpo que tardarían en completar las reservas de las habitaciones en un hotel
	public void procesarCompra(Client client, long timeStamp) {

		System.out.println(myBundle.getString("recepcionist") + " " + this.name + " " +
				myBundle.getString("hilo1") + " " +  client.getName() + " " +
				myBundle.getString("hilo2") + " " + (System.currentTimeMillis() - timeStamp) / 1_000	+
				"seg");

		for (int i = 0; i < client.getShopping().length; i++) { 
				this.esperarXsegundos(client.getShopping()[i]); 
				System.out.println( myBundle.getString("hilo3") + " " + (i + 1) +  
				" -> " + myBundle.getString("hilo4") + " " + (System.currentTimeMillis() - timeStamp) / 1_000 + 
				"seg");
		}

		System.out.println(myBundle.getString("recepcionist") + " " + this.name + " " + myBundle.getString("hilo5") + " "  + 
				client.getName() + " " + myBundle.getString("hilo2") + " " + 
				(System.currentTimeMillis() - timeStamp) / 1_000 + "seg");

	}


	private void esperarXsegundos(int segundos) {
		try {
			Thread.sleep(segundos * 1_000L);
		} catch (InterruptedException ex) {
			Thread.currentThread().interrupt();
		}
	}

}
